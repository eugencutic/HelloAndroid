package com.cutic.eugen.helloandroid.week_6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cutic.eugen.helloandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private TextView mTextViewIsOddOrEven;
    private int number;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        mTextViewIsOddOrEven = view.findViewById(R.id.text_view_is_odd_or_even);

        /*Bundle bundle = getArguments();
        if(bundle != null) {
            int number = bundle.getInt(DynamicActivity.NUMBER, 0);
            isEvenOrOdd(number);
        }*/

        setEvenOrOddText();
        return view;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void setEvenOrOddText() {
        if (number % 2 == 0) {
            mTextViewIsOddOrEven.setText(number + " is even");
        } else {
            mTextViewIsOddOrEven.setText(number + " is odd");
        }
    }

}
