package com.shashanksp.dailynews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView web = (WebView) findViewById(R.id.webView);
        String url = getIntent().getStringExtra("url");
        web.loadUrl(url);
    }
}