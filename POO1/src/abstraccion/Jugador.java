package abstraccion;
public abstract class Jugador {
    protected String nombre;
    protected int edad;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hablar(){
        System.out.println("Estoy hablando");
    }

    //creamos nuestro metodo abstracto
    public abstract void jugar();
}
