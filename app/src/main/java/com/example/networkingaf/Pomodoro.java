package com.example.networkingaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Pomodoro extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomodoro);
        webView = (WebView)findViewById(R.id.webviewpomodoro);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://pomofocus.io/");

        Button inapoiPomo = (Button) findViewById(R.id.inapoiPomodoro);
        inapoiPomo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Pomodoro.this, Aplicatie.class);
                startActivity(intent);
            }
        });
    }
}