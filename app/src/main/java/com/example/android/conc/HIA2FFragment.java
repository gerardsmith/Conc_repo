package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA2FFragment extends Fragment {

    public static HIA2FFragment newInstance() {
        HIA2FFragment fragment = new HIA2FFragment();
        return fragment;
    }

    public HIA2FFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia2_f, container, false);
        return rootView;
    }
}