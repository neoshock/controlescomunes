package com.example.trabajouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private String genero = "Masculino";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDatos(View view){
        Bundle bundle = new Bundle();
        Intent intent = new Intent(MainActivity.this, Bienvenida.class);

        EditText nombre = (EditText) findViewById(R.id.nombreTxt);
        EditText telefono = (EditText) findViewById(R.id.telefonoTxt);
        EditText fechaNacimiento = (EditText) findViewById(R.id.fechaNacimientoDate);

        bundle.putString("nombre", nombre.getText().toString());
        bundle.putString("telefono", telefono.getText().toString());
        bundle.putString("fecha", fechaNacimiento.getText().toString());
        bundle.putString("genero", genero);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.masculinoRb:
                if (checked)
                    genero = "Masculino";
                    break;
            case R.id.femeninoRb:
                if (checked)
                    genero = "Femenino";
                    break;
        }
    }
}