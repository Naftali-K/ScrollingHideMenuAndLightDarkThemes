package com.example.scrollinghidemenuandlightdarkthemes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.scrollinghidemenuandlightdarkthemes.DataManager;
import com.example.scrollinghidemenuandlightdarkthemes.R;
import com.example.scrollinghidemenuandlightdarkthemes.adapter.RecyclerViewAdapter;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        setReferences(view);

        adapter = new RecyclerViewAdapter(DataManager.getItemList(8));
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void setReferences(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
    }
}