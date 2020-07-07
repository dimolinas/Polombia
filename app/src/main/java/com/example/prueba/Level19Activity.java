package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level19Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l19);

    }
    public void levelDiecinueveSi(View view){
        Intent intent = new Intent(this, Level20Activity.class);
        startActivity(intent);
    }
    public void levelDiecinueveNo(View view){
        Intent intent = new Intent(this, Level20Activity.class);
        startActivity(intent);

    }
}
