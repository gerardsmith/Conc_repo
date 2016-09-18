package com.example.android.conc;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
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
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.w3c.dom.Text;

import java.util.HashMap;

public class HIA1AActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    boolean HIA1_Test1_Question13;
    public HIA1AActivity hia1test;

    //testResults attemp1 = new testResults();
    HIA1 objHIA1=new HIA1();
    HIA1FFragment fragObjHia1 = new HIA1FFragment();
    boolean HIA1_Test1_Question1 = false;
    boolean HIA1_Test1_Question2 = false;
    boolean HIA1_Test1_Question3 = false;
    boolean HIA1_Test1_Question4 = false;
    boolean HIA1_Test1_Question5 = false;
    boolean HIA1_Test1_Question6 = false;
    boolean HIA1_Test1_Question7 = false;
    boolean HIA1_Test1_Question8 = false;
    boolean HIA1_Test1_Question9 = false;
    boolean HIA1_Test1_Question10 = false;
    boolean HIA1_Test1_Question11 = false;

    public HIA1 databasetest;

    private static final String TAG = "Video Check";
    Spinner spinner;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    private GoogleApiClient client;

    //This function calls AsyncTask [insertHIA1], which submit the HIA1 data to insertHIA1.php file.
    public void submitHIA1(View view) {

        new HIA1insertAsync(objHIA1).execute(); //Call async Task
    }

    //---------------------------------------------
    //------------JSON ----------------------------

    private class HIA1insertAsync extends AsyncTask<Void, Void, JSONArray> {

        HIA1 objectHIA1=new HIA1();
        // Alert Dialog Manager
        AlertDialogManager alert = new AlertDialogManager();

        private static final String URL = "http://10.0.2.2/ConcApp/insertHIA1.php"; // Needs to be changed when using different php files.
        private static final String TAG_SUCCESS = "success";
        private static final String TAG_MESSAGE = "message";


        JSONParser jsonParser = new JSONParser();

        private ProgressDialog pDialog;

        public HIA1insertAsync(HIA1 objectHIA1Param){
            Log.d("JSONCONSTRUCTOR", "Start");
            Toast.makeText(getApplicationContext(), "Starting JSON", Toast.LENGTH_SHORT).show();
            this.objectHIA1=objectHIA1Param;
        }

        @Override
        protected void onPreExecute() {
            Log.d("JSonInsTeam", "Start");
            pDialog = new ProgressDialog(HIA1AActivity.this);
            pDialog.setMessage("Attempting register...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }
        @Override
        protected JSONArray doInBackground(Void... params) {

            Log.d("JSonInsTeam", "Background");
            try {
                //    Log.d("JSON REQUEST", "Start ...");

                // PREPARING PARAMETERS..
                Log.d("JSON REQUEST", "Preparing Params ...");
                HashMap<String, String> args = new HashMap<>();
                args.put("HIA1_Test1_Question1", Integer.toString(this.objectHIA1.getHIA1_Test1_Question1()));
                args.put("HIA1_Test1_Question2", Integer.toString(this.objectHIA1.getHIA1_Test1_Question2()));
                args.put("HIA1_Test1_Question3", Integer.toString(this.objectHIA1.getHIA1_Test1_Question3()));
                args.put("HIA1_Test1_Question4", Integer.toString(this.objectHIA1.getHIA1_Test1_Question4()));
                args.put("HIA1_Test1_Question5", Integer.toString(this.objectHIA1.getHIA1_Test1_Question5()));
                args.put("HIA1_Test1_Question6", Integer.toString(this.objectHIA1.getHIA1_Test1_Question6()));
                args.put("HIA1_Test1_Question7", Integer.toString(this.objectHIA1.getHIA1_Test1_Question7()));
                args.put("HIA1_Test1_Question8", Integer.toString(this.objectHIA1.getHIA1_Test1_Question8()));
                args.put("HIA1_Test1_Question9", Integer.toString(this.objectHIA1.getHIA1_Test1_Question9()));
                args.put("HIA1_Test1_Question10", Integer.toString(this.objectHIA1.getHIA1_Test1_Question10()));
                args.put("HIA1_Test1_Question11", Integer.toString(this.objectHIA1.getHIA1_Test1_Question11()));
                args.put("HIA1_Test1_Question12", Integer.toString(this.objectHIA1.getHIA1_Test1_Question12()));
                args.put("HIA1_Test1_Question13", Integer.toString(this.objectHIA1.getHIA1_Test1_Question13()));

                args.put("HIA1_Test2_Question1", Integer.toString(this.objectHIA1.getHIA1_Test2_Question1()));
                args.put("HIA1_Test2_Question2", Integer.toString(this.objectHIA1.getHIA1_Test2_Question2()));
                args.put("HIA1_Test2_Question3", Integer.toString(this.objectHIA1.getHIA1_Test2_Question3()));
                args.put("HIA1_Test2_Question4", Integer.toString(this.objectHIA1.getHIA1_Test2_Question4()));
                args.put("HIA1_Test2_Question5", Integer.toString(this.objectHIA1.getHIA1_Test2_Question5()));
                args.put("HIA1_Test2_Question6", this.objectHIA1.getHIA1_Test2_Question6());

                args.put("HIA1_Test3_Question1", Integer.toString(this.objectHIA1.getHIA1_Test3_Question1()));
                args.put("HIA1_Test3_Question2", Integer.toString(this.objectHIA1.getHIA1_Test3_Question2()));
                args.put("HIA1_Test3_Question3", Integer.toString(this.objectHIA1.getHIA1_Test3_Question3()));
                args.put("HIA1_Test3_Question4", Integer.toString(this.objectHIA1.getHIA1_Test3_Question4()));
                args.put("HIA1_Test3_Question5", Integer.toString(this.objectHIA1.getHIA1_Test3_Question5()));

                args.put("HIA1_Test4_Question1", Integer.toString(this.objectHIA1.getHIA1_Test4_Question1()));
                args.put("HIA1_Test4_Question2", Integer.toString(this.objectHIA1.getHIA1_Test4_Question2()));

                args.put("HIA1_Test5_Question1", Integer.toString(this.objectHIA1.getHIA1_Test5_Question1()));
                args.put("HIA1_Test5_Question2", Integer.toString(this.objectHIA1.getHIA1_Test5_Question2()));
                args.put("HIA1_Test5_Question3", Integer.toString(this.objectHIA1.getHIA1_Test5_Question3()));
                args.put("HIA1_Test5_Question4", Integer.toString(this.objectHIA1.getHIA1_Test5_Question4()));
                args.put("HIA1_Test5_Question5", Integer.toString(this.objectHIA1.getHIA1_Test5_Question5()));
                args.put("HIA1_Test5_Question6", Integer.toString(this.objectHIA1.getHIA1_Test5_Question6()));
                args.put("HIA1_Test5_Question7", Integer.toString(this.objectHIA1.getHIA1_Test5_Question7()));
                args.put("HIA1_Test5_Question8", Integer.toString(this.objectHIA1.getHIA1_Test5_Question8()));
                args.put("HIA1_Test5_Question9", Integer.toString(this.objectHIA1.getHIA1_Test5_Question9()));

                args.put("HIA1_Test6_Question1", Integer.toString(this.objectHIA1.getHIA1_Test6_Question1()));
                args.put("HIA1_Test6_Question2", Integer.toString(this.objectHIA1.getHIA1_Test6_Question2()));
                args.put("HIA1_Test6_Question3", Integer.toString(this.objectHIA1.getHIA1_Test6_Question3()));
                args.put("HIA1_Test6_Question4", Integer.toString(this.objectHIA1.getHIA1_Test6_Question4()));

                args.put("HIA1_Test7_Question1", Integer.toString(this.objectHIA1.getHIA1_Test7_Question1()));
                args.put("HIA1_Test7_Question2", Integer.toString(this.objectHIA1.getHIA1_Test7_Question2()));
                args.put("HIA1_Test7_Question3", Integer.toString(this.objectHIA1.getHIA1_Test7_Question3()));
                args.put("HIA1_Test7_Question4", Integer.toString(this.objectHIA1.getHIA1_Test7_Question4()));
                args.put("HIA1_Test7_Question5", Integer.toString(this.objectHIA1.getHIA1_Test7_Question5()));
                args.put("HIA1_Test7_Question6", Integer.toString(this.objectHIA1.getHIA1_Test7_Question6()));
                // all args needs to convert to string because the hash map is string, string types.

                //   Log.d("JSON REQUEST", args.toString());
                Log.d("JSON REQUEST", "Firing Json ...");
                JSONArray json = jsonParser.makeHttpRequest(
                        URL, "POST", args);
                Log.d("json", "0bject = " + json);

                if (json != null) {
                    Log.d("I got", "in here?");
                    Log.d("JSON REQUEST", params.toString());
                    Log.d("JSON result", json.toString());

                    return json;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(JSONArray json) {
            Log.d("JSonInsTeam", "Finish");
            if (pDialog != null && pDialog.isShowing()) {
                pDialog.dismiss();
            }
            int success = 0;
            String message = "";

            if (json != null) {
                Toast.makeText(HIA1AActivity.this, json.toString(), Toast.LENGTH_LONG).show();

                try {
                    success = json.getJSONObject(0).getInt(TAG_SUCCESS);
                    message = json.getJSONObject(0).getString(TAG_MESSAGE);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            if (success == 1) {
                Log.d("Success!", message);

                finish();
            } else {
                // Problems SQL
                alert.showAlertDialog(HIA1AActivity.this, "Insert failed..", "Something went wrong, see Failure Log", false);
                Log.d("Failure", message);
                finish();
            }
        }


    }
    //-------END JSON----------------
    //-------------------------------

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
          private int HIA1_Test1_Question12;
          //database
          public HIA1AActivity hia1test;


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
            HIA1_Test1_Question12 = position;

            Activity a = getActivity();
            if(a instanceof HIA1AActivity) {
                hia1test = (HIA1AActivity) getActivity();
                hia1test.objHIA1.setHIA1_Test1_Question12(position);
            }


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

            return "HIA1 (" + (position + 1) + "/7)";
        }

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        Activity a = this;
        if(a instanceof HIA1AActivity) {
            hia1test = (HIA1AActivity) this;

            switch (view.getId()) {
                case R.id.checkBox_yes:
                    if (checked)
                        HIA1_Test1_Question13 = true;
                    hia1test.objHIA1.setHIA1_Test1_Question13(1);
                    Log.v(TAG, "Video Checkbox: " + HIA1_Test1_Question13);
                    break;
                case R.id.checkBox_no:
                    if (checked)
                        HIA1_Test1_Question13 = false;
                    hia1test.objHIA1.setHIA1_Test1_Question13(0);
                    Log.v(TAG, "Video Checkbox: " + HIA1_Test1_Question13);
                    break;
            }
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

       Activity a = this;
       if(a instanceof HIA1AActivity) {
            hia1test = (HIA1AActivity) this;

           // Check which radio button was clicked
           switch (view.getId()) {
               case R.id.checkBox_TP:
                   if (ch1.isChecked()) {
                       HIA1_Test1_Question1 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question1(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question1);
                   } else {
                       HIA1_Test1_Question1 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question1(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question1);
                   }
                   break;
               case R.id.checkBox_CONV:
                   if (ch2.isChecked()) {
                       HIA1_Test1_Question2 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question2(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question2);
                   } else {
                       HIA1_Test1_Question2 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question2(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question2);
                   }
                   break;
               case R.id.checkBox_CCONSC:
                   if (ch3.isChecked()) {
                       HIA1_Test1_Question3 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question3(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question3);
                   } else {
                       HIA1_Test1_Question3 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question3(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question3);
                   }
                   break;
               case R.id.checkBox_SCONSC:
                   if (ch4.isChecked()) {
                       HIA1_Test1_Question4 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question4(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question4);
                   } else {
                       HIA1_Test1_Question4 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question4(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question4);
                   }
                   break;
               case R.id.checkBox_BAL:
                   if (ch5.isChecked()) {
                       HIA1_Test1_Question5 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question5(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question5);
                   } else {
                       HIA1_Test1_Question5 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question5(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question5);
                   }
                   break;
               case R.id.checkBox_ORIEN:
                   if (ch6.isChecked()) {
                       HIA1_Test1_Question6 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question6(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question6);
                   } else {
                       HIA1_Test1_Question6 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question6(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question6);
                   }
                   break;
               case R.id.checkBox_DAZE:
                   if (ch7.isChecked()) {
                       HIA1_Test1_Question7 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question7(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question7);
                   } else {
                       HIA1_Test1_Question7 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question7(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question7);
                   }
                   break;
               case R.id.checkBox_CONF:
                   if (ch8.isChecked()) {
                       HIA1_Test1_Question8 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question8(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question8);
                   } else {
                       HIA1_Test1_Question8 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question8(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question8);
                   }
                   break;
               case R.id.checkBox_BEHAV:
                   if (ch9.isChecked()) {
                       HIA1_Test1_Question9 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question9(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question9);
                   } else {
                       HIA1_Test1_Question9 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question9(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question9);
                   }
                   break;
               case R.id.checkBox_IDENT:
                   if (ch10.isChecked()) {
                       HIA1_Test1_Question10 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question10(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question10);
                   } else {
                       HIA1_Test1_Question10 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question10(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question10);
                   }
                   break;
               case R.id.checkBox_OCU:
                   if (ch11.isChecked()) {
                       HIA1_Test1_Question11 = true;
                       hia1test.objHIA1.setHIA1_Test1_Question11(1);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question11);
                   } else {
                       HIA1_Test1_Question11 = false;
                       hia1test.objHIA1.setHIA1_Test1_Question11(0);
                       Log.v(TAG, "Test: " + HIA1_Test1_Question11);
                   }
                   break;
           }

       }
    }

}
