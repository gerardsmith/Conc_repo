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


public class HIA1EFragment extends Fragment {

    private static final String TAG = "Video Check";
    private EditText delmem;

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
        return rootView;
    }

    @Override
    public void onPause( ){
        super.onPause();
        if(delmem.getText() != null) {
            String delmemstring =delmem.getText().toString();
            Log.v(TAG, "Video Checkbox: " + delmemstring);
        }
    }
}