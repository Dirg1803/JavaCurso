package abstraccion;

public class JugadorBasquet extends Jugador{
    public JugadorBasquet(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {

        System.out.println("El jugador del basquet " + nombre + " tiene " + edad + " años");
        System.out.println("Este jugador está en la cancha saltando con el balon");
    }
}
