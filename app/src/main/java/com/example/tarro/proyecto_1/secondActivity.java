package com.example.tarro.proyecto_1;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    private SeekBar seekBaredad;
    private TextView textViewedad;
    private View btn2;
    private String prueba;
    private String edad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn2 = (Button) findViewById(R.id.button3);
        prueba = getIntent().getStringExtra("nombre");




        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this, ThirdActivity.class);
                intent.putExtra("nombre",prueba);
                intent.putExtra("edad",edad);
                startActivity(intent);
            }
        });

        seekBaredad = (SeekBar) findViewById(R.id.seekBarEdad);
        textViewedad = (TextView) findViewById(R.id.textViewEdad);

        textViewedad.setText("Edad: " + seekBaredad.getProgress());

        seekBaredad.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                edad = String.valueOf(progress);
                //Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewedad.setText("Edad: " + progress);
                //Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }
        });
                seekBaredad = (SeekBar) findViewById(R.id.seekBarEdad);
                textViewedad = (TextView) findViewById(R.id.textViewEdad);
        }
    }