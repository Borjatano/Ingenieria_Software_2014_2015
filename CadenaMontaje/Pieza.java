package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public  class Pieza implements Elemento {



    @Override
    public Elemento prestate(ArrayList<Almacen> almacenes) throws ExcepcionNoPiezaNingunAlmacen {

        Elemento resultado = null;
        Boolean encontrado=false;

       try{

           for (int i = 0;!encontrado ; i++) {


               try{

                   resultado=  almacenes.get(i).dameElemento(this);
                   encontrado=true;


               }catch (ExcepcionNoPiezaAlmacen e){
                   //El almacen no tiene esa pieza, asique pasamos al siguiente

               }



           }

       }catch (IndexOutOfBoundsException e){//En ningun almacen hay esa pieza, se trata de alguna manera
           throw new ExcepcionNoPiezaNingunAlmacen("La fabrica no tiene la pieza en ningun almacen");
       }

        return resultado;
    }

    @Override
    public void almacenate(ArrayList<Almacen> almacenes) {//Provedor llama a este metodo

    }

    @Override
    public  Elemento algoritmo(ArrayList<Almacen> almacenes) {//Esto sera luego abstracto
        Elemento resultado=null;
        try {

            resultado=this.prestate(almacenes);


        } catch (ExcepcionNoPiezaNingunAlmacen error) {



        }

        return resultado;

    }

//GETTERS AND SETTERS

}



