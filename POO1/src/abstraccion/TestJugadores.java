package abstraccion;
public class TestJugadores {
    public static void main(String[] args) {

        JugadorFutbol jugadorFutbol=new JugadorFutbol("Leonel Messi",32);
        jugadorFutbol.jugar();

        System.out.println("");

        JugadorBasquet jugadorBasquet= new JugadorBasquet("Michel Jordan",50);
        jugadorBasquet.jugar();
    }
}
