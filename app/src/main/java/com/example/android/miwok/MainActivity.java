/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        FixedTabsPagerAdapter adapter = new FixedTabsPagerAdapter (this,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}

       /* TextView num= (TextView) findViewById(R.id.numbers);
        TextView fam= (TextView) findViewById(R.id.family);
        TextView col= (TextView) findViewById(R.id.colors);
        TextView ph= (TextView) findViewById(R.id.phrases);

        num.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(intent);
                return false;
            }
        });

        num.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(intent);
                return false;
            }
        });

        fam.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(),FamilyMembers.class);
                startActivity(intent);
                return false;
            }
        });

        col.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(),Colors.class);
                startActivity(intent);
                return false;
            }
        });

        ph.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(),Phrases.class);
                startActivity(intent);
                return false;
            }
        });
    }

    public void number(View view){
        Intent intent= new Intent(this,NumbersActivity.class);
        startActivity(intent);
    }

    public void famil(View view){
        Intent intent= new Intent(this,FamilyMembers.class);
        startActivity(intent);
    }

    public void color(View view){
        Intent intent= new Intent(this,Colors.class);
        startActivity(intent);
    }

    public void phrase(View view){
        Intent intent= new Intent(this,Phrases.class);
        startActivity(intent);
    }*/

