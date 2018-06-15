package com.example.purvajoshi.animals;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Bull", "Camel", "Cow", "Deer", "Elephant", "Giraffe", "Horse", "Lion", "Monkey", "Pig", "Sheep", "Tiger"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new Bull();
            }
            if (position == 1) {
                return new Camel();
            }
            if (position == 2) {
                return new Cow();
            }
            if (position == 3) {
                return new Deer();
            }
            if (position == 4) {
                return new Elephant();
            }
            if (position == 5) {
                return new Giraffe();

            }
            if (position == 6) {
                return new Horse();
            }
            if (position == 7) {
                return new Lion();
            }
            if (position == 8) {
                return new Monkey();
            }
            if (position == 9) {
                return new Pig();
            }
            if (position == 10) {
                return new Sheep();
            }
            if (position == 11) {
                return new Tiger();
            }

            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}


