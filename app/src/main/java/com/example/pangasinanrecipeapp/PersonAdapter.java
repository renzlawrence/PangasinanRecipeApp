package com.example.pangasinanrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private List<PersonObject> personObjectList;
    private Context context;

    public PersonAdapter(List<PersonObject> personObjectList, Context context) {
        this.personObjectList = personObjectList;
        this.context = context;
    }

    //SETTING VIEW OF ADAPTER TO members_list_layout LAYOUT
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.person_list_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PersonAdapter.ViewHolder holder, int position) {

        PersonObject personObject = personObjectList.get(position);

        String name = personObject.getName();
        String age = personObject.getAge();
        String address = personObject.getAddress();
        String email = personObject.getEmail();
        String number = personObject.getNumber();
        int picture = personObject.getPersonImage();
        holder.txt_name.setText(name);
        holder.txt_age.setText(age);
        holder.txt_address.setText(address);
        holder.txt_email.setText(email);
        holder.txt_number.setText(number);

        Glide.with(context)
                .load(picture)
                .into(holder.img_profile);

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
        return personObjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_profile;
        TextView txt_name, txt_age, txt_address, txt_email, txt_number;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            img_profile = itemView.findViewById(R.id.img_profile);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_age = itemView.findViewById(R.id.txt_age);
            txt_address = itemView.findViewById(R.id.txt_address);
            txt_email = itemView.findViewById(R.id.txt_email);
            txt_number = itemView.findViewById(R.id.txt_number);

        }
    }
}
