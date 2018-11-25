package com.cutic.eugen.helloandroid.week_3.models;

import android.util.Patterns;

public class Authentication {

    private String mEmail;
    private String mPhone;
    private boolean mAccepted;

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public boolean isAccepted() {
        return mAccepted;
    }

    public void setAccepted(boolean mIsAccepted) {
        this.mAccepted = mIsAccepted;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mIsAccepted=" + mAccepted +
                '}';
    }

    public boolean isEmailValid() {
        if (mEmail == null)
            return false;

        CharSequence email = mEmail;

        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

    }

    public boolean isPhoneValid() {
        if(mPhone == null)
            return false;

        CharSequence phone = mPhone;
        return Patterns.PHONE.matcher(phone).matches();
    }

    public boolean isValid() {
        if(isEmailValid() && isPhoneValid() && isAccepted())
            return true;
        return false;
    }
}
