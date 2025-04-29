
package com.mycompany.poo;

public class ProductoCongelado extends Producto {
    protected double temperaturaDeCongelacion;
    
    public ProductoCongelado(String nombreP, String fechaP, int numeroP, double temp){
        super(nombreP, fechaP, numeroP);
        this.temperaturaDeCongelacion = temp;
    }
    
    public void setTemperaturaDeCongelacion(double temp){
        this.temperaturaDeCongelacion = temp;
    }
    public double getTemperaturaDeCongelacion(){
        return this.temperaturaDeCongelacion;
    }
    
    @Override
    public String toString(){
        return "Producto Congelado {" + "nombre de producto: " + super.getNombre() 
                + "fecha de caducidad: " + super.getFechaDeCaducidad() + "Numero de lote: "
                + super.getNumeroDeLote() + "temperatura: " + this.getTemperaturaDeCongelacion() + "}";
    }
}
