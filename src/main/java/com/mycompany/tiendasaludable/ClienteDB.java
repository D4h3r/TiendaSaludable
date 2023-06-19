/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendasaludable;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author DAHER
 */
public interface ClienteDB {
    ArrayList<Cliente>ListaCliente=new ArrayList<Cliente>();
    public boolean Crear(Connection link, Cliente cliente);
    public void Actualizar();
    public void Eliminar();
    public ArrayList<Cliente> Leer(Connection link);
    public Cliente Buscar(Connection link, String rut);
}
