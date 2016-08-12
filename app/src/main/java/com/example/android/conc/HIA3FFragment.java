package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioButton;
import android.widget.Spinner;
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

import static android.content.ContentValues.TAG;


public class HIA3FFragment extends Fragment implements CheckBox.OnCheckedChangeListener {

    //adding
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
   HashMap<String, List<String>> listDataChild;

    private static final String TAG = "Video Check";
    private EditText other;
    private EditText other1;

    boolean antam = false;
    boolean retam= false;

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

        other = (EditText) rootView.findViewById(R.id.editText9);
        other1 = (EditText) rootView.findViewById(R.id.editText10);

        RadioButton mButton = (RadioButton) rootView.findViewById(R.id.checkBox_ANT_AM_Y);
        RadioButton mButton1 = (RadioButton) rootView.findViewById(R.id.checkBox_RET_AM_Y);

        mButton.setOnCheckedChangeListener(this);
        mButton1.setOnCheckedChangeListener(this);

        other.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String dur1 =other.getText().toString();
                Log.v(TAG, "Video Checkbox: " + dur1);
            }
        });

        other1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String dur2 =other.getText().toString();
                Log.v(TAG, "Video Checkbox: " + dur2);
            }
        });


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

        // Adding child data (22)
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
        List<String> one = new ArrayList<String>();
        one.add("Identify the maximum intensity of the symptom");
        one.add("Identify when you started to feel the symptom");
        one.add("Identify how long the symptom lasted");
        one.add("Identify the intensity of the symptom still present");

        listDataChild.put(listDataHeader.get(0), one); // Header, Child data
        listDataChild.put(listDataHeader.get(1), one);
        listDataChild.put(listDataHeader.get(2), one);
       listDataChild.put(listDataHeader.get(3), one);
       listDataChild.put(listDataHeader.get(4), one);
       listDataChild.put(listDataHeader.get(5), one);
       listDataChild.put(listDataHeader.get(6), one);
       listDataChild.put(listDataHeader.get(7), one);
       listDataChild.put(listDataHeader.get(8), one);
       listDataChild.put(listDataHeader.get(9), one);
       listDataChild.put(listDataHeader.get(10), one);
       listDataChild.put(listDataHeader.get(11), one);
       listDataChild.put(listDataHeader.get(12), one);
       listDataChild.put(listDataHeader.get(13), one);
       listDataChild.put(listDataHeader.get(14), one);
       listDataChild.put(listDataHeader.get(15), one);
       listDataChild.put(listDataHeader.get(16), one);
       listDataChild.put(listDataHeader.get(17), one);
       listDataChild.put(listDataHeader.get(18), one);
       listDataChild.put(listDataHeader.get(19), one);
       listDataChild.put(listDataHeader.get(20), one);
       listDataChild.put(listDataHeader.get(21), one);




    }

    /*@Override
    public void onPause( ) {
        super.onPause();
        if (other.getText() != null) {
            String dur1 = other.getText().toString();
            Log.v(TAG, "Video Checkbox: " + dur1);
        }

        if (other1.getText() != null) {
            String dur2 = other1.getText().toString();
            Log.v(TAG, "Video Checkbox: " + dur2);
        }

    }*/

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean checked2 = ((RadioButton) buttonView).isChecked();
        switch (buttonView.getId())
        {
            case R.id.checkBox_ANT_AM_Y:
                if (checked2)
                {
                    antam = true;
                    Log.v(TAG, "Purple Monkeys " + antam);
                    break;
                }
                else
                {
                    antam = false;
                    Log.v(TAG, "Purple Monkeys " + antam);
                    break;
                }

            case R.id.checkBox_RET_AM_Y:
                if (checked2)
                {
                    retam = true;
                    Log.v(TAG, "Purple Monkeys " + retam);
                    break;
                }
                else
                {
                    retam = false;
                    Log.v(TAG, "Purple Monkeys " + retam);
                    break;
                }
        }
    }
}