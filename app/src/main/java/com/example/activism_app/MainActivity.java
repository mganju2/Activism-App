package com.example.activism_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("The Activist");

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

        ImageButton mfol = findViewById(R.id.MFOL);
        mfol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMFOL();
            }
        });

        ImageButton meToo = findViewById(R.id.MeToo);
        meToo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeToo();
            }
        });

        ImageButton global = findViewById(R.id.GlobalW);
        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGlobal();
            }
        });

        ImageButton contact = findViewById(R.id.ContactUs);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContact();
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
    public void openMFOL() {
        Intent intent = new Intent(this, MFOL.class);
        startActivity(intent);
    }
    public void openMeToo() {
        Intent intent = new Intent(this, MeToo.class);
        startActivity(intent);
    }
    public void openGlobal() {
        Intent intent = new Intent(this, GlobalWarming.class);
        startActivity(intent);
    }
    public void openContact() {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }
}
