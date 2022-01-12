package com.example.tourguider;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class online extends AppCompatActivity{
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        web=(WebView) findViewById(R.id.webview);
        web.loadUrl(getString(R.string.url));
        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
            }
            else {super.onBackPressed();}
    }
}
