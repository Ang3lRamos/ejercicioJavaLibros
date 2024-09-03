package books;
import books.Autor;
public class Libro {
    private String ISBN;
    private String nombre;
    private Float precio;
    private Autor autor;

    private Libro(){
    }
    public Libro(String ISBN, String nombre, Float precio, Autor autor){
        this.ISBN=ISBN;
        this.nombre=nombre;
        this.precio=precio;
        this.autor=autor;
    }

    public Libro(String nombre, Float precio){
        this.nombre=nombre;
        this.precio=precio;
    }


    public Float getprecio() {
        return precio;
    }



}
