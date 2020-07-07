package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l8);
    }

    public void levelNineSi(View view){
        Intent intent  = new Intent(this,Level9Activity.class);
        startActivity(intent);
    }

    public void levelNineNo(View view){
        Intent intent  = new Intent(this,Level9Activity.class);
        startActivity(intent);
    }
}
