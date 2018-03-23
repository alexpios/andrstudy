package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class androidRes extends Activity {
    String[] data = {"animator/", "Файлы XML, которые определяют анимации свойств.", "anim/", "Файлы XML, которые определяют анимации преобразований.", "color/", "Файлы XML, которые определяют список состояний цветов. См. раздел Ресурс списка состояний цветов", "drawable/", "Файлы растровых изображений (.png, .9.png, .jpg, .gif) или файлы XML", "mipmap/", "Графические файлы для значков запуска с различной плотностью.", "layout/", "Файлы XML, которые определяют макет пользовательского интерфейса. См. раздел Ресурсы макетов.", "menu/", "Файлы XML, которые определяют меню приложения: меню параметров, контекстные меню или вложенные меню.", "raw/", "Произвольные файлы для сохранения в исходной форме. Чтобы открыть эти ресурсы с помощью InputStream, вызовите Resources.openRawResource().", "values/", "Файлы XML, которые содержат простые значения, такие как строки, целые числа и цвета.", "xml/", "Произвольные XML-файлы, которые можно читать в режиме выполнения вызовом метода Resources.getXML()."};

    GridView gvMain;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_res);

        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();



    }

    private void adjustGridView() {



        gvMain.setVerticalSpacing(8);
        gvMain.setHorizontalSpacing(8);
    }
}
