package app;
public class BebidaAzucarada extends Bebida{
    private double porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(double cantidad, double precio, String marca, double porcentaje, boolean promocion) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar=porcentaje;
        this.promocion=promocion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio() {
        if (isPromocion()){
            return super.getPrecio()*0.9;
        }else {
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPorcentaje Azucar : " + porcentajeAzucar +
                "\nPromoción : " + promocion;
    }
}
