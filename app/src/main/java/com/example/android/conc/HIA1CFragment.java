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
import android.widget.RadioButton;
import android.widget.TextView;


public class HIA1CFragment extends Fragment implements CheckBox.OnCheckedChangeListener {
    private static final String TAG = "Video Check";
    int mad_score=0;
    int mad1=0;
    int mad2 = 0;
    int mad3=0;
    int mad4=0;
    int mad5=0;
    int madTot=0;
    public static HIA1CFragment newInstance() {
        HIA1CFragment fragment = new HIA1CFragment();
        return fragment;
    }

    public HIA1CFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_c, container, false);

        RadioButton mButton = (RadioButton) rootView.findViewById(R.id.checkBox_MADD1_INC);
        RadioButton mButton1 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD1_COR);
        RadioButton mButton2 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD2_INC);
        RadioButton mButton3 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD2_COR);
        RadioButton mButton4 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD3_INC);
        RadioButton mButton5 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD3_COR);
        RadioButton mButton6 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD4_INC);
        RadioButton mButton7 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD4_COR);
        RadioButton mButton8 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD5_INC);
        RadioButton mButton9 = (RadioButton) rootView.findViewById(R.id.checkBox_MADD5_COR);

        mButton.setOnCheckedChangeListener(this);
        mButton1.setOnCheckedChangeListener(this);
        mButton2.setOnCheckedChangeListener(this);
        mButton3.setOnCheckedChangeListener(this);
        mButton4.setOnCheckedChangeListener(this);
        mButton5.setOnCheckedChangeListener(this);
        mButton6.setOnCheckedChangeListener(this);
        mButton7.setOnCheckedChangeListener(this);
        mButton8.setOnCheckedChangeListener(this);
        mButton9.setOnCheckedChangeListener(this);

        return rootView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        boolean checked2 = ((RadioButton) buttonView).isChecked();
        switch (buttonView.getId())
        {
            case R.id.checkBox_MADD1_COR:
                if (checked2)
                {
                    mad1=1;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score+1;
                   // Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }
                else
                {
                    mad1=0;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score-1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }

            case R.id.checkBox_MADD2_COR:
                if (checked2)
                {
                    mad2=1;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score+1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }
                else
                {
                    mad2=0;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score-1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }

            case R.id.checkBox_MADD3_COR:
                if (checked2)
                {
                    mad3=1;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score+1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }
                else
                {
                    mad3=0;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score-1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }

            case R.id.checkBox_MADD4_COR:
                if (checked2)
                {
                    mad4=1;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score+1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }
                else
                {
                    mad4=0;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score-1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }

            case R.id.checkBox_MADD5_COR:
                if (checked2)
                {
                    mad5=1;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score+1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }
                else
                {
                    mad5=0;
                    madTot = mad1+mad4+mad2 +mad3 +mad5;
                    Log.v(TAG, "Purple Monkeys " + madTot);
                    //mad_score=mad_score-1;
                    //Log.v(TAG, "Purple Monkeys " + mad_score);
                    break;
                }

            //default:
                    //madTot = mad1+mad4+mad2 +mad3 +mad5;
                   // Log.v(TAG, "Purple Monkeys " + madTot);
                    //break;
        }

    }
}