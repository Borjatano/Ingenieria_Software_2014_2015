package CadenaMontaje;

import sun.jvm.hotspot.utilities.CPPExpressions;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public class Almacen {

    ArrayList<Elemento> contenido;
    //int capacidad;

    Almacen(ArrayList<Elemento> contenido){this.contenido=contenido;}

    public Elemento dameElemento(Elemento e) throws ExcepcionNoPiezaAlmacen {
        Elemento resultado=null;
        Boolean encontrado=false;

        for (Elemento i:contenido) {

            if (i.getClass().equals(e.getClass())){
                contenido.remove(i);
                return i;

            }

           // resultado = ;


        }
        throw new ExcepcionNoPiezaAlmacen("No tenemos esa pieza");


    }


    public void almacena(Elemento e) /*throws ExcepcionAlmacenLleno*/{

        contenido.add(e);

    }





    public static void main(String[] args)  {


    }


}
