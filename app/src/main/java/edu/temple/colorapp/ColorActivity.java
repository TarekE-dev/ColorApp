package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors = {"RED", "YELLOW", "GREEN", "AQUA", "WHITE", "GRAY", "CYAN", "MAGENTA", "LIGHTGRAY", "DARKGRAY"};
        ColorAdapter adapter = new ColorAdapter(this, colors);
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        colorSpinner.setAdapter(adapter);
        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.setBackgroundColor(Color.WHITE);
                view.setBackgroundColor(Color.WHITE);
                TextView selected = (TextView) view;
                getWindow().getDecorView().setBackgroundColor(Color.parseColor(selected.getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
