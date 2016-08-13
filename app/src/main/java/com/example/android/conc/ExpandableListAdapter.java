package com.example.android.conc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
//public class ExpandableListAdapter extends ExpandableListActivity {

    private Context _context;
    private Activity context;
    ArrayAdapter<String> adapter1,adapter2,adapter3,adapter4;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;

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
        return true;
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

