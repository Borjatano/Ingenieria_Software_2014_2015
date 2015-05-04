package CadenaMontaje;

/**
 * Created by migueldelgadopineda on 28/04/15.
 */
public class Proveedor {

    private Almacen almacen;
    private int cantidadQueProvee;

    public Proveedor(Almacen al,int c){

        this.almacen=al;
        this.cantidadQueProvee=c;
    }

    public void provee (Elemento e){//Provee de elemento e el almacen una cantidad de veces

        for (int i = 0; i < this.cantidadQueProvee; i++) {

            almacen.meteElemento(e);

        }

    }

}
