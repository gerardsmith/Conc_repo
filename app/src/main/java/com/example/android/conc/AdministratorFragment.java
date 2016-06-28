package com.example.android.conc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AdministratorFragment extends android.app.Fragment {


    public Button startTestBut;

    public void init(){

        startTestBut = (Button)getView().findViewById(R.id.start_test_button);

        startTestBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hiaMenu = new Intent(getActivity(),HIA1AActivity.class);
                startActivity(hiaMenu);


            }
        });
    }

   /* public void init (View view){
        Intent hiaMenu = new Intent(getActivity(),HIA1AActivity.class);
        startActivity(hiaMenu);
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView2 = inflater.inflate(R.layout.fragment_administrator, container, false);
        //Button startTestBut = (Button)rootView2.findViewById(R.id.start_test_button);
        init();
        Log.d("Test", "onClickListener ist gestartet");

        return rootView2;

    }

    /*@Override
    public void onViewCreated(final View view,Bundle savedInstanceState ){
        Button startTestBut = (Button)view.findViewById(R.id.start_test_button);
        startTestBut.setOnClickListener(this);

    }*/

}
