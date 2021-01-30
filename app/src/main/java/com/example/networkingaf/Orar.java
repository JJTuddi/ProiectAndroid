package com.example.networkingaf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


//import com.example.networkingaf.data.OrarViewModel;

import java.util.ArrayList;

public class Orar extends AppCompatActivity {

    //private OrarViewModel orarViewModel;

    private RecyclerView myRecycleView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;
    public static Vreme vreme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.orar_vreme);

        // nu inteleg cum il leg acu aici
        //orarViewModel =

        Button inapoi = (Button) findViewById(R.id.butonInapoiOrar);
        inapoi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Orar.this, Aplicatie.class);
                startActivity(intent);
            }
        });

        ArrayList<CardviewOrar> cvOrarList = new ArrayList<>();
        cvOrarList.add(new CardviewOrar("Curs AF", "12:00-14:30", "", "Online", 0));
        cvOrarList.add(new CardviewOrar("Curs AF 2", "12:00-14:30", "Prea smechera", "Online", 1));
        cvOrarList.add(new CardviewOrar("Curs AF 3", "12:00-14:30", "Faina", "Online", 2));
        cvOrarList.add(new CardviewOrar("Curs AF 4", "13:00-14:30", "Ui", "Online", 3));
        cvOrarList.add(new CardviewOrar("Curs AF 5", "12:00-14:30", "Beau", "Online", 4));
        cvOrarList.add(new CardviewOrar("Curs AF 6", "08:00-14:30", "Mananc", "Online", 5));
        cvOrarList.add(new CardviewOrar("Curs AF 7", "07:00-14:30", "Idk", "Online", 6));

        myRecycleView = findViewById(R.id.recycleViewOrar);
        myRecycleView.setHasFixedSize(false);
        myLayoutManager = new LinearLayoutManager(this);
        myAdapter = new AdapterOrar(cvOrarList);

        myRecycleView.setLayoutManager(myLayoutManager);
        myRecycleView.setAdapter(myAdapter);
    }
}
