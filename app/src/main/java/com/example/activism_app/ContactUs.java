package com.example.activism_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Properties;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void sendEmail(View button) {
        // Do click handling here
    }

    final EditText nameField = (EditText) findViewById(R.id.EditTextName);
    String name = nameField.getText().toString();

    final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
    String email = emailField.getText().toString();

    final EditText feedbackField = (EditText) findViewById(R.id.EditTextFeedbackBody);
    String feedback = feedbackField.getText().toString();

    final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.CheckBoxResponse);
    boolean bRequiresResponse = responseCheckbox.isChecked();

}