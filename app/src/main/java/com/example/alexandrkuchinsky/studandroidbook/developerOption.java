package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class developerOption extends Activity {
TextView topic, tv1,tv2,tv3,tv4;
ImageView iv1,iv2,iv3,iv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.template);
       TextView topic = (TextView)findViewById(R.id.topic);

        topic.setText(getString(R.string.devActiv));

        topic.setVisibility(View.VISIBLE);

    }
}
