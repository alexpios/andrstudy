package com.example.alexandrkuchinsky.studandroidbook;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridLayout;

/**
 * Created by Alexandr Kuchinsky on 01.03.2018.
 */

public class Main extends AppCompatActivity{

  private TabLayout tabLayout;
  private AppBarLayout appBarLayout;
  private ViewPager viewPager;
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        tabLayout =(TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbarid);
        viewPager = (ViewPager)findViewById(R.id.viewpadger_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        FragmentManager fragmentManager = getSupportFragmentManager();


        //add Fragments

        adapter.AddFragment(new Book_fragment(), "Изучение");
        adapter.AddFragment(new Code_fragment(), "Примеры кода");
        adapter.AddFragment(new FragmentQuiz(), "Тесты");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




    }
    //Временно закоментил(отключает переход назад кнопкой на телефоне)
    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }




}
