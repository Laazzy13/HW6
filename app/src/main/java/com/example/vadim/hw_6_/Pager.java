package com.example.vadim.hw_6_;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab_1 tab_1 = new Tab_1();
                return tab_1;
            case 1:
                Tab_2 tab_2 = new Tab_2();
                return tab_2;
            case 2:
                Tab_3 tab_3 = new Tab_3();
                return tab_3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
