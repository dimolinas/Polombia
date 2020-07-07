package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l14);

    }
    public void levelCatorceSi(View view){
        Intent intent = new Intent(this, Level15Activity.class);
        startActivity(intent);
    }
    public void levelCatorceNo(View view){
        Intent intent = new Intent(this, Level15Activity.class);
        startActivity(intent);

    }
}
