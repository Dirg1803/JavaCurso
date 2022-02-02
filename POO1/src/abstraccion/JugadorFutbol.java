package abstraccion;
public class JugadorFutbol extends Jugador{
    public JugadorFutbol(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {
        System.out.println("El jugador del futbol " + nombre + " tiene " +edad + " años");
        System.out.println("Este jugador está en la cancha patiando el balon");
    }
}
