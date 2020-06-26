package com.example.activism_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapterMeToo extends FragmentPagerAdapter {
    private int myNumOfTabs;
    public PageAdapterMeToo(FragmentManager fm, int numOfTabs) {
        super(fm);
        myNumOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new metab1();
            case 1:
                return new metab2();
            case 2:
                return new metab3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return myNumOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
