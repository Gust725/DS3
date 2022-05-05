package com.example.myapptareareproductormusical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spiner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spiner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.generos, android.R.layout.simple_list_item_1);
        spiner.setAdapter(adapter);
    }

    public void Seleccion(View view) {
        String genero =  (spiner.getSelectedItem().toString());
        Bundle extras = new Bundle();
        extras.putString("Genero",String.valueOf(genero));
        Intent intent = new Intent(MainActivity.this, GenerosActivity.class);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void salir(View view) {
            finish();

    }
}