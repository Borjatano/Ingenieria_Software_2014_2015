package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 22/04/15.
 */
public class Fabrica {

    private Almacen almacen;

    public Fabrica(Almacen alf){this.almacen=alf;}

    public void fabricar(Elemento e){
        e.fabricar(almacen);

    }





    public static void main(String[] args) {

        ArrayList<Elemento> listaElementos=new ArrayList<Elemento>();
        Almacen al1=new Almacen(listaElementos);

        Proveedor p1 = new Proveedor(al1,10);

        ControlAbastecimiento c1= new ControlAbastecimiento(p1,10);
        ControlAbastecimiento c2= new ControlAbastecimiento(p1,20);

        Pieza pieza1= new Pieza(null);
        Pieza pieza2= new Pieza(null);


        al1.meteElemento(pieza1);
        al1.getLista().remove(pieza1);
        System.out.print(al1.getLista().isEmpty());

    }
}
