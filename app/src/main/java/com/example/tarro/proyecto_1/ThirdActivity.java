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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnhome = (ImageButton) findViewById(R.id.imageButtonhome);

        prueba2 = getIntent().getStringExtra("nombre");
        edad = getIntent().getStringExtra("edad");

        Toast.makeText(ThirdActivity.this,"el nombre es: " + prueba2 + "y tu edad" + edad,Toast.LENGTH_SHORT).show();

        btnhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
