package com.cutic.eugen.helloandroid.week_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cutic.eugen.helloandroid.R;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextViewReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextViewReceived = findViewById(R.id.textView);

        Intent intent = getIntent();
        String text = intent.getStringExtra(PhotosPicassoActivity.MESSAGE);
        int value = intent.getIntExtra(PhotosPicassoActivity.COUNT, 0);
        if (mTextViewReceived != null) {
            mTextViewReceived.setText(text + " " + value);
        }
    }
}
