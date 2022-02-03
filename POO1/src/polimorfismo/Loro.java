package polimorfismo;
public class Loro extends Animal{

    public Loro(String nombre, int edad, int tamaño) {
        super(nombre, edad, tamaño);
    }

    @Override
    public void realizarSonido() {
        System.out.println("El loro : " + nombre + " tiene : " + edad + "años y mide : " + tamaño);
        System.out.println("El Loro dice cri cri cri");
    }
}
