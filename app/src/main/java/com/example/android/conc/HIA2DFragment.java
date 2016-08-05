package com.example.android.conc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;


public class HIA2DFragment extends Fragment {

    // android developer START
   // OnOrientationSelectedListener mCallback;

    String[] wordArray,wordArray1,wordArray2,wordArray3,wordArray4;
    int orien=0;
    String string_orien;
    private static final String TAG = "Video Check";

    public static HIA2DFragment newInstance() {
        HIA2DFragment fragment = new HIA2DFragment();
        return fragment;
    }

    public HIA2DFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hia2_d, container, false);


        wordArray =   getResources().getStringArray(R.array.randomWords);
        wordArray1 =   getResources().getStringArray(R.array.randomWords1);
        wordArray2 =   getResources().getStringArray(R.array.randomWords2);
        wordArray3 =   getResources().getStringArray(R.array.randomWords3);
        wordArray4 =   getResources().getStringArray(R.array.randomWords4);

        //rand word generator
        Random rand = new Random();

        int num11 = rand.nextInt(10);
        int num12 = rand.nextInt(10);
        int num13 = rand.nextInt(10);
        int num14 = rand.nextInt(10);
        int num15 = rand.nextInt(10);

        TextView no_11 = (TextView)rootView.findViewById(R.id.textView43);
        no_11.setText(wordArray[num11] + "  ");
        TextView no_12 = (TextView)rootView.findViewById(R.id.textView42);
        no_12.setText(wordArray1[num12] + "  ");
        TextView no_13 = (TextView)rootView.findViewById(R.id.textView41);
        no_13.setText(wordArray2[num13] + "  ");
        TextView no_14 = (TextView)rootView.findViewById(R.id.textView40);
        no_14.setText(wordArray3[num14] + "  ");
        TextView no_15 = (TextView)rootView.findViewById(R.id.textView37);
        no_15.setText(wordArray4[num15] + "  ");

        int num21 = rand.nextInt(10);
        int num22 = rand.nextInt(10);
        int num23 = rand.nextInt(10);
        int num24 = rand.nextInt(10);
        int num25 = rand.nextInt(10);

        TextView no_21 = (TextView)rootView.findViewById(R.id.textView32);
        no_21.setText(wordArray[num21] + "  ");
        TextView no_22 = (TextView)rootView.findViewById(R.id.textView31);
        no_22.setText(wordArray1[num22] + "  ");
        TextView no_23 = (TextView)rootView.findViewById(R.id.textView29);
        no_23.setText(wordArray2[num23] + "  ");
        TextView no_24 = (TextView)rootView.findViewById(R.id.textView28);
        no_24.setText(wordArray3[num24] + "  ");
        TextView no_25 = (TextView)rootView.findViewById(R.id.textView27);
        no_25.setText(wordArray4[num25] + "  ");

        int num31 = rand.nextInt(10);
        int num32 = rand.nextInt(10);
        int num33 = rand.nextInt(10);
        int num34 = rand.nextInt(10);
        int num35 = rand.nextInt(10);

        TextView no_31 = (TextView)rootView.findViewById(R.id.textView01);
        no_31.setText(wordArray[num31] + "  ");
        TextView no_32 = (TextView)rootView.findViewById(R.id.textView02);
        no_32.setText(wordArray1[num32] + "  ");
        TextView no_33 = (TextView)rootView.findViewById(R.id.textView03);
        no_33.setText(wordArray2[num33] + "  ");
        TextView no_34 = (TextView)rootView.findViewById(R.id.textView04);
        no_34.setText(wordArray3[num34] + "  ");
        TextView no_35 = (TextView)rootView.findViewById(R.id.textView05);
        no_35.setText(wordArray4[num35] + "  ");

        Button mButton = (Button) rootView.findViewById(R.id.checkBox_ORIEN_1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien+1;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);

            }
        });

        Button mButton1 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_2);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
              //  mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton2 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_3);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien+1;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton3 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_4);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton4 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_5);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien+1;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton5 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_6);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton6 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_7);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien+1;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
                //mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton7 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_8);
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
                //mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton8 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_9);
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien+1;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });

        Button mButton9 = (Button) rootView.findViewById(R.id.checkBox_ORIEN_10);
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orien=orien;
                Log.v(TAG, "Orien Score: " + orien);
                string_orien=String.valueOf(orien);
               // mCallback.onOrientationSelected(string_orien);
            }
        });
        //String O_score = String.valueOf(orien);
        /*Intent intent = new Intent(getActivity(), HIA2EFragment.class)
                .putExtra(Intent.EXTRA_TEXT, O_score);
        startActivity(intent);*/

        //android developer
       //mCallback.onOrientationSelected(orien);


       //String TabOfFragmentB = ((HIA2AActivity)getActivity()).getTabFragmentB();

       /* String TabOfFragmentB = "android:switcher:2131558811:5";

        HIA2EFragment fragmentB = (HIA2EFragment)getActivity()
          .getSupportFragmentManager()
          .findFragmentByTag(TabOfFragmentB);
        Log.v(TAG, "Orien Tag: " + TabOfFragmentB);
        String ob;
        ob="1";
        //fragmentB.Fucntion_FragmantB(ob);

        if (fragmentB==null)
        {
            Log.v(TAG, "NULLLLLLLLLLL");
        }*/


       return rootView;
    }


    // Container Activity must implement this interface
   /* public interface OnOrientationSelectedListener {
        public void onOrientationSelected(String position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnOrientationSelectedListener) activity;
        } catch (ClassCastException e) {}

        //video

    }*/

    // END
}