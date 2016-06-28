package com.example.android.conc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdministratorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new AdministratorFragment())
                    .commit();
        }
    }

    public static class AdministratorFragment extends Fragment {
        public Button startTestBut;
        public String test_menu_sel;
        ArrayAdapter<String> adminadapter;
        public AdministratorFragment() {
        }

       /* public void init(){

            startTestBut = (Button)getView().findViewById(R.id.start_test_button);

            startTestBut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent hiaMenu = new Intent(getActivity(),HIA1AActivity.class);
                    startActivity(hiaMenu);


                }
            });
        }*/

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_administrator, container, false);
            startTestBut = (Button)rootView.findViewById(R.id.start_test_button);

            //added

            Intent intent = getActivity().getIntent();
            if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
                test_menu_sel = intent.getStringExtra(Intent.EXTRA_TEXT);
            }

            //

            startTestBut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final String tag = "MENU_APPLIED";
                    Intent hia1Menu = new Intent(getActivity(),HIA1AActivity.class);
                    Intent hia2Menu = new Intent(getActivity(),HIA2AActivity.class);
                    Intent hia3Menu = new Intent(getActivity(),HIA3AActivity.class);
                    Log.v(tag,"At if statement\nValue of i: " + test_menu_sel );
                    if (test_menu_sel.equals("0"))
                    {
                        startActivity(hia1Menu);
                    }
                    else if(test_menu_sel.equals("1")){
                        startActivity(hia2Menu);
                    }
                    else {
                        startActivity(hia3Menu);
                    }


                }
            });

            return rootView;
        }
    }

}
