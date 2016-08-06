package com.example.android.conc;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class HIA1FFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private ArrayAdapter<CharSequence> adapter3;
    private static final String TAG = "Video Check";
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
                return;
            case R.id.spinner2:
                Log.v(TAG, "Video Checkbox1: " + position);
                return;
            case R.id.spinner3:
                Log.v(TAG, "Video Checkbox2: " + position);
                return;

        }
        //Log.v(TAG, "Video Checkbox: " + position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}