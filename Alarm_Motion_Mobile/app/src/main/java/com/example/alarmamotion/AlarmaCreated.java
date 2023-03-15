package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlarmaCreated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma_created);

        ImageView mImageView;

        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.okalarma);

    }


    public void goToListarAlarm(View view) {
        Intent intent = new Intent(this, ListarAlarmas.class);
        startActivity(intent);
    }
}