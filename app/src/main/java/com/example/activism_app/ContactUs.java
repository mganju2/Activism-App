package com.example.activism_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


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
                EditText myName = findViewById(R.id.EditTextName);
                EditText myEmail = findViewById(R.id.EditTextEmail);
                EditText myMessage = findViewById(R.id.EditTextBody);
                String myStr = "https://docs.google.com/forms/d/e/1FAIpQLSc71DlzyTtE7f3qxhtZvZAJtXmHRsPQKRgmkRZjOk0IjWHkYw/formResponse?usp=pp_url&entry.1844187849=" + myName.getText() + "&entry.1599659447=" + myEmail.getText() + "&entry.1709743245=" + myMessage.getText() + "&submit=Submit";
                Uri uriUrl = Uri.parse(myStr);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
                Toast toast = Toast.makeText(ContactUs.this, "Thank You!", Toast.LENGTH_SHORT);
                ViewGroup group = (ViewGroup) toast.getView();
                TextView messageTextView = (TextView) group.getChildAt(0);
                messageTextView.setTextSize(40);
                toast.setGravity(Gravity.TOP|Gravity.START, 210, 800);
                toast.show();
            }
        });
    }
}