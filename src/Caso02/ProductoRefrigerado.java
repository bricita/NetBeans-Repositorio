
package Caso02;
public class ProductoRefrigerado extends Producto {
    private String codigoDigesa;
     public ProductoRefrigerado(){}
     public ProductoRefrigerado(String nombre, String fecha, int numeroLote, String CodigoDigesa){
         
        super(nombre,fecha,numeroLote);
        this.codigoDigesa  = CodigoDigesa;
        
     }

    public String getCodigoDigesa() {
        return codigoDigesa;
    }

    public void setCodigoDigesa(String codigoDigesa) {
        this.codigoDigesa = codigoDigesa;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+
                "Fecha de Caducidad: "+ this.getFechaDeCaducidad()+
                "Número de Lote: "+ this.getNumeroLote()+
                "Codigo digesa: " + this.getCodigoDigesa();
        
    }
    
}
