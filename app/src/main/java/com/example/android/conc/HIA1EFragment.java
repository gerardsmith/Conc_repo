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


public class HIA1EFragment extends Fragment implements CheckBox.OnCheckedChangeListener {

    private static final String TAG = "Video Check";
    private EditText delmem;
    int cs1=0;
    int cs2=0;
    int cs3=0;
    int cs=0;

    public static HIA1EFragment newInstance() {
        HIA1EFragment fragment = new HIA1EFragment();
        return fragment;
    }

    public HIA1EFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_e, container, false);
        delmem = (EditText) rootView.findViewById(R.id.editText12);

        RadioButton mButton = (RadioButton) rootView.findViewById(R.id.checkBox_CS1_Y);
        RadioButton mButton1 = (RadioButton) rootView.findViewById(R.id.checkBox_CS2_Y);
        RadioButton mButton2 = (RadioButton) rootView.findViewById(R.id.checkBox_CS3_Y);

        mButton.setOnCheckedChangeListener(this);
        mButton1.setOnCheckedChangeListener(this);
        mButton2.setOnCheckedChangeListener(this);

        delmem.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String delmemstring =delmem.getText().toString();
                Log.v(TAG, "Video Checkbox: " + delmemstring);
            }
        });

        return rootView;
    }

   /* @Override
    public void onPause( ){
        super.onPause();
        if(delmem.getText() != null) {
            String delmemstring =delmem.getText().toString();
            Log.v(TAG, "Video Checkbox: " + delmemstring);
        }
    }*/

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean checked = ((RadioButton) buttonView).isChecked();

        switch (buttonView.getId()) {
            case R.id.checkBox_CS1_Y:
                if (checked){
                    cs1 = 1;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }
                else{
                    cs1 = 0;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }

            case R.id.checkBox_CS2_Y:
                if (checked){
                    cs2 = 1;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }

                else{
                    cs2 = 0;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }

            case R.id.checkBox_CS3_Y:
                if (checked){
                    cs3 = 1;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }
                else{
                    cs3 = 0;
                    cs=cs1 +cs2+cs3;
                    Log.v(TAG, "Mad Checkbox: " + cs1 + "tally: " + cs);
                    break;
                }
        }

    }
}