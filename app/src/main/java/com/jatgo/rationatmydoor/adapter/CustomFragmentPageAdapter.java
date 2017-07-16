package com.jatgo.rationatmydoor.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jatgo.rationatmydoor.fragment.ActivityFragment;
import com.jatgo.rationatmydoor.fragment.GroupsFragment;
import com.jatgo.rationatmydoor.fragment.FriendsFragment;

public class CustomFragmentPageAdapter extends FragmentPagerAdapter{

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

    private static final int FRAGMENT_COUNT = 3;

    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FriendsFragment();
            case 1:
                return new GroupsFragment();
            case 2:
                return new ActivityFragment();
/*            case 3:
                return new FriendsFragment();
            case 1:
                return new GroupsFragment();
            case 2:
                return new AlbumFragment();
            case 3:
                return new ArtistFragment();*/
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Friends";
            case 1:
                return "Groups";
            case 2:
                return "Activity";
//            case 3:
//                return "Artists";
        }
        return null;
    }
}
