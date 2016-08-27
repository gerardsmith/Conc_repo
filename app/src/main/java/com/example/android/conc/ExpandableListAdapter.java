package com.example.android.conc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter implements AdapterView.OnItemSelectedListener {
//public class ExpandableListAdapter extends ExpandableListActivity {

    public int group_pos;
   // int HIA3_Test3_Question5;
    private Context _context;
    private Activity context;
    ArrayAdapter<String> adapter1,adapter2,adapter3,adapter4;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;
    private static final String TAG = "Video Check";

    //spinners for expandable view
    int HIA3_Test3_Question5,HIA3_Test3_Question6,HIA3_Test3_Question7,HIA3_Test3_Question8,
            HIA3_Test3_Question9, HIA3_Test3_Question10, HIA3_Test3_Question11,HIA3_Test3_Question12,
             HIA3_Test3_Question13,HIA3_Test3_Question14,HIA3_Test3_Question15,HIA3_Test3_Question16,
                HIA3_Test3_Question17,HIA3_Test3_Question18,HIA3_Test3_Question19,HIA3_Test3_Question20,
                    HIA3_Test3_Question21,HIA3_Test3_Question22,HIA3_Test3_Question23,HIA3_Test3_Question24,
                        HIA3_Test3_Question25, HIA3_Test3_Question26, HIA3_Test3_Question27;

    int HIA3_Test3_Question28,HIA3_Test3_Question29,HIA3_Test3_Question30,HIA3_Test3_Question31,
            HIA3_Test3_Question32, HIA3_Test3_Question33, HIA3_Test3_Question34,HIA3_Test3_Question35,
            HIA3_Test3_Question36,HIA3_Test3_Question37,HIA3_Test3_Question38,HIA3_Test3_Question39,
            HIA3_Test3_Question40,HIA3_Test3_Question41,HIA3_Test3_Question42,HIA3_Test3_Question43,
            HIA3_Test3_Question44,HIA3_Test3_Question45,HIA3_Test3_Question46,HIA3_Test3_Question47,
            HIA3_Test3_Question48, HIA3_Test3_Question49, HIA3_Test3_Question50;

    int HIA3_Test3_Question51,HIA3_Test3_Question52,HIA3_Test3_Question53,HIA3_Test3_Question54,
            HIA3_Test3_Question55, HIA3_Test3_Question56, HIA3_Test3_Question57,HIA3_Test3_Question58,
            HIA3_Test3_Question59,HIA3_Test3_Question60,HIA3_Test3_Question61,HIA3_Test3_Question62,
            HIA3_Test3_Question63,HIA3_Test3_Question64,HIA3_Test3_Question65,HIA3_Test3_Question66,
            HIA3_Test3_Question67,HIA3_Test3_Question68,HIA3_Test3_Question69,HIA3_Test3_Question70,
            HIA3_Test3_Question71, HIA3_Test3_Question72, HIA3_Test3_Question73;

    int HIA3_Test3_Question74,HIA3_Test3_Question75,HIA3_Test3_Question76,HIA3_Test3_Question77,
            HIA3_Test3_Question78, HIA3_Test3_Question79, HIA3_Test3_Question80,HIA3_Test3_Question81,
            HIA3_Test3_Question82,HIA3_Test3_Question83,HIA3_Test3_Question84,HIA3_Test3_Question85,
            HIA3_Test3_Question86,HIA3_Test3_Question87,HIA3_Test3_Question88,HIA3_Test3_Question89,
            HIA3_Test3_Question90,HIA3_Test3_Question91,HIA3_Test3_Question92;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.expandable_list_item, null);
        }

        TextView txtListChild = (TextView) convertView
               .findViewById(R.id.lblListItem);

       txtListChild.setText(childText);

        String [] req_by =
                {"N/A","1 - Mild","2 - Mild","3 - Moderate","4 - Moderate","5 - Severe","6 - Severe"};

        Spinner spinner1 = (Spinner) convertView.findViewById(R.id.spinner33);
        adapter1 = new ArrayAdapter<String>(this._context,
                android.R.layout.simple_spinner_item, req_by);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapter1);

        String [] when =
                {"N/A","On the pitch","Post match, same-day","Post-match, days after"};

        Spinner spinner2 = (Spinner) convertView.findViewById(R.id.spinner34);
        adapter2 = new ArrayAdapter<String>(this._context,
                android.R.layout.simple_spinner_item, when);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        String [] dur =
                {"N/A","0-15 minutes","15 minutes to 1 hour","1 hour to the 1st night", "1st night to 2nd night", "Beyond the 2nd night"};

        Spinner spinner3 = (Spinner) convertView.findViewById(R.id.spinner35);
        adapter3 = new ArrayAdapter<String>(this._context,
                android.R.layout.simple_spinner_item, dur);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        String [] pres =
                {"N/A","1 - Mild","2 - Mild","3 - Moderate","4 - Moderate","5 - Severe","6 - Severe"};

        Spinner spinner4 = (Spinner) convertView.findViewById(R.id.spinner36);
        adapter4 = new ArrayAdapter<String>(this._context,
                android.R.layout.simple_spinner_item,pres);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);

        spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        spinner2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        spinner3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        spinner4.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

            return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        //Log.v(TAG, "Group Pos: " + groupPosition);
        group_pos=groupPosition;

        return true;

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(group_pos){
            case 0:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        HIA3_Test3_Question5 =position;
                        Log.v(TAG, "Headaches spinner1");

                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: ");
                        HIA3_Test3_Question6 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question7 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question8 =position;
                        return;
                }
                return;
            case 1:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Pressure in head spinner1 ");
                        HIA3_Test3_Question9 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question10 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question11 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question12 =position;
                        return;
                }
                return;
            case 2:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Neckpain spinner1");
                        HIA3_Test3_Question13 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question14 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question15 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question16 =position;
                        return;
                }
                return;
            case 3:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Naus spinner1");
                        HIA3_Test3_Question17 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question18 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question19 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question20 =position;
                        return;
                }
                return;
            case 4:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Dizziness spinner1");
                        HIA3_Test3_Question21 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question22 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question23 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question24 =position;
                        return;
                }
                return;
            case 5:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Blurred  spinner1");
                        HIA3_Test3_Question25 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question26 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question27 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question28 =position;
                        return;
                }
                return;
            case 6:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "balance spinner1");
                        HIA3_Test3_Question29 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question30 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question31 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question32 =position;
                        return;
                }
                return;
            case 7:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "sense l spinner1");
                        HIA3_Test3_Question33 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question34 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question35 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question36 =position;
                        return;
                }
                return;
            case 8:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "sense n spinner1");
                        HIA3_Test3_Question37 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question38 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question39 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question40 =position;
                        return;
                }
                return;
            case 9:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "slow spinner1");
                        HIA3_Test3_Question41 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question42 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question43 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question44 =position;
                        return;
                }
                return;
            case 10:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "fog spinner1");
                        HIA3_Test3_Question45 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question46 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question47 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question48 =position;
                        return;
                }
                return;
            case 11:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "dfr spinner1");
                        HIA3_Test3_Question49 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question50 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question51 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question52 =position;
                        return;
                }
                return;
            case 12:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "dif conc spinner1");
                        HIA3_Test3_Question53 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question54 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question55 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question56 =position;
                        return;
                }
                return;
            case 13:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "dif rem spinner1");
                        HIA3_Test3_Question57 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question58 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question59 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question60 =position;
                        return;
                }
                return;
            case 14:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "fat spinner1");
                        HIA3_Test3_Question61 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question62 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question63 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question64 =position;
                        return;
                }
                return;
            case 15:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "conf spinner1");
                        HIA3_Test3_Question65 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question66 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question67 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question68 =position;
                        return;
                }
                return;
            case 16:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Drowsi spinner1");
                        HIA3_Test3_Question69 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question70 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question71 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question72 =position;
                        return;
                }
                return;
            case 17:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Troub spinner1");
                        HIA3_Test3_Question73 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question74 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question75 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question76 =position;
                        return;
                }
                return;
            case 18:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "More emotion spinner1");
                        HIA3_Test3_Question77 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question78 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question79 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question80 =position;
                        return;
                }
                return;
            case 19:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Irrit spinner1");
                        HIA3_Test3_Question81 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question82 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question83 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question84 =position;
                        return;
                }
                return;
            case 20:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Sad spinner1 " + position);
                        HIA3_Test3_Question85 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question86 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question87 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question88 =position;
                        return;
                }
                return;
            case 21:
                switch(parent.getId()) {
                    case R.id.spinner33:
                        Log.v(TAG, "Nerv spinner1");
                        HIA3_Test3_Question89 =position;
                        return;
                    case R.id.spinner34:
                        Log.v(TAG, "Video Checkbox1: " + position);
                        HIA3_Test3_Question90 =position;
                        return;
                    case R.id.spinner35:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question91 =position;
                        return;
                    case R.id.spinner36:
                        Log.v(TAG, "Video Checkbox2: " + position);
                        HIA3_Test3_Question92 =position;
                        return;
                }
                return;

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

