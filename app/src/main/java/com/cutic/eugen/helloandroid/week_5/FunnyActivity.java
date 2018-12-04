package com.cutic.eugen.helloandroid.week_5;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cutic.eugen.helloandroid.R;

public class FunnyActivity extends AppCompatActivity {

    private ImageView mImageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);

        mImageViewResult = findViewById(R.id.image_view_result);
    }

    public void btnSmallest(View view) {
        Drawable check = getDrawable(android.R.drawable.checkbox_on_background);
        mImageViewResult.setImageDrawable(check);
        mImageViewResult.setVisibility(View.VISIBLE);
    }

    public void btnWrong(View view) {
        Drawable wrong = getDrawable(android.R.drawable.ic_delete);
        mImageViewResult.setImageDrawable(wrong);
        mImageViewResult.setVisibility(View.VISIBLE);
    }
}
