package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA1CFragment extends Fragment {

    public static HIA1CFragment newInstance() {
        HIA1CFragment fragment = new HIA1CFragment();
        return fragment;
    }

    public HIA1CFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_c, container, false);
        return rootView;
    }
}