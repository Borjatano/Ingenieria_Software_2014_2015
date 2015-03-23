package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public class CadenaMontaje {
    public Elemento fabricar(Producto p,ArrayList<Almacen> almacenes){

        return p.algoritmo(almacenes);

    }

}
