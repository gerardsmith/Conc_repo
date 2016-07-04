package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by user on 2016/07/04.
 */

public class HIA2BFragment extends Fragment {

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

        return rootView;
    }
}