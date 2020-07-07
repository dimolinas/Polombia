package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l10);
    }

    public void levelSi(View view){
        Intent intent = new Intent(this, Level11Activity.class);
        startActivity(intent);
    }
    public void levelNo(View view){
        Intent intent = new Intent(this, Level11Activity.class);
        startActivity(intent);

    }
}
