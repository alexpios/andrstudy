package com.example.alexandrkuchinsky.studandroidbook;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alexandr Kuchinsky on 04.03.2018.
 */

public class CustomAdapter extends ArrayAdapter<dataItem> {
    Context context;
    int layoutResourceId;
    List<dataItem> data = null;


    public CustomAdapter(Context context, int resource, List<dataItem> objects) {
        super(context, resource, objects);

        this.layoutResourceId = resource;
        this.context = context;
        this.data=objects;
    }
static class DataHolder{
        ImageView ivrazdel;
        TextView tvName;
}
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DataHolder holder = null;
        if (convertView==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent);
            holder = new DataHolder();
            holder.ivrazdel = (ImageView)convertView.findViewById(R.id.ivrazdel);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            convertView.setTag(holder);
        }
else {
            holder =(DataHolder)convertView.getTag();
        }

   dataItem dataItem = data.get(position);
        holder.tvName.setText(dataItem.CodeName);
        holder.ivrazdel.setImageResource(dataItem.resIdThumbnail);
        return convertView;
    }
}
