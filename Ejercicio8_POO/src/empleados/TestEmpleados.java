package empleados;

import java.util.Scanner;

public class TestEmpleados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Comercial comercial;
        Repartidor repartidor;
        int opcion;

        do {
            System.out.println("\n\tPLUS DE EMPLEADOS");
            System.out.println("1. PLUS de comercial");
            System.out.println("1. PLUS de repartidor");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción : ");
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    String nombreComercial;
                    double salarioComercial,comision;
                    int edadComercial;

                    System.out.println("\nDigite el nombre del comercial");
                    nombreComercial= teclado.next();

                    System.out.println("Digite el salario del comercial");
                    salarioComercial= teclado.nextDouble();

                    System.out.println("Digite la comisión del comercial");
                    comision= teclado.nextDouble();

                    System.out.println("Digite la edad del comercial");
                    edadComercial= teclado.nextInt();

                    comercial = new Comercial(comision,nombreComercial,edadComercial,salarioComercial);
                    System.out.println(comercial.toString());
                    comercial.plus();


                    break;
                case 2:
                    String nombreRepartidor,zona;
                    double salarioRepartidor;
                    int edadRepartidor;

                    System.out.println("\nDigite el nombre del repartidor");
                    nombreRepartidor= teclado.next();

                    System.out.println("Digite el salario del repartidor");
                    salarioRepartidor= teclado.nextDouble();

                    System.out.println("Digite la edad del repartidor");
                    edadRepartidor= teclado.nextInt();

                    System.out.println("Digite la zona del repartidor");
                    zona= teclado.next();

                    repartidor =new Repartidor(zona,nombreRepartidor,edadRepartidor,salarioRepartidor);
                    System.out.println(repartidor.toString());
                    repartidor.plus();
                    break;
                case 3:
                    System.out.println("\n Gracias por participar");
                    opcion=3;
                    break;
                default:
                    System.out.println("Opción no disponible");
                    break;
            }
        }while (opcion !=3);
    }
}
