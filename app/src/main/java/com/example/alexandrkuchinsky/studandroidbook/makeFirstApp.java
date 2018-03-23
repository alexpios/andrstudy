package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class makeFirstApp extends Activity {
    TextView topic, tv1,tv2,tv3,tv4, tv5,tv6,tv7,tv8,tv9;
    ImageView iv1,iv2, iv7, iv8;

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
        TextView tv19 = (TextView)findViewById(R.id.ninetinParagraph);
        TextView tv20 = (TextView)findViewById(R.id.tventyParagraph);

        ImageView iv1 = (ImageView)findViewById(R.id.firstImage);
        ImageView iv2 = (ImageView)findViewById(R.id.secondImage);
        ImageView iv7 = (ImageView)findViewById(R.id.sevenImage);
        ImageView iv8 = (ImageView)findViewById(R.id.eightImage);

        iv1.setImageResource(R.drawable.wel);
        iv2.setImageResource(R.drawable.wel2);
        iv1.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.VISIBLE);
        iv7.setImageResource(R.drawable.wel3);
        iv8.setImageResource(R.drawable.wel4);
        iv7.setVisibility(View.VISIBLE);
        iv8.setVisibility(View.VISIBLE);

        topic.setText(getString(R.string.mfapp));
        topic.setVisibility(View.VISIBLE);

        tv1.setText(R.string.mfapp1);
        tv1.setVisibility(View.VISIBLE);

        tv2.setText(R.string.mfapp2);
        tv2.setVisibility(View.VISIBLE);
        tv3.setText(R.string.mfapp3);
        tv3.setVisibility(View.VISIBLE);
        tv4.setText(R.string.mfapp4);
        tv4.setVisibility(View.VISIBLE);
        tv5.setText(R.string.mfapp5);
        tv5.setVisibility(View.VISIBLE);
        tv6.setText(R.string.mfapp6);
        tv6.setVisibility(View.VISIBLE);
        tv7.setText(R.string.mfapp7);
        tv7.setVisibility(View.VISIBLE);
        tv8.setText(R.string.mfapp8);
        tv8.setVisibility(View.VISIBLE);
        tv9.setText(R.string.mfapp9);
        tv9.setVisibility(View.VISIBLE);
        tv10.setText(R.string.mfapp10);
        tv10.setVisibility(View.VISIBLE);

        tv11.setText(R.string.mfapp11);
        tv11.setVisibility(View.VISIBLE);
        tv12.setText(R.string.mfapp12);
        tv12.setVisibility(View.VISIBLE);
        tv13.setText(R.string.mfapp13);
        tv13.setVisibility(View.VISIBLE);
        tv14.setText(R.string.mfapp14);
        tv14.setVisibility(View.VISIBLE);
        tv15.setText(R.string.mfapp15);
        tv15.setVisibility(View.VISIBLE);
tv15.getResources().getColor(R.color.fonberusa);
  tv15.setTextSize(20);
        tv16.setText(R.string.mfapp16);
        tv16.setVisibility(View.VISIBLE);
        tv17.setText(R.string.mfapp17);
        tv17.setVisibility(View.VISIBLE);
        tv18.setText(R.string.mfapp18);
        tv18.setVisibility(View.VISIBLE);
        tv19.setText(R.string.mfapp19);
        tv19.setVisibility(View.VISIBLE);
        tv20.setText(R.string.mfapp20);
        tv20.setVisibility(View.VISIBLE);

    }
}