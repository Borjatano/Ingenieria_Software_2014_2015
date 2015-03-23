package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public interface Elemento {

    //private String tipo;
    //private boolean disponibilidad;

    public Elemento prestate(ArrayList<Almacen> almacenes) throws ExcepcionNoPiezaNingunAlmacen;

    public void almacenate(ArrayList<Almacen> almacenes);//se guarda en algun almacen.

    public Elemento algoritmo(ArrayList<Almacen> almacenes);

}
