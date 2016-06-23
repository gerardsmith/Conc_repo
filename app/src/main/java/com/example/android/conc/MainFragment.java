package com.example.android.conc;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.text.format.Time;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.SimpleDateFormat;

import android.widget.Toast;

import android.support.v4.app.Fragment;
/**
 * Created by user on 2016/06/21.
 */

public class MainFragment extends android.app.Fragment {

    ArrayAdapter<String> menuadapter;

    public MainFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] menuArray = getResources().getStringArray(R.array.menu_array);


        //String[]  menuArray = {"T","D","R"};

        List<String> mainMenu = new ArrayList<String>(Arrays.asList(menuArray));

        menuadapter = new ArrayAdapter<String>(
                getActivity(),R.layout.list_item_menu,
                R.id.list_item_menu_textview,mainMenu);

        // get reference to the listview id
        ListView l_id= (ListView)rootView.findViewById(R.id.listview_menu);
        //Binding the adapter to the list view in the fragment xml file
        l_id.setAdapter(menuadapter);
        //Look for a button push
        l_id.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view, int i, long l){
                String pushed_menu = menuadapter.getItem(i);
                //Toast.makeText(getActivity(),pushed_menu,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), TestMenuActivity.class);
                        //.putExtra(Intent.EXTRA_TEXT, pushed_menu);
                startActivity(intent);
            }
        });

        return rootView;
    }
}