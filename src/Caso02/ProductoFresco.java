
package Caso02;

import java.util.ArrayList;

public class ProductoFresco extends Producto{
    private ArrayList<ProductoFresco>
            productoFresco = new ArrayList<>();
    
    private String fechaDeEnvasado;
    private String paisDeOrigen;
    
    public ProductoFresco(){
        
    }
    public ProductoFresco (String nombre, String fecha, int numeroLote, String fechaDeEnvasado,String paisDeOrigen ){
        super(nombre,fecha,numeroLote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
        
    }
    
    public String getFechaDeEnvasado(){
        return this.fechaDeEnvasado;
    }
    public String getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    public void setFechaDeEnvasado(String fechaDeEnvasado){
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
    @Override 
     public String toString(){
        return "Nombre: "+ this.getNombre()+
                "Fecha de Caducidad: "+ this.getFechaDeCaducidad()+
                "Número de Lote: "+ this.getNumeroLote()+
                "Fecha de envasado: " + this.getFechaDeEnvasado()+
                "Pais de origen: " + this.getPaisDeOrigen();
        
    }
}
