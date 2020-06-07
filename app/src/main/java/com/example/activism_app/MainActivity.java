package com.example.activism_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton blm = findViewById(R.id.BLM);
        blm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBLM();
            }
        });
        ImageButton pride = findViewById(R.id.Pride);
        pride.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPride();
            }
        });

    }
    public void openBLM() {
        Intent intent = new Intent(this, BLM.class);
        startActivity(intent);
    }
    public void openPride() {
        Intent intent = new Intent(this, Pride.class);
        startActivity(intent);
    }
}
