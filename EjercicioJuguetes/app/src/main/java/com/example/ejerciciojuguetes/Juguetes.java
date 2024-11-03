package com.example.ejerciciojuguetes;

import java.io.Serializable;

public class Juguetes implements Serializable {
    String descripcion;
    String tipo;
    int cantidad;

    public Juguetes(String descripcion, String tipo, int cantidad) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
