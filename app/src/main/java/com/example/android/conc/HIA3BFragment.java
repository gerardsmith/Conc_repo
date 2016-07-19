package com.example.android.conc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class HIA3BFragment extends Fragment {

    public static HIA3BFragment newInstance() {
        HIA3BFragment fragment = new HIA3BFragment();
        return fragment;
    }

    public HIA3BFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia3_b, container, false);
        String [] game_event =
                {"Tackling",
                        "Being tackled",
                        "Ruck/maul",
                        "Scrum",
                        "Accidental collision",
                        "Unknown",
                        "Other"
                };
        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner28);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, game_event);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        String [] collision_with =
                {"Opponent",
                        "Co-player",
                        "Ground",
                       "Unknown",
                        "Other"
                };
        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.spinner29);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, collision_with);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);

        String [] contact =
                {"Head with head",
                        "Head with shoulder",
                        "Head with upper limb",
                        "Head with knee or hip",
                        "Head with foot/lower leg",
                        "Head with ground",
                        "Indirect transmission of force to head",
                        "Unknown",
                        "Other"
                };
        Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner30);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, contact);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);


        String [] player_technique =
                {"Correct technique",
                        "Incorrect head position",
                        "Other incorrect technique",
                        "Unknown",
                        "Not applicable",
                        "Other"
                };
        Spinner spinner3 = (Spinner) rootView.findViewById(R.id.spinner31);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, player_technique);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);
        return rootView;
    }
}