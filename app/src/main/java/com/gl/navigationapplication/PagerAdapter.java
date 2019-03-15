package com.gl.navigationapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int noOfTabs;

    public PagerAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
       switch (position){

           case 0:
               ApplicationFragment applicationFragment = new ApplicationFragment();
               return applicationFragment;
           case 1:
               MobileInfoFragment mobileInfoFragment = new MobileInfoFragment();
               return  mobileInfoFragment;
           case 2:
               VersionFragment versionFragment = new VersionFragment();
               return  versionFragment;

           default:return  null;
       }

    }


    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Tab-1";
        }
        else if (position == 1)
        {
            title = "Tab-2";
        }
        else if (position == 2)
        {
            title = "Tab-3";
        }
        return title;
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
