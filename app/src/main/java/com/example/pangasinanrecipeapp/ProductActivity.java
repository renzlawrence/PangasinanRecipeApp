package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter productAdapter;
    LinearLayoutManager manager;
    int[] about_product;
    TextView txt_desc;
    String city_name;

    private List<Integer> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        txt_desc = findViewById(R.id.txt_desc);

        productList = new ArrayList<>();

        manager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            city_name = extras.getString("city_name");
            about_product = extras.getIntArray("about_product");

        }

        if(city_name.equals("Alaminos")) {
            txt_desc.setText("This version of longganisa is from the province of Alaminos, Pangasinan. Unlike the Kampampangan, Tagalog or the Cebuano versions which are sweet, this longganisa is similar to Vigan or Lucban longganisa which are refined saltiness and garlicky in taste. But the most notable difference of this Alaminos longganisa is the yellow color and toothpicks that divides the longganisa lint");

        }else if (city_name.equals("Bayambang")){

        }else if (city_name.equals("Bolinao")){

            txt_desc.setText("Binungey is one of Bolinao, Pangasinan’s local dishes and the cooking process is quite interesting.Though it is said that the dish originated in Alaminos, Pangasinan, the people of Bolinao have come up with their own recipe of this dish. Rice is soaked in coconut extract then placed inside a bamboo to be steamed over fire. A rich sweet sticky coconut jam  is served with it, usually alongside slices of mango.");

        }else if (city_name.equals("Dagupan")){

        }else if (city_name.equals("Mangaldan")){

        }else if (city_name.equals("San Fabian")){

        }else if (city_name.equals("San Jacinto")){

            txt_desc.setText("Did you know that corn is the second most important food crop in the Philippines? It is the primary source of feeds for poultry and livestock industries, making it widely valued and used.Corn is one of the primary products of San Jacinto together with rice and tobacco. During the 13th Philippine National Corn Congress, Pangasinan was bestowed with the “National Corn Achievers Award (Provincial Category)”. Two farmers from Mangaldan were likewise honored and included in the “Hall of Farmers for Outstanding Agricultural Extension Workers”.");

        }else if (city_name.equals("San Nicolas")){

        }else if (city_name.equals("Villasis")){

        }else if (city_name.equals("Pozorrubio")){

            txt_desc.setText("The Pozorrubio Pangasinan celebrated its annual fiesta and this year, it is highlighted with their famous product which is the “Patupat” – a native delicacy made from sticky rice and wrapped in coconut leaves. It is cooked in boiling sugarcane-juice. It is served with melted panocha or pakasiat.");


        }else if (city_name.equals("Mangatarem")){

            txt_desc.setText("Intemtem or Tupig is a popular native delicacy from Mangatarem Pangasinan which is made out of ground glutinous rice and coconuts strips wrapped in banana leaves then cooked over charcoal.");


        }else if (city_name.equals("Infanta")){

            txt_desc.setText("The native delicacy of Infanta Pangasinan known for its sweetness is made of glutinous rice as the outer coating and yema or ube as its filling.");


        }else if (city_name.equals("Calasiao")){


        }else if (city_name.equals("Asingan")){


        }else if (city_name.equals("Malasiqui")){


        }else if (city_name.equals("Aguilar")){


        }else if (city_name.equals("Tayug")){


        }else if (city_name.equals("Sta Barbara")){


        }else if (city_name.equals("Binalonan")){
            txt_desc.setText("Banana chips are deep-fried or dried, generally crispy slices of bananas. They are usually made from firmer, starchier banana varieties like the Saba and Nendran cultivars. They can be sweet or savory, and can be covered with sugar, honey, salt, or various spices");

        }else if (city_name.equals("Alcala")){

        }


        populateArrayLists(about_product);
        loadIngredients();
    }

    public void populateArrayLists(int[] product) {

        for (int i = 0; i < product.length; i++) {
            productList.add(product[i]);


        }
    }

    public void loadIngredients() {

        productAdapter = new ProductAdapter(ProductActivity.this, productList);
        recyclerView.setAdapter(productAdapter);
        productAdapter.notifyDataSetChanged();

    }


}