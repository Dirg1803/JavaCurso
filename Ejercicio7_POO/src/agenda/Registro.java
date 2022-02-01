package agenda;
import javax.swing.*;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        int tamanoAgenda;

        tamanoAgenda=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantida de contactos para su agenda :"));
        Agenda agendaTelefonica=new Agenda(tamanoAgenda);

        do {
            System.out.println("\n\tBienvenido a la Telefonica");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos ");
            System.out.println("3. Busca un contacto");
            System.out.println("4. Comprobar si existe un cotacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. comprobar contactos disponibles");
            System.out.println("7. comprobar si la agenda está llena");
            System.out.println("8. Salir");
            System.out.print("Digite una opción por favor : ");
            opcion=teclado.nextInt();

            switch (opcion){
                case 1:
                    //Añadimos un contacto
                    System.out.println("\nDigite su nombre : ");
                    nombre=teclado.next();

                    System.out.println("\nDigite su telefono : ");
                    telefono=teclado.nextInt();

                    contacto=new Contacto(nombre, telefono);
                    agendaTelefonica.anadirContacto(contacto);
                    System.out.println("");
                    break;
                case 2:
                    //listamos los contactos
                    agendaTelefonica.listarContactos();
                    System.out.println("");
                    break;
                case 3:
                    //buscar un contacto
                    System.out.print("\nDigite un nombre a buscar : ");
                    nombre= teclado.next();

                    agendaTelefonica.buscarContacto(nombre);
                    System.out.println("");
                    break;
                case 4:
                    //comprobar si un contacto existe
                    System.out.print("\nDigite su nombre :");
                    nombre= teclado.next();

                    contacto=new Contacto(nombre);
                    if (agendaTelefonica.comprobarSiExisteContacto(contacto)){
                        System.out.println("\nEl contacto existe");
                    }else{
                        System.out.println("\nEl contacto no existe");
                    }
                    break;
                case 5:
                    //Eliminamos un contacto
                    System.out.print("\nDigite su nombre");
                    nombre= teclado.next();

                    contacto=new Contacto(nombre);
                    agendaTelefonica.eliminarContacto(contacto);
                    System.out.println("");
                    break;
                case 6:
                    //Comprobar contactos disponibles
                    System.out.println("\nHay " + agendaTelefonica.comprobarSiHayHuecosLibres() + " lugares disponibles");
                    System.out.println("");
                    break;
                case 7:
                    //comprobamos si la agenda está llena
                    if (agendaTelefonica.comprobarSiLaAgendaEstaLlena()){
                        System.out.println("\nLa agenda está llena");
                    }else{
                        System.out.println("Aún puedes registrar un contacto");
                    }
                    break;
                case 8:
                    //Salir
                    System.out.println("Gracias por participar!!");
                    opcion=8;
                    break;
                default:
                    System.out.println("\nNo existe la opción digitada, por favor elija otra opción");
                    break;
            }
        }while (opcion != 8);
    }
}
