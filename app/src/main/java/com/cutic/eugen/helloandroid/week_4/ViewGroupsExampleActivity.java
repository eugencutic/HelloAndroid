package com.cutic.eugen.helloandroid.week_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.cutic.eugen.helloandroid.R;

public class ViewGroupsExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_groups_example);

        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
    }
}
