package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class developerOption extends Activity {
TextView topic, tv1,tv2,tv3,tv4, tv5,tv6,tv7,tv8,tv9;
ImageView iv1,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.template);
       TextView topic = (TextView)findViewById(R.id.topic);
TextView tv1 = (TextView)findViewById(R.id.firstParagraph);
TextView tv2 = (TextView)findViewById(R.id.secondParagraph);
TextView tv3 = (TextView)findViewById(R.id.thirdParagraph);
TextView tv4 = (TextView)findViewById(R.id.fourthParagraph);
TextView tv5 = (TextView)findViewById(R.id.fifthParagraph);
ImageView iv1 = (ImageView)findViewById(R.id.fifthImage);
TextView tv6 = (TextView)findViewById(R.id.sixParagraph);
TextView tv7 = (TextView)findViewById(R.id.sevenParagraph);
ImageView iv2 = (ImageView)findViewById(R.id.sevenImage);
TextView tv8 = (TextView)findViewById(R.id.eightParagraph);
TextView tv9 = (TextView)findViewById(R.id.nineParagraph);


        topic.setText(getString(R.string.devActiv));
        topic.setVisibility(View.VISIBLE);

tv1.setText(R.string.first);
 tv1.setVisibility(View.VISIBLE);
tv2.setText(R.string.second);
 tv2.setVisibility(View.VISIBLE);
tv3.setText(R.string.third);
 tv3.setVisibility(View.VISIBLE);
tv4.setText(R.string.four1);
 tv4.setVisibility(View.VISIBLE);
tv5.setText(R.string.four2);
 tv5.setVisibility(View.VISIBLE);
tv6.setText(R.string.four3);
 tv6.setVisibility(View.VISIBLE);
tv7.setText(R.string.four4);
 tv7.setVisibility(View.VISIBLE);
tv8.setText(R.string.fifth);
 tv8.setVisibility(View.VISIBLE);
tv9.setText(R.string.six);
 tv9.setVisibility(View.VISIBLE);

   iv1.setImageResource(R.drawable.enbl);
iv2.setImageResource(R.drawable.devon);
iv1.setVisibility(View.VISIBLE);
iv2.setVisibility(View.VISIBLE);

    }
}
