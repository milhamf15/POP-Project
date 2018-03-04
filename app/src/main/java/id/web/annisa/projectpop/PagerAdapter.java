package id.web.annisa.projectpop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ryan Ar-rofiq on 04/03/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;
        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tab_fragment2();
            case 1:
                return new tab_fragment1();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
