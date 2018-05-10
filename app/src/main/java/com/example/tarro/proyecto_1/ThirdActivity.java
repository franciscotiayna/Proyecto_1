package com.example.tarro.proyecto_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private View btnhome;
    private String prueba2;
    private String edad;
    private Button accion;
    private String opcionseleccionada;
    private ImageButton compartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnhome = (ImageButton) findViewById(R.id.imageButtonhome);

        prueba2 = getIntent().getStringExtra("nombre");
        edad = getIntent().getStringExtra("edad");
        opcionseleccionada = getIntent().getStringExtra("opcion");

        Toast.makeText(ThirdActivity.this,"el nombre es: " + prueba2 + "y tu edad" + edad,Toast.LENGTH_LONG).show();

        btnhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        accion = (Button) findViewById(R.id.botonpresioname);
        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accion.setVisibility(View.INVISIBLE);
                if(opcionseleccionada.equalsIgnoreCase("Saludar")){
                    Toast.makeText(ThirdActivity.this,"hola " + prueba2 + " tu edad es " + edad + " cierto? ",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(ThirdActivity.this,"CHAO " + prueba2 + " tu edad es " + edad + " cierto? ",Toast.LENGTH_LONG).show();
                }
            }
        });
        compartir = (ImageButton) findViewById(R.id.botonshare);
        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendText = new Intent();
                sendText.setAction(Intent.ACTION_SEND);
                if (opcionseleccionada.equalsIgnoreCase("Saludar")){
                    sendText.putExtra(Intent.EXTRA_TEXT, "hola " + prueba2 + " tu edad es: " + edad);
                    sendText.setType("text/plain");
                    startActivity(sendText);
                }
                else{
                    sendText.putExtra(Intent.EXTRA_TEXT, "hola " + prueba2 + " tu edad es: " + edad);
                    sendText.setType("text/plain");
                    startActivity(sendText);
                }
            }
        });
    }


}