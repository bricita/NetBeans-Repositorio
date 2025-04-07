
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public boolean disponible;
    
    public void setIsbn(String x){
        this.isbn =x;
    }
    public String getIsbn(){
        return this.isbn;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setDisponible(boolean d){
        this.disponible = d;
    }
    public boolean getDisponible(){
        return this.disponible;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", disponible=" + disponible + '}';
    }
}
