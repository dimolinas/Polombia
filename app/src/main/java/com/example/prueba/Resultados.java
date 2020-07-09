package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Resultados extends AppCompatActivity {

    int poblacion = 50000;
    int pib = 331;
    float deudaExterna = (float) 140.232;
    int felicidad = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
    }

    public void cerrarApp(View view){
        finish();
    }
}
