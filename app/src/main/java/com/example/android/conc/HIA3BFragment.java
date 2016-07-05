package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA3BFragment extends Fragment {

    public static HIA3BFragment newInstance() {
        HIA3BFragment fragment = new HIA3BFragment();
        return fragment;
    }

    public HIA3BFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia3_b, container, false);
        return rootView;
    }
}