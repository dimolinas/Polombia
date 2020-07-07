package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l7);
    }

    public void levelEightSi(View view){
        Intent intent  = new Intent(this,Level8Activity.class);
        startActivity(intent);
    }

    public void levelEightNo(View view){
        Intent intent  = new Intent(this,Level8Activity.class);
        startActivity(intent);
    }
}
