package com.example.networkingaf;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private String lat, lon;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = "44.948";
        lon = "23.24";
        //?lon=" + lon + "&lat="+ lat
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://weatherbit-v1-mashape.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonCallVreme jsonCallVreme = retrofit.create(JsonCallVreme.class);

        Call<Vreme> call = jsonCallVreme.getPosts();

        call.enqueue(new Callback<Vreme>() {
            @Override
            public void onResponse(Call<Vreme> call, Response<Vreme> response) {
                Orar.vreme = response.body();
                Log.d("Raspuns vreme", Orar.vreme.toString());
            }

            @Override
            public void onFailure(Call<Vreme> call, Throwable t) {
                Log.d("Eroare vreme", t.getMessage());
            }
        });

        new Thread() {
            @Override
            public void run() {
                super.run();
                loadData();
                Intent intent = new Intent(MainActivity.this, Aplicatie.class);
                startActivity(intent);
            }
        }.start();
        Log.d("Bun", "Bun");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void loadData() {
        LocalDate localDate = LocalDate.now();
        int n = 100;
        TextView titlu = (TextView)findViewById(R.id.titluAplicatie);
        TextView loadingText = (TextView)findViewById(R.id.informatiiLoad);
        ProgressBar baraProgress = (ProgressBar)findViewById(R.id.progressBarIncarcare);
        titlu.setText(titlu.getText() + " " + localDate.getDayOfMonth() + " " + localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        for (int i = 0; i <= n; i++) {
            int procent = (int)(100.0 * i / n );
            Log.d("procent", String.valueOf(procent));
            loadingText.setText(String.format("Loading...%d%%", procent));
            baraProgress.setProgress(procent);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Log.d("eroare sleep", e.getMessage());
                //e.printStackTrace();
            }
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(MainActivity.this, Aplicatie.class);
        startActivity(intent);
    }
}