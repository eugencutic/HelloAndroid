package com.cutic.eugen.helloandroid.week_5;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.cutic.eugen.helloandroid.R;
import com.squareup.picasso.Picasso;

public class PhotosPicassoActivity extends AppCompatActivity {

    private static final String TAG = PhotosPicassoActivity.class.getSimpleName();
    public static final String MESSAGE = "message";
    public static final String COUNT = "count";
    private EditText mEditText;

    private ImageView mImageViewMainPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos_picasso);

        mImageViewMainPhoto = (ImageView)findViewById(R.id.image_view_main_photo);

        Picasso.get().load("https://i.imgur.com/3njX6z8.png").into(mImageViewMainPhoto);
        Log.e(TAG, "onCreate");
        mEditText = findViewById(R.id.editText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void btnGoToOnClick(View view) {
        if (mEditText != null) {
            String text = mEditText.getText().toString();
            Intent intent = new Intent(PhotosPicassoActivity.this, SecondActivity.class);
            intent.putExtra(MESSAGE, text);
            intent.putExtra(COUNT, 42);
            startActivity(intent);
        }
    }

    public void btnCallOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("https://developer.android.com/"));

        if(intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }
}
