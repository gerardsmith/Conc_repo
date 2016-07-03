package com.example.android.conc;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HIA1BFragment extends Fragment {

    public static HIA1BFragment newInstance() {
        HIA1BFragment fragment = new HIA1BFragment();
        return fragment;
    }

    public HIA1BFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_b, container, false);
        return rootView;
    }
}