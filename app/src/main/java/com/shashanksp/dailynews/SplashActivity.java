package com.shashanksp.dailynews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
     ProgressBar progressbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressbar = findViewById(R.id.idPBar);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressbar.setVisibility(View.VISIBLE);
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
        progressbar.setVisibility(View.GONE);
    }
}