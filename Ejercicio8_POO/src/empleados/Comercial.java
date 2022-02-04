package empleados;
public class Comercial extends Empleado{

    private double comision;

    public Comercial(double comision,String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision=comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Comision = " + comision;
    }

    @Override
    public boolean plus(){
        if (super.getEdad() >= 30 && this.comision > 200){
            double nuevoSalario= super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("\nSe le ha añadido el PLUS al empleado " + super.getNombre());
            System.out.println("Su salario actual es " + nuevoSalario);
            return true;
        }else{
            System.out.println("\nEl empleado no cumple con los requisitos para el PLUS");
            return false;
        }
    }
}
