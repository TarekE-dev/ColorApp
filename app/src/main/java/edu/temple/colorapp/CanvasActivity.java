package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        getSupportActionBar().setTitle("Canvas Activity");
        Intent current = getIntent();
        getWindow().getDecorView().setBackgroundColor(Color.parseColor(current.getStringExtra("color")));
    }
}
