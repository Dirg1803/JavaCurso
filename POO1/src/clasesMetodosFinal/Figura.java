package clasesMetodosFinal;
public class Figura {

    protected double tamano;

    public void dibujar(){
        System.out.println("Dibujando figura");
    }

    public void pintar(){
        System.out.println("Pintando figura");
    }

    public Figura(double tamano) {
        this.tamano = tamano;
    }
}
