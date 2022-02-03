package polimorfismo;

public class Gato extends Animal{
    public Gato(String nombre, int edad, int tamaño) {
        super(nombre, edad, tamaño);
    }

    @Override
    public void realizarSonido() {
        System.out.println("El gato " + nombre + " con la edad de " + edad + " años y mide" + tamaño);
        System.out.println("El gato dice miao miao miao");
    }
}
