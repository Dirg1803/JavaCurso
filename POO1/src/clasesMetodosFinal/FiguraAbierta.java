package clasesMetodosFinal;

public class FiguraAbierta extends Figura{


    public FiguraAbierta(double tamano) {
        super(tamano);
    }


    @Override
    public void pintar() {
        System.out.println("Pintando figura abierta del tamaño : " + tamano);

    }
}
