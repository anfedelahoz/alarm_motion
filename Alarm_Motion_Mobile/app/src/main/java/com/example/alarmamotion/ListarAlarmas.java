package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ListarAlarmas extends AppCompatActivity {

    CardView cd1, cd2, cd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_alarmas);


    }


    public void goToAddAlarm(View view) {
        Intent intent = new Intent(this, CreateAlarma.class);
        startActivity(intent);
    }

    public void  goToEditAlarm(View view) {
        Intent intent = new Intent(this, EditarAlarma.class);
        startActivity(intent);
    }

    public void   goToLogin (View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}