package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;

import android.app.Activity;


import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;


public class HIA3FFragment extends Fragment {

    //adding
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public static HIA3FFragment newInstance() {
        HIA3FFragment fragment = new HIA3FFragment();
        return fragment;
    }

    public HIA3FFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia3_f, container, false);

        //added
        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvExp);
        // preparing list data
        prepareListData();
        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);

        return rootView;
    }

    /*
  * Preparing the list data
  * added
  */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        //List<String> listDataHeader = Arrays.asList(getResources().getStringArray(R.array.listDataHeader));
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Headaches");
        listDataHeader.add("\'Pressure in head\'");
        listDataHeader.add("Neck pain");
        listDataHeader.add("Nausea/vomiting");
        listDataHeader.add("Dizziness");
        listDataHeader.add("Blurred vision");
        listDataHeader.add("Balance problems");
        listDataHeader.add("Sensitivity to light");
        listDataHeader.add("Sensitivity to noise");
        listDataHeader.add("Feeling slowed down");
        listDataHeader.add("Feeling like \'in a fog\'");
        listDataHeader.add("\'Dont feel right\'");
        listDataHeader.add("Difficulty concentrating");
        listDataHeader.add("Difficulty remembering");
        listDataHeader.add("Fatigue/low energy");
        listDataHeader.add("Confusion");
        listDataHeader.add("Drowsiness");
        listDataHeader.add("Trouble falling asleep");
        listDataHeader.add("More emotional");
        listDataHeader.add("Irritability");
        listDataHeader.add("Sadness");
        listDataHeader.add("Nervous/anxious");


        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}