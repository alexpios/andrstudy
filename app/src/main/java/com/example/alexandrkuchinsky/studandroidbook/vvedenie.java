package com.example.alexandrkuchinsky.studandroidbook;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class vvedenie extends Activity {
    ListView list;
    String[] web = {
            "Знакомство Android",
            "История и версии",
            "Почему именно Android?",
            "Основы построения приложения",
            "Настройка Android SDK",
            "Активируем опцию разработчика",
            "Собираем первое приложение"
    };
    Integer[] imageId = {
            R.drawable.sqliteread,
            R.drawable.sqliteread,
            R.drawable.sqliteread,
            R.drawable.sqliteread,
            R.drawable.sqliteread,
            R.drawable.sqliteread,
            R.drawable.sqliteread,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setTheme(R.Theme.Holo.NoActionBar.Fullscreen);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vvedenie);

        CustomList adapter = new
                CustomList(vvedenie.this, web, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setClickable(true);




            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if (list.getItemIdAtPosition(position)==0) {

                        Intent intent = new Intent(vvedenie.this, knowing.class);
                        startActivity(intent);}
                   else if (list.getItemIdAtPosition(position)==1) {

                        Intent intent = new Intent(vvedenie.this, historyVersion.class);
                        startActivity(intent);}
                    else if (list.getItemIdAtPosition(position)==2) {

                        Intent intent = new Intent(vvedenie.this, whyAndroid.class);
                        startActivity(intent);}
                    else if (list.getItemIdAtPosition(position)==3) {

                        Intent intent = new Intent(vvedenie.this, basicsOfConstruction.class);
                        startActivity(intent);}

                    else if (list.getItemIdAtPosition(position)==4) {

                        Intent intent = new Intent(vvedenie.this, sdkSettings.class);
                        startActivity(intent);}
                        else if (list.getItemIdAtPosition(position)==5) {

                        Intent intent = new Intent(vvedenie.this, developerOption.class);
                        startActivity(intent);}

                    else if (list.getItemIdAtPosition(position)==6) {

                        Intent intent = new Intent(vvedenie.this, makeFirstApp.class);
                        startActivity(intent);}

                }
            });

        }

    }
