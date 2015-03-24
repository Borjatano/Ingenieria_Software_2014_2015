package CadenaMontaje;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public class Almacen {

    public ArrayList<Elemento> contenido;
    //int capacidad;

    Almacen(ArrayList<Elemento> contenido){this.contenido=contenido;}

    public Elemento dameElemento(Elemento e) throws ExcepcionNoPiezaAlmacen {




        for (Elemento i:contenido) {

            if (i.getClass().equals(e.getClass())){
                contenido.remove(i);
                return i;

            }

        }

        //TODO LO SIGUIENTE SE VA A CAMBIAR


        if(e instanceof Pieza){
            System.out.println("No tenemos la pieza:" +  " necesarias en el almacen");
        //Guarrerida maxima
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Desea pedir pieza al proveedor?- [SI,NO]");
        try {
            String respuesta = linea.readLine();
            if(respuesta.equals("SI")){contenido.add(e);}
        } catch (IOException e1) {}


        }



        throw new ExcepcionNoPiezaAlmacen("No tenemos esa pieza");


    }


    public void almacena(Elemento e) /*throws ExcepcionAlmacenLleno*/{

        contenido.add(e);

    }





   //GETTERS Y SETTERS

    public ArrayList<Elemento> getContenido(){return contenido;}


}
