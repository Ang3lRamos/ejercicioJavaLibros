package books;

import books.Autor;
import books.Coleccion;
import books.Libro;

public class Instancias {
    public static void instanciaColeccion(){
        Autor a1=new Autor("Miguel Cervantes",2003);

        Libro lib1 = new Libro("123456789", "El perfume del rey",40.500F,a1);
        Libro lib2 = new Libro ("987654321","Las Cadenas del Rey",60.200F,a1);
        Libro lib3 = new Libro ("9876543210","El Corazon del Rey",65.400F,a1);
        Libro lib4 = new Libro ("0987654321","La Espada del Rey",70.100F,a1);
        Coleccion colec1=new Coleccion("Fantasia",lib1,lib2);
        Coleccion colec2 = new Coleccion("Romance", lib3, lib4);

        System.out.println("El promedio de las dos colecciones es: "+ (lib1.getprecio() + lib2.getprecio() + lib3.getprecio() + lib4.getprecio())/4+" pesos");
    }


}
