package com.example.pangasinanrecipeapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ProcessAdapter extends RecyclerView.Adapter<ProcessAdapter.ViewHolder> {

    private Context context;
    private List<Integer> processList;
    private List<String> descriptionList;

    public ProcessAdapter(Context context, List<Integer> processList, List<String> descriptionList) {
        this.context = context;
        this.processList = processList;
        this.descriptionList = descriptionList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ingredients_list_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        int product = processList.get(position);
        String desc = descriptionList.get(position);
        holder.txt_ingredients_title.setText("Step " + String.valueOf(position + 1));
        holder.txt_ingredients_description.setText(desc);
        Glide.with(context)
                .load(product)
                .into(holder.img_ingredients);


    }

    //METHOD FOR AVOIDING REPEATED VALUES
    @Override
    public long getItemId(int position) {
        return position;
    }
    //METHOD FOR AVOIDING REPEATED VALUES
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return processList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_ingredients;
        TextView txt_ingredients_title;
        TextView txt_ingredients_description;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_ingredients = itemView.findViewById(R.id.img_ingredients);
            txt_ingredients_title = itemView.findViewById(R.id.txt_ingredients_title);
            txt_ingredients_description = itemView.findViewById(R.id.txt_ingredients_description);


        }
    }
}

