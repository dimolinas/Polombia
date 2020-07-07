package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l12);

    }
    public void levelDoceSi(View view){
        Intent intent = new Intent(this, Level13Activity.class);
        startActivity(intent);
    }
    public void levelDoceNo(View view){
        Intent intent = new Intent(this, Level13Activity.class);
        startActivity(intent);

    }
}
