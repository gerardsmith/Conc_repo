package com.example.android.conc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new TestMenuFragment())
                    .commit();
        }
    }

    public static class TestMenuFragment extends Fragment {

        ArrayAdapter<String> testmenuadapter;
        int testMenuButton=0;
        public TestMenuFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_testmenu, container, false);
            String[] testmenuArray = getResources().getStringArray(R.array.testmenu_array);
            List<String> testMenu = new ArrayList<String>(Arrays.asList(testmenuArray));

            testmenuadapter = new ArrayAdapter<String>(
                    getActivity(),R.layout.list_item_menu,
                    R.id.list_item_menu_textview,testMenu);

            // get reference to the listview id
            ListView l_id= (ListView)rootView.findViewById(R.id.listview_testmenu);
            //Binding the adapter to the list view in the fragment xml file
            l_id.setAdapter(testmenuadapter);

            // The Test Menu called via intent.
            // This displays the menu item selected on the preceding activity
            // in the future can use this to maybe set the heading
            //Intent intent = getActivity().getIntent();
            /*if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
                String forecastStr = intent.getStringExtra(Intent.EXTRA_TEXT);
                ((TextView) rootView.findViewById(R.id.testmenu_text))
                        .setText(forecastStr);
            }*/

            l_id.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> adapterView,View view, int i, long l){
                    String pushed_menu = testmenuadapter.getItem(i);
                    //Toast.makeText(getActivity(),pushed_menu,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), AdministratorActivity.class);
                    //.putExtra(Intent.EXTRA_TEXT, pushed_menu);
                    testMenuButton=i;
                    startActivity(intent);

                }
            });

            return rootView;
        }
    }

}
