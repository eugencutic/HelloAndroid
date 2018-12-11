package com.cutic.eugen.helloandroid.week_6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.cutic.eugen.helloandroid.R;

public class DynamicActivity extends AppCompatActivity {

    private EditText mEditTextNumber;
    public static final String NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        initView();
    }

    private void initView() {
        mEditTextNumber = findViewById(R.id.edit_text_number);
    }

    private void initFragment(BlankFragment blankFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_frame_layout, blankFragment);
        fragmentTransaction.commit();
    }

    public void btnCheckNumberOnClick(View view) {
        if(mEditTextNumber != null) {
            String numberString = mEditTextNumber.getText().toString();
            int number;
//            Bundle bundle = new Bundle();
            if (numberString != null && !numberString.isEmpty()) {
                  number = Integer.parseInt(numberString);
//                bundle.putInt(NUMBER, number);
//
//                BlankFragment blankFragment = new BlankFragment();
//                blankFragment.setArguments(bundle);
//                initFragment(blankFragment);
//            }

                BlankFragment blankFragment = new BlankFragment();
                blankFragment.setNumber(number);
                initFragment(blankFragment);

            }
        }
    }
}
