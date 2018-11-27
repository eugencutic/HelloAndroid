package com.cutic.eugen.helloandroid.week_4;

public class Contact {
    private String mFirstName;
    private String mLastName;

    public Contact(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "First Name ='" + mFirstName + '\'' +
                ", Last Name ='" + mLastName + '\'' +
                '}';
    }
}
