package polimorfismo;
public abstract class Animal {

    protected String nombre;
    protected  int edad;
    protected int tamaño;

    public Animal(String nombre, int edad, int tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public abstract void realizarSonido();
}
