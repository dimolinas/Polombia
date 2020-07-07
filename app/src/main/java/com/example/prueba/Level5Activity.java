package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l5);
    }

    public void levelSixSi(View view){
        Intent intent  = new Intent(this,Level6Activity.class);
        startActivity(intent);
    }

    public void levelSixNo(View view){
        Intent intent  = new Intent(this,Level6Activity.class);
        startActivity(intent);
    }
}
