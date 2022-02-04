package empleados;
public class Repartidor extends Empleado{

    private String zona;

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona=zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "La zona : " + zona;
    }

    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("Lima")){
            double nuevoSalario= super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("\nSe ha añadido el PLUS al repartidor " + getNombre());
            System.out.println("Su salario actual es : " + nuevoSalario);
            return  true;
        }else {
            System.out.println(" No cumple con los requisitos necesarios");
            return false;
        }
    }
}
