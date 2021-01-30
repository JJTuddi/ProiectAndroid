package com.example.networkingaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aplicatie extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paginaprincipala);

        Button orar, pomodoro, adaugareActiv;
        orar = (Button) findViewById(R.id.buttonOrar);
        pomodoro = (Button) findViewById(R.id.buttonPomodoro);
        adaugareActiv = (Button) findViewById(R.id.buttonAdaugareActivitati);

        orar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Aplicatie.this, Orar.class);
                startActivity(intent);
            }
        });

        pomodoro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Aplicatie.this, Pomodoro.class);
                startActivity(intent);
            }
        });

        adaugareActiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Aplicatie.this, AdaugareOrar.class);
                startActivity(intent);
            }
        });

    }
}