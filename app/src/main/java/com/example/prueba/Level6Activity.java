package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l6);
    }

    public void levelSevenSi(View view){
        Intent intent  = new Intent(this,Level7Activity.class);
        startActivity(intent);
    }

    public void levelSevenNo(View view){
        Intent intent  = new Intent(this,Level7Activity.class);
        startActivity(intent);
    }
}
