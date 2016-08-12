package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HIA2CFragment extends Fragment {
    private EditText other;
    private static final String TAG = "Video Check";
    public static HIA2CFragment newInstance() {
        HIA2CFragment fragment = new HIA2CFragment();
        return fragment;
    }

    public HIA2CFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia2_c, container, false);
        other = (EditText) rootView.findViewById(R.id.editText);

        other.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String unusual_symp =other.getText().toString();
                Log.v(TAG, "Video Checkbox: " + unusual_symp);
            }
        });

        return rootView;

    }

    /*@Override
    public void onPause( ){
        super.onPause();
        if(other.getText() != null) {
            String unusual_symp =other.getText().toString();
            Log.v(TAG, "Video Checkbox: " + unusual_symp);
        }
    }*/
}