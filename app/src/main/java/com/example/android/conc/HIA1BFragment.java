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

    boolean remov_1 = false;
    boolean remov_2 = false;
    boolean remov_3 = false;
    boolean remov_4 = false;
    boolean remov_5 = false;
    boolean remov_6 = false;
    boolean remov_7 = false;
    boolean remov_8 = false;
    boolean remov_9 = false;
    boolean remov_10 = false;
    boolean remov_11 = false;
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

        //EditText other= (EditText) rootView.findViewById(R.id.editText001);
        //String HIA_other_reason =other.getText().toString();
        //Log.v(TAG, "Video Checkbox: " + HIA_other_reason);

        other = (EditText) rootView.findViewById(R.id.editText001);
        //Button mButton = (Button) rootView.findViewById(R.id.checkBox_TP);
        //mButton.setOnCheckedChangeListener(this);
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
                    remov_1 = true;
                    Log.v(TAG, "Test: " + remov_1);
                } else {
                    remov_1 = false;
                    Log.v(TAG, "Test: " + remov_1);
                }
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton1.isChecked();
                if (checked2) {
                    remov_2 = true;
                    Log.v(TAG, "Test: " + remov_2);
                } else {
                    remov_2 = false;
                    Log.v(TAG, "Test: " + remov_2);
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton2.isChecked();
                if (checked2) {
                    remov_3 = true;
                    Log.v(TAG, "Test: " + remov_3);
                } else {
                    remov_3 = false;
                    Log.v(TAG, "Test: " + remov_3);
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton3.isChecked();
                if (checked2) {
                    remov_4 = true;
                    Log.v(TAG, "Test: " + remov_4);
                } else {
                    remov_4 = false;
                    Log.v(TAG, "Test: " + remov_4);
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final boolean checked2 = mButton4.isChecked();
                if (checked2) {
                    remov_5 = true;
                    Log.v(TAG, "Test: " + remov_5);
                } else {
                    remov_5 = false;
                    Log.v(TAG, "Test: " + remov_5);
                }
            }
        });

        other.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String HIA_other_reason =other.getText().toString();
                Log.v(TAG, "Video Checkbox: " + HIA_other_reason);
            }
        });

        return rootView;
    }
    /*@Override
    public void onPause( ){
        super.onPause();
        if(other.getText() != null) {
            String HIA_other_reason =other.getText().toString();
            Log.v(TAG, "Video Checkbox: " + HIA_other_reason);
        }
    }*/


}

