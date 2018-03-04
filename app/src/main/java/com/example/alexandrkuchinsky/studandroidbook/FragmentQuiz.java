package com.example.alexandrkuchinsky.studandroidbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alexandr Kuchinsky on 01.03.2018.
 */

public class FragmentQuiz extends Fragment {
View view;
    public FragmentQuiz() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.quiz_fragment, container, false);


        return view;
    }
}
