package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlarmaActivate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma_activate);
    }

    public void goToListarAlarmas(View view) {
        Intent intent = new Intent(this, ListarAlarmas.class);
        startActivity(intent);
    }
}