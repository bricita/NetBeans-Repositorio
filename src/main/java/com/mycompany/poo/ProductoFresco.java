
package com.mycompany.poo;

public class ProductoFresco extends Producto{
    protected String fechaDeEnvasado;
    protected String paisDeOrigen;
    
    public ProductoFresco(String nombreP, String fechaP, int numeroP, String f, String p){
        super(nombreP, fechaP, numeroP);
        this.fechaDeEnvasado = f;
        this.paisDeOrigen = p;
    }
    
    public void setFechaDeEnvasado(String f){
        this.fechaDeEnvasado = f;
    }
    public String getFechaDeEnvasado(){
        return this.fechaDeCaducidad;
    }
    
    public void setPaisDeOrigen(String p){
        this.paisDeOrigen = p;
    }
    public String getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    
    @Override
    public String toString(){
        return "Producto Fresco {" + "Nombre: " + super.getNombre() + "fecha de caducidad:"
                + super.getFechaDeCaducidad() + "numero de lote: " + super.getNumeroDeLote()
                + "fecha de envasado: " + this.getFechaDeCaducidad() + "pais de origen: "
                + this.getPaisDeOrigen() + "}";
    }
}
