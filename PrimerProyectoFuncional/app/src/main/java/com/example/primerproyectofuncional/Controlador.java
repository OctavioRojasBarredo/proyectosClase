package com.example.primerproyectofuncional;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Controlador implements View.OnClickListener {

    private TextView mostrarNombre;
    private EditText nombre;

    // Constructor que recibe las vistas que necesitas controlar
    public Controlador(TextView mostrarNombre, EditText nombre) {
        this.mostrarNombre = mostrarNombre;
        this.nombre = nombre;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.botonIzq) {
            mostrarNombre.setText(nombre.getText().toString());
        }

        if (view.getId() == R.id.botonDer) {
                mostrarNombre.setText("");
        }
    }
}
