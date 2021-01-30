package com.example.networkingaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AdaugareOrar extends AppCompatActivity {

    private ImageView arrowBack;
    Button butonAdaugareActivitate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaugare_orar);

        arrowBack = (ImageView) findViewById(R.id.inapoiArrow);
        butonAdaugareActivitate = (Button) findViewById(R.id.butonAdaugareActivitate);

        arrowBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inapoi();
            }
        });

        butonAdaugareActivitate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                adaugareActivitate();
            }
        });

        titluActiv = (EditText) findViewById(R.id.titluActiv);
        despreActiv = (EditText) findViewById(R.id.despreActiv);
        locatieActiv = (EditText) findViewById(R.id.locatieActiv);
        ziActiv = (RadioGroup)findViewById(R.id.ziActiv);
    }

    public void inapoi(){
        Intent intent = new Intent(AdaugareOrar.this, Aplicatie.class);
        startActivity(intent);
    }

    private RadioGroup ziActiv;
    private EditText titluActiv, despreActiv, locatieActiv;
    public void adaugareActivitate() {
        Log.d("adaugata", String.format("Titlu: %s\nDespre: %s\nLocatie: %s\nZi Activ: %d", titluActiv.getText(), despreActiv.getText(), locatieActiv.getText(), ziActiv.getCheckedRadioButtonId()));
        Toast.makeText(AdaugareOrar.this, String.format("Titlu: %s\nDespre: %s\nLocatie: %s\nZi Activ: %d", titluActiv.getText(), despreActiv.getText(), locatieActiv.getText(), ziActiv.getCheckedRadioButtonId()), Toast.LENGTH_LONG).show();
    }
}