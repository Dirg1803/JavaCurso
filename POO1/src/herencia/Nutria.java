package herencia;

import org.w3c.dom.ls.LSOutput;

public class Nutria extends Animal{

    public Nutria(String nombre, int id, int edad) {
        super(nombre, id, edad); //la palabra super
    }

    @Override //hace refrencia a que voy a transcribir un metodo de la clase padre, un metodo que estoy heredando
    public void comer() {
        System.out.println("La nutria come peces");
        System.out.println("El nombre de la nuutria es : " + nombre);
        System.out.println("el ID de la nutria es : " +id);
        System.out.println("La edad de la nutria es : " + edad);
    }

    public void nadar(){
        System.out.println("La nutria está nadando");
    }
}
