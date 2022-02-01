package agenda;
public class Contacto {
    //Creamos los atributos del contactos
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public  boolean equals(Contacto contacto){
        if (nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return  "\nnombre='" + nombre + '\'' +
                ", \ntelefono=" + telefono +
                '}';
    }
}
