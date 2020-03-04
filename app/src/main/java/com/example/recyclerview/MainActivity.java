package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvList;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = getResources().getStringArray(R.array.names);

        rvList = findViewById(R.id.rvList);
        layoutManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(layoutManager);

        adapter = new MyAdapter(names);
        rvList.setAdapter(adapter);
    }
}
