package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l16);

    }
    public void levelDieciseisSi(View view){
        Intent intent = new Intent(this, Level17Activity.class);
        startActivity(intent);
    }
    public void levelDieciseisNo(View view){
        Intent intent = new Intent(this, Level17Activity.class);
        startActivity(intent);

    }
}
