package com.example.notebook.request;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Container extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        if(First1.number==11)
        {
            getSupportActionBar().setTitle(R.string.politeh1);}

        else if (First1.number==12)
        {
            getSupportActionBar().setTitle(R.string.evseev1);
        }
        else if (First1.number==13)
        {
            getSupportActionBar().setTitle(R.string.pochta1);
        }
        else if (First1.number==14)
        {
            getSupportActionBar().setTitle(R.string.detskiy1);
        }
        else if (First1.number==15)
        {
            getSupportActionBar().setTitle(R.string.chavain1);
        }
        else if (First1.number==16)
        {
            getSupportActionBar().setTitle(R.string.kotomkin1);
        }

        //Начало фиолтового маршрута
        if(First1.number==21)
        {
            getSupportActionBar().setTitle(R.string.obshaga1);}

        else if (First1.number==22)
        {
            getSupportActionBar().setTitle(R.string.iSO1);
        }
        else if (First1.number==23)
        {
            getSupportActionBar().setTitle(R.string.teatrkukol1);
        }
        else if (First1.number==24)
        {
            getSupportActionBar().setTitle(R.string.hram1);
        }
        else if (First1.number==25)
        {
            getSupportActionBar().setTitle(R.string.dram1);
        }
        else if (First1.number==26)
        {
            getSupportActionBar().setTitle(R.string.korepova1);
        }

        //Начало зеленого маршрута
        if(First1.number==31)
        {
            getSupportActionBar().setTitle(R.string.lenin1);}

        else if (First1.number==32)
        {
            getSupportActionBar().setTitle(R.string.margu1);
        }
        else if (First1.number==33)
        {
            getSupportActionBar().setTitle(R.string.record1);
        }
        else if (First1.number==34)
        {
            getSupportActionBar().setTitle(R.string.biblioteka1);
        }
        else if (First1.number==35)
        {
            getSupportActionBar().setTitle(R.string.park1);
        }
        else if (First1.number==36)
        {
            getSupportActionBar().setTitle(R.string.voshod1);
        }
        else if (First1.number==37)
        {
            getSupportActionBar().setTitle(R.string.gulag1);
        }

        //Начало красного маршрута
        if(First1.number==41)
        {
            getSupportActionBar().setTitle(R.string.shketan1);}

        else if (First1.number==42)
        {
            getSupportActionBar().setTitle(R.string.shkola1);
        }
        else if (First1.number==43)
        {
            getSupportActionBar().setTitle(R.string.mari1);
        }
        else if (First1.number==44)
        {
            getSupportActionBar().setTitle(R.string.tihvino1);
        }
        else if (First1.number==45)
        {
            getSupportActionBar().setTitle(R.string.sssr1);
        }
        else if (First1.number==46)
        {
            getSupportActionBar().setTitle(R.string.naumov1);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Container.this, Spravka.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

                    switch (position) {
                        case 0:
                            Tab1photos photos1 = new Tab1photos();
                            return photos1;
                        case 2:
                            Tab3Task task1 = new Tab3Task();
                            return task1;
                        case 1:
                            Tab2Text text1 = new Tab2Text();
                            return text1;
                        default:
                            return null;
                    }

        }

        @Override
        public int getCount() {
            if(First1.number==13||First1.number==22||First1.number==34||First1.number==45){
                return 2;
            }

            else return 3;

        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Фото";
                case 1:
                    return "Информ-я";
                case 2:
                    return "Задания";
            }
            return null;
        }
    }
}
