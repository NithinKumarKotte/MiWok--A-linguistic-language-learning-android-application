package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nithin on 05/02/2018.
 */

public class FixedTabsPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public  FixedTabsPagerAdapter(Context context,FragmentManager fm){
        super(fm);
        mContext = context;

    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new NumberFragment();
            case 1: return new FamilyFragment();
            case 2: return new ColorFragment();
            case 3: return new PhraseFragment();
            default:  return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:   return mContext.getString(R.string.category_numbers);
            case 1:   return mContext.getString(R.string.category_family);
            case 2:   return mContext.getString(R.string.category_colors);
            case 3:   return mContext.getString(R.string.category_phrases);
            default:  return null;
        }
    }
}
