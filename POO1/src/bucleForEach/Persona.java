package bucleForEach;
public class Persona {

    private String nombre;
    private String apellido;
    private  int edad;
    private int dni;

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad : " + edad);
        System.out.println("DNI : " + dni);
    }
}
