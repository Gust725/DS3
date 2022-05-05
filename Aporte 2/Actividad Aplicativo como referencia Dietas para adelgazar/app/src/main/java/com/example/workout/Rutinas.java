package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Rutinas extends AppCompatActivity {
    ImageView img1,img2, img3, img4, img5;
    TextView tit1, tit2, tit3, tit4, tit5, tie1,tie2,tie3,tie4,tie5, rep1,rep2,rep3,rep4,rep5, des1, des2, des3, des4, des5;
    String nombreActividad,imagen1, imagen2, imagen3, imagen4, imagen5;
    Animation topAnim, bottonAnim, right,cambio;
    String url = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas);
        recibirDatos();
        nombreActividad = getIntent().getExtras().getString("actividad");
        //animacion
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        right = AnimationUtils.loadAnimation(this,R.anim.move_right);
        cambio = AnimationUtils.loadAnimation(this,R.anim.cambio_activity);
        img1 = (ImageView) findViewById(R.id.imagenejercicio1);
        img2 = (ImageView) findViewById(R.id.imagenejercicio2);
        img3 = (ImageView) findViewById(R.id.imagenejercicio3);
        img4 = (ImageView) findViewById(R.id.imagenejercicio4);
        img5 = (ImageView) findViewById(R.id.imagenejercicio5);

        img1.setAnimation(cambio);
        img2.setAnimation(cambio);
        img3.setAnimation(cambio);
        img4.setAnimation(cambio);
        img5.setAnimation(cambio);

        tit1 = (TextView) findViewById(R.id.nroejercicio1);
        tit2 = (TextView) findViewById(R.id.nroejercicio2);
        tit3 = (TextView) findViewById(R.id.nroejercicio3);
        tit4 = (TextView) findViewById(R.id.nroejercicio4);
        tit5 = (TextView) findViewById(R.id.nroejercicio5);

        tit1.setAnimation(right);
        tit2.setAnimation(right);
        tit3.setAnimation(right);
        tit4.setAnimation(right);
        tit5.setAnimation(right);

        tie1 = (TextView) findViewById(R.id.nrorepejercicio1);
        tie2 = (TextView) findViewById(R.id.nrorepejercicio2);
        tie3 = (TextView) findViewById(R.id.nrorepejercicio3);
        tie4 = (TextView) findViewById(R.id.nrorepejercicio4);
        tie5 = (TextView) findViewById(R.id.nrorepejercicio5);

        rep1 = (TextView) findViewById(R.id.tiemporepejercicio1);
        rep2 = (TextView) findViewById(R.id.tiemporepejercicio2);
        rep3 = (TextView) findViewById(R.id.tiemporepejercicio3);
        rep4 = (TextView) findViewById(R.id.tiemporepejercicio4);
        rep5 = (TextView) findViewById(R.id.tiemporepejercicio5);

        des1 = (TextView) findViewById(R.id.tiempodesejercicio1);
        des2 = (TextView) findViewById(R.id.tiempodesejercicio2);
        des3 = (TextView) findViewById(R.id.tiempodesejercicio3);
        des4 = (TextView) findViewById(R.id.tiempodesejercicio4);
        des5 = (TextView) findViewById(R.id.tiempodesejercicio5);
        Rutina(nombreActividad);


    }
    public void recibirDatos(){
        Bundle extras =getIntent().getExtras();
        nombreActividad = extras.getString("actividad");
    }
    public  void Rutina(String nombre)
    {
        switch (nombre) {
            case "abdomen":
            {

                tit1.setText("Perro pájaro");
                tit2.setText("Pelota de estabilidad");
                tit3.setText("El puente de una pierna");
                tit4.setText("Perro pájaro");
                tit5.setText("Dale vuelta al cazo");
                Glide.with(getApplicationContext()).load(R.drawable.abd1).into(img1);
                Glide.with(getApplicationContext()).load(R.drawable.abd2).into(img2);
                Glide.with(getApplicationContext()).load(R.drawable.abd3).into(img3);
                Glide.with(getApplicationContext()).load(R.drawable.abd4).into(img4);
                Glide.with(getApplicationContext()).load(R.drawable.abd5).into(img5);


                tie1.setText("Nro. De series: 4 ");
                tie2.setText("Nro. De series: 4 ");
                tie3.setText("Nro. De series: 4 ");
                tie4.setText("Nro. De series: 4 ");
                tie5.setText("Nro. De series: 4 ");

                rep1.setText("Nro. De repeticiones: 10 por lado");
                rep2.setText("Nro. De repeticiones: 10 por lado");
                rep3.setText("Nro. De repeticiones: 10 por lado");
                rep4.setText("Nro. De repeticiones: 10 por lado");
                rep5.setText("Nro. De repeticiones: 10 por lado");

                des1.setText("Tiempo de descanso: 15 seg");
                des2.setText("Tiempo de descanso: 15 seg");
                des3.setText("Tiempo de descanso: 15 seg");
                des4.setText("Tiempo de descanso: 15 seg");
                des5.setText("Tiempo de descanso: 15 seg");
                EnviarImagen("abd1",img1);
                EnviarImagen("abd2",img2);
                EnviarImagen("abd3",img3);
                EnviarImagen("abd4",img4);
                EnviarImagen("abd5",img5);

            }
            break;
            case "piernas":
            {

                tit1.setText("Sentadillas aéreas");
                tit2.setText("Sentadillas con salto");
                tit3.setText("Sentadilla a una piernas con o sin mancuernas");
                tit4.setText("Subidas de escalera a cajón");
                tit5.setText("Puente a una pierna");
                Glide.with(getApplicationContext()).load(R.drawable.pi1).into(img1);
                Glide.with(getApplicationContext()).load(R.drawable.pi2).into(img2);
                Glide.with(getApplicationContext()).load(R.drawable.pi3).into(img3);
                Glide.with(getApplicationContext()).load(R.drawable.pi4).into(img4);
                Glide.with(getApplicationContext()).load(R.drawable.pi5).into(img5);
                tie1.setText("Nro. De series: 4 ");
                tie2.setText("Nro. De series: 4");
                tie3.setText("Nro. De series: 4");
                tie4.setText("Nro. De series: 4");
                tie5.setText("Nro. De series: 4");

                rep1.setText("Nro. De repeticiones: 12");
                rep2.setText("Nro. De repeticiones: 12");
                rep3.setText("Nro. De repeticiones: 12");
                rep4.setText("Nro. De repeticiones: 12");
                rep5.setText("Nro. De repeticiones: 12");

                des1.setText("Tiempo de descanso: Sin descanso");
                des2.setText("Tiempo de descanso: 30 seg");
                des3.setText("Tiempo de descanso: 30 seg");
                des4.setText("Tiempo de descanso: Sin Descanso");
                des5.setText("Tiempo de descanso: 30 seg");

                EnviarImagen("pi1",img1);
                EnviarImagen("pi2",img2);
                EnviarImagen("pi3",img3);
                EnviarImagen("pi4",img4);
                EnviarImagen("pi5",img5);
            }
            break;
            case "pecho":
            {
                tit1.setText("Flexiones");
                tit2.setText("Flexiones adaptadas");
                tit3.setText("Flexiones de pared");
                tit4.setText("Press banca plano");
                tit5.setText("Press banca inclinado");
                Glide.with(getApplicationContext()).load(R.drawable.pec1).into(img1);
                Glide.with(getApplicationContext()).load(R.drawable.pec2).into(img2);
                Glide.with(getApplicationContext()).load(R.drawable.pec3).into(img3);
                Glide.with(getApplicationContext()).load(R.drawable.pec4).into(img4);
                Glide.with(getApplicationContext()).load(R.drawable.pec5).into(img5);
                tie1.setText("Nro. De series: 4 ");
                tie2.setText("Nro. De series: 4 ");
                tie3.setText("Nro. De series: 4 ");
                tie4.setText("Nro. De series: 4 ");
                tie5.setText("Nro. De series: 4 ");

                rep1.setText("Nro. De repeticiones: 10 ");
                rep2.setText("Nro. De repeticiones: 10 ");
                rep3.setText("Nro. De repeticiones: 10 ");
                rep4.setText("Nro. De repeticiones: 15");
                rep5.setText("Nro. De repeticiones: 15");

                des1.setText("Tiempo de descanso: 30 seg");
                des2.setText("Tiempo de descanso: 30 seg");
                des3.setText("Tiempo de descanso: 30 seg");
                des4.setText("Tiempo de descanso: 30 seg");
                des5.setText("Tiempo de descanso: 30 seg");
                EnviarImagen("pec1",img1);
                EnviarImagen("pec2",img2);
                EnviarImagen("pec3",img3);
                EnviarImagen("pec4",img4);
                EnviarImagen("pec5",img5);
            }
            break;
            case "brazos":
            {
                tit1.setText("La caminata del oso");
                tit2.setText("Descenso de tríceps");
                tit3.setText("Flexiones estilo perro");
                tit4.setText("Serie de puñetazos");
                tit5.setText("Movimientos circulares con los brazos");
                Glide.with(getApplicationContext()).load(R.drawable.bra1).into(img1);
                Glide.with(getApplicationContext()).load(R.drawable.bra2).into(img2);
                Glide.with(getApplicationContext()).load(R.drawable.bra3).into(img3);
                Glide.with(getApplicationContext()).load(R.drawable.bra4).into(img4);
                Glide.with(getApplicationContext()).load(R.drawable.bra5).into(img5);
                tie1.setText("Nro. De series: 4 ");
                tie2.setText("Nro. De series: 4 ");
                tie3.setText("Nro. De series: 4 ");
                tie4.setText("Nro. De series: 4 ");
                tie5.setText("Nro. De series: 4 ");

                rep1.setText("Nro. De repeticiones: 45-60 seg");
                rep2.setText("Nro. De repeticiones: 45-60 seg");
                rep3.setText("Nro. De repeticiones: 45-60 seg");
                rep4.setText("Nro. De repeticiones: 45-60 seg");
                rep5.setText("Nro. De repeticiones: 45-60 seg");

                des1.setText("Tiempo de descanso: 15 seg");
                des2.setText("Tiempo de descanso: 15 seg");
                des3.setText("Tiempo de descanso: 15 seg");
                des4.setText("Tiempo de descanso: 15 seg");
                des5.setText("Tiempo de descanso: 15 seg");
                EnviarImagen("bra1",img1);
                EnviarImagen("bra2",img2);
                EnviarImagen("bra3",img3);
                EnviarImagen("bra4",img4);
                EnviarImagen("bra5",img5);
            }

        }

    }
    public void EnviarImagen(String enviar, ImageView img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=enviar;
                Intent i = new Intent(Rutinas.this, Visor.class);
                i.putExtra("visor",nombre );
                startActivity(i);
            }
        });

    }



}