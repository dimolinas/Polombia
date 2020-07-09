package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l21);

    }
    public void levelVentiunoSi(View view){
        Intent intent = new Intent(this,End.class);
        startActivity(intent);
    }
    public void levelVentiunoNo(View view){
        Intent intent = new Intent(this,End.class);
        startActivity(intent);

    }
}

