package com.vikash.example.myrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView hlist = (RecyclerView)findViewById(R.id.hlistview);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        hlist.setLayoutManager(layoutManager);
        MyAdapter listAdapter= new MyAdapter();
        hlist.setAdapter(listAdapter);


    }
}
