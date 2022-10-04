package com.example.pangasinanrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CityMain extends AppCompatActivity {

    ImageView img_food;
    String city_name;
    TextView txt_food_title;
    CardView cardView_ingredients, cardView_product, cardView_nutrition, cardView_process,cardView_profile;

    String[] ingredients_title, ingredients_description,process_description;
    int[] ingredients_picture,nutrition_picture,about_product,process_picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_main);
        img_food = findViewById(R.id.img_food);
        txt_food_title = findViewById(R.id.txt_food_title);
        cardView_ingredients = findViewById(R.id.cardView_ingredients);
        cardView_product = findViewById(R.id.cardView_product);
        cardView_nutrition = findViewById(R.id.cardView_nutrition);
        cardView_process = findViewById(R.id.cardView_process);
        cardView_profile = findViewById(R.id.cardView_profile);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             city_name = extras.getString("city_name");
            ingredients_title=extras.getStringArray("ingredients_title");
            ingredients_description=extras.getStringArray("ingredients_description");
            ingredients_picture = extras.getIntArray("ingredients_picture");
            nutrition_picture = extras.getIntArray("nutrition_picture");
            about_product = extras.getIntArray("about_product");
            process_picture = extras.getIntArray("process_picture");
            process_description=extras.getStringArray("process_description");
            //The key argument here must match that used in the other activity
        }

        if(city_name.equals("Dagupan")) {
            img_food.setImageResource(R.drawable.dagupan_food);
            txt_food_title.setText("Inihaw na Bangus");

        }else if(city_name.equals("Mangaldan")){
            img_food.setImageResource(R.drawable.mangaldan_food);
            txt_food_title.setText("Beef Tapa");

        }else if(city_name.equals("Alaminos")){
            img_food.setImageResource(R.drawable.alaminos_food);
            txt_food_title.setText("Longganisa");

        }else if(city_name.equals("Bolinao")){
            img_food.setImageResource(R.drawable.bolinao_food);
            txt_food_title.setText("Binungey");

        }else if(city_name.equals("Villasis")){
            img_food.setImageResource(R.drawable.villasis_food);
            txt_food_title.setText("Tupig");

        }else if(city_name.equals("Bayambang")){
            img_food.setImageResource(R.drawable.bayambang_food);
            txt_food_title.setText("Buro");

        }else if(city_name.equals("San Jacinto")){
            img_food.setImageResource(R.drawable.sanjacinto_food);
            txt_food_title.setText("Corn");

        }else if(city_name.equals("San Nicolas")){
            img_food.setImageResource(R.drawable.sannicolas_food);
            txt_food_title.setText("Cookies");

        }else if(city_name.equals("San Fabian")){
            img_food.setImageResource(R.drawable.sanfabian_food);
            txt_food_title.setText("Kaleskes");

        }else if(city_name.equals("Pozorrubio")){
            img_food.setImageResource(R.drawable.pozorrubio_food);
            txt_food_title.setText("Patupat");

        }else if(city_name.equals("Mangatarem")){
            img_food.setImageResource(R.drawable.mangatarem_food);
            txt_food_title.setText("Tupig");

        }else if(city_name.equals("Infanta")){
            img_food.setImageResource(R.drawable.infanta_food);
            txt_food_title.setText("Patotoy");

        }else if(city_name.equals("Calasiao")){
            img_food.setImageResource(R.drawable.calasiao_food);
            txt_food_title.setText("Puto");

        }else if(city_name.equals("Asingan")){
            img_food.setImageResource(R.drawable.asingan_food);
            txt_food_title.setText("Rice cake");

        }else if(city_name.equals("Malasiqui")){
            img_food.setImageResource(R.drawable.malasiqui_food);
            txt_food_title.setText("Pigar pigar");

        }else if(city_name.equals("Aguilar")){
            img_food.setImageResource(R.drawable.aguilar_food);
            txt_food_title.setText("Adobo flakes");

        }else if(city_name.equals("Tayug")){
            img_food.setImageResource(R.drawable.tayug_food);
            txt_food_title.setText("Masikoy");

        }else if(city_name.equals("Sta Barbara")){
            img_food.setImageResource(R.drawable.stabarbara_food);
            txt_food_title.setText("Suman");

        }else if(city_name.equals("Binalonan")){
            img_food.setImageResource(R.drawable.binalonan_food);
            txt_food_title.setText("Banana Chips");

        }else if(city_name.equals("Alcala")){
            img_food.setImageResource(R.drawable.alcala_food);
            txt_food_title.setText("Bukayo");

        }



        cardView_ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle =new Bundle();

                bundle.putStringArray("ingredients_title", ingredients_title);
                bundle.putStringArray("ingredients_description", ingredients_description);
                bundle.putIntArray("ingredients_picture",ingredients_picture);
                bundle.putIntArray("nutrition_picture",nutrition_picture);
                bundle.putIntArray("about_product",about_product);
                bundle.putIntArray("process_picture",process_picture);
                bundle.putStringArray("process_description", process_description);

                Intent i = new Intent(CityMain.this, IngredientsActivity.class);
                i.putExtras(bundle);

                CityMain.this.startActivity(i);

            }
        });

        cardView_nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle =new Bundle();

                bundle.putStringArray("ingredients_title", ingredients_title);
                bundle.putIntArray("ingredients_picture",ingredients_picture);
                bundle.putIntArray("nutrition_picture",nutrition_picture);

                Intent i = new Intent(CityMain.this, NutritionFactsActivity.class);
                i.putExtra("city_name",city_name);
                i.putExtras(bundle);
                CityMain.this.startActivity(i);

            }
        });

        cardView_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle =new Bundle();
                bundle.putIntArray("about_product",about_product);
                Intent i = new Intent(CityMain.this, ProductActivity.class);
                i.putExtras(bundle);
                i.putExtra("city_name",city_name);
                CityMain.this.startActivity(i);

            }
        });

        cardView_process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle =new Bundle();

                bundle.putStringArray("process_description",process_description);
                bundle.putIntArray("process_picture",process_picture);
                Intent i = new Intent(CityMain.this, ProcessActivity.class);
                i.putExtras(bundle);
                CityMain.this.startActivity(i);

            }
        });

        cardView_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(CityMain.this, PersonMain.class);
                CityMain.this.startActivity(i);

            }
        });
    }
}