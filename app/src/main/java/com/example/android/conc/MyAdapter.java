package com.example.android.conc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter (FragmentManager fragmentManager){super(fragmentManager);}

    // when swiping returns a fragment with the object identified by position
    @Override
    public Fragment getItem(int position) {
        return ArrayListFragment.createNewFragmentToDisplay(position);
    }

    //    returns the number of views available
    @Override
    public int getCount() {
        return 0;//HIA1AActivity.NUMBER_OF_VIEWS;
    }
    /*gets the title describing specified page and passes it to the PagerTitleStrip in
        fragment_pager.xml - displays either top or bottom of screen*/

    @Override
    public CharSequence getPageTitle(int position) {
        return "HIA TEST " + (position + 1);
    }
}
