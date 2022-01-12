package com.example.tourguider;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class Combination extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination);
        ArrayList<grid> grids =new ArrayList<>();
        grids.add(new grid(R.drawable.abc3,R.drawable.abc1));
        grids.add(new grid(R.drawable.ac1,R.drawable.ac3));
        grids.add(new grid(R.drawable.ac5,R.drawable.ac4));
        grids.add(new grid(R.drawable.ac6,R.drawable.abc4));
        grids.add(new grid(R.drawable.abc2,R.drawable.abc5));
        GridView grid=(GridView) findViewById(R.id.grid);
        GridAdapter adapter=new GridAdapter(this,grids);
        grid.setAdapter(adapter);
    }
}
