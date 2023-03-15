package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Button btnRegistro;
    EditText etMail;
    EditText etPass;
    EditText etPass2;
    EditText etUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ImageView mImageView;

        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.registroimage);


        btnRegistro = findViewById(R.id.btnRegistrarme);
        etUserName = findViewById(R.id.editTextUserName);
        etMail = findViewById(R.id.editTextTextEmailAddress);
        etPass = findViewById(R.id.editTextTextPassword);
        etPass2 = findViewById(R.id.editTextTextPasswordRepetir);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                boolean validatePass= passValidator(etPass,etPass2);
                boolean validateEmail= emailValidator(etMail);
                boolean validateUserName= userNameValidator(etUserName);
                if(validateEmail && validatePass && validateUserName)
                {
                    Intent intent = new Intent(v.getContext(), ListarAlarmas.class);
                    startActivity(intent);
                }
            }
        });




    }


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

    boolean passValidator(EditText etPass,EditText etPass2) {

        // extract the entered data from the EditText
        String emailToText = etPass.getText().toString();
        String emailToText2 = etPass2.getText().toString();

        // Android offers the inbuilt patterns which the entered
        // data from the EditText field needs to be compared with
        // In this case the entered data needs to compared with
        // the EMAIL_ADDRESS, which is implemented same below
        if ((!emailToText.isEmpty()) && (!emailToText2.isEmpty()) && (emailToText==emailToText2)   ) {
            // Toast.makeText(this, "contraseña verificada !", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (emailToText.trim().isEmpty()) {
            Toast.makeText(this, "La contraseña no puede ser vacia!", Toast.LENGTH_SHORT).show();
            return  false;
        }

        if (emailToText2.trim().isEmpty()) {
            Toast.makeText(this, "La repetición de contraseña  no puede ser vacia!", Toast.LENGTH_SHORT).show();
            return  false;
        }


        Log.d("emailToText", emailToText);
        Log.d("emailToText2", emailToText2);
       Log.d("emailToText2", String.valueOf((emailToText.equals(emailToText2))));
        if (emailToText.equals(emailToText2)==false ){
            Toast.makeText(this, "Las contraseñas no coinciden!", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else {
            //Toast.makeText(this, "algo extraño sucedio en la validación!", Toast.LENGTH_SHORT).show();

            return  true;
        }


    }


    boolean userNameValidator(EditText etPass) {

        // extract the entered data from the EditText
        String emailToText = etPass.getText().toString();

        // Android offers the inbuilt patterns which the entered
        // data from the EditText field needs to be compared with
        // In this case the entered data needs to compared with
        // the EMAIL_ADDRESS, which is implemented same below
        if (!emailToText.trim().isEmpty()) {
            // Toast.makeText(this, "contraseña verificada !", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "El nombre de usuario no puede ser vacio!", Toast.LENGTH_SHORT).show();
            return  false;
        }
    }



    public void goToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}