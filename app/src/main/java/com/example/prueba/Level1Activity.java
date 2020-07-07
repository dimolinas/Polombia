package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1);
    }

    public void levelTwoSi(View view){
        Intent intent  = new Intent(this,Level2Activity.class);
        startActivity(intent);
    }

    public void levelTwoNo(View view){
        Intent intent  = new Intent(this,Level2Activity.class);
        startActivity(intent);
    }
}
