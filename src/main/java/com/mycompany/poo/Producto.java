
package com.mycompany.poo;

public class Producto {
    protected String nombre;
    protected String fechaDeCaducidad;
    protected int numeroDeLote;
    
    public Producto(String n, String f, int l){
        this.nombre = n;
        this.fechaDeCaducidad = n;
        this.numeroDeLote = l;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFechaDeCaducidad(String f){
        this.fechaDeCaducidad = f;
    }
    public String getFechaDeCaducidad(){
        return this.fechaDeCaducidad;
    }
    
    public void setNumeroDeLote(int l){
        this.numeroDeLote = l;
    }
    public int getNumeroDeLote(){
        return this.numeroDeLote;
    }
    
    @Override
    public String toString(){
        return "Producto{" + "nombre: " + this.nombre + "fecha de caducidad: "
                + this.fechaDeCaducidad + "numero de lote: " + this.numeroDeLote + "}";
    }
}
