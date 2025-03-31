package com.mycompany.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author ma5ti
 */
public class POO {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno(19,"Mauricio","Rebaza");
        Alumno alu2 = new Alumno();
        
        System.out.println("El nombre del alumno es "+ alu1.getNombre());
        System.out.println("El id del alumno es "+ alu1.getId());
        System.out.println("El apellido del alumno es "+ alu1.getApellido());
        alu2.setId(12);
        alu2.setNombre("Victor");
        alu2.setApellido("Diaz");
        System.out.println("El nombre del alumno es "+ alu2.getNombre());
        System.out.println("El id del alumno es "+ alu2.getId());
        System.out.println("El apellido del alumno es "+ alu2.getApellido());
    }
}
