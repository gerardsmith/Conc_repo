package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA2CFragment extends Fragment {

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
        return rootView;
    }
}