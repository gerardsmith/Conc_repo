package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA3DFragment extends Fragment {

    public static HIA3DFragment newInstance() {
        HIA3DFragment fragment = new HIA3DFragment();
        return fragment;
    }

    public HIA3DFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia3_d, container, false);
        return rootView;
    }
}