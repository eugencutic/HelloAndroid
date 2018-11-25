package com.cutic.eugen.helloandroid.week_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cutic.eugen.helloandroid.R;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner mSpinnerAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initView();

    }

    private void initView() {
        mSpinnerAndroidVersions = (Spinner)findViewById(R.id.spinner_android_versions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.android_versions, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mSpinnerAndroidVersions.setAdapter(adapter);
    }
}
