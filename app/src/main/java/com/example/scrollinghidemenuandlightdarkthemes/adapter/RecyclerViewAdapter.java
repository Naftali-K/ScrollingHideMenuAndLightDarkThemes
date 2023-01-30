package com.example.scrollinghidemenuandlightdarkthemes.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scrollinghidemenuandlightdarkthemes.R;

import java.util.List;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/01/23
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private static final String TAG = "Test_Code";

    private List<String> itemList;

    public RecyclerViewAdapter(List<String> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView itemNameTv;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            itemNameTv = itemView.findViewById(R.id.item_name_tv);
        }

        void bind(String itemName){
            itemNameTv.setText(itemName);
        }
    }
}
