/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

public class Actor {
    int cedula;
    String nombre;
    String apellido;
    LocalDate fechaNac;
    int peliculasRealizadas;

    public Actor(int cedula, String nombre, String apellido, LocalDate fechaNac, int peliculasRealizadas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.peliculasRealizadas = peliculasRealizadas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getPeliculasRealizadas() {
        return peliculasRealizadas;
    }

    public void setPeliculasRealizadas(int peliculasRealizadas) {
        this.peliculasRealizadas = peliculasRealizadas;
    }

    @Override
    public String toString() {
        return "Actor{" + "cedula=" + cedula + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", fechaNac=" + fechaNac + 
                ", peliculasRealizadas=" + peliculasRealizadas + '}';
    }
    
    
}
