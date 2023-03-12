package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    // EditText filed for Email
    EditText etMail;

    EditText etPass;

    // Button to validate the Email address
    Button btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView mImageView;

        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.loginimage2);

        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        etMail = findViewById(R.id.editTextTextEmailAddress);
        etPass = findViewById(R.id.editTextTextPassword);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean validateEmail= emailValidator(etMail);
                boolean validatePass= passValidator(etPass);
                if(validateEmail && validatePass)
                {
                    Intent intent = new Intent(v.getContext(), ListarAlarmas.class);
                    startActivity(intent);
                }
            }
        });
    }

    // the function which triggered when the VALIDATE button is clicked
    // which validates the email address entered by the user
    public boolean emailValidator(EditText etMail) {

        // extract the entered data from the EditText
        String emailToText = etMail.getText().toString();

        // Android offers the inbuilt patterns which the entered
        // data from the EditText field needs to be compared with
        // In this case the entered data needs to compared with
        // the EMAIL_ADDRESS, which is implemented same below
        if (!emailToText.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailToText).matches()) {
           // Toast.makeText(this, "Email Verified !", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Ingrese Email valido!", Toast.LENGTH_SHORT).show();
            return  false;
        }
    }



    public boolean passValidator(EditText etPass) {

        // extract the entered data from the EditText
        String emailToText = etPass.getText().toString();

        // Android offers the inbuilt patterns which the entered
        // data from the EditText field needs to be compared with
        // In this case the entered data needs to compared with
        // the EMAIL_ADDRESS, which is implemented same below
        if (!emailToText.isEmpty()) {
           // Toast.makeText(this, "contraseña verificada !", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "La contraseña no puede ser vacia!", Toast.LENGTH_SHORT).show();
            return  false;
        }
    }






}