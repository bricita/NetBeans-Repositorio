import java.util.ArrayList;

public class LibroController {
    private ArrayList<Libro>
            libro = new ArrayList<>();
    
    public void agregarLibro(Libro l){
        libro.add(l);
    }
    
    public void listarLibro(){
        for (Libro l : libro) {
            System.out.println(l.toString());
        }
    }
    
    public void prestarLibros(String isbn){
        
    }
    
    public void devolverLibro(String isbn){
        
    }
}
