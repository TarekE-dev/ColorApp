package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = this.getResources();
        getSupportActionBar().setTitle("Pallete Activity");
        String[] colors = res.getStringArray(R.array.colors);
        ColorAdapter adapter = new ColorAdapter(this, colors);
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        colorSpinner.setSelection(0);
        colorSpinner.setAdapter(adapter);
        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if( i != 0 ) {
                    adapterView.setBackgroundColor(Color.WHITE);
                    view.setBackgroundColor(Color.WHITE);
                    TextView selected = (TextView) view;
                    Intent newIntent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    newIntent.putExtra("color", selected.getText().toString());
                    PaletteActivity.this.startActivity(newIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
