package herencia;
public class Perro extends Animal{

    public String colorPelo;

    public Perro(String nombre, int id, int edad) {
        super(nombre, id, edad);
    }


    @Override
    public void comer() {
        System.out.println("El perro come ricocan");
        System.out.println("El nombre de la perro es : " + nombre);
        System.out.println("el ID de la perro es : " +id);
        System.out.println("La edad de la perro es : " + edad);
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }

}
