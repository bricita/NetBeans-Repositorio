
public class Usuario {
    public int id;
    public String nombre;
    public String email;
    public String nuevoEmail;
    
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
    public void setEmail(String e){
        this.email = e;
    }
    public String getEmail(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id =" + id + ", nombre =" + nombre + ", email =" + email + '}';
    }
}