// Second attempt

    // Create ArrayList to hold parent Items and Child Items
    /*private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Create Expandable List and set it's properties
        ExpandableListView expandableList = getExpandableListView();
        expandableList.setDividerHeight(2);
        expandableList.setGroupIndicator(null);
        expandableList.setClickable(true);

        // Set the Items of Parent
        setGroupParents();
        // Set The Child Data
        setChildData();

        // Create the Adapter
        MyExpandableAdapter adapter = new MyExpandableAdapter(parentItems, childItems);

        adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);

        // Set the Adapter to expandableList
        expandableList.setAdapter(adapter);
        expandableList.setOnChildClickListener(this);
    }

    // method to add parent Items
    public void setGroupParents()
    {
       // parentItems.add("Fruits");
       // parentItems.add("Flowers");
       // parentItems.add("Animals");
       // parentItems.add("Birds");

        // Adding child data
        parentItems.add("Headaches");
        parentItems.add("\'Pressure in head\'");
        parentItems.add("Neck pain");
        parentItems.add("Nausea/vomiting");
        parentItems.add("Dizziness");
        parentItems.add("Blurred vision");
        parentItems.add("Balance problems");
        parentItems.add("Sensitivity to light");
        parentItems.add("Sensitivity to noise");
        parentItems.add("Feeling slowed down");
        parentItems.add("Feeling like \'in a fog\'");
        parentItems.add("\'Dont feel right\'");
        parentItems.add("Difficulty concentrating");
        parentItems.add("Difficulty remembering");
        parentItems.add("Fatigue/low energy");
        parentItems.add("Confusion");
        parentItems.add("Drowsiness");
        parentItems.add("Trouble falling asleep");
        parentItems.add("More emotional");
        parentItems.add("Irritability");
        parentItems.add("Sadness");
        parentItems.add("Nervous/anxious");
    }

    // method to set child data of each parent
    public void setChildData()
    {

        // Add Child Items for Fruits
        ArrayList<String> child = new ArrayList<String>();
        child.add("A");
        child.add("B");
        child.add("C");
        child.add("D");

        childItems.add(child);

        // Add Child Items for Flowers
        child = new ArrayList<String>();
        child.add("Rose");
        child.add("Lotus");
        child.add("Jasmine");
        child.add("Lily");

        childItems.add(child);

        // Add Child Items for Animals
        child = new ArrayList<String>();
        child.add("Lion");
        child.add("Tiger");
        child.add("Horse");
        child.add("Elephant");

        childItems.add(child);

        // Add Child Items for Birds
        child = new ArrayList<String>();
        child.add("Parrot");
        child.add("Sparrow");
        child.add("Peacock");
        child.add("Pigeon");

        childItems.add(child);
    }

}*/

