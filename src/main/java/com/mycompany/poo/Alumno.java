package com.mycompany.poo;


public class Alumno {
    int id;
    String nombre;
    String apellido;
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno");
    }
    public void saberAprobado(double calificacion){
        if (calificacion>= 12){
            System.out.println("Aprobadoo");
        }
        else if (calificacion<= 12){
            System.out.println("Desaprobadoo");
        }
    }
    
     public void mayorEdad(int edad){
        if (edad >= 18 ){
            System.out.println("Mayor de edad");
        }
        else if (edad <= 18 ){
            System.out.println("Menor de edad");
        }
    }
     
public Alumno(){
    
}
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
