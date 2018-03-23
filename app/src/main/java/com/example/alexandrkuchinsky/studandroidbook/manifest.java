package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class manifest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.template);
        TextView topic = (TextView)findViewById(R.id.topic);
        topic.setText(getString(R.string.manifest));
        topic.setVisibility(View.VISIBLE);


        TextView tv1 = (TextView)findViewById(R.id.firstParagraph);
        TextView tv2 = (TextView)findViewById(R.id.secondParagraph);
        TextView tv3 = (TextView)findViewById(R.id.thirdParagraph);
        TextView tv4 = (TextView)findViewById(R.id.fourthParagraph);
        TextView tv5 = (TextView)findViewById(R.id.fifthParagraph);
        TextView tv6 = (TextView)findViewById(R.id.sixParagraph);
        TextView tv7 = (TextView)findViewById(R.id.sevenParagraph);
        TextView tv8 = (TextView)findViewById(R.id.eightParagraph);
        TextView tv9 = (TextView)findViewById(R.id.nineParagraph);
        TextView tv10 = (TextView)findViewById(R.id.tenParagraph);
        TextView tv11 = (TextView)findViewById(R.id.elevenParagraph);
        TextView tv12 = (TextView)findViewById(R.id.tvelveParagraph);
        TextView tv13 = (TextView)findViewById(R.id.thirtinParagraph);
        TextView tv14 = (TextView)findViewById(R.id.fourtinParagraph);
        TextView tv15 = (TextView)findViewById(R.id.fivetinParagraph);
        TextView tv16 = (TextView)findViewById(R.id.sixtinParagraph);
        TextView tv17 = (TextView)findViewById(R.id.seventinParagraph);
        TextView tv18 = (TextView)findViewById(R.id.eightinParagraph);


        ImageView iv17 = (ImageView)findViewById(R.id.seventinImage);


        iv17.setImageResource(R.drawable.manimg);

        iv17.setVisibility(View.VISIBLE);



        tv1.setText(R.string.manifest1);
        tv1.setVisibility(View.VISIBLE);

        tv2.setText(R.string.manifest2);
        tv2.setVisibility(View.VISIBLE);
        tv3.setText(R.string.manifest3);
        tv3.setVisibility(View.VISIBLE);
        tv4.setText(R.string.manifest4);
        tv4.setVisibility(View.VISIBLE);
        tv5.setText(R.string.manifest5);
        tv5.setVisibility(View.VISIBLE);
        tv6.setText(R.string.manifest6);
        tv6.setVisibility(View.VISIBLE);
        tv7.setText(R.string.manifest7);
        tv7.setVisibility(View.VISIBLE);
        tv8.setText(R.string.manifest8);
        tv8.setVisibility(View.VISIBLE);
        tv9.setText(R.string.manifest9);
        tv9.setVisibility(View.VISIBLE);
        tv10.setText(R.string.manifest10);
        tv10.setVisibility(View.VISIBLE);
        tv10.setTextSize(20);
        tv11.setText(R.string.manifest11);
        tv11.setVisibility(View.VISIBLE);
        tv12.setText(R.string.manifest12);
        tv12.setTextSize(20);
        tv12.setVisibility(View.VISIBLE);
        tv13.setText(R.string.manifest13);
        tv13.setVisibility(View.VISIBLE);
        tv14.setText(R.string.manifest14);
        tv14.setVisibility(View.VISIBLE);
        tv15.setText(R.string.manifest15);
        tv15.setVisibility(View.VISIBLE);
        tv15.getResources().getColor(R.color.fonberusa);

        tv16.setText(R.string.manifest16);
        tv16.setVisibility(View.VISIBLE);
        tv17.setText(R.string.manifest17);
        tv17.setVisibility(View.VISIBLE);
        tv18.setText(R.string.manifest18);
        tv18.setVisibility(View.VISIBLE);

    }
}
