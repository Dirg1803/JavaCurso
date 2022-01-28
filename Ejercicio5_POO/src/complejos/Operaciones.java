package complejos;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        NumeroComplejo primerNumero,segundoNumero;
        double a,b,c,d;
        int opcion, numeroEntero;

        NumeroComplejo suma,multiplicacion;

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Sumar 2 numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comprobar igualdad de 2 numeros complejos");
            System.out.println("4. Multiplicar entero por complejo");
            System.out.println("5. Salir");
            System.out.print("Digite una opción: ");
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("\nDigite la parte real del primer numero complejo : ");
                    a=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del primer numero complejo : ");
                    b=teclado.nextDouble();

                    System.out.print("\nDigite la parte real del segundo numero complejo : ");
                    c=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del segundo numero complejo : ");
                    d=teclado.nextDouble();

                    primerNumero=new NumeroComplejo(a,b);
                    segundoNumero=new NumeroComplejo(c,d);

                    suma = primerNumero.calcularSuma(segundoNumero);
                    System.out.println("\nLa suma es : " + suma.getParteReal()+ " + " + suma.getParteImaginaria()+"i");
                    break;
                case 2:
                    System.out.print("\nDigite la parte real del primer numero complejo : ");
                    a=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del primer numero complejo : ");
                    b=teclado.nextDouble();

                    System.out.print("\nDigite la parte real del segundo numero complejo : ");
                    c=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del segundo numero complejo : ");
                    d=teclado.nextDouble();

                    primerNumero=new NumeroComplejo(a,b);
                    segundoNumero=new NumeroComplejo(c,d);

                    multiplicacion=primerNumero.calcularProducto(segundoNumero);
                    System.out.println("\nLa multiplicacion es : " + multiplicacion.getParteReal()+ " + " + multiplicacion.getParteImaginaria() + "i");
                    break;
                case 3:
                    System.out.print("\nDigite la parte real del primer numero complejo : ");
                    a=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del primer numero complejo : ");
                    b=teclado.nextDouble();

                    System.out.print("\nDigite la parte real del segundo numero complejo : ");
                    c=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del segundo numero complejo : ");
                    d=teclado.nextDouble();

                    primerNumero=new NumeroComplejo(a,b);
                    segundoNumero=new NumeroComplejo(c,d);

                    if ((primerNumero.comprobarIgualdad(segundoNumero)) == true){
                        System.out.println("\nLos numeros son iguales");
                    }else{
                        System.out.println("\nLos numeros NO son iguales");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite la parte real del numero complejo : ");
                    a=teclado.nextDouble();

                    System.out.print("\nDigite la parte imaginaria del numero complejo : ");
                    b=teclado.nextDouble();

                    System.out.println("\nDigite el numero entero");
                    numeroEntero= teclado.nextInt();

                    primerNumero=new NumeroComplejo(a,b);
                    multiplicacion=primerNumero.multiplicarPorEntero(numeroEntero);
                    System.out.println("\nLa multiplicación es : " + multiplicacion.getParteReal() + " + " +
                            multiplicacion.getParteImaginaria() + "i");
                    break;
                case 5:
                    System.out.println(" \nGracias por participar ");
                    break;
                default:
                    System.out.println("\nOpción no disponible, vuelva a intentar");
                    break;

            }

        }while (opcion!=5);

    }
}
