package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE", "PINK"};
        ColorAdapter adapter = new ColorAdapter(this, colors);
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        colorSpinner.setAdapter(adapter);
    }
}
