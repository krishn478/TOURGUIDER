package com.example.tourguider;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListOfTemple extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_temple);
        ArrayList<List> temple=new ArrayList<>();
        temple.add(new List(getString(R.string.t1),getString(R.string.tp1),R.drawable.ab));
        temple.add(new List(getString(R.string.t2),getString(R.string.tp2),R.drawable.ab1));
        temple.add(new List(getString(R.string.t3),getString(R.string.tp3),R.drawable.ab2));
        temple.add(new List(getString(R.string.t4),getString(R.string.tp4),R.drawable.ab3));
        temple.add(new List(getString(R.string.t5),getString(R.string.tp5),R.drawable.ab4));
        temple.add(new List(getString(R.string.t6),getString(R.string.tp6),R.drawable.ab5));
        temple.add(new List(getString(R.string.t7),getString(R.string.tp7),R.drawable.ab6));
        temple.add(new List(getString(R.string.t8),getString(R.string.tp8),R.drawable.ab7));
        ListAdapter list=new ListAdapter(this,temple);
        ListView view=(ListView) findViewById(R.id.temples);
        view.setAdapter(list);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListOfTemple.this, R.string.msg4,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
