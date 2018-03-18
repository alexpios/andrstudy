package com.example.alexandrkuchinsky.studandroidbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

/**
 * Created by Alexandr Kuchinsky on 01.03.2018.
 */

public class Book_fragment extends Fragment {
    GridLayout mainGrid;
    View view;

    public Book_fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.book_fragment, container, false);
        GridLayout mainGrid = view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
       mainGrid.setClickable(true);
        return view;
    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0){

                        Intent intent = new Intent(getContext(), vvedenie.class);
                        startActivity(intent);
                    } else if (finalI==1) {

                        Intent intent = new Intent(getContext().getApplicationContext(), sructofproject.class);
                        startActivity(intent);
                    }
                    else if (finalI==2) {

                        Intent intent = new Intent(getContext().getApplicationContext(), androidLayouts.class);
                        startActivity(intent);
                    }else if (finalI==3) {

                        Intent intent = new Intent(getContext().getApplicationContext(), workWithMenu.class);
                        startActivity(intent);
                    }
                    else if (finalI==4) {

                        Intent intent = new Intent(getContext().getApplicationContext(), uiWidgets.class);
                        startActivity(intent);
                    }else if (finalI==5) {

                        Intent intent = new Intent(getContext().getApplicationContext(), fragmentsActivities.class);
                        startActivity(intent);
                    }else if (finalI==6) {

                        Intent intent = new Intent(getContext().getApplicationContext(), notification.class);
                        startActivity(intent);
                    }
                    else if (finalI==7) {

                        Intent intent = new Intent(getContext().getApplicationContext(), SqliteFirebase.class);
                        startActivity(intent);
                    }else if (finalI==8) {

                        Intent intent = new Intent(getContext().getApplicationContext(), mysqlPHP.class);
                        startActivity(intent);
                    }else if (finalI==9) {

                        Intent intent = new Intent(getContext().getApplicationContext(), services.class);
                        startActivity(intent);
                    }else if (finalI==10) {

                        Intent intent = new Intent(getContext().getApplicationContext(), containersAndroid.class);
                        startActivity(intent);
                    }else if (finalI==11) {

                        Intent intent = new Intent(getContext().getApplicationContext(), flows.class);
                        startActivity(intent);
                    }else if (finalI==12) {

                        Intent intent = new Intent(getContext().getApplicationContext(), dataWork.class);
                        startActivity(intent);
                    }

                    else  {

                        Intent intent = new Intent(getContext().getApplicationContext(), xmlJson.class);
                        startActivity(intent);
                    }


                }
            });
        }
    }



}


//    GridLayout mainGrid;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.book_fragment);
//        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
////Set Event
//        setSingleEvent(mainGrid);
//    }
//    private void setSingleEvent(GridLayout mainGrid) {
//        //Loop all child item of Main Grid
//        for (int i = 0; i < mainGrid.getChildCount(); i++) {
//            //You can see , all child item is CardView , so we just cast object to CardView
//            CardView cardView = (CardView) mainGrid.getChildAt(i);
//            final int finalI = i;
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (finalI==0){
//
//                        Intent intent = new Intent(test.this, vvedenie.class);
//                        startActivity(intent);
//                    } else if (finalI==1) {
//
//                        Intent intent = new Intent(test.this, sructofproject.class);
//                        startActivity(intent);
//                    }
//
//
//                }
//            });
//        }
//    }