/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/**
 *
 * @author DAHER
 */
package com.mycompany.tiendasaludable;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class TiendaSaludable {
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Venta> ventas;
    private List<Dieta> dietas;

    public TiendaSaludable() {
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        dietas = new ArrayList<>();
    }
    
    // Clientes
    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void agregarCliente(Cliente nuevoCliente) {
        clientes.add(nuevoCliente);
    }

    public void actualizarCliente(int rut, Cliente clienteActualizado) {
        Cliente cliente = buscarClientePorRut(clientes, rut);
        if (cliente != null) {
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setApellido(clienteActualizado.getApellido());
            cliente.setEmail(clienteActualizado.getEmail());
            cliente.setTelefono(clienteActualizado.getTelefono());
        }
    }

    public void eliminarCliente(int rut) {
        Cliente cliente = buscarClientePorRut(clientes, rut);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }

    // Productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void agregarProducto(Producto nuevoProducto) {
        productos.add(nuevoProducto);
    }

    public void actualizarProducto(String nombre, Producto productoActualizado) {
        Producto producto = buscarProductoPorNombre(productos, nombre);
        if (producto != null) {
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setStock(productoActualizado.getStock());
            producto.setTipo(productoActualizado.getTipo());
            producto.setDescripcion(productoActualizado.getDescripcion());
        }
    }

    public void eliminarProducto(String nombre) {
        Producto producto = buscarProductoPorNombre(productos, nombre);
        if (producto != null) {
            productos.remove(producto);
        }
    }

    // Ventas
    public void mostrarVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public void agregarVenta(Venta nuevaVenta) {
        ventas.add(nuevaVenta);
    }

    public void actualizarVenta(int id, Venta ventaActualizada) {
        Venta venta = buscarVentaPorId(ventas, id);
        if (venta != null) {
            venta.setCliente(ventaActualizada.getCliente());
            venta.setProductos(ventaActualizada.getProductos());
        }
    }

    public void eliminarVenta(int id) {
        Venta venta = buscarVentaPorId(ventas, id);
        if (venta != null) {
            ventas.remove(venta);
        }
    }

    // Dietas
    public void mostrarDietas() {
        for (Dieta dieta : dietas) {
            System.out.println(dieta);
        }
    }

    public void agregarDieta(Dieta nuevaDieta) {
        dietas.add(nuevaDieta);
    }

    public void actualizarDieta(String nombre, Dieta dietaActualizada) {
        Dieta dieta = buscarDietaPorNombre(dietas, nombre);
        if (dieta != null) {
            dieta.setDescripcion(dietaActualizada.getDescripcion());
            dieta.setProductos(dietaActualizada.getProductos());
        }
    }

    public void eliminarDieta(String nombre) {
        Dieta dieta = buscarDietaPorNombre(dietas, nombre);
        if (dieta != null) {
            dietas.remove(dieta);
        }
    }
    

    public void cargarClientes(String archivo) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                int rut = Integer.parseInt(record[0]);
                String nombre = record[1];
                String apellido = record[2];
                String email = record[3];
                int telefono = Integer.parseInt(record[4]);
                Cliente cliente = new Cliente(rut, nombre, apellido, email, telefono);
                clientes.add(cliente);
            }
        }
    }

    public void cargarProductos(String archivo) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                String nombre = record[1];
                int precio = Integer.parseInt(record[2]);
                int stock = Integer.parseInt(record[3]);
                String tipo = record[4];
                String descripcion = record[5];
                Producto producto = new Producto(id, nombre, precio, stock, tipo, descripcion);
                productos.add(producto);
            }
        }
    }

    public void cargarVentas(String archivo) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                int rutCliente = Integer.parseInt(record[1]);
                Cliente cliente = buscarClientePorRut(clientes, rutCliente);
                int total = Integer.parseInt(record[2]);
                String fecha = record[3];
                Venta venta = new Venta(id, cliente, total, fecha);
                ventas.add(venta);
            }
        }
    }
    
    public void cargarDietas(String archivo) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                String nombre = record[1];
                String descripcion = record[2];
                int duracion = Integer.parseInt(record[3]);
                int precio = Integer.parseInt(record[4]);
                Dieta dieta = new Dieta(id, nombre, descripcion, duracion, precio);
                dietas.add(dieta);
            }
        }
    }

    private Cliente buscarClientePorRut(List<Cliente> clientes1, int rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut() == rut) {
                return cliente;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        TiendaSaludable tiendaSaludable = new TiendaSaludable();

        try {
            tiendaSaludable.cargarClientes("clientes.csv");
            tiendaSaludable.cargarProductos("productos.csv");
            tiendaSaludable.cargarVentas("ventas.csv");
            tiendaSaludable.cargarDietas("dietas.csv");
            
            // Crear instancia de Menu y mostrar el menú
            Menu menu = new Menu(tiendaSaludable);
            menu.mostrarMenu();            
            
            // Aquí se llama a la interfaz gráfica
            SwingUtilities.invokeLater(() -> new LoginGUI());
            SwingUtilities.invokeLater(() -> new TiendaSaludableGUI());
        } catch (IOException | CsvException e) {
            System.err.println("Error al cargar archivos CSV: " + e.getMessage());
        }
    }

}