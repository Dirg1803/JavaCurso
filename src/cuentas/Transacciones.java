package cuentas;

import java.util.Scanner;

public class Transacciones {

    //creamos un metodo para busca el numero de cuenta
    public static int buscarNumeroDeCuenta(Cuenta cuentas[],int numeroDeCuentaAbuscar){
        int indice=0;
        int iterador=0;
        boolean numeroDeCuentaEncontrada=false;

        while ((iterador<cuentas.length) && (numeroDeCuentaEncontrada==false)){
            if (cuentas[iterador].getNumeroCuenta() == numeroDeCuentaAbuscar){
                numeroDeCuentaEncontrada=true;
                indice=iterador;
            }
            iterador++;
        }

        if (numeroDeCuentaEncontrada == false){
            indice=-1;
        }

        return indice;
    }

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        String nombre,apellido,dni;
        Cuenta cuentas[];
        Cliente cliente;
        int numeroCuenta, cantidadCuentas, opcion, indiceNumeroCuenta;
        double saldo, cantidadDinero;

        //pedimos los datos delc cliente
        System.out.print("Digite el nombre del cliente : ");
        nombre=teclado.next();

        System.out.print("Digite el appelido del cliente : ");
        apellido= teclado.next();

        System.out.print("Digite el DNI del cliente : ");
        dni= teclado.next();

        System.out.print("\nDigite la cantidad de cuentas que tiene el cliente : ");
        cantidadCuentas= teclado.nextInt();

        System.out.println("");

        cuentas=new Cuenta[cantidadCuentas];

        //rellenamos las cuentas
        for (int i=0;i<cuentas.length;i++){
            System.out.println("\nDigite la " + (i+1) + "° cuenta : ");
            System.out.print("Digite el numero de cuenta : ");
            numeroCuenta= teclado.nextInt();

            System.out.println("Digite el saldo de la cuenta : ");
            saldo= teclado.nextDouble();
            System.out.println("");
            cuentas[i]=new Cuenta(numeroCuenta,saldo);
        }
        cliente=new Cliente(nombre,apellido,dni,cuentas);

        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Ingresar saldo a la cuenta");
            System.out.println("2. Retirar saldo a la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Digite una opción : ");
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    //consultar
                    System.out.println("\nDigite el numero de cuenta : ");
                    numeroCuenta= teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas,numeroCuenta);

                    if (indiceNumeroCuenta == -1){
                        System.out.println("\nCuenta no encontrada, verifique su numero de cuenta");
                    }else {
                        System.out.println("Digite la cantidad de dinero a depositar : ");
                        cantidadDinero= teclado.nextDouble();

                        cliente.ingresarDinero(indiceNumeroCuenta, cantidadDinero);
                        System.out.println("\nDeposito con exito");
                        System.out.println("\nSaldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }
                    break;
                case 2:

                    System.out.println("\nDigite el numero de cuenta : ");
                    numeroCuenta= teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas,numeroCuenta);

                    if (indiceNumeroCuenta == -1){
                        System.out.println("\nNo existe una cuenta con ese numero");
                        System.out.println("");
                    }else{
                        System.out.print("\nDigite la cantidad de dinero a retirar : ");
                        cantidadDinero= teclado.nextDouble();
                        if (cliente.consultarSaldo(indiceNumeroCuenta)<cantidadDinero){
                            System.out.print("Saldo insuficiente");
                            System.out.println();
                        }else{
                            cliente.retirarDinero(indiceNumeroCuenta,cantidadDinero);
                            System.out.println("Retiro con exito");
                            System.out.println("Saldo disponible de la cuenta : " + cliente.consultarSaldo(indiceNumeroCuenta));
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDigite el numero de cuenta : ");
                    numeroCuenta= teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas,numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nNo existe una cuenta con ese numero");
                        System.out.println("");
                    }else{
                        System.out.println("Saldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }
                    break;
                case 4:
                    //salir
                    System.out.println("Gracias por participar");
                    opcion=4;
                    break;
                default:
                    System.out.println("Opcion no disponible, vuelva a digitar");
                    break;
            }
        }while (opcion != 4);
    }

}
