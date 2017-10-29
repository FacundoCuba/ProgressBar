package com.example.facu.conversor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar skbProgreso = (SeekBar)findViewById(R.id.skbProgreso);
        skbProgreso.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        SeekBar skbProgreso = (SeekBar)findViewById(R.id.skbProgreso);
        TextView txtProgreso = (TextView)findViewById(R.id.txtProgreso);
        String valor = String.valueOf(skbProgreso.getProgress());
        txtProgreso.setText(valor);
        txtProgreso.setBackgroundColor(Color.LTGRAY);
        if (skbProgreso.getProgress() < 50){
            txtProgreso.setTextColor(Color.GREEN);
        }
        else if ((skbProgreso.getProgress() >= 50) && (skbProgreso.getProgress() <= 150)){
            txtProgreso.setTextColor(Color.YELLOW);
        }
        else if (skbProgreso.getProgress() > 150){
            txtProgreso.setTextColor(Color.RED);
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
