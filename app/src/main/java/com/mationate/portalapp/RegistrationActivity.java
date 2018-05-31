package com.mationate.portalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final EditText userInput = findViewById(R.id.userInput);
        final EditText passInput = findViewById(R.id.passInput);
        final Button registerBtn = findViewById(R.id.registerBtn);
        EditText mailInput = findViewById(R.id.mailInput);



        final CheckBox termsCheck = findViewById(R.id.termsCheck);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passInput.getText().toString().trim().length() >= 7) {
                    if (termsCheck.isChecked()) {
                        Intent intentPass = new Intent(RegistrationActivity.this, ConfirmationActivity.class);
                        startActivity(intentPass);
                        Toast.makeText(RegistrationActivity.this, userInput.getText() + ", estas a un paso de crear tu cuenta!", Toast.LENGTH_SHORT).show();
                    } else {
                        //ERROR CHECKBOX
                        Toast.makeText(RegistrationActivity.this, "No has aceptado los términos y condiciones.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    //ERROR PASSWORD Y USER
                    passInput.setError("Tu contraseña debe ser más larga");
                    userInput.setError("Requerido");
                }

            }
        });
    }
}

