package com.example.activism_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton blm = findViewById(R.id.BLM);
        ImageButton pride = findViewById(R.id.Pride);
        ImageButton mfol = findViewById(R.id.MFOL);
        ImageButton meToo = findViewById(R.id.MeToo);
        ImageButton global = findViewById(R.id.GlobalW);

    }
}
