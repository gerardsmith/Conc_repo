package com.example.android.conc;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class HIA2AActivity extends AppCompatActivity
        //implements HIA2DFragment.OnOrientationSelectedListener
        {
            private static final String TAG = "Tag Check";
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

           /* String TabFragmentB;
            public void setTabFragmentB(String t){
                TabFragmentB = t;
                Log.v(TAG, "Orien Tag: " + t);
            }
            public String getTabFragmentB(){
                return TabFragmentB;
            }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

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

    /*@Override
    public void onArticleSelected(int position) {

        HIA2EFragment articleFrag = (HIA2EFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment2);

       if (articleFrag != null) {
            // If article frag is available, we're in two-pane layout...

            // Call a method in the ArticleFragment to update its content
            articleFrag.updateOrientationScore(position);
       }
    }*/

    /*@Override
    public void onOrientationSelected(String orien) {
        HIA2EFragment f2 = (HIA2EFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_two);
        f2.updateOrientationScore(orien);
    }*/


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
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
            View rootView = inflater.inflate(R.layout.fragment_hia2_a, container, false);

            Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner4);

            //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, req_by);
            //adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            this.adapter=ArrayAdapter.createFromResource(this.getActivity(),R.array.hia2_1_spinner,android.R.layout.simple_spinner_dropdown_item);
            this.adapter = ArrayAdapter.createFromResource(this.getActivity(),R.array.hia2_1_spinner,R.layout.multiline_spinner_dropdown_item);
            spinner.setAdapter(adapter);



            return rootView;
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
            switch(position)
            {
                case 0:
                    return PlaceholderFragment.newInstance(position + 1);
                case 1:
                    return HIA2BFragment.newInstance();
                case 2:
                    return HIA2CFragment.newInstance();
                case 3:
                    return HIA2DFragment.newInstance();
                case 4:
                    return HIA2GFragment.newInstance();
                case 5:
                    return HIA2EFragment.newInstance();
                case 6:
                    return HIA2FFragment.newInstance();

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
            return "HIA2 TEST " + (position + 1);
        }

    }
}
