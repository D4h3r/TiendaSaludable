/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendasaludable;

/**
 *
 * @author DAHER
 */
// Clase VentaDetalle
public class VentaDetalle {
    private int cantidad;
    private Producto producto;
    private Dieta dieta;
    private int precio;

    public VentaDetalle(int cantidad, Producto producto, Dieta dieta, int precio) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.dieta = dieta;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}