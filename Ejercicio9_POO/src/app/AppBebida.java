package app;

import java.util.Scanner;

public class AppBebida {
    public static void main(String[] args) {

        int matriz[][]=new int[2][3];
        System.out.println(matriz.length);

        Scanner teclado=new Scanner(System.in);
        Bebida bebida;
        Almancen almancen = new Almancen();
        int opcion;

        do {
            System.out.println("\n\tMENU DE OPCIONES");
            System.out.println("1. Agregar bebida");
            System.out.println("2. Eliminar bebida");
            System.out.println("3. Mostrar bebidas");
            System.out.println("4. Calcular el precio de las bebidas");
            System.out.println("5. Salir");
            System.out.println("Digite una opción: ");
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    double porcentajeAzucar;
                    boolean promocionAzucar;
                    double cantidadAzucar, precioAzucar;
                    String marcaAzucar;

                    System.out.println("\nDigite el porcentaje de la azucar :");
                    porcentajeAzucar=teclado.nextDouble();

                    System.out.println("Digite la promoción de la azucar: ");
                    promocionAzucar=teclado.nextBoolean();

                    System.out.println("Digite la cantidad de azucar: ");
                    cantidadAzucar= teclado.nextDouble();

                    System.out.println("Digite el precio de la azucar");
                    precioAzucar= teclado.nextDouble();

                    System.out.println("Digite la marca del azucar: ");
                    marcaAzucar= teclado.next();

                    bebida=new BebidaAzucarada(cantidadAzucar,precioAzucar,marcaAzucar,porcentajeAzucar,promocionAzucar);
                    almancen.agregarBebida(bebida);
                    System.out.println("");

                    String manantial;
                    double cantidadMineral, precioMinera;
                    String marcaMineral;

                    System.out.println("\nDigite la cantidad del mineral : ");
                    cantidadMineral= teclado.nextDouble();

                    System.out.println("Digite el precio del mineral");
                    precioMinera= teclado.nextDouble();

                    System.out.println("Digite la marca del mineral: ");
                    marcaMineral= teclado.next();

                    System.out.println("Digite el manantial del mineral");
                    manantial= teclado.next();

                    bebida=new BebidaMineral(cantidadMineral,precioMinera,marcaMineral,manantial);
                    almancen.agregarBebida(bebida);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\nDigite el ID de la bebida a eliminar");
                    int id= teclado.nextInt();

                    almancen.eliminarBebida(id);
                    break;
                case 3:
                    almancen.mostrarBebidas();
                    break;
                case 4:
                    System.out.println("\nEl precio total de las bebidas es: " + almancen.calcularprecioBebidas());
                    break;
                case 5:
                    System.out.println("Gracias por su visita");
                    opcion=5;
                    break;
                default:
                    System.out.println("La opción no existe, vuelve a digitar");
                    break;
            }
        }while (opcion !=5);

    }
}
