package complejos;
public class NumeroComplejo {

    // Creamos los atributos de un numero complejo
    private double parteReal; //Parte real
    private double parteImaginaria; //Parte imaginaria

    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    //creamos el metod para calcular la suma de numeros complejos
    public NumeroComplejo calcularSuma(NumeroComplejo numero){
        NumeroComplejo suma=new NumeroComplejo(parteReal+ numero.getParteReal(),
                parteImaginaria + numero.getParteImaginaria());
        return suma;
    }

    public  NumeroComplejo calcularProducto(NumeroComplejo numero){
        NumeroComplejo multiplicacion=new NumeroComplejo((parteReal * numero.getParteReal()
                - parteImaginaria * numero.getParteImaginaria()),
                (parteReal * numero.getParteImaginaria() + numero.getParteReal() * parteImaginaria));
                return multiplicacion;
    }

    //creamos el motodo para comprobar igualdad
    public boolean comprobarIgualdad(NumeroComplejo numero){
        boolean igualdad=false;
        if ((parteReal == numero.getParteReal()) && (parteImaginaria == numero.parteImaginaria))
            igualdad=true;
        return igualdad;
    }

    //metodo para calcular el producto por el entero por complejo
    public NumeroComplejo multiplicarPorEntero(int numero){
        NumeroComplejo multiplicacion=new NumeroComplejo(parteReal*numero,
                parteImaginaria*numero);
        return multiplicacion;
    }

}
