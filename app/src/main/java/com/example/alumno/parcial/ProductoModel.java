package com.example.alumno.parcial;

/**
 * Created by alumno on 26/09/2019.
 */

public class ProductoModel {

    private String nombre;
    private String cantidad;
    private String precio;
    private int id;

    public ProductoModel(String nombre, String cantidad, String precio){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
