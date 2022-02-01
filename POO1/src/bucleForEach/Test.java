package bucleForEach;
public class Test {
    public static void main(String[] args) {

        //creamos el arreglo de objectos
        Persona personas[]=new Persona[4];
        personas[0]=new Persona("Diego","Rosales",30,12345);
        personas[1]=new Persona("Cesar","Rosales",26,54321);
        personas[2]=new Persona("Rubi","Lopez",25,67890);
        personas[3]=new Persona("Jade","Lopez",24,98765);

        for (Persona persona: personas) {
            persona.mostrarDatos();
            System.out.println("");
        }

    }
}
