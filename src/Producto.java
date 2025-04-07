//investigar tipo de datos y clase envolvente
//1, Crear clase
//2. Creo constructor
//3. Get /Set
//4. Crear toString
public class Producto {
    public int id;
    public String nombre;
    public double precio;
    public int stock;
    //constructor 
    public Producto(){    
    }
    public Producto(int cod, String nombre){
        this.id = cod;
        this.nombre = nombre;
    }
    public void setId(int x){
        this.id =x;
    }
    public int getId(){
        return this.id;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPrecio(double p){
        this.precio = p;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setStock (int s){
        this.stock = s;
    }
    public int getStock(){
        return this.stock;
    }
    @Override
    public String toString() {
        return "Producto{" + "id: " +
                id + ", nombre: "
                + nombre + ", precio: " 
                + precio + ", stock: " + 
                stock + '}';
    }
}
