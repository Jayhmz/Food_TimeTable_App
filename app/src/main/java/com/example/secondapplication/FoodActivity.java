package com.example.secondapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    FoodLists foodLists = new FoodLists();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Bundle getfood = getIntent().getExtras();

        if (getfood == null) {
            return;
        }
        String content = getfood.getString("foodtoeat");

        final TextView showfoodday = findViewById(R.id.dayId);
        showfoodday.setText(content);

        final TextView showbreakfast = findViewById(R.id.breakfastid);
        showbreakfast.setText(foodLists.Foodlist(content).get(0));

        final TextView showlunch = findViewById(R.id.lunchid);
        showlunch.setText(foodLists.Foodlist(content).get(1));

        final TextView showdinner = findViewById(R.id.dinnerid);
        showdinner.setText(foodLists.Foodlist(content).get(2));

    }





}
