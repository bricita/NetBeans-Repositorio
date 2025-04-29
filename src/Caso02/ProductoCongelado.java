
package Caso02;

public class ProductoCongelado extends Producto {
    private double temperaturaDeCongelacion;
    
    public ProductoCongelado(){}
    
    public ProductoCongelado(String nombre, String fecha, int numeroLote, double temperatura)
    {
        super(nombre,fecha,numeroLote);
        this.temperaturaDeCongelacion = temperatura;
        
    }

    public double getTemperaturaDeCongelacion() {
        return temperaturaDeCongelacion;
    }

    public void setTemperaturaDeCongelacion(double temperaturaDeCongelacion) {
        this.temperaturaDeCongelacion = temperaturaDeCongelacion;
    }
    @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+
                "Fecha de Caducidad: "+ this.getFechaDeCaducidad()+
                "Número de Lote: "+ this.getNumeroLote()+
                "Temperatura de congelación: " + this.getFechaDeCaducidad();
        
    }
}
