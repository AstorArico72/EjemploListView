package com.example.ejemplolistview;

public class Inmueble {
    private int foto;
    private String direccion;
    private int precio;

    public Inmueble (int foto, String direccion, int precio) {
        this.foto = foto;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int obtenerNumeroFoto () {
        return this.foto;
    }

    public String obtenerDireccion () {
        return this.direccion;
    }

    public String obtenerPrecio () {
        return "$ " + this.precio;
    }

}