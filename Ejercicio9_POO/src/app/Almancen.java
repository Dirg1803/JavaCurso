package app;
public class Almancen {

    private Bebida estanteria[][];

    //con este constructor le indicamos que le vamos a pasar un tamaño a nuestra matriz
    public Almancen(int fila, int columnas) {
        estanteria=new Bebida[fila][columnas];

    }

    //con este contrutor que nuestra matriz tiene un tamaño por defecto de 5*5
    public Almancen() {
        estanteria=new Bebida[5][5];
    }

    //creamos el metodo para agregar la bebida
    public void agregarBebida(Bebida bebida){
        boolean encontrado=false;
        for (int i=0;i<estanteria.length && !encontrado;i++){
            for (int j=0;j<estanteria[0].length && !encontrado;i++){
                if (estanteria[i][j]==null){
                    estanteria[i][j]=bebida;
                    encontrado=true;
                }
            }
        }
        if (encontrado){
            System.out.println("\nbebida añadida");
        }else {
            System.out.println("No se ha podido añadir la bebida");
        }
    }


    //creamos el metodo para calcular el precio de las bebidas
    public  double calcularprecioBebidas(){
        double precioTotal=0;
        for (int i=0;i<estanteria.length;i++){
            for (int j=0;j<estanteria[0].length;i++){
                if (estanteria[i][j] != null){
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }


    //creamos el metodo para mostrar las bebidas
    public void mostrarBebidas(){
        for (int i=0;i<estanteria.length;i++){
            for (int j=0;j<estanteria[0].length;i++){
                if (estanteria[i][j] != null){
                    System.out.println("\nfila : " + i + " - Columna : " + j +
                                    "\nBebida : " + estanteria[i][j].toString());
                }
            }
        }
    }


    //creamos el metodo para eliminar una bebida
    public void eliminarBebida(int id){
        boolean encontrado=false;
        for (int i=0;i<estanteria.length && !encontrado;i++){
            for (int j=0;j<estanteria[0].length && !encontrado;i++){
                if (estanteria[i][j] != null){
                    if (estanteria[i][j].getId()==id){
                        estanteria[i][j]=null;//Elimino el valor
                        encontrado=true;
                    }
                }
            }
        }

        if (encontrado){
            System.out.println("Bebida eliminada");
        }else{
            System.out.println("No se ha podido eliminar la bebida");
        }
    }
}
