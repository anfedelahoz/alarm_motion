package com.example.alarmamotion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;





public class EditarAlarma extends  AppCompatActivity  implements View.OnClickListener{

    private TimePicker timePicker1;
    private Button[] btn = new Button[7];

    private Button[] btnVibracion = new Button[4];

    private Button[] btnSonido = new Button[4];
    private Button btn_unfocus;

    private Button btn_unfocus_vibracion;

    private Button btn_unfocus_sonido;
    private int[] btn_id = {R.id.btnlun, R.id.btnmar, R.id.btnmie, R.id.btnjue,R.id.btnvie,R.id.btnsab, R.id.btndom};
    private int[] btn_id_vibracion = {R.id.btninactivo, R.id.btnalto, R.id.btnmedio, R.id.btnbajo};
    private int[] btn_id_sonido = {R.id.btninactivosonido, R.id.btnaltosonido, R.id.btnmediosonido, R.id.btnbajosonido};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_alarma);
        timePicker1 = (TimePicker) findViewById(R.id.timePicker);


        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setBackgroundColor(Color.rgb(207, 207, 207));
            btn[i].setOnClickListener(this);
        }

        btn_unfocus = btn[0];


        for(int i = 0; i < btnVibracion.length; i++){
            btnVibracion[i] = (Button) findViewById(btn_id_vibracion[i]);
            btnVibracion[i].setBackgroundColor(Color.rgb(207, 207, 207));
            btnVibracion[i].setOnClickListener(this);
        }

        btn_unfocus_vibracion = btnVibracion[0];

        for(int i = 0; i < btnSonido.length; i++){
            btnSonido[i] = (Button) findViewById(btn_id_sonido[i]);
            btnSonido[i].setBackgroundColor(Color.rgb(207, 207, 207));
            btnSonido[i].setOnClickListener(this);
        }

        btn_unfocus_sonido = btnSonido[0];
    }

    @Override
    public void onClick(@NonNull View v) {
        //setForcus(btn_unfocus, (Button) findViewById(v.getId()));
        //Or use switch
        switch (v.getId()){
            case R.id.btnlun:
                setFocus(btn_unfocus, btn[0]);
                break;

            case R.id.btnmar :
                setFocus(btn_unfocus, btn[1]);
                break;

            case R.id.btnmie :
                setFocus(btn_unfocus, btn[2]);
                break;

            case R.id.btnjue :
                setFocus(btn_unfocus, btn[3]);
                break;

            case R.id.btnvie :
                setFocus(btn_unfocus, btn[4]);
                break;

            case R.id.btnsab :
                setFocus(btn_unfocus, btn[5]);
                break;

            case R.id.btndom :
                setFocus(btn_unfocus, btn[6]);
                break;

            /////////Vibracion///////////

            case R.id.btninactivo:
                setFocusVibracion(btn_unfocus_vibracion, btnVibracion[0]);
                break;

            case R.id.btnalto :
                setFocusVibracion(btn_unfocus_vibracion, btnVibracion[1]);
                break;

            case R.id.btnmedio :
                setFocusVibracion(btn_unfocus_vibracion, btnVibracion[2]);
                break;

            case R.id.btnbajo :
                setFocusVibracion(btn_unfocus_vibracion, btnVibracion[3]);
                break;

            /////////Sonido///////////

            case R.id.btninactivosonido:
                setFocusSonido(btn_unfocus_sonido, btnSonido[0]);
                break;

            case R.id.btnaltosonido :
                setFocusSonido(btn_unfocus_sonido, btnSonido[1]);
                break;

            case R.id.btnmediosonido :
                setFocusSonido(btn_unfocus_sonido, btnSonido[2]);
                break;

            case R.id.btnbajosonido :
                setFocusSonido(btn_unfocus_sonido, btnSonido[3]);
                break;


        }
    }

    private void setFocus(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus = btn_focus;
    }


    private void setFocusVibracion(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus_vibracion = btn_focus;
    }

    private void setFocusSonido(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus_sonido = btn_focus;
    }


    public void goToOkAlarm(View view) {
        Intent intent = new Intent(this, AlarmaCreated.class);
        startActivity(intent);
    }


    public void  goToListarAlarmas (View view) {
        Intent intent = new Intent(this, ListarAlarmas.class);
        startActivity(intent);
    }
}


