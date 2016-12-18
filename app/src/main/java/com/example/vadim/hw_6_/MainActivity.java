package com.example.vadim.hw_6_;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {


    private TabLayout tabLayout;

    private ViewPager viewPager;

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    tabLayout = (TabLayout) findViewById(R.id.tabLayout);

    tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
    tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
    tabLayout.addTab(tabLayout.newTab().setText("Tab3"));
    tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    viewPager = (ViewPager) findViewById(R.id.pager);

    Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

    viewPager.setAdapter(adapter);

    tabLayout.setOnTabSelectedListener(this);
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
