/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author DAHER
 */
public class Cliente {
    private String rut; 
    private String nombres; 
    private String apellidos;
    private int edad;
    private String email;
    private String planDieta;
    private String planEjercicio;
    private String fechaNacimiento; 
    private String region;
    private String comuna;

    public Cliente(){
        
    }
    public Cliente(String rut, String nombres, String apellidos, int edad, String email, 
                   String planDieta, String planEjercicio, String fechaNacimiento, String region, String comuna) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.planDieta = planDieta;
        this.planEjercicio = planEjercicio;
        this.fechaNacimiento = fechaNacimiento;
        this.region = region;
        this.comuna = comuna;
    }

    // Accesores
    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getPlanDieta() {
        return planDieta;
    }

    public String getPlanEjercicio() {
        return planEjercicio;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRegion() {
        return region;
    }

    public String getComuna() {
        return comuna;
    }

    // Mutadores
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlanDieta(String planDieta) {
        this.planDieta = planDieta;
    }

    public void setPlanEjercicio(String planEjercicio) {
        this.planEjercicio = planEjercicio;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    
    public void Imprimir(){
        
    }
    
    
}
