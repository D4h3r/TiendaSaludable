/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/**
 *
 * @author DAHER
 */
package com.mycompany.tiendasaludable;
public class Producto {
    private String nombre;
    private int precio;
    private int stock;
    private String tipo;
    private String descripcion;

    // Constructor
    public Producto(String nombre, int precio, int stock, String tipo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Accesores (getters)
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Mutadores (setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}