package com.example.android.conc;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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



        return rootView;
    }
    @Override
    public void onPause( ){
        super.onPause();
        if(other.getText() != null) {
            String HIA_other_reason =other.getText().toString();
            Log.v(TAG, "Video Checkbox: " + HIA_other_reason);
        }
    }

}