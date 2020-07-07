package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l9);
    }

    public void levelTenSi(View view){
        Intent intent  = new Intent(this,Level10Activity.class);
        startActivity(intent);
    }

    public void levelTenNo(View view){
        Intent intent  = new Intent(this,Level10Activity.class);
        startActivity(intent);
    }
}
