package com.mycompany.tiendasaludable;

import java.util.List;

public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private List<Integer> cantidades;

    // Constructor
    public Venta(int idVenta, String fecha, Cliente cliente, List<Producto> productos, List<Integer> cantidades) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.cantidades = cantidades;
    }

    // Accesores (getters)
    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Integer> getCantidades() {
        return cantidades;
    }

    // Mutadores (setters)
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setCantidades(List<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    // Método toString
    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                ", productos=" + productos +
                ", cantidades=" + cantidades +
                '}';
    }

}


