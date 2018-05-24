package com.mationate.portalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button loginBtnFake = findViewById(R.id.loginBtnFake);
        loginBtnFake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "No tienes una cuenta, ¿por qué no te registras?", Toast.LENGTH_SHORT).show();
            }
        });
    }
    
}
