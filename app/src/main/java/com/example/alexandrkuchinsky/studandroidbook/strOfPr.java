package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class strOfPr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template);
        TextView topic = (TextView)findViewById(R.id.topic);
        topic.setText(getString(R.string.stropr));
        topic.setVisibility(View.VISIBLE);

        TextView tv1 = (TextView)findViewById(R.id.firstParagraph);
        TextView tv2 = (TextView)findViewById(R.id.secondParagraph);
        TextView tv3 = (TextView)findViewById(R.id.thirdParagraph);
        TextView tv4 = (TextView)findViewById(R.id.fourthParagraph);
        TextView tv5 = (TextView)findViewById(R.id.fifthParagraph);
        TextView tv6 = (TextView)findViewById(R.id.sixParagraph);
        TextView tv7 = (TextView)findViewById(R.id.sevenParagraph);
        TextView tv8 = (TextView)findViewById(R.id.eightParagraph);


        ImageView iv1 = (ImageView)findViewById(R.id.firstImage);
        ImageView iv6 = (ImageView)findViewById(R.id.sixImage);
        ImageView iv2 = (ImageView)findViewById(R.id.secondImage);ImageView iv5 = (ImageView)findViewById(R.id.fifthImage);
        iv1.setImageResource(R.drawable.strpr1);
        iv2.setImageResource(R.drawable.strpr2);
        iv5.setImageResource(R.drawable.strpr3);
        iv6.setImageResource(R.drawable.strpr4);
        iv1.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.VISIBLE);
        iv5.setVisibility(View.VISIBLE);
        iv6.setVisibility(View.VISIBLE);


        tv1.setText(R.string.stropr1);
        tv1.setVisibility(View.VISIBLE);

        tv2.setText(R.string.stropr2);
        tv2.setVisibility(View.VISIBLE);
        tv3.setText(R.string.stropr3);
        tv3.setVisibility(View.VISIBLE);
        tv4.setText(R.string.stropr4);
        tv4.setVisibility(View.VISIBLE);
        tv5.setText(R.string.stropr5);
        tv5.setVisibility(View.VISIBLE);
        tv6.setText(R.string.stropr6);
        tv6.setVisibility(View.VISIBLE);
        tv7.setText(R.string.stropr7);
        tv7.setVisibility(View.VISIBLE);
        tv8.setText(R.string.stropr8);
        tv8.setVisibility(View.VISIBLE);


    }
}
