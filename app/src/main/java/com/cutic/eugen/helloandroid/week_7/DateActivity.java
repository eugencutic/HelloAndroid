package com.cutic.eugen.helloandroid.week_7;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.cutic.eugen.helloandroid.R;

import java.util.Calendar;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        setAnimation();
    }

    private void setAnimation() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layout_activity_date);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }

    public void btnDatePicker(View view) {
        DialogFragment dateFragment = new CustomDatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "DatePicker");
    }

    public void btnTimePicker(View view) {
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        Toast.makeText(DateActivity.this, hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
                    }
                }, hour, minute, false);
        timePickerDialog.show();
    }

    public void btnDialog(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.notice));
        builder.setMessage(getString(R.string.alert_message));

// add the buttons
        builder.setPositiveButton(getString(R.string.launch_app), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DateActivity.this, getString(R.string.launch_app) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton(getString(R.string.remind_me), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DateActivity.this, getString(R.string.remind_me) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DateActivity.this, getString(R.string.cancel) + " " + getString(R.string.click), Toast.LENGTH_SHORT).show();
            }
        });

// create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
