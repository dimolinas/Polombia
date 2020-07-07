package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2);
    }

    public void levelThreeSi(View view){
        Intent intent = new Intent(this,Level3Activity.class);
        startActivity(intent);
    }

    public void levelThreeNo(View view){
        Intent intent  = new Intent(this,Level3Activity.class);
        startActivity(intent);
    }

}
