package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Seleccion extends AppCompatActivity {
    ImageView imagen1, imagen2, imagen3, imagen4;
    Animation topAnim, bottonAnim, right,cambio;
    TextView titulo, sub1, sub2, sub3, sub4;
    String nombreActividad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
        //animacion
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        right = AnimationUtils.loadAnimation(this,R.anim.move_right);
        //logica y diseño
        titulo = findViewById(R.id.textView1);
        sub1 = findViewById(R.id.textView2);
        sub2 = findViewById(R.id.textView3);
        sub3 = findViewById(R.id.textView4);
        sub4 = findViewById(R.id.textView5);
        imagen1 = findViewById(R.id.imageBrazos);
        imagen2 = findViewById(R.id.imagePiernas);
        imagen3 = findViewById(R.id.imageAbdomen);
        imagen4 = findViewById(R.id.imagePecho);

        titulo.setAnimation(topAnim);
        sub1.setAnimation(right);
        sub2.setAnimation(right);
        sub3.setAnimation(right);
        sub4.setAnimation(right);
        imagen1.setAnimation(bottonAnim);
        imagen2.setAnimation(bottonAnim);
        imagen3.setAnimation(bottonAnim);
        imagen4.setAnimation(bottonAnim);


        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreActividad="brazos";
                Intent i = new Intent(Seleccion.this, Rutinas.class);
                i.putExtra("actividad",nombreActividad);
                startActivity(i);
            }
        });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreActividad="piernas";
                Intent i = new Intent(Seleccion.this, Rutinas.class);
                i.putExtra("actividad",nombreActividad);
                startActivity(i);
            }
        });
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreActividad="abdomen";
                Intent i = new Intent(Seleccion.this, Rutinas.class);
                i.putExtra("actividad",nombreActividad);
                startActivity(i);
            }
        });
        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreActividad="pecho";
                Intent i = new Intent(Seleccion.this, Rutinas.class);
                i.putExtra("actividad",nombreActividad);
                startActivity(i);
            }
        });


    }
}