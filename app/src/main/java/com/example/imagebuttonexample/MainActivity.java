package com.example.imagebuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize view's
        ImageButton simpleImageButtonHome
            = (ImageButton) findViewById(R.id.simpleImageButtonHome);
        ImageButton simpleImageButtonYoutube
            = (ImageButton) findViewById(R.id.simpleImageButtonYoutube);

        // Perform click event on button's
        // Home button clicking
        simpleImageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Home Button",
                    Toast.LENGTH_LONG
                ).show();
            }
        });
        // Home ending

        // Youtube button clicking
        simpleImageButtonYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                    getApplicationContext(),
                    "Youtube Button",
                    Toast.LENGTH_LONG
                ).show();
            }
        });
        // Youtube ending
        // Performance ending
    }
}