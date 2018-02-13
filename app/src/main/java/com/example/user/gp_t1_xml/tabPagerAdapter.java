package com.example.user.gp_t1_xml;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 2/11/2018.
 */

public class tabPagerAdapter extends FragmentPagerAdapter {
    public tabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new HotelFragment();
            case 1:
                return new FlightsFragment();
            case 2:
                return new ToursFragment();
            case 3:
                return new CarsFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Hotels";
            case 1:
                return "Flights";
            case 2:
                return "Tours";
            case 3:
                return "Cars";
        }
        return super.getPageTitle(position);
    }
}
