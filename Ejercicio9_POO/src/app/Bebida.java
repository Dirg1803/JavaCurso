package app;
public class Bebida {

    private static int idActual=1;

    //creamos los atributos de la clase bebida

    private  int id;
    private double cantidad;
    private double precio;
    private String marca;

    public Bebida(double cantidad, double precio, String marca) {
        this.id=idActual ++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nID : " + id +
                "\nCantidad : " + cantidad +
                "\nPrecio : " + precio +
                "\nMarca : " + marca;
    }


}
