package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l18);

    }
    public void levelDieciochoSi(View view){
        Intent intent = new Intent(this, Level19Activity.class);
        startActivity(intent);
    }
    public void levelDieciochoNo(View view){
        Intent intent = new Intent(this, Level19Activity.class);
        startActivity(intent);

    }
}
