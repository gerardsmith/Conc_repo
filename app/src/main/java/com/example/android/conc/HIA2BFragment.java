package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by user on 2016/07/04.
 */

public class HIA2BFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private static final String TAG = "Video Check";
    boolean s1= false;
    boolean s2= false;
    boolean s3= false;
    boolean s4= false;
    boolean s5= false;
    boolean s6= false;
    boolean s7= false;
    boolean s8= false;
    boolean s9= false;
    boolean s10= false;
    boolean s11= false;
    boolean s12= false;
    boolean s13= false;
    boolean s14= false;
    boolean s15= false;
    boolean s16= false;
    boolean s17= false;
    boolean s18= false;
    boolean s19= false;
    boolean s20= false;
    boolean s21= false;
    boolean s22= false;
    int symp_score=0;
    int prev1=0;
    int prev2=0;
    int prev3=0;
    int prev4=0;
    int prev5=0;
    int prev6=0;
    int prev7=0;
    int prev8=0;
    int prev9=0;
    int prev10=0;
    int prev11=0;
    int prev12=0;
    int prev13=0;
    int prev14=0;
    int prev15=0;
    int prev16=0;
    int prev17=0;
    int prev18=0;
    int prev19=0;
    int prev20=0;
    int prev21=0;
    int prev22=0;



    public static HIA2BFragment newInstance() {
        HIA2BFragment fragment = new HIA2BFragment();
        return fragment;
    }

    public HIA2BFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String s = getResources().getString(R.string.hia2a_section22_header);
        View rootView = inflater.inflate(R.layout.fragment_hia2_b, container, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(s).setTitle("Read before completing the symptoms checklist");

        AlertDialog dialog = builder.create();
        dialog.show();

        String [] symp_num =
                {"0","1","2","3","4","5","6"};

        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner6);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner7);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) rootView.findViewById(R.id.spinner8);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) rootView.findViewById(R.id.spinner9);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);

        Spinner spinner5 = (Spinner) rootView.findViewById(R.id.spinner10);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) rootView.findViewById(R.id.spinner11);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner6.setAdapter(adapter6);

        Spinner spinner7 = (Spinner) rootView.findViewById(R.id.spinner12);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner7.setAdapter(adapter7);

        Spinner spinner8 = (Spinner) rootView.findViewById(R.id.spinner13);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter8.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner8.setAdapter(adapter8);

        Spinner spinner9 = (Spinner) rootView.findViewById(R.id.spinner14);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter9.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner9.setAdapter(adapter9);

        Spinner spinner10 = (Spinner) rootView.findViewById(R.id.spinner15);
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter10.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner10.setAdapter(adapter10);

        Spinner spinner11 = (Spinner) rootView.findViewById(R.id.spinner16);
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter11.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner11.setAdapter(adapter11);

        Spinner spinner12 = (Spinner) rootView.findViewById(R.id.spinner17);
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter12.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner12.setAdapter(adapter12);

        Spinner spinner13 = (Spinner) rootView.findViewById(R.id.spinner18);
        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter13.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner13.setAdapter(adapter13);

        Spinner spinner14 = (Spinner) rootView.findViewById(R.id.spinner19);
        ArrayAdapter<String> adapter14 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter14.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner14.setAdapter(adapter14);

        Spinner spinner15 = (Spinner) rootView.findViewById(R.id.spinner20);
        ArrayAdapter<String> adapter15 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter15.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner15.setAdapter(adapter15);

        Spinner spinner16 = (Spinner) rootView.findViewById(R.id.spinner21);
        ArrayAdapter<String> adapter16 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter16.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner16.setAdapter(adapter16);

        Spinner spinner17 = (Spinner) rootView.findViewById(R.id.spinner22);
        ArrayAdapter<String> adapter17 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter17.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner17.setAdapter(adapter17);

        Spinner spinner18 = (Spinner) rootView.findViewById(R.id.spinner23);
        ArrayAdapter<String> adapter18 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter18.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner18.setAdapter(adapter18);

        Spinner spinner19 = (Spinner) rootView.findViewById(R.id.spinner24);
        ArrayAdapter<String> adapter19 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter19.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner19.setAdapter(adapter19);

        Spinner spinner20 = (Spinner) rootView.findViewById(R.id.spinner25);
        ArrayAdapter<String> adapter20 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter20.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner20.setAdapter(adapter20);

        Spinner spinner21 = (Spinner) rootView.findViewById(R.id.spinner26);
        ArrayAdapter<String> adapter21 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, symp_num);
        adapter21.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner21.setAdapter(adapter21);

        spinner.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);
        spinner6.setOnItemSelectedListener(this);
        spinner7.setOnItemSelectedListener(this);
        spinner8.setOnItemSelectedListener(this);
        spinner9.setOnItemSelectedListener(this);
        spinner10.setOnItemSelectedListener(this);
        spinner11.setOnItemSelectedListener(this);
        spinner12.setOnItemSelectedListener(this);
        spinner13.setOnItemSelectedListener(this);
        spinner14.setOnItemSelectedListener(this);
        spinner15.setOnItemSelectedListener(this);
        spinner16.setOnItemSelectedListener(this);
        spinner17.setOnItemSelectedListener(this);
        spinner18.setOnItemSelectedListener(this);
        spinner19.setOnItemSelectedListener(this);
        spinner20.setOnItemSelectedListener(this);
        spinner21.setOnItemSelectedListener(this);

        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch(parent.getId()) {
            case R.id.spinner5:
                if(position>0){
                    s1=true;
                    symp_score=symp_score+position - prev1;
                    prev1=position;
                }
                else{
                    s1=false;
                    symp_score=symp_score - prev1;
                }
                Log.v(TAG, "Video Checkbox0: " + symp_score + "state: " + s1);
                return;
            case R.id.spinner6:
                if(position>0){
                    s2=true;
                    symp_score=symp_score+position - prev2;
                    prev2=position;
                }
                else{
                    s2=false;
                    symp_score=symp_score - prev2;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner7:
                if(position>0){
                    s3=true;
                    symp_score=symp_score+position - prev3;
                    prev3=position;
                }
                else{
                    s3=false;
                    symp_score=symp_score - prev3;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner8:
                if(position>0){
                    s4=true;
                    symp_score=symp_score+position - prev4;
                    prev4=position;
                }
                else{
                    s4=false;
                    symp_score=symp_score - prev4;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner9:
                if(position>0){
                    s5=true;
                    symp_score=symp_score+position - prev5;
                    prev5=position;
                }
                else{
                    s5=false;
                    symp_score=symp_score - prev5;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner10:
                if(position>0){
                    s6=true;
                    symp_score=symp_score+position - prev6;
                    prev6=position;
                }
                else{
                    s6=false;
                    symp_score=symp_score - prev6;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner11:
                if(position>0){
                    s7=true;
                    symp_score=symp_score+position - prev7;
                    prev7=position;
                }
                else{
                    s7=false;
                    symp_score=symp_score - prev7;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner12:
                if(position>0){
                    s8=true;
                    symp_score=symp_score+position - prev8;
                    prev8=position;
                }
                else{
                    s8=false;
                    symp_score=symp_score - prev8;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner13:
                if(position>0){
                    s9=true;
                    symp_score=symp_score+position - prev9;
                    prev9=position;
                }
                else{
                    s9=false;
                    symp_score=symp_score - prev9;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner14:
                if(position>0){
                    s10=true;
                    symp_score=symp_score+position - prev10;
                    prev10=position;
                }
                else{
                    s10=false;
                    symp_score=symp_score - prev10;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner15:
                if(position>0){
                    s11=true;
                    symp_score=symp_score+position - prev11;
                    prev11=position;
                }
                else{
                    s11=false;
                    symp_score=symp_score - prev11;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner16:
                if(position>0){
                    s12=true;
                    symp_score=symp_score+position - prev12;
                    prev12=position;
                }
                else{
                    s12=false;
                    symp_score=symp_score - prev12;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner17:
                if(position>0){
                    s13=true;
                    symp_score=symp_score+position - prev13;
                    prev13=position;
                }
                else{
                    s13=false;
                    symp_score=symp_score - prev13;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner18:
                if(position>0){
                    s14=true;
                    symp_score=symp_score+position - prev14;
                    prev14=position;
                }
                else{
                    s14=false;
                    symp_score=symp_score - prev14;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner19:
                if(position>0){
                    s15=true;
                    symp_score=symp_score+position - prev15;
                    prev15=position;
                }
                else{
                    s15=false;
                    symp_score=symp_score - prev15;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner20:
                if(position>0){
                    s16=true;
                    symp_score=symp_score+position - prev16;
                    prev16=position;
                }
                else{
                    s16=false;
                    symp_score=symp_score - prev16;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner21:
                if(position>0){
                    s17=true;
                    symp_score=symp_score+position - prev17;
                    prev17=position;
                }
                else{
                    s17=false;
                    symp_score=symp_score - prev17;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner22:
                if(position>0){
                    s18=true;
                    symp_score=symp_score+position - prev18;
                    prev18=position;
                }
                else{
                    s18=false;
                    symp_score=symp_score - prev18;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner23:
                if(position>0){
                    s19=true;
                    symp_score=symp_score+position - prev19;
                    prev19=position;
                }
                else{
                    s19=false;
                    symp_score=symp_score - prev19;
                }
                Log.v(TAG, "Video Checkbox0: " + position);
                return;
            case R.id.spinner24:
                if(position>0){
                    s20=true;
                    symp_score=symp_score+position - prev20;
                    prev20=position;
                }
                else{
                    s20=false;
                    symp_score=symp_score - prev20;
                }
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner25:
                if(position>0){
                    s21=true;
                    symp_score=symp_score+position - prev21;
                    prev21=position;
                }
                else{
                    s21=false;
                    symp_score=symp_score - prev21;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;
            case R.id.spinner26:
                if(position>0){
                    s22=true;
                    symp_score=symp_score+position - prev22;
                    prev22=position;
                }
                else{
                    s22=false;
                    symp_score=symp_score - prev22;
                }
                Log.v(TAG, "Video Checkbox2: " + position);
                return;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}