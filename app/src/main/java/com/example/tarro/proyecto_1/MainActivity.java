package com.example.tarro.proyecto_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private View btn;
    private String palabra;
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        nombre = (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                palabra = nombre.getText().toString();
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("nombre",palabra);
                startActivity(intent);

            }
        });
    }
}
