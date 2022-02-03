package polimorfismo;
public class Perro extends Animal{

    public Perro(String nombre, int edad, int tamaño) {
        super(nombre, edad, tamaño);
    }

    @Override
    public void realizarSonido() {
        System.out.println("El perro " + nombre + " tiene :" + edad + " años y mide : " + tamaño);
        System.out.println("El perro dice gua gua gua");
    }
}
