package com.example.pangasinanrecipeapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.ViewHolder> {

    private Context context;
    private List<String> citiesList;


    String[] dagupan_ingredients_title = {"Fish Sauce", "Calamansi", "White Onion", "Tomatoes", "Ginger", "Bangus", "Salt", "Ground Pepper","Salted egg"};
    String[] dagupan_ingredients_description = {"Fish sauce is a liquid condiment made from fish or krill that have been coated in salt and fermented for up to two years.",
            "Calamansi, also known as calamondin, Philippine lime, or Philippine lemon, is an economically important citrus hybrid predominantly cultivated in the Philippines.",
            "White onion or Allium cepa are a cultivar of dry onion which have a distinct light and mild flavour profile. Much like red onions, they have a high sugar and low sulphur content, and thus have a relatively short shelf life.",
            "The tomato is the edible berry of the plant Solanum lycopersicum, commonly known as the tomato plant.",
            "Ginger is a flowering plant whose rhizome, ginger root or ginger, is widely used as a spice and a folk medicine. It is a herbaceous perennial which grows annual pseudostems about one meter tall bearing narrow leaf blades.",
            "The milkfish is the sole living species in the family Chanidae. However, there are at least five extinct genera from the Cretaceous.",
            "Salt is a mineral composed primarily of sodium chloride, a chemical compound belonging to the larger class of salts; salt in the form of a natural crystalline mineral is known as rock salt or halite.",
            "Black pepper is a flowering vine in the family Piperaceae, cultivated for its fruit, known as a peppercorn, which is usually dried and used as a spice and seasoning. ",
            "Salted Eggs are preserved eggs soaked in brine or packed in a thick layer of salted charcoal paste. They are traditionally made with duck eggs for a richer taste and texture."};
    int[] dagupan_ingredients_picture = {R.drawable.dagupan_ingredients_1,
            R.drawable.dagupan_ingredients_2,
            R.drawable.dagupan_ingredients_3,
            R.drawable.dagupan_ingredients_4,
            R.drawable.dagupan_ingredients_5,
            R.drawable.dagupan_ingredients_6,
            R.drawable.dagupan_ingredients_7,
            R.drawable.dagupan_ingredients_8,
            R.drawable.dagupan_ingredients_9};
    int[] dagupan_nutrition_picture = {R.drawable.dagupan_nutrition_1,
            R.drawable.dagupan_nutrition_2,
            R.drawable.dagupan_nutrition_3,
            R.drawable.dagupan_nutrition_4,
            R.drawable.dagupan_nutrition_5,
            R.drawable.dagupan_nutrition_6,
            R.drawable.dagupan_nutrition_7,
            R.drawable.dagupan_nutrition_8,
            R.drawable.dagupan_nutrition_9};
    int[] dagupan_about_product = {R.drawable.dagupan_about_1,
            R.drawable.dagupan_about_2,
            R.drawable.dagupan_about_3,
            R.drawable.dagupan_about_4,
            R.drawable.dagupan_about_5,
            R.drawable.dagupan_about_6,
            R.drawable.dagupan_about_7,
            R.drawable.dagupan_about_8,
            R.drawable.dagupan_about_9,
            R.drawable.dagupan_about_10,
            R.drawable.dagupan_about_11,
            R.drawable.dagupan_about_12,
            R.drawable.dagupan_about_13};
    int[] dagupan_process_picture = {R.drawable.dagupan_step_1,
            R.drawable.dagupan_step_2,
            R.drawable.dagupan_step_3,
            R.drawable.dagupan_step_4,
            R.drawable.dagupan_step_5,
            R.drawable.dagupan_step_6,
            R.drawable.dagupan_step_7};
    String[] dagupan_process_description = {"Chopped the white onion, ginger, calamansin and tomatoes.",
            "Put the salt and scrub it in the body of the milkfish or bangus to taste.",
            "mixed all the ingredients after you put the salt and scrub the body of the bangus.",
            "After you mix all the ingredients put all the engredients  inside the body of the milkfish or bangus.",
            "After putting all the ingredients inside the body of the bangus, using the foil you will wrap the entire body of the bangus.",
            "Put the bangus inside the grill and wait probably 30 minutes until the milkfish will cook.",
            "After 30minutes of grilling the bangus, you can remove the wrap foil and it  is ready to eat."};


    String[] mangaldan_ingredients_title = {"beef sirloin","Soy sauce", "Calamansi Juice", "Garlic", "ground pepper","Sugar","Baking Soda", "Cooking oil"};
    String[] mangaldan_ingredients_description = {"sirloin steak is cut from the sirloin, the sub-primal posterior to the short loin where the T-bone, porterhouse, and club steaks are cut.",
            "Soy sauce is a liquid condiment of Chinese origin, traditionally made from a fermented paste of soybeans, roasted grain, brine, and Aspergillus oryzae",
            "Calamansi Juice is the Filipino version of lemonade and limeade.",
            "Garlic is a species of bulbous flowering plant in the genus Allium. Its close relatives include the onion, shallot, leek, chive, Welsh onion and Chinese onion.",
            "Ground Pepper is a spice made from peppercorns that have been ground.",
            "Sugar is the generic name for sweet-tasting, soluble carbohydrates, many of which are used in food. Simple sugars, also called monosaccharides, include glucose, fructose, and galactose",
            "Sodium bicarbonate, commonly known as baking soda or bicarbonate of soda, is a chemical compound with the formula NaHCO₃. It is a salt composed of a sodium cation and a bicarbonate anion. Sodium bicarbonate is a white solid that is crystalline, but often appears as a fine powder",
            "Cooking oil is plant, animal, or synthetic liquid fat used in frying, baking, and other types of cooking."};
    int[] mangaldan_ingredients_picture = {R.drawable.mangaldan_ingredients_1,
            R.drawable.mangaldan_ingredients_2,
            R.drawable.mangaldan_ingredients_3,
            R.drawable.mangaldan_ingredients_4,
            R.drawable.mangaldan_ingredients_5,
            R.drawable.mangaldan_ingredients_6,
            R.drawable.mangaldan_ingredients_7,
            R.drawable.mangaldan_ingredients_8};
    int[] mangaldan_nutrition_picture = {R.drawable.mangaldan_nutrition_1,
            R.drawable.mangaldan_nutrition_2,
            R.drawable.mangaldan_nutrition_3,
            R.drawable.mangaldan_nutrition_4,
            R.drawable.mangaldan_nutrition_5,
            R.drawable.mangaldan_nutrition_6,
            R.drawable.mangaldan_nutrition_7,
            R.drawable.mangaldan_nutrition_8};
    int[] mangaldan_about_product = {R.drawable.mangaldan_about_1,
            R.drawable.mangaldan_about_2,
            R.drawable.mangaldan_about_3,
            R.drawable.mangaldan_about_4,
            R.drawable.mangaldan_about_5,
            R.drawable.mangaldan_about_6};
    int[] mangaldan_process_picture = {R.drawable.mangaldan_step_1,
            R.drawable.mangaldan_step_2,
            R.drawable.mangaldan_step_3,
            R.drawable.mangaldan_step_4,
            R.drawable.mangaldan_step_5,
            R.drawable.mangaldan_step_6};
    String[] mangaldan_process_description = {"Using a mallet or any blunt object, pound each cut of meat until meat is flattened to about a quarter inch thick.",
            "Place the beef into a bowl and sprinkle with the baking soda. Mix until well blended.",
            "Add lemon juice and mix again several times. Then add the rest of the ingredients.",
            "Cover the bowl with plastic wrap and marinate beef in the fridge overnight.",
            "Heat a tablespoon of oil in a large pan or skillet. Fry each side of the meat for 3-5 minutes or until browned and the liquids are absorbed. Add more oil as needed.",
            "Serve with sunny-side-up egg and garlic fried rice while still hot."};

    String[] alaminos_ingredients_title = {"ground lean pork","ground pork fat", "coarse salt", "black pepper", "Vinegar","Garlic","Soy sauce", "Rum","Atsuete powder"};
    String[] alaminos_ingredients_description = {"When selecting the best cut of pork for making sausage one of the main things to take into consideration is the meat to fat ratio present in the cut. Typically, when making sausage you want to aim for a cut that gives you a ratio of 80% meat and 20% fat.",
            "Ground pork is affordable, fresh, and extremely versatile, soaking up any flavor you add to it. It's available with an average lean-fat ratio of 70 percent lean, 30 percent fat, making it a great substitute for other ground meats featured in your favorite recipes",
            "Coarse salt, sometimes called kosher salt (incorrectly, however), is a type of salt that is formed into large crystals or granules. It is often used to salt meat, as an ingredient in brines, and also in regular recipes, like soups and sauces. Table salt is much more commonly used than coarse salt.",
            "While salt can cause water retention and other undesired effects when added to food, pepper is a diuretic. It encourages urination and sweating, which help rid the body of harmful toxins. As a result, evidence shows that black pepper may help keep the liver healthy.",
            "Vinegar is fine to use on food and when mixed with water, juice, or another liquid is safe to drink. However, with a pH between 2.4 and 3.3, vinegar is acidic enough to erode tooth enamel, inflame the esophagus and stomach, and trigger nausea and acid reflux.",
            "Garlic is a known appetite suppressant. It helps keep you fuller for longer, further preventing you from overeating. A study published in the Journal of Nutrition, there is an association between garlic and fat-burning. The compounds in it are known to stimulate the fat-burning process",
            "Soy sauce is an extremely versatile ingredient that can be used as a table condiment or added to dishes during cooking for extra flavor. The ingredient is made from fermented soybeans, giving it a strong umami taste from the fermentation process",
            "Rum is beneficial for your heart, and drinking it frequently in moderation can give you a healthy and strong heart. Rum has shown to be a great cure for peripheral heart disease and avoid the formation of artery blockage in the body.",
            "The most impressive health benefits of annatto may include its potential ability to promote healthy digestion, strengthen bones, prevent neural tube defects, promote healing, lower fevers, boost eye health, eliminate headaches, reduce nausea, and protect respiratory distress"};
    int[] alaminos_ingredients_picture = {R.drawable.alaminos_ingredients_1,
            R.drawable.alaminos_ingredients_2,
            R.drawable.alaminos_ingredients_3,
            R.drawable.alaminos_ingredients_4,
            R.drawable.alaminos_ingredients_5,
            R.drawable.alaminos_ingredients_6,
            R.drawable.alaminos_ingredients_7,
            R.drawable.alaminos_ingredients_8,
            R.drawable.alaminos_ingredients_9};
    int[] alaminos_nutrition_picture = {R.drawable.alaminos_nutrition_1,
            R.drawable.alaminos_nutrition_2,
            R.drawable.alaminos_nutrition_3,
            R.drawable.alaminos_nutrition_4,
            R.drawable.alaminos_nutrition_5,
            R.drawable.alaminos_nutrition_6,
            R.drawable.alaminos_nutrition_7,
            R.drawable.alaminos_nutrition_8,
            R.drawable.alaminos_nutrition_9};
    int[] alaminos_about_product = {R.drawable.alaminos_about_1,
            R.drawable.alaminos_about_2,
            R.drawable.alaminos_about_3,
            R.drawable.alaminos_about_4,
            R.drawable.alaminos_about_5,
            R.drawable.alaminos_about_6,
            R.drawable.alaminos_about_7,
            R.drawable.alaminos_about_8,
            R.drawable.alaminos_about_9};
    int[] alaminos_process_picture = {R.drawable.alaminos_step_1,
            R.drawable.alaminos_step_2,
            R.drawable.alaminos_step_3,
            R.drawable.alaminos_step_4,
            R.drawable.alaminos_step_5,
            R.drawable.alaminos_step_6};
    String[] alaminos_process_description = {"Peel the skin off the garlic cloves. Crush thoroughly using mortar and pestle.",
            "In a large mixing bowl, combine ground pork along with all of the ingredients. Mix well.",
            "Cover the bowl",
            "Shape the longganisa by laying a sheet of wax paper on a flat surface",
            "Refrigerate overnight.",
            "Cook and serve for breakfast"};

    String[] bolinao_ingredients_title = {"Malagkit rice","Gata"};
    String[] bolinao_ingredients_description = {"In the Philippines, glutinous rice is known as malagkit in Tagalog or pilit in Visayan, among other names. Both mean \"sticky\".",
            "Gata refers to milk from coconut meat. Pressing the grated meat of a mature coconut with water creates milk or cream."};
    int[] bolinao_ingredients_picture = {R.drawable.bolinao_ingredients_1,
            R.drawable.bolinao_ingredients_2};
    int[] bolinao_nutrition_picture = {R.drawable.bolinao_nutrition_1,
            R.drawable.bolinao_nutrition_2};
    int[] bolinao_about_product = {R.drawable.bolinao_about_1,
            R.drawable.bolinao_about_2,
            R.drawable.bolinao_about_3,
            R.drawable.bolinao_about_4,
            R.drawable.bolinao_about_5,
            R.drawable.bolinao_about_6,
            R.drawable.bolinao_about_7,
            R.drawable.bolinao_about_8,
            R.drawable.bolinao_about_9,
            R.drawable.bolinao_about_10,
            R.drawable.bolinao_about_11};
    int[] bolinao_process_picture = {R.drawable.bolinao_step_1,
            R.drawable.bolinao_step_2,
            R.drawable.bolinao_step_3,
            R.drawable.bolinao_step_4,
            R.drawable.bolinao_step_5};
    String[] bolinao_process_description = {"Prepared the bamboos you need to put the sticky rice and coconut milk",
            "then, fill the bamboo tubes with glutinous rice, ¾ full",
            "Top the glutinous rice either with a banana leaf or the coconut shavings that was extracted for the coconut extract.",
            "Arrange bamboo tubes in a row in an upright position. Then, lit up a fire on each side, using either wood or coal, just near enough to allow the heat to reach the tubes.",
            "Let it steam for a few hours. Then, you can either top it with sugar, nuts or milk upon serving"};

    String[] villasis_ingredients_title = {"RICE FLOUR","SHREDDED  COCONUT", "COCONUT MILK", "BROWN SUGAR", "BUTTER"};
    String[] villasis_ingredients_description = {"Rice flour is a form of flour made from finely milled rice. It is distinct from rice starch, which is usually produced by steeping rice in lye. Rice flour is a common substitute for wheat flour.",
            "Desiccated coconut is fresh coconut that has been shredded or flaked and dried. It is typically unsweetened, but the term is sometimes also used to refer to the less dry sweetened flake coconut as well. ",
            "Coconut milk is an opaque, milky-white liquid extracted from the grated pulp of mature coconuts. The opacity and rich taste of coconut milk are due to its high oil content, most of which is saturated fat.",
            "Brown sugar is a sucrose sugar product with a distinctive brown color due to the presence of molasses. It is either an unrefined or partially refined soft sugar consisting of sugar crystals with some residual molasses content, or it is produced by the addition of molasses to refined white sugar",
            "Butter is a dairy product made from the fat and protein components of churned cream."};
    int[] villasis_ingredients_picture = {R.drawable.villasis_ingredients_1,
            R.drawable.villasis_ingredients_2,
            R.drawable.villasis_ingredients_3,
            R.drawable.villasis_ingredients_4,
            R.drawable.villasis_ingredients_5};
    int[] villasis_nutrition_picture = {R.drawable.villasis_nutrition_1,
            R.drawable.villasis_nutrition_2,
            R.drawable.villasis_nutrition_3,
            R.drawable.villasis_nutrition_4,
            R.drawable.villasis_nutrition_5};
    int[] villasis_about_product = {R.drawable.villasis_about_1,
            R.drawable.villasis_about_2,
            R.drawable.villasis_about_3,
            R.drawable.villasis_about_4,
            R.drawable.villasis_about_5,
            R.drawable.villasis_about_6,
            R.drawable.villasis_about_7,
            R.drawable.villasis_about_8,
            R.drawable.villasis_about_9};
    int[] villasis_process_picture = {R.drawable.villasis_step_1,
            R.drawable.villasis_step_2,
            R.drawable.villasis_step_3,
            R.drawable.villasis_step_4,
            R.drawable.villasis_step_5,
            R.drawable.villasis_step_6};
    String[] villasis_process_description = {"In a small mixing bowl add glutinous rice and pour enough water to soak the rice. Leave it in a room temperature overnight.",
            "Drain the water from the rice then place in a cheesecloth to remove excess liquid.",
            "Place in a blender or food processor and process until it becomes a powder, add the coconut milk and sugar and continue to blend until even in consistency.",
            "Place mixture in a bowl then combine with the coconut strips.",
            "Place 2 tablespoons of mixture in the centre of the banana leaf then wrap by rolling and fold the edges to avoid dripping. (This will be tricky as the dough is very runny, it takes practice). ",
            "Immediately place in a charcoal or any grill once you wrap one, cook by turning frequently. Once the banana leaf is charred on all sides remove it from the grill then set aside to cool before serving."};

    String[] bayambang_ingredients_title = {"Tilapia","cooked rice", "Salt", "sliced bamboo shoots"};
    String[] bayambang_ingredients_description = {"Tilapia are a hardy, fast growing fish, that can live up to ten years and reach ten pounds in weight. Tilapia are shaped like a sunfish or crappie and are easily identifiable by the interrupted lateral line characteristic of the Chiclid family of fishes",
            "edible starchy cereal grain and the grass plant (family Poaceae) by which it is produced. Roughly one-half of the world population, including virtually all of East and Southeast Asia, is wholly dependent upon rice as a staple food; 95 percent of the world's rice crop is eaten by humans",
            "consists of the positive ion (cation) of a base and the negative ion (anion) of an acid. The reaction between an acid and a base is called a neutralization reaction. The term salt is also used to refer specifically to common table salt, or sodium chloride",
            "cut from the heart of the bamboo plant. They have an ivory to light yellow color and a mild flavor. They add a pleasant crunchy texture to stir-fries and soups."};
    int[] bayambang_ingredients_picture = {R.drawable.bayambang_ingredients_1,
            R.drawable.bayambang_ingredients_2,
            R.drawable.bayambang_ingredients_3,
            R.drawable.bayambang_ingredients_4};
    int[] bayambang_nutrition_picture = {R.drawable.bayambang_nutrition_1,
            R.drawable.bayambang_nutrition_2,
            R.drawable.bayambang_nutrition_3,
            R.drawable.bayambang_nutrition_4};
    int[] bayambang_about_product = {R.drawable.bayambang_about_1,
            R.drawable.bayambang_about_2,
            R.drawable.bayambang_about_3,
            R.drawable.bayambang_about_4,
            R.drawable.bayambang_about_5,
            R.drawable.bayambang_about_6};
    int[] bayambang_process_picture = {R.drawable.bayambang_step_1,
            R.drawable.bayambang_step_2,
            R.drawable.bayambang_step_3,
            R.drawable.bayambang_step_4,
            R.drawable.bayambang_step_5,
            R.drawable.bayambang_step_6,
            R.drawable.bayambang_step_7,
            R.drawable.bayambang_step_8,
            R.drawable.bayambang_step_9,
            R.drawable.bayambang_step_10};
    String[] bayambang_process_description = {"Clean the tilapia very well.",
            "Marinate the fish with salt overnight.",
            "The next day, prepare the banga, making sure it is clean and dry.",
            "Mix the salt and the rice well.",
            "Put some rice with salt at the bottom of the banga to serve as the bedding.",
            "Put some amount of rice in the fish belly. Sliced bamboo shoots may be added as an option.",
            "Arrange the fish and rice inside the banga one by one: After placing a piece of whole fish inside, put some salted rice on the top of it, and so on until all the fish have been placed inside.",
            "Put the remaining rice on top.",
            "Put enough rice",
            "Cover the banga with clean cloth then tie it around the rim."};

    String[] sanjacinto_ingredients_title = {"Butter","Runny Honey", "Ketchup", "Garlic", "Harissa","corncob"};
    String[] sanjacinto_ingredients_description = {"Butter is a dairy product made from the fat and protein components of churned cream. It is a semi-solid emulsion at room temperature, consisting of approximately 80% butterfat" ,
            "Runny Honey is the British term for any clear honey. This is in contrast to crystallized or solid honey. In most cases the honey can be used interchangeably in recipes (unless you need it to drizzle).",
            "Ketchup comes from the Hokkien Chinese word, kê-tsiap, the name of a sauce derived from fermented fish. It is believed that traders brought fish sauce from Vietnam to southeastern China. The British likely encountered ketchup in Southeast Asia, returned home, and tried to replicate the fermented dark sauce.",
            "For starters, fresh garlic is normally sold in heads, which are bulb-like and covered in whiteish papery skin. Remove the outer papery layer, and you'll see that one bulb is made up of many individual lobes that are also covered in papery skin. Each of these lobes is called a clove of garlic.",
            "Harissa is a hot chili pepper paste, native to the Maghreb. The main ingredients are roasted red peppers, Baklouti peppers, spices and herbs such as garlic paste, caraway seeds, coriander seeds, cumin and olive oil to carry the oil-soluble flavors. Rose harissa, made with rose petals",
            "A corncob, also called cob of corn or corn on the cob, is the central core of an ear of corn. It is the part of the ear on which the kernels grow. The ear is also considered a \"cob\" or \"pole\" but it is not fully a \"pole\" until the ear is shucked, or removed from the plant material around the ear."};
    int[] sanjacinto_ingredients_picture = {R.drawable.sanjacinto_ingredients_1,
            R.drawable.sanjacinto_ingredients_2,
            R.drawable.sanjacinto_ingredients_3,
            R.drawable.sanjacinto_ingredients_4,
            R.drawable.sanjacinto_ingredients_5,
            R.drawable.sanjacinto_ingredients_6};
    int[] sanjacinto_nutrition_picture = {R.drawable.sanjacinto_nutrition_1,
            R.drawable.sanjacinto_nutrition_2,
            R.drawable.sanjacinto_nutrition_3,
            R.drawable.sanjacinto_nutrition_4,
            R.drawable.sanjacinto_nutrition_5,
            R.drawable.sanjacinto_nutrition_6};
    int[] sanjacinto_about_product = {R.drawable.sanjacinto_about_1,
            R.drawable.sanjacinto_about_2,
            R.drawable.sanjacinto_about_3,
            R.drawable.sanjacinto_about_4,
            R.drawable.sanjacinto_about_5,
            R.drawable.sanjacinto_about_6,
            R.drawable.sanjacinto_about_7,
            R.drawable.sanjacinto_about_8,
            R.drawable.sanjacinto_about_9};
    int[] sanjacinto_process_picture = {R.drawable.sanjacinto_step_1,
            R.drawable.sanjacinto_step_2,
            R.drawable.sanjacinto_step_3,
            R.drawable.sanjacinto_step_4,
            R.drawable.sanjacinto_step_5};
    String[] sanjacinto_process_description = {"Prepare coals for grilling.",
            "Peel off the Corn leaves and clean the cob off of hairs",
            "Use a barbecue stick to hold each cobs for grilling",
            "Grill the corn until done or a few pops",
            "How long to boil corn on the cob? Boil the corn until the kernels turn bright yellow and are crisp tender, 4 to 5 minutes. Carefully remove from the water with tongs to a serving platter and serve warm"};


    String[] sannicolas_ingredients_title = {"Flour ","Cornstarch ", "Coconut Cream ", "Fotified Milk ", "Butter ","Baking Powder ","Sugar ", "Star anise ","Egg"};
    String[] sannicolas_ingredients_description = {"- Flour is a powder made by grinding raw grains, roots, beans, nuts, or seeds. Flours are used to make many different foods.",
            "Corn starch, maize starch, or cornflour is the starch derived from corn grain. Corn starch is a common food ingredient, often used to thicken sauces or soups, and to make corn syrup and other sugars.",
            "Coconut cream is a type of thick cream made from coconut milk. Although canned versions are widely available, you can also make coconut cream at home. Simply refrigerate coconut milk for a few hours and observe how a thick layer of cream floats to the top and separates from the thin, watery liquid below",
            "Milk is a white liquid food produced by the mammary glands of mammals. It is the primary source of nutrition for young mammals before they are able to digest solid food.",
            "Butter is a dairy product made from the fat and protein components of churned cream. ",
            "Baking powder is a dry chemical leavening agent, a mixture of a carbonate or bicarbonate and a weak acid. The base and acid are prevented from reacting prematurely by the inclusion of a buffer such as cornstarch. Baking powder is used to increase the volume and lighten the texture of baked goods",
            "Sugar is the generic name for sweet-tasting, soluble carbohydrates, many of which are used in food. Simple sugars, also called monosaccharides, include glucose, fructose, and galactose.",
            "Illicium verum is a medium-sized evergreen tree native to northeast Vietnam and southwest China. A spice commonly called star anise.",
            "Eggs are laid by female animals of many different species, including birds, reptiles, amphibians, a few mammals, and fish, and many of these have been eaten by humans for thousands of years."};
    int[] sannicolas_ingredients_picture = {R.drawable.sannicolas_ingredients_1,
            R.drawable.sannicolas_ingredients_2,
            R.drawable.sannicolas_ingredients_3,
            R.drawable.sannicolas_ingredients_4,
            R.drawable.sannicolas_ingredients_5,
            R.drawable.sannicolas_ingredients_6,
            R.drawable.sannicolas_ingredients_7,
            R.drawable.sannicolas_ingredients_8,
            R.drawable.sannicolas_ingredients_9};
    int[] sannicolas_nutrition_picture = {R.drawable.sannicolas_nutrition_1,
            R.drawable.sannicolas_nutrition_2,
            R.drawable.sannicolas_nutrition_3,
            R.drawable.sannicolas_nutrition_4,
            R.drawable.sannicolas_nutrition_5,
            R.drawable.sannicolas_nutrition_6,
            R.drawable.sannicolas_nutrition_7,
            R.drawable.sannicolas_nutrition_8,
            R.drawable.sannicolas_nutrition_9};
    int[] sannicolas_about_product = {R.drawable.sannicolas_about_1,
            R.drawable.sannicolas_about_2,
            R.drawable.sannicolas_about_3,
            R.drawable.sannicolas_about_4,
            R.drawable.sannicolas_about_5,
            R.drawable.sannicolas_about_6,
            R.drawable.sannicolas_about_7,
            R.drawable.sannicolas_about_8,
            R.drawable.sannicolas_about_9,
            R.drawable.sannicolas_about_10,
            R.drawable.sannicolas_about_11,
            R.drawable.sannicolas_about_12,
            R.drawable.sannicolas_about_13,
            R.drawable.sannicolas_about_14};
    int[] sannicolas_process_picture = {R.drawable.sannicolas_step_1,
            R.drawable.sannicolas_step_2,
            R.drawable.sannicolas_step_3,
            R.drawable.sannicolas_step_4,
            R.drawable.sannicolas_step_5,
            R.drawable.sannicolas_step_6,
            R.drawable.sannicolas_step_7,
            R.drawable.sannicolas_step_8,
            R.drawable.sannicolas_step_9};
    String[] sannicolas_process_description = {"You need to prepare all the ingredients that you can use to make a cookies.",
            "You need to mix the Cream butter then gradually add sugar.",
            "Beat egg yolk then blend into butter-sugar mixture",
            "Sift half of dry ingredients to mixture and gradually add coconut cream",
            "Mix well to make dough. Knead dough on floured board",
            "Roll out with rolling pin that has been dusted with flour until dough can be spread thinly.",
            "Cut into pieces with cookie cutter and bake in greased baking sheet.",
            "To make it more authentic get a mold with the imprinted image of Saint Nicholas de Tolentino then press the dough with it.",
            "Brush cookies with milk and put it in the cement coal stove or “Kalan de Uling” for 10 minutes."};


    String[] sanfabian_ingredients_title = {"beef intestines","cane vinegar","beef stock","spring onions", "finger chillies","large onions","whole garlic","Annatto  powder","Ground Pepper","Salt","Cooking oil"};
    String[] sanfabian_ingredients_description = {"Beef intestines, also known as tripe, are not common in mainstream American cooking, but they are a dietary staple in other cultures, including Latin America and China. Often served braised, stewed or in a soup, tripe is an inexpensive source of protein.",
            "Cane vinegar is made from syrup from sugar cane. The cane is harvested, crushed to extract the juice, simmered down into a syrup, and the syrup fermented into vinegar. Good ones are also aged in oak barrels. It has a mellow flavour like malt vinegar, with an added freshness in the mouth.",
            "Beef stock is typically made from beef bones and some herbs and spices boiled down in water. It is distinguished from beef broth which uses meat in the process. They are often used interchangeably.",
            "Also known as scallions or green onions, spring onions are in fact very young onions, harvested before the bulb has had a chance to swell. Both the long, slender green tops and the small white bulb are edible, and are good either raw or cooked. They have a similar flavour to onions, but are much milder.",
            "Long thin variety known as finger or rocket chilli are a hot green chilli. These do ripen to red but generally used when they are green. Typically used in Indian cooking where they are added during the cooking process to create the masala, for additional punch you would add chilli powder if required.",
            "An onion is a round vegetable with a brown skin that grows underground. It has many white layers on its inside which have a strong, sharp smell and taste. Will you chop an onion up for me? It is made with fresh minced meat, cooked with onion and a rich tomato sauce.",
            "Garlic is the small, white, round bulb of a plant that is related to the onion plant. Garlic has a very strong smell and taste and is used in cooking.",
            "Annatto is an orange-red food coloring or condiment made from the seeds of the achiote tree (Bixa orellana), which grows in tropical regions in South and Central America",
            "They become yellowish red at maturity and bear a single seed. Their odour is penetrating and aromatic; the taste is hot, biting, and very pungent.",
            "colorless or white substance that consists of sodium and chlorine and is used in seasoning and preserving food and in industry",
            "Cooking oil is plant, animal, or synthetic liquid fat used in frying, baking, and other types of cooking. It is also used in food preparation and flavoring not involving heat, such as salad dressings and bread dips, and may be called edible oil."};
    int[] sanfabian_ingredients_picture = {R.drawable.sanfabian_ingredients_1,
            R.drawable.sanfabian_ingredients_2,
            R.drawable.sanfabian_ingredients_3,
            R.drawable.sanfabian_ingredients_4,
            R.drawable.sanfabian_ingredients_5,
            R.drawable.sanfabian_ingredients_6,
            R.drawable.sanfabian_ingredients_7,
            R.drawable.sanfabian_ingredients_8,
            R.drawable.sanfabian_ingredients_9,
            R.drawable.sanfabian_ingredients_10,
            R.drawable.sanfabian_ingredients_11};
    int[] sanfabian_nutrition_picture = {R.drawable.sanfabian_nutrition_1,
            R.drawable.sanfabian_nutrition_2,
            R.drawable.sanfabian_nutrition_3,
            R.drawable.sanfabian_nutrition_4,
            R.drawable.sanfabian_nutrition_5,
            R.drawable.sanfabian_nutrition_6,
            R.drawable.sanfabian_nutrition_7,
            R.drawable.sanfabian_nutrition_8,
            R.drawable.sanfabian_nutrition_9,
            R.drawable.sanfabian_nutrition_10,
            R.drawable.sanfabian_nutrition_11};
    int[] sanfabian_about_product = {R.drawable.sanfabian_about_1,
            R.drawable.sanfabian_about_2,
            R.drawable.sanfabian_about_3,
            R.drawable.sanfabian_about_4,
            R.drawable.sanfabian_about_5,
            R.drawable.sanfabian_about_6,
            R.drawable.sanfabian_about_7,
            R.drawable.sanfabian_about_8};
    int[] sanfabian_process_picture = {R.drawable.sanfabian_step_1,
            R.drawable.sanfabian_step_2,
            R.drawable.sanfabian_step_3,
            R.drawable.sanfabian_step_4,
            R.drawable.sanfabian_step_5};
    String[] sanfabian_process_description = {"",
            "In a large pot heat oil then add garlic and onions, sauté until fragrant.",
            "Add the intestines, tripe and annatto powder, stir fry in high heat for 5 minutes.",
            "Add the vinegar, boil for 2 minutes.",
            "Add the beef stock and green finger chillies, boil then simmer for 30 minutes or until tender.",
            "Season with salt and freshly ground black pepper, add spring onions, turn off heat then serve."};

    String[] pozorrubio_ingredients_title = {"GLUTINOUS RICE","COCONUT WATER","PANUTSA "};
    String[] pozorrubio_ingredients_description = {"Glutinous rice is a type of rice grown mainly in Southeast and East Asia, Northeastern India and Bhutan which has opaque grains, very low amylose content, and is especially sticky when cooked. It is widely consumed across Asia.",
            "Coconut water is the liquid found in the center of a young, green coconut. It helps nourish the fruit. As the coconut matures, which takes around 10–12 months, some of the liquid remains while the rest ripens into the solid white flesh known as coconut meat",
            "The Filipino treat called panocha (panotsa, panutsa) is traditionally made by crystallizing brown sugar with limewater, then pouring the mixture into a coconut shell until it hardens."};
    int[] pozorrubio_ingredients_picture = {R.drawable.pozorrubio_ingredients_1,
            R.drawable.pozorrubio_ingredients_2,
            R.drawable.pozorrubio_ingredients_3};
    int[] pozorrubio_nutrition_picture = {R.drawable.pozorrubio_nutrition_1,
            R.drawable.pozorrubio_nutrition_2,
            R.drawable.pozorrubio_nutrition_3};
    int[] pozorrubio_about_product = {R.drawable.pozorrubio_about_1,
            R.drawable.pozorrubio_about_2,
            R.drawable.pozorrubio_about_3,
            R.drawable.pozorrubio_about_4,
            R.drawable.pozorrubio_about_5,
            R.drawable.pozorrubio_about_6,
            R.drawable.pozorrubio_about_7,
            R.drawable.pozorrubio_about_8};
    int[] pozorrubio_process_picture = {R.drawable.pozorrubio_step_1,
            R.drawable.pozorrubio_step_2,
            R.drawable.pozorrubio_step_3,
            R.drawable.pozorrubio_step_4,
            R.drawable.pozorrubio_step_5};
    String[] pozorrubio_process_description = {"In a bowl, place Glutinous rice and water then soak for at least 2 hours.",
            "In a wok, cooked glutinous rice in coconut milk and sugar in a low heat until done. Let it cool and set aside.",
            "Singe each banana leaf into flames for a few seconds but do not burn. Let it cool then wipe with clean cloth.",
            "Scoop a cup of cooked glutinous rice the wrap in banana leaf in a cone shape.",
            "Steam for 50 minutes then drain and let it cool before serving"};

    String[] mangatarem_ingredients_title = {"COCONUT MEAT","COCONUT MILK","GLUTINOUS RICE FLOUR", "SUGAR", "OIL"};
    String[] mangatarem_ingredients_description = {"Coconut meat is the edible white flesh lining the inside of a coconut, also called the \"kernel.\" Coconut meat can be used to create coconut oil, coconut cream, coconut milk, and dried coconut. Of course, you can eat it fresh, too.",
            "Coconut milk is an opaque, milky- white liquid extracted from the grated pulp of mature coconuts. The opacity and rich taste of coconut milk are due to its high oil content, most of which is saturated fat. Coconut milk is a traditional food ingredient used in Southeast Asia, Oceania, South Asia, and East Africa.",
            "Glutinous rice flour is milled flour made by grinding cooked and dehydrated kernels of long or short-grain glutinous rice (Oryza sativa glutinosa). Glutinous rice, also known as sticky rice or sweet rice, refers to any type of rice high in amylopectin starch and low in amylose starch.",
            "Sugar is the generic name for sweet-tasting, soluble carbohydrates, many of which are used in food. Simple sugars, also called monosaccharides, include glucose, fructose, and galactose.",
            "Oils, which are considered fats, are an integral part of cooking. They appear in everything from salad dressings to marinades, and are especially useful for searing, frying, grilling, or sautéing protein. But fats and oils are not one- size-fits-all."};
    int[] mangatarem_ingredients_picture = {R.drawable.mangatarem_ingredients_1,
            R.drawable.mangatarem_ingredients_2,
            R.drawable.mangatarem_ingredients_3,
            R.drawable.mangatarem_ingredients_4,
            R.drawable.mangatarem_ingredients_5};
    int[] mangatarem_nutrition_picture = {R.drawable.mangatarem_nutrition_1,
            R.drawable.mangatarem_nutrition_2,
            R.drawable.mangatarem_nutrition_3,
            R.drawable.mangatarem_nutrition_4,
            R.drawable.mangatarem_nutrition_5};
    int[] mangatarem_about_product = {R.drawable.mangatarem_about_1,
            R.drawable.mangatarem_about_2,
            R.drawable.mangatarem_about_3,
            R.drawable.mangatarem_about_4,
            R.drawable.mangatarem_about_5,
            R.drawable.mangatarem_about_6,
            R.drawable.mangatarem_about_7};
    int[] mangatarem_process_picture = {R.drawable.mangatarem_step_1,
            R.drawable.mangatarem_step_2,
            R.drawable.mangatarem_step_3,
            R.drawable.mangatarem_step_4,
            R.drawable.mangatarem_step_5,
            R.drawable.mangatarem_step_6,
            R.drawable.mangatarem_step_7};
    String[] mangatarem_process_description = {"Add butter and glutinous rice flour in a bowl and mix it.",
            "Add coconut milk and then mix again. Pour some glutinous rice until it thickens.",
            "When the texture thickens, add the sugar and mix again until it became sticky.",
            "When ingredients are well combined, stir it using a spoon.",
            "Pour the mixed ingredients on the banana leaves and fold it.",
            "After we cover it on banana leaves, it’s now ready to cook in a hot stainless steel.",
            "When the tupig because brown, it’s now ready to serve"};

    String[] infanta_ingredients_title = {"CONDENSED MILK","EGG YOLK","BUTTER", "GLUTINOUS RICE FLOUR"};
    String[] infanta_ingredients_description = {"Condensed milk is cow's milk from which water has been removed. It is most often found with sugar added, in the form of sweetened condensed milk, to the extent that the terms \"condensed milk\" and \"sweetened condensed milk\" are often used interchangeably today.",
            "Egg yolks are the nourishing nucleus of the egg and contain nutrients such as essential fatty acids, vitamins, protein and minerals. Egg yolks are also the rich, flavoursome portion of the egg and are often used in recipes to enhance flavours and bind ingredients.",
            "butter, a yellow-to-white solid emulsion of fat globules, water, and inorganic salts produced by churning the cream from cows' milk. Butter has long been used as a spread and as a cooking fat. It is an important edible fat in northern Europe, North America, and other places where cattle are the primary dairy animals",
            "Glutinous rice flour is milled flour made by grinding cooked and dehydrated kernels of long or short-grain glutinous rice (Oryza sativa glutinosa). Glutinous rice, also known as sticky rice or sweet rice, refers to any type of rice high in amylopectin starch and low in amylose starch."};
    int[] infanta_ingredients_picture = {R.drawable.infanta_ingredients_1,
            R.drawable.infanta_ingredients_2,
            R.drawable.infanta_ingredients_3,
            R.drawable.infanta_ingredients_4};
    int[] infanta_nutrition_picture = {R.drawable.infanta_nutrition_1,
            R.drawable.infanta_nutrition_2,
            R.drawable.infanta_nutrition_3,
            R.drawable.infanta_nutrition_4};
    int[] infanta_about_product = {R.drawable.infanta_about_1,
            R.drawable.infanta_about_2,
            R.drawable.infanta_about_3,
            R.drawable.infanta_about_4,
            R.drawable.infanta_about_5,
            R.drawable.infanta_about_6,
            R.drawable.infanta_about_7,
            R.drawable.infanta_about_8,
            R.drawable.infanta_about_9,
            R.drawable.infanta_about_10};
    int[] infanta_process_picture = {R.drawable.infanta_step_1,
            R.drawable.infanta_step_2,
            R.drawable.infanta_step_3,
            R.drawable.infanta_step_4,
            R.drawable.infanta_step_5,
            R.drawable.infanta_step_6,
            R.drawable.infanta_step_7,
            R.drawable.infanta_step_8,
            R.drawable.infanta_step_9,
            R.drawable.infanta_step_10};
    String[] infanta_process_description = {"Put the condensed milk in a pan.",
            "Add the egg yolk into the condensed milk and mix it throughly.",
            "When the texture thickens, add the butter and mix again.",
            "Transfer it to a bowl with butter coated within. Let it cool for about 2 hrs.",
            "Scoop the ingredients and then set aside.",
            "FOR THE RICE CAKE: Add water into the glutinous flour until it became a dough.",
            "FOR THE RICE CAKE: Roll the rice cake into the hand until you make and oblong shape .",
            "FOR THE RICE CAKE: Put the yema inside the the rice cake and roll it again.",
            "FOR THE RICE CAKE: Cook in the boiling water in a medium heat.",
            "FOR THE RICE CAKE: Set aside the cooked rice cake and wrap it with banana leaves. And then it’s now ready to go."};

    String[] calasiao_ingredients_title = {"RICE FLOUR","SUGAR","BAKING POWDER", "MINERAL WATER"};
    String[] calasiao_ingredients_description = {"Rice flour (also rice powder) is a form of flour made from finely milled rice. It is distinct from rice starch, which is usually produced by steeping rice in lye. Rice flour is a common substitute for wheat flour. It is also used as a thickening agent in recipes that are refrigerated or frozen since it inhibits liquid separation.",
            "Sugar is the generic name for sweet-tasting, soluble carbohydrates, many of which are used in food. Simple sugars, also called monosaccharides, include glucose, fructose, and galactose. Compound sugars, also called disaccharides or double sugars, are molecules made of two bonded monosaccharides; common examples are sucrose (glucose + fructose), lactose (glucose + galactose), and maltose (two molecules of glucose). White sugar is a refined form of sucrose. In the body, compound sugars are hydrolyzed into simple sugars.",
            "Baking powder is a dry chemical leavening agent, a mixture of a carbonate or bicarbonate and a weak acid. The base and acid are prevented from reacting prematurely by the inclusion of a buffer such as cornstarch. Baking powder is used to increase the volume and lighten the texture of baked goods.",
            "mineral water, water that contains a large quantity of dissolved minerals or gases. Mineral water from natural springs commonly has a high content of calcium carbonate, magnesium sulfate, potassium, and sodium sulfate. It may also be impregnated with such gases as carbon dioxide or hydrogen sulfide"};
    int[] calasiao_ingredients_picture = {R.drawable.calasiao_ingredients_1,
            R.drawable.calasiao_ingredients_2,
            R.drawable.calasiao_ingredients_3,
            R.drawable.calasiao_ingredients_4};
    int[] calasiao_nutrition_picture = {R.drawable.calasiao_nutrition_1,
            R.drawable.calasiao_nutrition_2,
            R.drawable.calasiao_nutrition_3,
            R.drawable.calasiao_nutrition_4};
    int[] calasiao_about_product = {R.drawable.calasiao_about_1,
            R.drawable.calasiao_about_2,
            R.drawable.calasiao_about_3,
            R.drawable.calasiao_about_4,
            R.drawable.calasiao_about_5,
            R.drawable.calasiao_about_6,
            R.drawable.calasiao_about_7,
            R.drawable.calasiao_about_8,
            R.drawable.calasiao_about_9,
            R.drawable.calasiao_about_10,
            R.drawable.calasiao_about_11,
            R.drawable.calasiao_about_12,
            R.drawable.calasiao_about_13};
    int[] calasiao_process_picture = {R.drawable.calasiao_step_1,
            R.drawable.calasiao_step_2,
            R.drawable.calasiao_step_3,
            R.drawable.calasiao_step_4,
            R.drawable.calasiao_step_5,
            R.drawable.calasiao_step_6,
            R.drawable.calasiao_step_7,
            R.drawable.calasiao_step_8,
            R.drawable.calasiao_step_9,
            R.drawable.calasiao_step_10,
            R.drawable.calasiao_step_11};
    String[] calasiao_process_description = {"You need to add the rice flour",
            "Then next add the sugar",
            "After the sugar add baking powder",
            "After add the baking powder add some water",
            "You to mix it up until it’s soft",
            "After mix Cover and set aside for 1.5 hours",
            "After we set aside Mix to remove the bubbles",
            "Then put some water in the steamer",
            "Avoid molds touching the edge of the pan",
            "THE LAST LET IT COOL DOWN A BIT ",
            "DONE"};

    String[] asingan_ingredients_title = {"GLUTINOUS RICE","CUPS OF WATER","BROWN SUGAR ", "COCONUT MILK", "SALT"};
    String[] asingan_ingredients_description = {"Also known as “sweet rice” or glutinous rice (though it's gluten free), sticky rice is a large white grain that becomes translucent, shiny and extremely sticky when steamed.",
            "water glass, also called sodium silicate or soluble glass, a compound containing sodium oxide (Na2O) and silica (silicon dioxide, SiO2) that forms a glassy solid with the very useful property of being soluble in water.",
            "brown sugar is granulated cane sugar with added molasses. It is coarser and more moist than white sugar and imparts a unique flavor and dark color to food systems. Two main forms of brown sugar are available",
            "Coconut milk is an opaque, milky-white liquid extracted from the grated pulp of mature coconuts.",
            " a colorless or white substance that consists of sodium and chlorine and is used in seasoning and preserving food and in industry."};
    int[] asingan_ingredients_picture = {R.drawable.asingan_ingredients_1,
            R.drawable.asingan_ingredients_2,
            R.drawable.asingan_ingredients_3,
            R.drawable.asingan_ingredients_4,
            R.drawable.asingan_ingredients_5};
    int[] asingan_nutrition_picture = {R.drawable.asingan_nutrition_1,
            R.drawable.asingan_nutrition_2,
            R.drawable.asingan_nutrition_3,
            R.drawable.asingan_nutrition_4,
            R.drawable.asingan_nutrition_5};
    int[] asingan_about_product = {R.drawable.asingan_about_1,
            R.drawable.asingan_about_2,
            R.drawable.asingan_about_3,
            R.drawable.asingan_about_4,
            R.drawable.asingan_about_5};
    int[] asingan_process_picture = {R.drawable.asingan_step_1,
            R.drawable.asingan_step_2,
            R.drawable.asingan_step_3,
            R.drawable.asingan_step_4,
            R.drawable.asingan_step_5};
    String[] asingan_process_description = {"You need to ADD GLUTINOUS RICE IN THE PAN",
            "THEN ADD THE CANNED COCONUT MILK TO THE RICE ",
            "YOU TO ADD THE PANDAN LEAVES",
            "THEN ADD THE COCONUT MILK IN TO THE PAN ",
            "AFTER ADD THE COCONUT MILK ADD  BROWN SUGAR"};


    String[] malasiqui_ingredients_title = {"BEEF MEAT","ONION","SALT", "BLACKPEPPER", "OIL","VINEGAR","FISH SAUCE", "CABBAGE"};
    String[] malasiqui_ingredients_description = {"beef, flesh of mature cattle, as distinguished from veal, the flesh of calves. The best beef is obtained from early maturing, special beef breeds. ",
            "An onion is a round vegetable with a brown skin that grows underground. It has many white layers on its inside which have a strong, sharp smell and taste. ",
            "a colorless or white substance that consists of sodium and chlorine and is used in seasoning and preserving food and in industry.",
            "The outer layer of a dried black peppercorn (known as the “pericarp”) is dark brown/black and wrinkled in appearance. ",
            "Cooking oil is plant, animal, or synthetic liquid fat used in frying, baking, and other types of cooking.",
            "Vinegar is a sour liquid that is made by fermenting substances that contain sugar, such as fruit or wine. ",
            "Fish sauce is a brown liquid with a characteristic meaty flavour and aroma. It is mainly used as a condiment to flavour rice and other cereal dishes.",
            "All forms of cabbage have succulent leaves that are free of hairs and covered with a waxy coating, which often gives the leaf surface a gray-green or blue-green colour. "};
    int[] malasiqui_ingredients_picture = {R.drawable.malasiqui_ingredients_1,
            R.drawable.malasiqui_ingredients_2,
            R.drawable.malasiqui_ingredients_3,
            R.drawable.malasiqui_ingredients_4,
            R.drawable.malasiqui_ingredients_5,
            R.drawable.malasiqui_ingredients_6,
            R.drawable.malasiqui_ingredients_7,
            R.drawable.malasiqui_ingredients_8};
    int[] malasiqui_nutrition_picture = {R.drawable.malasiqui_nutrition_1,
            R.drawable.malasiqui_nutrition_2,
            R.drawable.malasiqui_nutrition_3,
            R.drawable.malasiqui_nutrition_4,
            R.drawable.malasiqui_nutrition_5,
            R.drawable.malasiqui_nutrition_6,
            R.drawable.malasiqui_nutrition_7,
            R.drawable.malasiqui_nutrition_8};
    int[] malasiqui_about_product = {R.drawable.malasiqui_about_1,
            R.drawable.malasiqui_about_2,
            R.drawable.malasiqui_about_3,
            R.drawable.malasiqui_about_4,
            R.drawable.malasiqui_about_5,
            R.drawable.malasiqui_about_6};
    int[] malasiqui_process_picture = {R.drawable.malasiqui_step_1,
            R.drawable.malasiqui_step_2,
            R.drawable.malasiqui_step_3,
            R.drawable.malasiqui_step_4,
            R.drawable.malasiqui_step_5,
            R.drawable.malasiqui_step_6};
    String[] malasiqui_process_description = {"MARINATE BEEF IN SALT PEPPER AND SOY SOUCE FOR AN HOUR.",
            "ON HIGH HEAT, FRY THE BEEF IN OIL WHILE STIRRING IT CONTINOUSLY",
            "IF THE BEEF IS ALREADY COOKED, ROMOVE IT FROM THE PAN AND SET ASIDE.",
            "STIR FRY THE ONIONS FOR 3 MINUTES, REMOVE FROM THE PAN AND SET ASIDE ",
            "LASTLY, STIR FRY THE CABBAGE. ADD THE ONIONS AND BEEF BACK AND STIR IT FOR ANOTHER MINUTE THEN ITS DONE.",
            "DONE"};


    String[] aguilar_ingredients_title = {"PORK MEAT","MINCED GARLIC","COOKING OIL", "BLACKPEPPER", "SOY SAUCE","GARLIC FRIED RICE"};
    String[] aguilar_ingredients_description = {"pork, flesh of hogs, usually slaughtered between the ages of six months and one year",
            "Minced garlic is finer, around the size of small grains of couscous, or less than 1/16-inches. ",
            "Cooking oil is plant, animal, or synthetic liquid fat used in frying, baking, and other types of cooking.",
            "Black pepper is one of the most commonly used spices worldwide. It's made by grinding peppercorns, which are dried berries from the vine Piper nigrum.",
            "a brown, salty liquid that is made by subjecting soybeans and roasted grain (such as wheat) to long fermentation in brine and is used especially in Asian cooking and as a condiment At its most basic, soy sauce is a fermented liquid made from soybeans and wheat.",
            "Garlic Fried Rice or Sinangag is steamed rice fried with lots of garlic. This is a favorite side in the Philippines and most of Asia since rice is considered as the staple food."};
    int[] aguilar_ingredients_picture = {R.drawable.aguilar_ingredients_1,
            R.drawable.aguilar_ingredients_2,
            R.drawable.aguilar_ingredients_3,
            R.drawable.aguilar_ingredients_4,
            R.drawable.aguilar_ingredients_5,
            R.drawable.aguilar_ingredients_6};
    int[] aguilar_nutrition_picture = {R.drawable.aguilar_nutrition_1,
            R.drawable.aguilar_nutrition_2,
            R.drawable.aguilar_nutrition_3,
            R.drawable.aguilar_nutrition_4,
            R.drawable.aguilar_nutrition_5,
            R.drawable.aguilar_nutrition_6};
    int[] aguilar_about_product = {R.drawable.aguilar_about_1,
            R.drawable.aguilar_about_2,
            R.drawable.aguilar_about_3,
            R.drawable.aguilar_about_4,
            R.drawable.aguilar_about_5,
            R.drawable.aguilar_about_6};
    int[] aguilar_process_picture = {R.drawable.aguilar_step_1,
            R.drawable.aguilar_step_2,
            R.drawable.aguilar_step_3,
            R.drawable.aguilar_step_4,
            R.drawable.aguilar_step_5,
            R.drawable.aguilar_step_6};
    String[] aguilar_process_description = {"2 CUPS LEFTOVER ADOBO MEAT",
            "Then you need to gently pull the meat apart ",
            "After that you need to add the oil in the pan",
            "ADD ADOBO FLAKES ON THE PAN",
            "ADD THE LEFTOVER ADOBO SAUCE",
            "FRY THE  ADOBO FLAKES UNTIL CRISPY"};

    String[] tayug_ingredients_title = {"SESAME SEED","GLUTINOUS RICE","MINERAL WATER", "COCONUT STRIP", "COCONUT MILK","BROWN SUGAR","PANDAN LEAVES"};
    String[] tayug_ingredients_description = {"Sesame seeds are tiny, oil-rich seeds that grow in pods on the Sesamum indicum plant. Unhulled seeds have the outer, edible husk intact, while hulled seeds come without the husk.",
            "Also known as “sweet rice” or glutinous rice (though it's gluten free), sticky rice is a large white grain that becomes translucent, shiny and extremely sticky when steamed. ",
            "mineral water, water that contains a large quantity of dissolved minerals or gases. Mineral water from natural springs commonly has a high content of calcium carbonate, magnesium sulfate, potassium, and sodium sulfate. It may also be impregnated with such gases as carbon dioxide or hydrogen sulfide",
            "These dried coconut strips are delicious and a customer favorite. Trader Joe's lightly sweetened coconut strips, a wonderful, healthy snack.",
            "Coconut milk is an opaque, milky-white liquid extracted from the grated pulp of mature coconuts.",
            "Brown sugar is granulated cane sugar with added molasses. It is coarser and more moist than white sugar and imparts a unique flavor and dark color to food systems.",
            "Pandan is a herbaceous tropical plant that grows abundantly in Southeast Asia. In Chinese, it is known as \"fragrant plant\" because of its unique, sweet aroma. "};
    int[] tayug_ingredients_picture = {R.drawable.tayug_ingredients_1,
            R.drawable.tayug_ingredients_2,
            R.drawable.tayug_ingredients_3,
            R.drawable.tayug_ingredients_4,
            R.drawable.tayug_ingredients_5,
            R.drawable.tayug_ingredients_6,
            R.drawable.tayug_ingredients_7};
    int[] tayug_nutrition_picture = {R.drawable.tayug_nutrition_1,
            R.drawable.tayug_nutrition_2,
            R.drawable.tayug_nutrition_3,
            R.drawable.tayug_nutrition_4,
            R.drawable.tayug_nutrition_5,
            R.drawable.tayug_nutrition_6,
            R.drawable.tayug_nutrition_7};
    int[] tayug_about_product = {R.drawable.tayug_about_1,
            R.drawable.tayug_about_2,
            R.drawable.tayug_about_3,
            R.drawable.tayug_about_4,
            R.drawable.tayug_about_5,
            R.drawable.tayug_about_6,
            R.drawable.tayug_about_7,
            R.drawable.tayug_about_8,
            R.drawable.tayug_about_9,
            R.drawable.tayug_about_10,
            R.drawable.tayug_about_11,
            R.drawable.tayug_about_12,
            R.drawable.tayug_about_13};
    int[] tayug_process_picture = {R.drawable.tayug_step_1,
            R.drawable.tayug_step_2,
            R.drawable.tayug_step_3,
            R.drawable.tayug_step_4,
            R.drawable.tayug_step_5,
            R.drawable.tayug_step_6,
            R.drawable.tayug_step_7,
            R.drawable.tayug_step_8,
            R.drawable.tayug_step_9,
            R.drawable.tayug_step_10,
            R.drawable.tayug_step_11,
            R.drawable.tayug_step_12,
            R.drawable.tayug_step_13,
            R.drawable.tayug_step_14};
    String[] tayug_process_description = {"Add the sesame seeds in the bowl",
            "After that toast sesame seed until turned into brown ",
            "Grind with food processor then put in clean cup",
            "Add the glutinous rice flour ",
            "Add the gradually and water ",
            "Then you need to from a dough ",
            "YOU NEED TO ROUND THEN MAKE IT A LITTLE ELONGATED AND PUT A FINGERPRINT ON IT",
            "ADD THE COCONUT MILK INTO THE PAN",
            "BRING IT TO A BOIL",
            "ADD THE SUGAR (MUSCOVADO)",
            "ADD RICE DOUGH TO A BOILING COCONUT MILK ",
            "WHEN THE RICE IS FLOATING ITS COOKED ALREADY ",
            "Then ADD GRINTED SESAME SEEDS",
            "IT DONE AND READY TO TRANSFER IN A SERVING DISH."};


    String[] stabarbara_ingredients_title = {"COCONUT MILK "," Granulated Sugar","SALT", "GLUTINOUS RICE", " Banana leaves"};
    String[] stabarbara_ingredients_description = {"Coconut milk is an opaque, milky-white liquid extracted from the grated pulp of mature coconuts. The opacity and rich taste of coconut milk are due to its high oil content, most of which is saturated fat.",
            "a pure sugar that has been crystallized and centrifuged and then sent through a granulator where the crystals are dried, separated, and screened.",
            "a colorless or white substance that consists of sodium and chlorine and is used in seasoning and preserving food and in industry.a compound formed by the combination of an acid and a base or a metal. ",
            "Also known as “sweet rice” or glutinous rice (though it's gluten free), sticky rice is a large white grain that becomes translucent, shiny and extremely sticky when steamed",
            "Banana leaves are large, flexible, and waterproof. They impart an aroma to food that is cooked in or served on them; steaming with banana leaves imparts a subtle sweet flavor and aroma to the dish. "};
    int[] stabarbara_ingredients_picture = {R.drawable.stabarbara_ingredients_1,
            R.drawable.stabarbara_ingredients_2,
            R.drawable.stabarbara_ingredients_3,
            R.drawable.stabarbara_ingredients_4,
            R.drawable.stabarbara_ingredients_5};
    int[] stabarbara_nutrition_picture = {R.drawable.stabarbara_nutrition_1,
            R.drawable.stabarbara_nutrition_2,
            R.drawable.stabarbara_nutrition_3,
            R.drawable.stabarbara_nutrition_4,
            R.drawable.stabarbara_nutrition_5};
    int[] stabarbara_about_product = {R.drawable.stabarbara_about_1,
            R.drawable.stabarbara_about_2,
            R.drawable.stabarbara_about_3,
            R.drawable.stabarbara_about_4,
            R.drawable.stabarbara_about_5,
            R.drawable.stabarbara_about_6,
            R.drawable.stabarbara_about_7,
            R.drawable.stabarbara_about_8,
            R.drawable.stabarbara_about_9,
            R.drawable.stabarbara_about_10,
            R.drawable.stabarbara_about_11,
            R.drawable.stabarbara_about_12};
    int[] stabarbara_process_picture = {R.drawable.stabarbara_step_1,
            R.drawable.stabarbara_step_2,
            R.drawable.stabarbara_step_3,
            R.drawable.stabarbara_step_4,
            R.drawable.stabarbara_step_5,
            R.drawable.stabarbara_step_6,
            R.drawable.stabarbara_step_7};
    String[] stabarbara_process_description = {"ADD SOME GLUTINOUS RICE IN A MEASURED CUP",
            "ADD THE COCONUT MILK IN A MEASURED CUP",
            "THEN AFTER WE ADD A COCONUT MILK IN A COOKING PAN",
            "AFTER WE BOIL THE COCONUT MILK ADD SOME SUGAR",
            "AFTER WE ADD THE SUGAR ADD SOME SALT",
            "NEXT IS YOU NEED TO CLEAN A GLUTONOUS RICE",
            "THEN AFTER WE CLEAN THE GLUTINOUS RICE PUT IN TO A BOILED COCONUT MILK",
            "MIX THE COCONUT MILK IN MEDIUM HEAT UNTIL IT THICK",
            "LET IT SIMMER",
            "AFTER WE SIMMER TRANSFER TO A CLEAN BOWL AND LET IT COOLDOWN",
            "THEN ARRANGE GLUTINOUS RICE IN CLEANED AND WAARMED BANANA LEAVES",
            "ROLL IT IN BANANALEAVES BOTH SIDE"};


    String[] binalonan_ingredients_title = {"Banana peels","Cooking oil ","Turmeric", "water", "Granulated sugar "};
    String[] binalonan_ingredients_description = {"Banana peels are totally edible, if prepared correctly. Bananas are known for their high potassium content, with each medium fruit containing a whopping 422 milligrams. The peel contains an additional 78 milligrams of potassium, plus plenty of filling fiber",
            "Cooking oil is plant, animal, or synthetic liquid fat used in frying, baking, and other types of cooking. It is also used in food preparation and flavoring not involving heat, such as salad dressings and bread dips, and may be called edible oil.",
            "Turmeric — and especially its most active compound, curcumin — have many scientifically proven health benefits, such as the potential to improve heart health and prevent against Alzheimer's and cancer. It's a potent anti-inflammatory and antioxidant. It may also help improve symptoms of depression and arthritis.",
            "water, a substance composed of the chemical elements hydrogen and oxygen and existing in gaseous, liquid, and solid states. It is one of the most plentiful and essential of compounds. A tasteless and odourless liquid at room temperature, it has the important ability to dissolve many other substances.",
            "Granulated sugar is also sometimes known as white sugar, or “regular” sugar. Granulated sugar has had all of the naturally present molasses refined out of it. It is the sugar that is most commonly used in baking."};
    int[] binalonan_ingredients_picture = {R.drawable.binalonan_ingredients_1,
            R.drawable.binalonan_ingredients_2,
            R.drawable.binalonan_ingredients_3,
            R.drawable.binalonan_ingredients_4,
            R.drawable.binalonan_ingredients_5};
    int[] binalonan_nutrition_picture = {R.drawable.binalonan_nutrition_1,
            R.drawable.binalonan_nutrition_2,
            R.drawable.binalonan_nutrition_3,
            R.drawable.binalonan_nutrition_4,
            R.drawable.binalonan_nutrition_5};
    int[] binalonan_about_product = {R.drawable.binalonan_about_1,
            R.drawable.binalonan_about_2,
            R.drawable.binalonan_about_3,
            R.drawable.binalonan_about_4,
            R.drawable.binalonan_about_5,
            R.drawable.binalonan_about_6,
            R.drawable.binalonan_about_7,
            R.drawable.binalonan_about_8,
            R.drawable.binalonan_about_9,
            R.drawable.binalonan_about_10,
            R.drawable.binalonan_about_11,
            R.drawable.binalonan_about_12,
            R.drawable.binalonan_about_13};
    int[] binalonan_process_picture = {R.drawable.binalonan_step_1,
            R.drawable.binalonan_step_2,
            R.drawable.binalonan_step_3,
            R.drawable.binalonan_step_4,
            R.drawable.binalonan_step_5,
            R.drawable.binalonan_step_6,
            R.drawable.binalonan_step_7,
            R.drawable.binalonan_step_8,
            R.drawable.binalonan_step_9};
    String[] binalonan_process_description = {"wash well and peel the banana",
            "cut the banana into small pieces",
            "Pour cooking oil in a wide pot and heat",
            "Deep fry the banana until almost crisp. When the bananas are almost done, scoop a teaspoon of the turmeric mixture and gently add to the oil. Note: Be very careful. This is an optional step. Doing this can add a yellowish color to the banana slices and make it more crisp.",
            "Once the oil stops bubbling, remove the bananas and drain excess oil. Set aside.",
            "Meanwhile, lets make the simple syrup. Heat a saucepan and pour in 1/2 cup of water and 1/2 cup sugar.",
            "Pour the syrup into the fried banana",
            "Fry the banana again on medium heat and wait for 3mins and drain the oil",
            "place the banana chips in a container, or serve right away."};


    String[] alcala_ingredients_title = {"Coconut","Brown Sugar ","Salt", "Pandan Leaves"};
    String[] alcala_ingredients_description = {"A coconut is the edible fruit of the coconut palm (Cocos nucifera), a tree of the palm family. Coconut flesh is high in fat and can be dried or eaten fresh or processed into coconut milk or coconut oil.",
            "Brown sugar is a sucrose sugar product with a distinctive brown color due to the presence of molasses. It is either an unrefined or partially refined soft sugar consisting of sugar crystals with some residual molasses content, or it is produced by the addition of molasses to refined white sugar",
            "Salt is a mineral composed primarily of sodium chloride, a chemical compound belonging to the larger class of salts; salt in the form of a natural crystalline mineral is known as rock salt or halite. Salt is present in vast quantities in seawater",
            "Pandanus amaryllifolius is a tropical plant in the Pandanus genus, which is commonly known as pandan. It has fragrant leaves which are used widely for flavouring in the cuisines of Southeast Asia and South Asia."};
    int[] alcala_ingredients_picture = {R.drawable.alcala_ingredients_1,
            R.drawable.alcala_ingredients_2,
            R.drawable.alcala_ingredients_3,
            R.drawable.alcala_ingredients_4};
    int[] alcala_nutrition_picture = {R.drawable.alcala_nutrition_1,
            R.drawable.alcala_nutrition_2,
            R.drawable.alcala_nutrition_3,
            R.drawable.alcala_nutrition_4};
    int[] alcala_about_product = {R.drawable.alcala_about_1,
            R.drawable.alcala_about_2,
            R.drawable.alcala_about_3,
            R.drawable.alcala_about_4,
            R.drawable.alcala_about_5,
            R.drawable.alcala_about_6,
            R.drawable.alcala_about_7,
            R.drawable.alcala_about_8};
    int[] alcala_process_picture = {R.drawable.alcala_step_1,
            R.drawable.alcala_step_2,
            R.drawable.alcala_step_3,
            R.drawable.alcala_step_4,
            R.drawable.alcala_step_5,
            R.drawable.alcala_step_6,
            R.drawable.alcala_step_7,
            R.drawable.alcala_step_8,
            R.drawable.alcala_step_9,
            R.drawable.alcala_step_10,
            R.drawable.alcala_step_11};
    String[] alcala_process_description = {"you need put 2 cups of fresh grated buko into pan",
            "you add the ¼ kilo of brown sugar and mix it ( don’t put any water )",
            "cook in low heat and mix it",
            "after you mix the sugar and the grated coconut add pinch of salt",
            "mix it and wait until the sugar to dissolve",
            "after the sugar will dissolve add another brown sugar to become sweeter",
            "continous stirring until the sugar become thick",
            "after the sugar become thick you add the pandan leaves for additional flavor. ",
            "step wait until the sugar will be caramelized",
            "mold it into your desire size ",
            "Last step put it on the fridge and wait until it cool and its all done !"};

    
    

    /*String[] mangaldan_ingredients_title = {"","","", "", "","","", ""};
    String[] mangaldan_ingredients_description = {"",
            "",
            "",
            "",
            "",
            "",
            "",
            ""};
    int[] mangaldan_ingredients_picture = {R.drawable.mangaldan_ingredients_1,
            R.drawable.mangaldan_ingredients_2,
            R.drawable.mangaldan_ingredients_3,
            R.drawable.mangaldan_ingredients_4,
            R.drawable.mangaldan_ingredients_5,
            R.drawable.mangaldan_ingredients_6,
            R.drawable.mangaldan_ingredients_7,
            R.drawable.mangaldan_ingredients_8};
    int[] mangaldan_nutrition_picture = {R.drawable.mangaldan_nutrition_1,
            R.drawable.mangaldan_nutrition_2,
            R.drawable.mangaldan_nutrition_3,
            R.drawable.mangaldan_nutrition_4,
            R.drawable.mangaldan_nutrition_5,
            R.drawable.mangaldan_nutrition_6,
            R.drawable.mangaldan_nutrition_7,
            R.drawable.mangaldan_nutrition_8};
    int[] mangaldan_about_product = {R.drawable.mangaldan_about_1,
            R.drawable.mangaldan_about_2,
            R.drawable.mangaldan_about_3,
            R.drawable.mangaldan_about_4,
            R.drawable.mangaldan_about_5,
            R.drawable.mangaldan_about_6};
    int[] mangaldan_process_picture = {R.drawable.mangaldan_step_1,
            R.drawable.mangaldan_step_2,
            R.drawable.mangaldan_step_3,
            R.drawable.mangaldan_step_4,
            R.drawable.mangaldan_step_5,
            R.drawable.mangaldan_step_6};
    String[] mangaldan_process_description = {"",
            "",
            "",
            "",
            "",
            ""};*/


    public CitiesAdapter(Context context, List<String> citiesList) {
        this.context = context;
        this.citiesList = citiesList;

    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cities_list_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        String city_name = citiesList.get(position);
        holder.txt_city.setText(city_name);


        switch (city_name) {
            case "Dagupan":
                Glide.with(context)
                        .load(R.drawable.dagupan_food)
                        .into(holder.img_city);

                break;

            case "Mangaldan":
                Glide.with(context)
                        .load(R.drawable.mangaldan_food)
                        .into(holder.img_city);

                break;
            case "Alaminos":
                Glide.with(context)
                        .load(R.drawable.alaminos_food)
                        .into(holder.img_city);

                break;
            case "Bolinao":
                Glide.with(context)
                        .load(R.drawable.bolinao_food)
                        .into(holder.img_city);

                break;
            case "Villasis":
                Glide.with(context)
                        .load(R.drawable.villasis_food)
                        .into(holder.img_city);

                break;
            case "Bayambang":
                Glide.with(context)
                        .load(R.drawable.bayambang_food)
                        .into(holder.img_city);

                break;
            case "San Jacinto":
                Glide.with(context)
                        .load(R.drawable.sanjacinto_food)
                        .into(holder.img_city);

                break;
            case "San Nicolas":
                Glide.with(context)
                        .load(R.drawable.sannicolas_food)
                        .into(holder.img_city);

                break;
            case "San Fabian":
                Glide.with(context)
                        .load(R.drawable.sanfabian_food)
                        .into(holder.img_city);

                break;
            case "Pozorrubio":
                Glide.with(context)
                        .load(R.drawable.pozorrubio_food)
                        .into(holder.img_city);

                break;
            case "Mangatarem":
                Glide.with(context)
                        .load(R.drawable.mangatarem_food)
                        .into(holder.img_city);

                break;
            case "Infanta":
                Glide.with(context)
                        .load(R.drawable.infanta_food)
                        .into(holder.img_city);

                break;
            case "Calasiao":
                Glide.with(context)
                        .load(R.drawable.calasiao_food)
                        .into(holder.img_city);

                break;
            case "Asingan":
                Glide.with(context)
                        .load(R.drawable.asingan_food)
                        .into(holder.img_city);

                break;
            case "Malasiqui":
                Glide.with(context)
                        .load(R.drawable.malasiqui_food)
                        .into(holder.img_city);

                break;
            case "Aguilar":
                Glide.with(context)
                        .load(R.drawable.aguilar_food)
                        .into(holder.img_city);

                break;
            case "Tayug":
                Glide.with(context)
                        .load(R.drawable.tayug_food)
                        .into(holder.img_city);

                break;
            case "Sta Barbara":
                Glide.with(context)
                        .load(R.drawable.stabarbara_food)
                        .into(holder.img_city);

                break;
            case "Binalonan":
                Glide.with(context)
                        .load(R.drawable.binalonan_food)
                        .into(holder.img_city);

                break;
            case "Alcala":
                Glide.with(context)
                        .load(R.drawable.alcala_food)
                        .into(holder.img_city);

                break;
        }


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle =new Bundle();

                if(city_name.equals("Dagupan")) {

                    bundle.putStringArray("ingredients_title", dagupan_ingredients_title);
                    bundle.putStringArray("ingredients_description", dagupan_ingredients_description);
                    bundle.putIntArray("ingredients_picture",dagupan_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",dagupan_nutrition_picture);

                    bundle.putIntArray("about_product",dagupan_about_product);
                    bundle.putIntArray("process_picture",dagupan_process_picture);
                    bundle.putStringArray("process_description",dagupan_process_description);

                }else if(city_name.equals("Mangaldan")) {

                    bundle.putStringArray("ingredients_title", mangaldan_ingredients_title);
                    bundle.putStringArray("ingredients_description", mangaldan_ingredients_description);
                    bundle.putIntArray("ingredients_picture",mangaldan_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",mangaldan_nutrition_picture);

                    bundle.putIntArray("about_product",mangaldan_about_product);
                    bundle.putIntArray("process_picture",mangaldan_process_picture);
                    bundle.putStringArray("process_description",mangaldan_process_description);

                }else if(city_name.equals("Alaminos")) {

                    bundle.putStringArray("ingredients_title", alaminos_ingredients_title);
                    bundle.putStringArray("ingredients_description", alaminos_ingredients_description);
                    bundle.putIntArray("ingredients_picture",alaminos_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",alaminos_nutrition_picture);

                    bundle.putIntArray("about_product",alaminos_about_product);
                    bundle.putIntArray("process_picture",alaminos_process_picture);
                    bundle.putStringArray("process_description",alaminos_process_description);

                }else if(city_name.equals("Bolinao")) {

                    bundle.putStringArray("ingredients_title", bolinao_ingredients_title);
                    bundle.putStringArray("ingredients_description", bolinao_ingredients_description);
                    bundle.putIntArray("ingredients_picture",bolinao_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",bolinao_nutrition_picture);

                    bundle.putIntArray("about_product",bolinao_about_product);
                    bundle.putIntArray("process_picture",bolinao_process_picture);
                    bundle.putStringArray("process_description",bolinao_process_description);
                }else if(city_name.equals("Villasis")) {

                    bundle.putStringArray("ingredients_title", villasis_ingredients_title);
                    bundle.putStringArray("ingredients_description", villasis_ingredients_description);
                    bundle.putIntArray("ingredients_picture",villasis_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",villasis_nutrition_picture);

                    bundle.putIntArray("about_product",villasis_about_product);
                    bundle.putIntArray("process_picture",villasis_process_picture);
                    bundle.putStringArray("process_description",villasis_process_description);
                }else if(city_name.equals("Bayambang")) {

                    bundle.putStringArray("ingredients_title", bayambang_ingredients_title);
                    bundle.putStringArray("ingredients_description", bayambang_ingredients_description);
                    bundle.putIntArray("ingredients_picture",bayambang_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",bayambang_nutrition_picture);

                    bundle.putIntArray("about_product",bayambang_about_product);
                    bundle.putIntArray("process_picture",bayambang_process_picture);
                    bundle.putStringArray("process_description",bayambang_process_description);
                }else if(city_name.equals("San Jacinto")) {

                    bundle.putStringArray("ingredients_title", sanjacinto_ingredients_title);
                    bundle.putStringArray("ingredients_description", sanjacinto_ingredients_description);
                    bundle.putIntArray("ingredients_picture",sanjacinto_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",sanjacinto_nutrition_picture);

                    bundle.putIntArray("about_product",sanjacinto_about_product);
                    bundle.putIntArray("process_picture",sanjacinto_process_picture);
                    bundle.putStringArray("process_description",sanjacinto_process_description);
                }else if(city_name.equals("San Nicolas")) {

                    bundle.putStringArray("ingredients_title", sannicolas_ingredients_title);
                    bundle.putStringArray("ingredients_description", sannicolas_ingredients_description);
                    bundle.putIntArray("ingredients_picture",sannicolas_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",sannicolas_nutrition_picture);

                    bundle.putIntArray("about_product",sannicolas_about_product);
                    bundle.putIntArray("process_picture",sannicolas_process_picture);
                    bundle.putStringArray("process_description",sannicolas_process_description);
                }else if(city_name.equals("San Fabian")) {

                    bundle.putStringArray("ingredients_title", sanfabian_ingredients_title);
                    bundle.putStringArray("ingredients_description", sanfabian_ingredients_description);
                    bundle.putIntArray("ingredients_picture",sanfabian_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",sanfabian_nutrition_picture);

                    bundle.putIntArray("about_product",sanfabian_about_product);
                    bundle.putIntArray("process_picture",sanfabian_process_picture);
                    bundle.putStringArray("process_description",sanfabian_process_description);
                }
                else if(city_name.equals("Pozorrubio")) {

                    bundle.putStringArray("ingredients_title", pozorrubio_ingredients_title);
                    bundle.putStringArray("ingredients_description", pozorrubio_ingredients_description);
                    bundle.putIntArray("ingredients_picture",pozorrubio_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",pozorrubio_nutrition_picture);

                    bundle.putIntArray("about_product",pozorrubio_about_product);
                    bundle.putIntArray("process_picture",pozorrubio_process_picture);
                    bundle.putStringArray("process_description",pozorrubio_process_description);
                }else if(city_name.equals("Mangatarem")) {

                    bundle.putStringArray("ingredients_title", mangatarem_ingredients_title);
                    bundle.putStringArray("ingredients_description", mangatarem_ingredients_description);
                    bundle.putIntArray("ingredients_picture",mangatarem_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",mangatarem_nutrition_picture);

                    bundle.putIntArray("about_product",mangatarem_about_product);
                    bundle.putIntArray("process_picture",mangatarem_process_picture);
                    bundle.putStringArray("process_description",mangatarem_process_description);
                }else if(city_name.equals("Infanta")) {

                    bundle.putStringArray("ingredients_title", infanta_ingredients_title);
                    bundle.putStringArray("ingredients_description", infanta_ingredients_description);
                    bundle.putIntArray("ingredients_picture",infanta_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",infanta_nutrition_picture);

                    bundle.putIntArray("about_product",infanta_about_product);
                    bundle.putIntArray("process_picture",infanta_process_picture);
                    bundle.putStringArray("process_description",infanta_process_description);
                }else if(city_name.equals("Calasiao")) {

                    bundle.putStringArray("ingredients_title", calasiao_ingredients_title);
                    bundle.putStringArray("ingredients_description", calasiao_ingredients_description);
                    bundle.putIntArray("ingredients_picture",calasiao_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",calasiao_nutrition_picture);

                    bundle.putIntArray("about_product",calasiao_about_product);
                    bundle.putIntArray("process_picture",calasiao_process_picture);
                    bundle.putStringArray("process_description",calasiao_process_description);
                }else if(city_name.equals("Asingan")) {

                    bundle.putStringArray("ingredients_title", asingan_ingredients_title);
                    bundle.putStringArray("ingredients_description", asingan_ingredients_description);
                    bundle.putIntArray("ingredients_picture",asingan_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",asingan_nutrition_picture);

                    bundle.putIntArray("about_product",asingan_about_product);
                    bundle.putIntArray("process_picture",asingan_process_picture);
                    bundle.putStringArray("process_description",asingan_process_description);
                }else if(city_name.equals("Malasiqui")) {

                    bundle.putStringArray("ingredients_title", malasiqui_ingredients_title);
                    bundle.putStringArray("ingredients_description", malasiqui_ingredients_description);
                    bundle.putIntArray("ingredients_picture",malasiqui_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",malasiqui_nutrition_picture);

                    bundle.putIntArray("about_product",malasiqui_about_product);
                    bundle.putIntArray("process_picture",malasiqui_process_picture);
                    bundle.putStringArray("process_description",malasiqui_process_description);
                }else if(city_name.equals("Aguilar")) {

                    bundle.putStringArray("ingredients_title", aguilar_ingredients_title);
                    bundle.putStringArray("ingredients_description", aguilar_ingredients_description);
                    bundle.putIntArray("ingredients_picture",aguilar_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",aguilar_nutrition_picture);

                    bundle.putIntArray("about_product",aguilar_about_product);
                    bundle.putIntArray("process_picture",aguilar_process_picture);
                    bundle.putStringArray("process_description",aguilar_process_description);
                }else if(city_name.equals("Tayug")) {

                    bundle.putStringArray("ingredients_title", tayug_ingredients_title);
                    bundle.putStringArray("ingredients_description", tayug_ingredients_description);
                    bundle.putIntArray("ingredients_picture",tayug_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",tayug_nutrition_picture);

                    bundle.putIntArray("about_product",tayug_about_product);
                    bundle.putIntArray("process_picture",tayug_process_picture);
                    bundle.putStringArray("process_description",tayug_process_description);
                }else if(city_name.equals("Sta Barbara")) {

                    bundle.putStringArray("ingredients_title", stabarbara_ingredients_title);
                    bundle.putStringArray("ingredients_description", stabarbara_ingredients_description);
                    bundle.putIntArray("ingredients_picture",stabarbara_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",stabarbara_nutrition_picture);

                    bundle.putIntArray("about_product",stabarbara_about_product);
                    bundle.putIntArray("process_picture",stabarbara_process_picture);
                    bundle.putStringArray("process_description",stabarbara_process_description);
                }else if(city_name.equals("Binalonan")) {

                    bundle.putStringArray("ingredients_title", binalonan_ingredients_title);
                    bundle.putStringArray("ingredients_description", binalonan_ingredients_description);
                    bundle.putIntArray("ingredients_picture",binalonan_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",binalonan_nutrition_picture);

                    bundle.putIntArray("about_product",binalonan_about_product);
                    bundle.putIntArray("process_picture",binalonan_process_picture);
                    bundle.putStringArray("process_description",binalonan_process_description);
                }else if(city_name.equals("Alcala")) {

                    bundle.putStringArray("ingredients_title", alcala_ingredients_title);
                    bundle.putStringArray("ingredients_description", alcala_ingredients_description);
                    bundle.putIntArray("ingredients_picture",alcala_ingredients_picture);
                    bundle.putIntArray("nutrition_picture",alcala_nutrition_picture);

                    bundle.putIntArray("about_product",alcala_about_product);
                    bundle.putIntArray("process_picture",alcala_process_picture);
                    bundle.putStringArray("process_description",alcala_process_description);
                }


                Intent i = new Intent(context, CityMain.class);
                i.putExtras(bundle);
                i.putExtra("city_name",city_name);
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
        return citiesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_city;
        CardView cardView;
        ImageView img_city;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_city = itemView.findViewById(R.id.txt_city);
            cardView = itemView.findViewById(R.id.cardView);
            img_city = itemView.findViewById(R.id.img_city);

        }
    }
}
