package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA3EFragment extends Fragment {

    public static HIA3EFragment newInstance() {
        HIA3EFragment fragment = new HIA3EFragment();
        return fragment;
    }

    public HIA3EFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia3_e, container, false);
        return rootView;
    }
}