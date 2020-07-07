package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4);
    }

    public void levelFiveSi(View view){
        Intent intent  = new Intent(this,Level5Activity.class);
        startActivity(intent);
    }

    public void levelFiveNo(View view){
        Intent intent  = new Intent(this,Level5Activity.class);
        startActivity(intent);
    }
}
