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


public class HIA2EFragment extends Fragment {

    TextView o_result;
    String o_result_string;
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

        /*Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            o_result_string = intent.getStringExtra(Intent.EXTRA_TEXT);
        }*/

       // o_result = (TextView) rootView.findViewById(R.id.textView_orientationresult);
       // o_result.setVisibility(View.GONE);
        //o_result_string= String.valueOf(tempval);
       // o_result.setText(o_result_string);

       // String myTag = getTag();
       // Log.v(TAG, "Orien Tag: " + myTag);

       // ((HIA2AActivity)getActivity()).setTabFragmentB(myTag);
        //String delmemstring =delmem.getText().toString();

        delmem.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String delmemstring =delmem.getText().toString();
                Log.v(TAG, "Video Checkbox: " + delmemstring);
            }
        });
        return rootView;
    }

/*    @Override
    public void onPause( ){
        super.onPause();
        if(delmem.getText() != null) {
            String delmemstring =delmem.getText().toString();
            Log.v(TAG, "Video Checkbox: " + delmemstring);
        }
    }
*/
    /*public void updateOrientationScore(String O_score)
    {
        o_result.setText(O_score);
        o_result.setVisibility(View.VISIBLE);
    }*/

   /* public void Fucntion_FragmantB(String O_score)
   {
       o_result.setText(O_score);
       o_result.setVisibility(View.VISIBLE);
    }*/
}