package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA2DFragment extends Fragment {

    public static HIA2DFragment newInstance() {
        HIA2DFragment fragment = new HIA2DFragment();
        return fragment;
    }

    public HIA2DFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia2_d, container, false);
        return rootView;
    }
}