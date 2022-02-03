package polimorfismo;
public class TestAnimales {
    public static void main(String[] args) {

        Animal perro=new Perro("Boby",5,1);
        perro.realizarSonido();

        System.out.println("");

        Animal gato=new Gato("Misha",3,1);
        gato.realizarSonido();

        System.out.println("");

        Animal loro=new Loro("Pancho",1,1);
        loro.realizarSonido();
    }
}
