package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Visor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        Intent intent = getIntent();
        Bundle b= intent.getExtras();
        if(b!=null){
            String nombre = getIntent().getExtras().getString("visor");
            img.setImageResource(b.getInt(nombre));
            Glide.with(getApplicationContext()).load(R.drawable.abd1).into(img);
        }
    }
}