package com.introandroid.lab_04_seacrist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl("https://www.roosterteeth.com/channel/achievement-hunter");
    }
}
