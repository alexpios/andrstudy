package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class sructofproject extends Activity {
    ListView list;
    String[] web = {
            "Project Structure",
            "Android Manifest",
            "Android Res",
            "Android Strings.xml",
            "Android Styles.xml",

    };
    Integer[] imageId = {
            R.drawable.activitylifecycle,
            R.drawable.activitylifecycle,
            R.drawable.activitylifecycle,
            R.drawable.activitylifecycle,
            R.drawable.activitylifecycle,



    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sructofproject);



        CustomList adapter = new CustomList(this, web, imageId);
        list = (ListView) findViewById(R.id.list2);
        list.setAdapter(adapter);
        list.setClickable(true);





        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (list.getItemIdAtPosition(position)==0) {

                    Intent intent = new Intent(sructofproject.this, strOfPr.class);
                    startActivity(intent);}
                else if (list.getItemIdAtPosition(position)==1) {

                    Intent intent = new Intent(sructofproject.this, manifest.class);
                    startActivity(intent);}
                else if (list.getItemIdAtPosition(position)==2) {

                    Intent intent = new Intent(sructofproject.this, androidRes.class);
                    startActivity(intent);}
                else if (list.getItemIdAtPosition(position)==3) {

                    Intent intent = new Intent(sructofproject.this, basicsOfConstruction.class);
                    startActivity(intent);}

                else if (list.getItemIdAtPosition(position)==4) {

                    Intent intent = new Intent(sructofproject.this, sdkSettings.class);
                    startActivity(intent);}
                else if (list.getItemIdAtPosition(position)==5) {

                    Intent intent = new Intent(sructofproject.this, developerOption.class);
                    startActivity(intent);}



            }
        });

    }
}
