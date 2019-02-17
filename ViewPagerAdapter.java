package com.example.vineetha.cardview1;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends Activity {
    private String title[] = {"One", "Two", "Three"};

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    public Fragment getItem(int position) {
        return TabFragment.getInstance(position);
    }

    public int getCount() {
        return title.length;
    }

    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}


