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

public class NutritionsAdapter extends RecyclerView.Adapter<NutritionsAdapter.ViewHolder> {

    private Context context;
    private List<String> titleList;
    private List<Integer> pictureList;
    private List<Integer> nutritionList;

    public NutritionsAdapter(Context context, List<String> titleList, List<Integer> pictureList, List<Integer> nutritionList) {
        this.context = context;
        this.titleList = titleList;
        this.pictureList = pictureList;
        this.nutritionList = nutritionList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nutrition_list_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        String title = titleList.get(position);
        int picture = pictureList.get(position);
        int nutritionPicture = nutritionList.get(position);
        holder.txt_ingredients_title.setText(title);
        Glide.with(context)
                .load(picture)
                .into(holder.img_ingredients);

        holder.cardView_ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, SingleNutritionActivity.class);
                i.putExtra("nutritionPicture",nutritionPicture);

                context.startActivity(i);
            }
        });

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
        CardView cardView_ingredients;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_ingredients = itemView.findViewById(R.id.img_ingredients);
            txt_ingredients_title = itemView.findViewById(R.id.txt_ingredients_title);
            txt_ingredients_description = itemView.findViewById(R.id.txt_ingredients_description);
            cardView_ingredients = itemView.findViewById(R.id.cardView_ingredients);

        }
    }
}

