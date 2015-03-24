package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public class Producto1 extends Producto {

    //ArrayList<Elemento> componentes;

    Producto1(){
        componentes=new ArrayList<Elemento>();

        componentes.add(new Pieza1());
        componentes.add(new Pieza2());
    }



    @Override
    public Elemento algoritmo(ArrayList<Almacen> almacenes) {

        try{

            this.prestate(almacenes);


        }catch (ExcepcionNoPiezaNingunAlmacen error){

            for(Elemento e:componentes){
                e.algoritmo(almacenes);

            }

        }
        //Producto1 p1=new Producto1();p1.almacenate(almacenes);

        //almacenes.get(0).almacena(this);// ¿Que pasa cuando hemos fabricado un producto?
        return this;

    }
}
