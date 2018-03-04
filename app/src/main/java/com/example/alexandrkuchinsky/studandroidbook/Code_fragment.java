package com.example.alexandrkuchinsky.studandroidbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandr Kuchinsky on 01.03.2018.
 */

public class Code_fragment extends Fragment {
View view;
List<dataItem> lstData;

    public Code_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.code_fragment, container, false);
lstData = new ArrayList<>();
lstData.add(new dataItem(R.drawable.))
        return view;
    }
}
