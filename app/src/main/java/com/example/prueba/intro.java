package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView= findViewById(R.id.nombreIntro);
        textView.setText("!Hola "+name+"!");
    }

    public void start(View view){
        Intent intent = new Intent(this,Level1Activity.class);
        startActivity(intent);
    }
}
