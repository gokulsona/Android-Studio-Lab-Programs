package com.example.launcheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email, pass;
    Button login;
    String useremail, userpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 useremail = email.getText().toString();
                 userpass = pass.getText().toString();

                 if (useremail.equals("user@gmail.com") && userpass.equals("user@123"))
                 {
                     Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                 }
            }
        });
    }
}