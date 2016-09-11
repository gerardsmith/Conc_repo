package com.example.android.conc;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class HIA1FFragment extends Fragment implements AdapterView.OnItemSelectedListener, CheckBox.OnCheckedChangeListener {
    private ArrayAdapter<CharSequence> adapter3;
    private static final String TAG = "Video Check";
    boolean HIA1_Test7_Question2;
    boolean HIA1_Test7_Question4;
    boolean HIA1_Test7_Question6;

    //database
    public HIA1AActivity hia1test;




    int HIA1_Test7_Question1,HIA1_Test7_Question3,HIA1_Test7_Question5;
    public HIA1 databasetest;

    public static HIA1FFragment newInstance() {
        HIA1FFragment fragment = new HIA1FFragment();
        return fragment;
    }

    public HIA1FFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia1_f, container, false);

        String [] req_by =
                {"Team Doctor","Physiotherapist","Match Day Doctor","Tournament Doctor","Referee"};
        String [] comp_by =
                {"Team Doctor","Match Day Doctor","Tournament Doctor","Assistant Team Doctor"};
        String [] player_remove =
                {"No","Yes, pitchside HIA abnormal","Yes, player removed for another injury"};

        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, req_by);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, comp_by);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) rootView.findViewById(R.id.spinner3);
        //ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, player_remove);
        //adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        this.adapter3=ArrayAdapter.createFromResource(this.getActivity(),R.array.player_removed_spinner,android.R.layout.simple_spinner_dropdown_item);
        this.adapter3 = ArrayAdapter.createFromResource(this.getActivity(),R.array.player_removed_spinner,R.layout.multiline_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

        RadioButton mButton = (RadioButton) rootView.findViewById(R.id.checkBox_VI_Y);
        RadioButton mButton1 = (RadioButton) rootView.findViewById(R.id.checkBox_MDD_Y);
        RadioButton mButton2 = (RadioButton) rootView.findViewById(R.id.checkBox_VI2_Y);

        mButton.setOnCheckedChangeListener(this);
        mButton1.setOnCheckedChangeListener(this);
        mButton2.setOnCheckedChangeListener(this);



        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //TextView myText = (TextView) view;
        //String myTextString = myText.toString();
        //Toast.makeText(this, "You selected " + myText, Toast.LENGTH_SHORT).show();
        switch(parent.getId()) {
            case R.id.spinner:
                Log.v(TAG, "Video Checkbox0: " + position);
                HIA1_Test7_Question1=position;
                return;
            case R.id.spinner2:
                Log.v(TAG, "Video Checkbox1: " + position);
                HIA1_Test7_Question3=position;
                return;
            case R.id.spinner3:
                Log.v(TAG, "Video Checkbox2: " + position);
                HIA1_Test7_Question5=position;
                return;

        }
        //Log.v(TAG, "Video Checkbox: " + position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean checked = ((RadioButton) buttonView).isChecked();
       Activity a = getActivity();

        if(a instanceof HIA1AActivity) {
            hia1test = (HIA1AActivity) getActivity();

            switch (buttonView.getId()) {
                case R.id.checkBox_VI_Y:
                    if (checked) {
                        HIA1_Test7_Question2 = true;
                        //hia1test.objHIA1.setHIA1_Test1_Question1(1);
                        //objHIA1.HIA1_Test1_Question1 = 1;
                        Log.v(TAG, "Check Check Ckeck: " + hia1test.objHIA1.HIA1_Test1_Question1);
                        break;
                    } else {
                        HIA1_Test7_Question2 = false;
                        Log.v(TAG, "Mad Checkbox: " + HIA1_Test7_Question2);
                        break;
                    }

                case R.id.checkBox_MDD_Y:
                    if (checked) {
                        HIA1_Test7_Question4 = true;
                        Log.v(TAG, "Mad Checkbox: " + HIA1_Test7_Question4);
                        break;
                    } else {
                        HIA1_Test7_Question4 = false;
                        Log.v(TAG, "Mad Checkbox: " + HIA1_Test7_Question4);
                        break;
                    }

                case R.id.checkBox_VI2_Y:
                    if (checked) {
                        HIA1_Test7_Question6 = true;
                        Log.v(TAG, "Mad Checkbox: " + HIA1_Test7_Question6);
                        break;
                    } else {
                        HIA1_Test7_Question6 = false;
                        Log.v(TAG, "Mad Checkbox: " + HIA1_Test7_Question6);
                        break;
                    }
            }
        }
    }
}