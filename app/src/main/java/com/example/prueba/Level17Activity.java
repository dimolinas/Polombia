package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l17);

    }
    public void levelDiecisieteSi(View view){
        Intent intent = new Intent(this, Level18Activity.class);
        startActivity(intent);
    }
    public void levelDiecisieteNo(View view){
        Intent intent = new Intent(this, Level18Activity.class);
        startActivity(intent);

    }
}
