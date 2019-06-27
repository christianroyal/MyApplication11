package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);
        CharSequence text = "Welcome!";
        int duration = Toast.LENGTH_LONG;
        Context context = getApplicationContext();
        Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
    }
}

