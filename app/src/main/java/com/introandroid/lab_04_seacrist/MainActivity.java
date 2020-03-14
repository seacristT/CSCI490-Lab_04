package com.introandroid.lab_04_seacrist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {

            urlLoader("www.jsonplaceholder.typicode.com/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected String urlLoader (String myString) throws IOException {
        URL url = new URL (myString);

        url.openConnection();

        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));
        String bufferOutput = in.readLine();
        Log.i(null, bufferOutput);


        return bufferOutput;
    }
}
