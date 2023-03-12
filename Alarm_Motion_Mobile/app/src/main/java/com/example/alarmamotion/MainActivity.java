package com.example.alarmamotion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* TextView textViewHora = findViewById(R.id.hora);
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        String horaFormateada = String.format("%02d:%02d", hora, minutos);
        String horaActual = sdf.format(calendario.getTime());
        textViewHora.setText(horaActual);*/
       // new Thread(runnable).start();


        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.landingpage5);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String horaActual = sdf.format(calendar.getTime());
        TextView textViewHora = findViewById(R.id.hora);
        textViewHora.setText(horaActual);

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Calendar calendar = Calendar.getInstance();
                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                        String horaActual = sdf.format(calendar.getTime());

                        textViewHora.setText(horaActual);
                    }
                });
            }
        }, 0, 1000);

        TextView textViewFecha = findViewById(R.id.fecha);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "CO"));
        String fechaActual = sdf2.format(calendar.getTime());

        textViewFecha.setText(fechaActual);
    }





}