package com.example.alarmamotion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class CreateAlarma extends AppCompatActivity  implements View.OnClickListener{
    private TimePicker timePicker1;
    private Button[] btn = new Button[7];
    private Button btn_unfocus;
    private int[] btn_id = {R.id.btnlun, R.id.btnmar, R.id.btnmie, R.id.btnjue,R.id.btnvie,R.id.btnsab, R.id.btndom};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarma);
        timePicker1 = (TimePicker) findViewById(R.id.timePicker);


        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setBackgroundColor(Color.rgb(207, 207, 207));
            btn[i].setOnClickListener(this);
        }

        btn_unfocus = btn[0];
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
        }
    }

    private void setFocus(Button btn_unfocus, Button btn_focus){
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus = btn_focus;
    }
}