package com.example.notamedia;

import android.widget.EditText;

public class Logica {
    EditText nombre;
    EditText apellidos;
    String nombreTexto;
    String apellidosTexto;

    private Controlador controlador;
    public Logica(Controlador controlador) {
        this.controlador = controlador;
    }

    public void cambiarMayus() {
        controlador.enviarNombre(nombre);
        controlador.enviarApellidos(apellidos);
        nombreTexto = nombre.getText().toString().toUpperCase();
        apellidosTexto = apellidos.getText().toString().toUpperCase();
    }

    public void cambiarTextoNombre(){
        nombre.setText(nombreTexto);
    }

    public void cambiarTextoApellidos(){
        apellidos.setText(apellidosTexto);
    }
}
