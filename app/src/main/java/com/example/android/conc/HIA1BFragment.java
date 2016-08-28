package com.example.android.conc;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class HIA1BFragment extends Fragment {

    boolean HIA1_Test2_Question1 = false;
    boolean HIA1_Test2_Question2 = false;
    boolean HIA1_Test2_Question3 = false;
    boolean HIA1_Test2_Question4 = false;
    boolean HIA1_Test2_Question5 = false;
    String HIA1_Test2_Question6;

    private static final String TAG = "Video Check";
    private EditText other;

    public static HIA1BFragment newInstance() {
        HIA1BFragment fragment = new HIA1BFragment();
        return fragment;
    }

    public HIA1BFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_b, container, false);
        other = (EditText) rootView.findViewById(R.id.editText001);

        final CheckBox mButton = (CheckBox) rootView.findViewById(R.id.checkBox_RHEAD);
        final CheckBox mButton1 = (CheckBox) rootView.findViewById(R.id.checkBox_RBEHAV);
        final CheckBox mButton2 = (CheckBox) rootView.findViewById(R.id.checkBox_RCONF);
        final CheckBox mButton3 = (CheckBox) rootView.findViewById(R.id.checkBox_RINJ);
        final CheckBox mButton4 = (CheckBox) rootView.findViewById(R.id.checkBox_ROTHER);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton.isChecked();
                if (checked2) {
                    HIA1_Test2_Question1 = true;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question1);
                } else {
                    HIA1_Test2_Question1 = false;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question1);
                }
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton1.isChecked();
                if (checked2) {
                    HIA1_Test2_Question2 = true;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question2);
                } else {
                    HIA1_Test2_Question2 = false;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question2);
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton2.isChecked();
                if (checked2) {
                    HIA1_Test2_Question3 = true;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question3);
                } else {
                    HIA1_Test2_Question3 = false;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question3);
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton3.isChecked();
                if (checked2) {
                    HIA1_Test2_Question4 = true;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question4);
                } else {
                    HIA1_Test2_Question4 = false;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question4);
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton4.isChecked();
                if (checked2) {
                    HIA1_Test2_Question5 = true;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question5);
                } else {
                    HIA1_Test2_Question5 = false;
                    Log.v(TAG, "Test: " + HIA1_Test2_Question5);
                }
            }
        });

        other.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                HIA1_Test2_Question6 =other.getText().toString();
                Log.v(TAG, "Other textbox string: " + HIA1_Test2_Question6);
            }
        });

        return rootView;
    }

}

