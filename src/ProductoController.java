import java.util.ArrayList;

public class ProductoController {
    private ArrayList<Producto> 
            productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
    }
    
    public void buscarProductoPorId(int id){
        
    }
}
