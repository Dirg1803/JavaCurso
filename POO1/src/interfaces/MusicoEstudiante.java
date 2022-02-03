package interfaces;
public class MusicoEstudiante implements Musico, Estudiante{

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando programación");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Estoy cantando y tocando instrumentos musicales");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
    }
}
