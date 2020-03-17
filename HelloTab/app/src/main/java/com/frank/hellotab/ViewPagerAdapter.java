package com.frank.hellotab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private int pageCount;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        pageCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new Page1Fragment();
            case 1:
                return new Page2Fragment();
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return pageCount;
    }
}
