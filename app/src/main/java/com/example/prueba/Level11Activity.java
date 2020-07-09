package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l11);

    }

    public void levelOnceSi(View view){
        Intent intent = new Intent(this, Level12Activity.class);
        startActivity(intent);
    }

    public void levelOnceNo(View view){
        Intent intent = new Intent(this, Level12Activity.class);
        startActivity(intent);
    }

}

