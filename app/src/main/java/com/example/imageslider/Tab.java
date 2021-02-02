package com.example.imageslider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Tab extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    DrawerLayout drawerLayout1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Tab 1");
        arrayList.add("Tab 2");
        arrayList.add("Tab 3");

        prepareViewPager(viewPager, arrayList);

        tabLayout.setupWithViewPager((viewPager));

        drawerLayout1 = findViewById(R.id.drawer_layout2);


    }

    private void prepareViewPager(ViewPager viewPager, ArrayList<String> arrayList) {
        MainAdapter adapter = new MainAdapter(getSupportFragmentManager());
        TabFragment fragment = new TabFragment();

        for(int i = 0; i < arrayList.size(); i++){
//            Bundle bundle = new Bundle();
//
//            bundle.putString("title", arrayList.get(i));
//
//            fragment.setArguments(bundle);
//
            adapter.addFragment(fragment, arrayList.get(i));

            fragment = new TabFragment();
        }
        viewPager.setAdapter(adapter);
    }

    private class MainAdapter extends FragmentPagerAdapter {

        ArrayList<String> arrayList = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList<>();

        public void addFragment(Fragment fragment, String title){
            arrayList.add(title);
            fragmentList.add(fragment);
        }
        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return arrayList.get(position);
        }
    }


    public void ClickMenu(View view){
        openDrawer(drawerLayout1);
    }

    private void openDrawer(DrawerLayout drawerLayout1) {
        drawerLayout1.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout1);
    }

    private void closeDrawer(DrawerLayout drawerLayout1) {
        if (drawerLayout1.isDrawerOpen(GravityCompat.START)){
            drawerLayout1.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickItem1(View view){
        Intent intent = new Intent(this, Tab.class);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
    public void ClickItem2(View view){
        Intent intent = new Intent(this, MainActivity.class);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}
