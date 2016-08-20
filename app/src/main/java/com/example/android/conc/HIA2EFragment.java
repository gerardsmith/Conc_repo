package com.example.android.conc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.conc.R.id.textView_orientationresult;


public class HIA2EFragment extends Fragment {

    public HIA2AActivity attempt;
    TextView o_result;
    String o_result_string;
    TextView textView;
    int tempval;
    private EditText delmem;
    private static final String TAG = "Tag Check";
    public static HIA2EFragment newInstance() {
        HIA2EFragment fragment = new HIA2EFragment();
        return fragment;
    }

        public HIA2EFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia2_e, container, false);
        delmem = (EditText) rootView.findViewById(R.id.editText12);

        //o_result = (TextView) rootView.findViewById(R.id.textView_orientationresult);
        //o_result.setVisibility(View.GONE);
        //Log.v(TAG, "TEMPVAL: " + tempval);
        //o_result_string= String.valueOf(tempval);
       // o_result.setText(o_result_string);

       // String myTag = getTag();
       // Log.v(TAG, "Orien Tag: " + myTag);

       // ((HIA2AActivity)getActivity()).setTabFragmentB(myTag);
        //String delmemstring =delmem.getText().toString();
        //textView = (TextView) rootView.findViewById(textView_orientationresult);
        //Bundle bundle = getArguments();
        //Log.v(TAG, "Got here");
        //if (bundle!= null)
        //{
          //  textView.setText(bundle.getInt("pos"));
           // Log.v(TAG, "SET FLAG");
        //}

        delmem.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String delmemstring =delmem.getText().toString();
                Log.v(TAG, "Video Checkbox: " + delmemstring);
            }
        });
        return rootView;
    }

    public void updateOrienScore(int position) {

        //Log.v(TAG, "TEMPVAL: " + position);
        //HIA2EFragment fraggy = new HIA2EFragment();
        /*TextView textView;
        textView = (TextView) getView().findViewById(textView_orientationresult);
        Log.v(TAG, "TEMPVAL tview: " + textView);
        textView.setVisibility(View.VISIBLE);
        o_result_string= String.valueOf(position);
        textView.setText(o_result_string);*/
       // Bundle args = new Bundle();
       // args.putInt("pos",position);
        //fraggy.setArguments(args);
        //tempval= position;


    }
    @Override
    public void onResume()
    {
        super.onResume();
//        attempt = (HIA2AActivity) getActivity();
        textView = (TextView) getView().findViewById(textView_orientationresult);
       o_result_string= String.valueOf(4);//attempt.attemp1.orientation);
        textView.setText(o_result_string);


    }

}