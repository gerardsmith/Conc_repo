package com.example.android.conc;

import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class HIA1AActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int vid;
    boolean mad_ven;
    boolean mad_half;
    boolean mad_scored;
    boolean mad_play;
    boolean mad_win;

   /* boolean symp1;
    boolean symp2;
    boolean symp3;
    boolean symp4;
    boolean symp5;
    boolean symp6;
    boolean symp7;
    boolean symp8;
    boolean symp9;*/

    /*boolean cs1;
    boolean cs2;
    boolean cs3;*/

   /* boolean HIA1form1;
    boolean HIA1form2;
    boolean HIA1form3;*/


    boolean remov_1 = false;
    boolean remov_2 = false;
    boolean remov_3 = false;
    boolean remov_4 = false;
    boolean remov_5 = false;
    boolean remov_6 = false;
    boolean remov_7 = false;
    boolean remov_8 = false;
    boolean remov_9 = false;
    boolean remov_010 = false;
    boolean remov_011 = false;


/*    boolean remov_10 = false;
    boolean remov_11 = false;
    boolean remov_12 = false;
    boolean remov_13 = false;
    boolean remov_14 = false;
    boolean remov_15 = false;*/
    //private static String HIA_other_reason;
    private static final String TAG = "Video Check";
    Spinner spinner;
    /**
     * The {@link PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "You selected ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

      /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements AdapterView.OnItemSelectedListener {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private ArrayAdapter<CharSequence> adapter;

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_hia1_a, container, false);
            //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner32);

            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, req_by);
            //adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            this.adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hia1_1_spinner, android.R.layout.simple_spinner_dropdown_item);
            this.adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hia1_1_spinner, R.layout.multiline_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);

            return rootView;
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //TextView myText = (TextView) view;
            //String myTextString = myText.toString();
            //Toast.makeText(this, "You selected " + myText, Toast.LENGTH_SHORT).show();
            Log.v(TAG, "Video Checkbox: " + position);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    return PlaceholderFragment.newInstance(position + 1);
                case 1:
                    return HIA1BFragment.newInstance();
                case 2:
                    return HIA1CFragment.newInstance();
                case 3:
                    return HIA1GFragment.newInstance();
                case 4:
                    return HIA1DFragment.newInstance();
                case 5:
                    return HIA1EFragment.newInstance();
                case 6:
                    return HIA1FFragment.newInstance();

            }

            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            /*switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
            */
            return "HIA1 TEST " + (position + 1);
        }

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.checkBox_yes:
                if (checked)
                    vid = 1;
                Log.v(TAG, "Video Checkbox: " + vid);
                break;
            case R.id.checkBox_no:
                if (checked)
                    vid = 0;
                Log.v(TAG, "Video Checkbox: " + vid);
                break;
        }
    }

   public void onCheckBoxSelected(View view) {
        boolean checked2 = ((CheckBox) view).isChecked();
        final CheckBox ch1 = (CheckBox) findViewById(R.id.checkBox_TP);
        final CheckBox ch2 = (CheckBox) findViewById(R.id.checkBox_CONV);
        final CheckBox ch3 = (CheckBox) findViewById(R.id.checkBox_CCONSC);
        final CheckBox ch4 = (CheckBox) findViewById(R.id.checkBox_SCONSC);
        final CheckBox ch5 = (CheckBox) findViewById(R.id.checkBox_BAL);
        final CheckBox ch6 = (CheckBox) findViewById(R.id.checkBox_ORIEN);
        final CheckBox ch7 = (CheckBox) findViewById(R.id.checkBox_DAZE);
        final CheckBox ch8 = (CheckBox) findViewById(R.id.checkBox_CONF);
        final CheckBox ch9 = (CheckBox) findViewById(R.id.checkBox_BEHAV);
        final CheckBox ch10 = (CheckBox) findViewById(R.id.checkBox_IDENT);
        final CheckBox ch11 = (CheckBox) findViewById(R.id.checkBox_OCU);


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.checkBox_TP:
                if (ch1.isChecked()) {
                    remov_1 = true;
                    Log.v(TAG, "Test: " + remov_1);
                } else {
                    remov_1 = false;
                    Log.v(TAG, "Test: " + remov_1);
                }
                break;
            case R.id.checkBox_CONV:
                if (ch2.isChecked()) {
                    remov_2 = true;
                    Log.v(TAG, "Test: " + remov_2);
                } else {
                    remov_2 = false;
                    Log.v(TAG, "Test: " + remov_2);
                }
                break;
            case R.id.checkBox_CCONSC:
                if (ch3.isChecked()) {
                    remov_3 = true;
                    Log.v(TAG, "Test: " + remov_3);
                } else {
                    remov_3 = false;
                    Log.v(TAG, "Test: " + remov_3);
                }
                break;
            case R.id.checkBox_SCONSC:
                if (ch4.isChecked()) {
                    remov_4 = true;
                    Log.v(TAG, "Test: " + remov_4);
                } else {
                    remov_4 = false;
                    Log.v(TAG, "Test: " + remov_4);
                }
                break;
            case R.id.checkBox_BAL:
                if (ch5.isChecked()) {
                    remov_5 = true;
                    Log.v(TAG, "Test: " + remov_5);
                } else {
                    remov_5 = false;
                    Log.v(TAG, "Test: " + remov_5);
                }
                break;
            case R.id.checkBox_ORIEN:
                if (ch6.isChecked()) {
                    remov_6 = true;
                    Log.v(TAG, "Test: " + remov_6);
                } else {
                    remov_6 = false;
                    Log.v(TAG, "Test: " + remov_6);
                }
                break;
            case R.id.checkBox_DAZE:
                if (ch7.isChecked()) {
                    remov_7 = true;
                    Log.v(TAG, "Test: " + remov_7);
                } else {
                    remov_7 = false;
                    Log.v(TAG, "Test: " + remov_7);
                }
                break;
            case R.id.checkBox_CONF:
                if (ch8.isChecked()) {
                    remov_8 = true;
                    Log.v(TAG, "Test: " + remov_8);
                } else {
                    remov_8 = false;
                    Log.v(TAG, "Test: " + remov_8);
                }
                break;
            case R.id.checkBox_BEHAV:
                if (ch9.isChecked()) {
                    remov_9 = true;
                    Log.v(TAG, "Test: " + remov_9);
                } else {
                    remov_9 = false;
                    Log.v(TAG, "Test: " + remov_9);
                }
                break;
            case R.id.checkBox_IDENT:
                if (ch10.isChecked()) {
                    remov_010 = true;
                    Log.v(TAG, "Test: " + remov_010);
                } else {
                    remov_010 = false;
                    Log.v(TAG, "Test: " + remov_010);
                }
                break;
            case R.id.checkBox_OCU:
                if (ch11.isChecked()) {
                    remov_011 = true;
                    Log.v(TAG, "Test: " + remov_011);
                } else {
                    remov_011 = false;
                    Log.v(TAG, "Test: " + remov_011);
                }
                break;
        }
    }

    /*public void onCheckBoxSelected2(View view) {
        boolean checked2 = ((CheckBox) view).isChecked();
        final CheckBox ch11 = (CheckBox) view.findViewById(R.id.checkBox_RHEAD);
        final CheckBox ch12 = (CheckBox) view.findViewById(R.id.checkBox_RBEHAV);
        final CheckBox ch13 = (CheckBox) view.findViewById(R.id.checkBox_RCONF);
        final CheckBox ch14 = (CheckBox) view.findViewById(R.id.checkBox_RINJ);
        final CheckBox ch15 = (CheckBox) view.findViewById(R.id.checkBox_ROTHER);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.checkBox_RHEAD:
                if (ch11.isChecked()) {
                    remov_11 = true;
                    Log.v(TAG, "Test: " + remov_11);
                } else {
                    remov_11 = false;
                    Log.v(TAG, "Test: " + remov_11);
                }
                break;
            case R.id.checkBox_RBEHAV:
                if (ch12.isChecked()) {
                    remov_12 = true;
                    Log.v(TAG, "Test: " + remov_12);
                } else {
                    remov_12 = false;
                    Log.v(TAG, "Test: " + remov_12);
                }
                break;
            case R.id.checkBox_RCONF:
                if (ch13.isChecked()) {
                    remov_13 = true;
                    Log.v(TAG, "Test: " + remov_13);
                } else {
                    remov_13 = false;
                    Log.v(TAG, "Test: " + remov_13);
                }
                break;
            case R.id.checkBox_RINJ:
                if (ch14.isChecked()) {
                    remov_14 = true;
                    Log.v(TAG, "Test: " + remov_14);
                } else {
                    remov_14 = false;
                    Log.v(TAG, "Test: " + remov_14);
                }
                break;
            case R.id.checkBox_ROTHER:
                if (ch15.isChecked()) {
                    remov_15 = true;
                    Log.v(TAG, "Test: " + remov_15);
                } else {
                    remov_15 = false;
                    Log.v(TAG, "Test: " + remov_15);
                }
                break;

        }
    }*/

    /*public void onCheckBoxSelected_Mad(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_MADD1_INC:
                if (checked)
                    mad_ven = false;
                Log.v(TAG, "Mad Checkbox: " + mad_ven);
                break;
            case R.id.checkBox_MADD1_COR:
                if (checked)
                    mad_ven = true;
                Log.v(TAG, "Mad Checkbox: " + mad_ven);
                break;
            case R.id.checkBox_MADD2_INC:
                if (checked)
                    mad_half = false;
                Log.v(TAG, "Mad Checkbox: " + mad_half);
                break;
            case R.id.checkBox_MADD2_COR:
                if (checked)
                    mad_half = true;
                Log.v(TAG, "Mad Checkbox: " + mad_half);
                break;
            case R.id.checkBox_MADD3_INC:
                if (checked)
                    mad_scored = false;
                Log.v(TAG, "Mad Checkbox: " + mad_scored);
                break;
            case R.id.checkBox_MADD3_COR:
                if (checked)
                    mad_scored = true;
                Log.v(TAG, "Mad Checkbox: " + mad_scored);
                break;
            case R.id.checkBox_MADD4_INC:
                if (checked)
                    mad_play = false;
                Log.v(TAG, "Mad Checkbox: " + mad_play);
                break;
            case R.id.checkBox_MADD4_COR:
                if (checked)
                    mad_play = true;
                Log.v(TAG, "Mad Checkbox: " + mad_play);
                break;
            case R.id.checkBox_MADD5_INC:
                if (checked)
                    mad_win = false;
                Log.v(TAG, "Mad Checkbox: " + mad_win);
                break;
            case R.id.checkBox_MADD5_COR:
                if (checked)
                    mad_win = true;
                Log.v(TAG, "Mad Checkbox: " + mad_win);
                break;
        }
    }
*/
   /* public void onCheckBoxSelected_Symp(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_Symp22_y:
                if (checked)
                    symp1 = true;
                Log.v(TAG, "Mad Checkbox: " + symp1);
                break;
            case R.id.checkBox_Symp22_n:
                if (checked)
                    symp1 = false;
                Log.v(TAG, "Mad Checkbox: " + symp1);
                break;
            case R.id.checkBox_Symp23_y:
                if (checked)
                    symp2 = true;
                Log.v(TAG, "Mad Checkbox: " + symp2);
                break;
            case R.id.checkBox_Symp23_n:
                if (checked)
                    symp2 = false;
                Log.v(TAG, "Mad Checkbox: " + symp2);
                break;
            case R.id.checkBox_Symp24_y:
                if (checked)
                    symp3 = true;
                Log.v(TAG, "Mad Checkbox: " + symp3);
                break;
            case R.id.checkBox_Symp24_n:
                if (checked)
                    symp3 = false;
                Log.v(TAG, "Mad Checkbox: " + symp3);
                break;
            case R.id.checkBox_Symp25_y:
                if (checked)
                    symp4 = true;
                Log.v(TAG, "Mad Checkbox: " + symp4);
                break;
            case R.id.checkBox_Symp25_n:
                if (checked)
                    symp4 = false;
                Log.v(TAG, "Mad Checkbox: " + symp4);
                break;
            case R.id.checkBox_Symp26_y:
                if (checked)
                    symp5 = true;
                Log.v(TAG, "Mad Checkbox: " + symp5);
                break;
            case R.id.checkBox_Symp26_n:
                if (checked)
                    symp5 = false;
                Log.v(TAG, "Mad Checkbox: " + symp5);
                break;
            case R.id.checkBox_Symp27_y:
                if (checked)
                    symp6 = true;
                Log.v(TAG, "Mad Checkbox: " + symp6);
                break;
            case R.id.checkBox_Symp27_n:
                if (checked)
                    symp6 = false;
                Log.v(TAG, "Mad Checkbox: " + symp6);
                break;
            case R.id.checkBox_Symp28_y:
                if (checked)
                    symp7 = true;
                Log.v(TAG, "Mad Checkbox: " + symp7);
                break;
            case R.id.checkBox_Symp28_n:
                if (checked)
                    symp7 = false;
                Log.v(TAG, "Mad Checkbox: " + symp7);
                break;
            case R.id.checkBox_Symp29_y:
                if (checked)
                    symp8 = true;
                Log.v(TAG, "Mad Checkbox: " + symp8);
                break;
            case R.id.checkBox_Symp29_n:
                if (checked)
                    symp8 = false;
                Log.v(TAG, "Mad Checkbox: " + symp9);
                break;
            case R.id.checkBox_Symp210_y:
                if (checked)
                    symp9 = true;
                Log.v(TAG, "Mad Checkbox: " + symp9);
                break;
            case R.id.checkBox_Symp210_n:
                if (checked)
                    symp9 = false;
                Log.v(TAG, "Mad Checkbox: " + symp9);
                break;
        }
    }
*/
   /* public void onCheckBoxSelected_clinical(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_CS1_Y:
                if (checked)
                    cs1 = true;
                Log.v(TAG, "Mad Checkbox: " + cs1);
                break;
            case R.id.checkBox_CS1_N:
                if (checked)
                    cs1 = false;
                Log.v(TAG, "Mad Checkbox: " + cs1);
                break;
            case R.id.checkBox_CS2_Y:
                if (checked)
                    cs2 = true;
                Log.v(TAG, "Mad Checkbox: " + cs2);
                break;
            case R.id.checkBox_CS2_N:
                if (checked)
                    cs2 = false;
                Log.v(TAG, "Mad Checkbox: " + cs2);
                break;
            case R.id.checkBox_CS3_Y:
                if (checked)
                    cs3 = true;
                Log.v(TAG, "Mad Checkbox: " + cs3);
                break;
            case R.id.checkBox_CS3_N:
                if (checked)
                    cs3 = false;
                Log.v(TAG, "Mad Checkbox: " + cs3);
                break;

        }
    }*/

   /* public void onCheckBoxSelected_HIA1form(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_VI_Y:
                if (checked)
                    HIA1form1 = true;
                Log.v(TAG, "Mad Checkbox: " + HIA1form1);
                break;
            case R.id.checkBox_VI_N:
                if (checked)
                    HIA1form1 = false;
                Log.v(TAG, "Mad Checkbox: " + HIA1form1);
                break;
            case R.id.checkBox_MDD_Y:
                if (checked)
                    HIA1form2 = true;
                Log.v(TAG, "Mad Checkbox: " + HIA1form2);
                break;
            case R.id.checkBox_MDD_N:
                if (checked)
                    HIA1form2 = false;
                Log.v(TAG, "Mad Checkbox: " + HIA1form2);
                break;
            case R.id.checkBox_VI2_Y:
                if (checked)
                    HIA1form3 = true;
                Log.v(TAG, "Mad Checkbox: " + HIA1form3);
                break;
            case R.id.checkBox_VI2_N:
                if (checked)
                    HIA1form3 = false;
                Log.v(TAG, "Mad Checkbox: " + HIA1form3);
                break;

        }
    }*/
}
