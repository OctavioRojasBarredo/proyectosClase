package com.example.notamedia;

import android.widget.EditText;

public class Logica {
    private Controlador controlador;

    public Logica() {

    }

    public void ponerMayusculasNombre(String texto) {
        controlador.getNombre().toUpperCase();
    }

    public void ponerMayusculasApellidos(String texto) {
        controlador.getApellidos().toUpperCase();
    }
}
