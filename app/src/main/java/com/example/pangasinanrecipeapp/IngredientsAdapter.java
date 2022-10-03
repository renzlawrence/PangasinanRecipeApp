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

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.ViewHolder> {

    private Context context;
    private List<String> titleList, descriptionList;
    private List<Integer> pictureList;
    private List<Integer> nutritionList;

    public IngredientsAdapter(Context context, List<String> titleList, List<String> descriptionList, List<Integer> pictureList, List<Integer> nutritionList) {
        this.context = context;
        this.titleList = titleList;
        this.descriptionList = descriptionList;
        this.pictureList = pictureList;
        this.nutritionList = nutritionList;
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

        String title = titleList.get(position);
        String desc = descriptionList.get(position);
        int picture = pictureList.get(position);
        //holder.img_ingredients.setImageResource(picture);
        holder.txt_ingredients_title.setText(title);
        holder.txt_ingredients_description.setText(desc);

        Glide.with(context)
                .load(picture)
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
        return titleList.size();
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

