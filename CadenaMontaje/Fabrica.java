package CadenaMontaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public class Fabrica {
    ArrayList<Almacen> almacenes;
    ArrayList<CadenaMontaje> cadenas;


    Fabrica(ArrayList<Almacen> almacenes,ArrayList<CadenaMontaje> cadenas){
        this.almacenes=almacenes;
        this.cadenas=cadenas;
    }

    public void fabricar(Producto p){
        //Por ahora
        cadenas.get(0).fabricar(p,almacenes);

    }



    public static void main(String[] args) throws IOException {
        BufferedReader linea = new BufferedReader(new InputStreamReader(System.in));

        //Producto y piezas existentes

        Pieza1 p1 = new Pieza1();
        Pieza2 p2 = new Pieza2();

        Producto1 prod1=new Producto1();



        CadenaMontaje c1= new CadenaMontaje();
        ArrayList<CadenaMontaje> cadenas= new ArrayList<CadenaMontaje>();
        cadenas.add(c1);

        ArrayList<Almacen> almacenes = new ArrayList<Almacen>();

        //Almacenes a probar y su contenido


        ArrayList<Elemento> contenidoA1 = new ArrayList<Elemento>();

        for (int i = 0; i < 2; i++) {
            contenidoA1.add(p1);
            contenidoA1.add(p2);
        }
        Almacen a1 = new Almacen(contenidoA1);


        //Asignamos los almacenens a la fabrica
        almacenes.add(a1);

        Fabrica f1 = new Fabrica(almacenes,cadenas);


        boolean fin = false;

        while(!fin){//Una guarreria peeeeeeero

            System.out.print("¿Desea fabricar el producto1? - [SI,NO]");
            String respuesta = linea.readLine();
            if(respuesta.equals("NO")){fin = true;}
            else{
                System.out.println("El almacen ahora mismo contiene "+almacenes.get(0).contenido.size()+" piezas");
                f1.fabricar(prod1);

            }



        }


    }


}


/*
* Poner algoritmoFabricar que solo fabrique
* y que fabrica lo guarde en almacen
* */
