package Controladores;

import Modelos.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteG {
    public String query;
    private ArrayList<Cliente> ListaCliente = new ArrayList<>();
    
    public ArrayList<Cliente> Leer(Connection link){
        
        Cliente cliente;
        try{
            Statement s = link.createStatement();
            query="SELECT * FROM Clientes";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                
               cliente = new Cliente();
               cliente.setRut(rs.getString("rut"));
               cliente.setNombres(rs.getString("nombres"));
               cliente.setApellidos(rs.getString("apellidos"));
               cliente.setEdad(rs.getInt("edad"));
               cliente.setEmail(rs.getString("email"));
               cliente.setPlanDieta(rs.getString("planDieta"));
               cliente.setPlanEjercicio(rs.getString("planEjercicio"));
               cliente.setFechaNacimiento(rs.getString("fechaNacimiento"));
               cliente.setRegion(rs.getString("region"));
               cliente.setComuna(rs.getString("comuna"));
               
               ListaCliente.add(cliente);
                
            }
            
            return ListaCliente;
        }catch (SQLException ex) {
            Logger.getLogger(ClienteG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean Crear(Connection link, Cliente cliente){
        
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Clientes(rut, nombres, apellidos, edad, email, planDieta, planEjercicio, fechaNacimiento, region, comuna) VALUES ('"+cliente.getRut()+"','"+cliente.getNombres()+"','"+cliente.getApellidos()+"',"+cliente.getEdad()+",'"+cliente.getEmail()+"','"+cliente.getPlanDieta()+"','"+cliente.getPlanEjercicio()+"','"+cliente.getFechaNacimiento()+"','"+cliente.getRegion()+"','"+cliente.getComuna()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(ClienteG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public Cliente Buscar(Connection link, String rut){
        Cliente cliente=new Cliente();
        try {
            Statement s = link.createStatement();
            query="select * from Clientes where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               cliente.setRut(rs.getString("rut"));
               cliente.setNombres(rs.getString("nombres"));
               cliente.setApellidos(rs.getString("apellidos"));
               cliente.setEdad(rs.getInt("edad"));
               cliente.setEdad(rs.getInt("Plan Dieta"));
               cliente.setEdad(rs.getInt("Plan Ejercicio"));
               cliente.setFechaNacimiento(rs.getString("fechaNacimiento"));
               cliente.setRegion(rs.getString("region"));
               cliente.setComuna(rs.getString("comuna"));
                
            }
            return cliente;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
