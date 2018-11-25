package com.cutic.eugen.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonSeeScrollAndRel;
    private Button mButtonSeeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mButtonSeeScrollAndRel = (Button)findViewById(R.id.button_see_scroll_and_rel);
        mButtonSeeSpinner = (Button)findViewById(R.id.button_see_spinner);
    }


    public void btnSeeScrollAndRel(View view) {
        setContentView(R.layout.activity_scroll_and_rel);
    }

    public void btnSeeSpinner(View view) {
        setContentView(R.layout.activity_spinner);
    }
}
