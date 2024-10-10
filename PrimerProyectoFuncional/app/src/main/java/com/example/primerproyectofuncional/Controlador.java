package com.example.primerproyectofuncional;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Controlador implements View.OnClickListener {

    private TextView mostrarNombre;
    private EditText nombre;
    private MainActivity activity;

    // Constructor que recibe las vistas que necesitas controlar
    public Controlador(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.botonIzq) {
            activity.cambiarTexto();
        }

        if (view.getId() == R.id.botonDer) {
            activity.resetearTexto();
        }
    }
}
