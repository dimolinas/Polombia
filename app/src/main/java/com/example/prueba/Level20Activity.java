package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l20);

    }
    public void levelVeinteSi(View view){
        Intent intent = new Intent(this, Level21Activity.class);
        startActivity(intent);
    }
    public void levelVeinteNo(View view){
        Intent intent = new Intent(this, Level21Activity.class);
        startActivity(intent);

    }
}
