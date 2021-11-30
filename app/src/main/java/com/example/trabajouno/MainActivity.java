package com.example.trabajouno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void enviarDatos(View view){
        EditText nombre = (EditText) findViewById(R.id.nombreTxt);
        RadioGroup genero = (RadioGroup)findViewById(R.id.generosRg);
        genero.check(R.id.masculinoRb);
    }
}