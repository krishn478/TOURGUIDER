package com.example.tourguider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<grid> {
    public GridAdapter(@NonNull Context context, ArrayList<grid> arrayList) {
        super(context, 0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.gridview,parent,false);

        }

        grid currentposition=getItem(position);
        ImageView imge=(ImageView) convertView.findViewById(R.id.imageView2);
        imge.setImageResource(currentposition.getImage1());
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView3);
        img.setImageResource(currentposition.getImage2());
        return convertView;

    }
}
