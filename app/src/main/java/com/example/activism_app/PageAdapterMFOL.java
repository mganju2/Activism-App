package com.example.activism_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapterMFOL extends FragmentPagerAdapter {
    private int myNumOfTabs;
    public PageAdapterMFOL (FragmentManager fm, int numOfTabs) {
        super(fm);
        myNumOfTabs = numOfTabs;
    }
    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new mfoltab1();
            case 1:
                return new mfoltab2();
            case 2:
                return new mfoltab3();
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return myNumOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
