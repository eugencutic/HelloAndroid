package com.cutic.eugen.helloandroid.week_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cutic.eugen.helloandroid.R;

public class ListenerActivity extends AppCompatActivity implements MyListener {

    private TextView mTextViewSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        initView();
        initFragment();
    }

    private void initView() {
        mTextViewSum = findViewById(R.id.text_view_sum);
    }

    private void initFragment() {
        SumFragment sumFragment = new SumFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_listener, sumFragment).commit();
    }

    @Override
    public void addTwoNumbers(int a, int b) {
        mTextViewSum.setText("Sum is: " + (a + b));
    }
}
