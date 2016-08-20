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


public class HIA1DFragment extends Fragment implements CheckBox.OnCheckedChangeListener {

    int symp1;
    int symp2;
    int symp3;
    int symp4;
    int symp5;
    int symp6;
    int symp7;
    int symp8;
    int symp9;
    private static final String TAG = "Video Check";
    int sym_tally=0;

    public static HIA1DFragment newInstance() {
        HIA1DFragment fragment = new HIA1DFragment();
        return fragment;
    }

    public HIA1DFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_d, container, false);

        RadioButton mButton = (RadioButton) rootView.findViewById(R.id.checkBox_Symp22_y);
        RadioButton mButton1 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp22_n);
        RadioButton mButton2 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp23_y);
        RadioButton mButton3 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp23_n);
        RadioButton mButton4 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp24_y);
        RadioButton mButton5 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp24_n);
        RadioButton mButton6 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp25_y);
        RadioButton mButton7 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp25_n);
        RadioButton mButton8 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp26_y);
        RadioButton mButton9 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp26_n);
        RadioButton mButton10 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp27_y);
        RadioButton mButton11 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp27_n);
        RadioButton mButton12 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp28_y);
        RadioButton mButton13 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp28_n);
        RadioButton mButton14 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp29_y);
        RadioButton mButton15 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp29_n);
        RadioButton mButton16 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp210_y);
        RadioButton mButton17 = (RadioButton) rootView.findViewById(R.id.checkBox_Symp210_n);

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
        mButton10.setOnCheckedChangeListener(this);
        mButton11.setOnCheckedChangeListener(this);
        mButton12.setOnCheckedChangeListener(this);
        mButton13.setOnCheckedChangeListener(this);
        mButton14.setOnCheckedChangeListener(this);
        mButton15.setOnCheckedChangeListener(this);
        mButton16.setOnCheckedChangeListener(this);
        mButton17.setOnCheckedChangeListener(this);

        return rootView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean checked = ((RadioButton) buttonView).isChecked();

        switch (buttonView.getId()) {
            case R.id.checkBox_Symp22_y:
                if (checked) {
                    symp1 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp1 + " tally: " + sym_tally);
                    break;
                }
                else{
                    symp1 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp1 + " tally: " + sym_tally);
                break;
            }
            case R.id.checkBox_Symp23_y:
                if (checked){
                    symp2 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp2 + " tally: " + sym_tally);
                break;}
            else {
                    symp2 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp2 + " tally: " + sym_tally);
                    break;
                }
            case R.id.checkBox_Symp24_y:
                if (checked) {
                    symp3 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp3 + " tally: " + sym_tally);
                    break;
                }
            else  {
                    symp3 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp3 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp25_y: //+2
                if (checked) {
                    symp4 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp4 + " tally: " + sym_tally);
                    break;
                }
                else{
                    symp4 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp4 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp26_y:
                if (checked){
                    symp5 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp5 + " tally: " + sym_tally);
                    break;
                }
                else{
                    symp5 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp5 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp27_y:
                if (checked){
                    symp6 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp6 + " tally: " + sym_tally);
                    break;
                }
                else{
                    symp6 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp6 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp28_y:
                if (checked){
                    symp7 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp7 + " tally: " + sym_tally);
                    break;
                }

                else{
                    symp7 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp7 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp29_y:
                if (checked){
                    symp8 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp8 + " tally: " + sym_tally);
                    break;
                }

                else{
                    symp8 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp8 + " tally: " + sym_tally);
                    break;
                }

            case R.id.checkBox_Symp210_y:
                if (checked){
                    symp9 = 1;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp9 + " tally: " + sym_tally);
                    break;
                }
                else{
                    symp9 = 0;
                    sym_tally = symp1+symp2 +symp3+ symp4+symp5 +symp6+symp7+symp8 +symp9;
                    Log.v(TAG, "Mad Checkbox: " + symp9 + " tally: " + sym_tally);
                    break;
                }

        }

    }
}