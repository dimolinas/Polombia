package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l3);
    }

    public void levelFourSi(View view){
        Intent intent  = new Intent(this,Level4Activity.class);
        startActivity(intent);
    }

    public void levelFourNo(View view){
        Intent intent  = new Intent(this,Level4Activity.class);
        startActivity(intent);
    }
}
