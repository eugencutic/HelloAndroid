package com.cutic.eugen.helloandroid.week_3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.cutic.eugen.helloandroid.R;
import com.cutic.eugen.helloandroid.week_3.models.Authentication;

public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private CheckBox mCheckBoxAccept;
    private TextView mTextViewResult;

    private Authentication mAuthentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuthentication = new Authentication();

        initView();

    }

    private void initView()
    {
        mEditTextEmail = (EditText) findViewById(R.id.edittext_email);
        mEditTextPhone = (EditText) findViewById(R.id.edittext_phone);
        mCheckBoxAccept = (CheckBox) findViewById(R.id.checkbox_terms_accept);
        mTextViewResult = (TextView) findViewById(R.id.textview_result);
    }



    public void btnSubmitOnClick(View view) {
        mAuthentication.setEmail(mEditTextEmail.getText().toString());
        mAuthentication.setPhone(mEditTextPhone.getText().toString());
        mAuthentication.setAccepted(mCheckBoxAccept.isChecked());

        if(!mAuthentication.isEmailValid()) {
            mEditTextEmail.setError("Email is not valid.");
        }
        else {

        }

        if(!mAuthentication.isPhoneValid()) {
            mEditTextPhone.setError("Phone number is not valid.");
        }

        if(!mAuthentication.isAccepted()) {
            mCheckBoxAccept.setError("You must agree with T&C");
        }
        else {
            mCheckBoxAccept.setError(null);
        }

        if(mAuthentication.isValid()) {
            mTextViewResult.setText(mEditTextEmail.getText().toString() + " " +
                                    mEditTextPhone.getText().toString() + " terms accepted");
            setContentView(R.layout.activity_main);
        }
        else {
            mTextViewResult.setText("Authentication not valid.");
        }
    }
}
