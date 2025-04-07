import java.util.ArrayList;

public class UsuarioController {
    private ArrayList <Usuario>
            usuario = new ArrayList<>();
    
    public void agregarUsuario(Usuario u){
        usuario.add(u);
    }
    
    public void listarUsuario(){
        for (Usuario u : usuario) {
            System.out.println(u.toString());
        }
    }
    
    public void actualizarEmail(int id, String nuevoEmail){
        
    }
    
    public void eliminarEmail(int id){
        
    }
}
