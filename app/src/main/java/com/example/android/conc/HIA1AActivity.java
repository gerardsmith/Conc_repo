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


    private static final String TAG = "Video Check";
    Spinner spinner;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

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
          private int removal_req_by;

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
            Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner32);

            this.adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hia1_1_spinner, android.R.layout.simple_spinner_dropdown_item);
            this.adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hia1_1_spinner, R.layout.multiline_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);

            return rootView;
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Log.v(TAG, "Spinner pos: " + position);
            removal_req_by = position;

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.

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

}
