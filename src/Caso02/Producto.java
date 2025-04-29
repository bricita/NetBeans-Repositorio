
package Caso02;

public class Producto {
    protected String nombre;
    protected String fechaDeCaducidad;
    protected int numeroLote;
    public Producto(){
        
    }
    public Producto(String nombre, String fecha, int numeroLote){
        this.nombre = nombre;
        this.fechaDeCaducidad = fecha;
        this.numeroLote = numeroLote;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    @Override
    public String toString(){
        return "Nombre: "+ this.getNombre()+
                "Fecha de Caducidad: "+ this.getFechaDeCaducidad()+
                "Número de Lote: "+ this.getNumeroLote();
    }
}
