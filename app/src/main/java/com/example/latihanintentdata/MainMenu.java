package com.example.latihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.latihanintentdata.R;


public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    ImageView food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        food = (ImageView)findViewById(R.id.img_gofood);
        food.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent food= new Intent(MainMenu.this, OrderFoodMainActivity.class);
        startActivity(food);

    }
}