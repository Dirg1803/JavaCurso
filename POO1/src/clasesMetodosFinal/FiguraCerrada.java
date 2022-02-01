package clasesMetodosFinal;
public class FiguraCerrada extends Figura{

    public FiguraCerrada(double tamano) {
        super(tamano);
    }


    @Override
    public void pintar() {
        System.out.println("Pintando figura cerradadel tamaño : " + tamano);
    }
}
