package com.example.scrollinghidemenuandlightdarkthemes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.scrollinghidemenuandlightdarkthemes.adapter.RecyclerViewAdapter;

public class MyDesignActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_design);
        setReferences();

        recyclerViewAdapter = new RecyclerViewAdapter(DataManager.getItemList(10));

        recyclerView.setAdapter(recyclerViewAdapter);

    }

    private void setReferences(){
        recyclerView = findViewById(R.id.recycler_view);
    }
}