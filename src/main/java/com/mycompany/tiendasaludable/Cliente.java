/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/**
 *
 * @author DAHER
 */
package com.mycompany.tiendasaludable;
public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private int rut;
    private String email;
    private String planDieta;
    private String planEjercicio;

    // Constructor
    public Cliente(String nombres, String apellidos, int edad, int rut, String email, String planDieta, String planEjercicio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.rut = rut;
        this.email = email;
        this.planDieta = planDieta;
        this.planEjercicio = planEjercicio;
    }

    // Accesores
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getRut() {
        return rut;
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

    // Mutadores
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRut(int rut) {
        this.rut = rut;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", rut=" + rut +
                ", email='" + email + '\'' +
                ", planDieta='" + planDieta + '\'' +
                ", planEjercicio='" + planEjercicio + '\'' +
                '}';
    }
}