package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l13);

    }
    public void levelTreceSi(View view){
        Intent intent = new Intent(this, Level14Activity.class);
        startActivity(intent);
    }
    public void levelTreceNo(View view){
        Intent intent = new Intent(this, Level14Activity.class);
        startActivity(intent);

    }
}
