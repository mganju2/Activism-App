package com.example.activism_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class ContactUs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button sendButton = findViewById(R.id.ButtonSend);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStr = "https://docs.google.com/forms/d/e/1FAIpQLSc71DlzyTtE7f3qxhtZvZAJtXmHRsPQKRgmkRZjOk0IjWHkYw/viewform?usp=pp_url&entry.1844187849=Ashish+Ganju&entry.1599659447=ashganju@gmail.com&entry.1709743245=test+message+123&submit=Submit";
                URL obj = null;
                try {
                    obj = new URL(myStr);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                //Toast.makeText(ContactUs.this, obj.toString(), Toast.LENGTH_SHORT).show();
                /*//System.out.println("Name = " + findViewById(R.id.EditTextName).toString());
                String myStr = "entry.1844187849=" + findViewById(R.id.EditTextName).toString() + "&entry.1599659447=" + findViewById(R.id.EditTextEmail).toString() + "&entry.1599659447=" + findViewById(R.id.EditTextBody).toString();
                URL obj = null;
                String myStr ="https://docs.google.com/forms/d/e/1FAIpQLSc71DlzyTtE7f3qxhtZvZAJtXmHRsPQKRgmkRZjOk0IjWHkYw/viewform?usp=pp_url&entry.1844187849=Ashish+Ganju&entry.1599659447=ashganju@gmail.com&entry.1709743245=test+message+123&submit=Submit";
                //System.out.println("Name = " + findViewById(R.id.EditTextName).toString());
                try {
                    //obj = new URL("https://docs.google.com/forms/d/e/1FAIpQLSc71DlzyTtE7f3qxhtZvZAJtXmHRsPQKRgmkRZjOk0IjWHkYw/formResponse?" + myStr + "&submit=Submit");
                    obj = new URL(myStr);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }*/
                HttpURLConnection con = null;
                try {
                    con = (HttpURLConnection) obj.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    con.setRequestMethod("POST");
                } catch (ProtocolException e) {
                    e.printStackTrace();
                }
                //con.setRequestProperty("User-Agent", "Mozilla/5.0");
                con.setDoOutput(true);
                /*OutputStream os = null;
                try {
                    os = con.getOutputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                int responseCode = 0;
                try {
                    responseCode = con.getResponseCode();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (responseCode == HttpURLConnection.HTTP_OK) { //success
                    Toast.makeText(ContactUs.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ContactUs.this, "FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}