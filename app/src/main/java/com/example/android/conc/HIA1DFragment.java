package com.example.android.conc;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA1DFragment extends Fragment {

    public static HIA1DFragment newInstance() {
        HIA1DFragment fragment = new HIA1DFragment();
        return fragment;
    }

    public HIA1DFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_d, container, false);
        return rootView;
    }
}