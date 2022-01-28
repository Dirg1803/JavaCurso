package tablero;

import java.util.Scanner;

public class Movimientos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int x,y,opcion,incremento=0;

        System.out.println("Digite la posición inicial de X : ");
        x=teclado.nextInt();

        System.out.println("Digite la posición inicial de Y : ");
        y=teclado.nextInt();

        Tablero tablero=new Tablero(x,y);
        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover a la derecha");
            System.out.println("3. Mover hacia abajo");
            System.out.println("4. Mover a la izquiera");
            System.out.println("5. Salir");
            System.out.print("Digite una opción : ");
            opcion = teclado.nextInt();

            if (opcion !=5){
                System.out.println("\nDigite el incremento o decremento de una coordenada : ");
                incremento= teclado.nextInt();
            }

            switch (opcion){
                case 1:
                    tablero.moverArriba(incremento);
                    break;
                case 2:
                    tablero.moverDerecha(incremento);
                    break;
                case 3:
                    tablero.moverAbajo(incremento);
                    break;
                case 4:
                    tablero.moverIzquierda(incremento);
                    break;
                case 5:
                    System.out.println("\nPosición actual (" + tablero.getX() + ") : (" + tablero.getY() + ")");
                    opcion=5;
                    break;
                default:
                    System.out.println("\nLa opción no existe vuelva a digitar");
                    break;
            }

            System.out.println("\nPosición actual (" + tablero.getX() + ") : (" + tablero.getY() + ")");

        }while (opcion != 5);
    }
}
