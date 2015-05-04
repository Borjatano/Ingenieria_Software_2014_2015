package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 28/04/15.
 */
public class ModoMontaje {

    private ArrayList<Elemento> listaComponentes;
    //Fabrica fabrica;

    public ModoMontaje(ArrayList<Elemento> listaComponentes){this.listaComponentes=listaComponentes;}


    public  void obtencion(Almacen alf) throws ExcepcionNoPiezaAlmacen {

        ArrayList<Elemento> conseguidos=new ArrayList<Elemento>();

       try{//Intenta que todos sus productos se presten

           for (int i = 0; i <this.listaComponentes.size() ; i++) {
               conseguidos.add(this.listaComponentes.get(i).prestate(alf));
           }



       }catch (ExcepcionNoPiezaAlmacen e){//Si no tienemos algun producto o pieza en almacen, hacemos que se devuelvan todos los que se habian prestado

           for (int i = 0; i < conseguidos.size(); i++) {
               conseguidos.get(i).almacenate(alf);
           }

           throw new ExcepcionNoPiezaAlmacen("");

       }



    }

}


/**
 *
 *
 public abstract class  ModoMontaje {

 private ArrayList<Elemento> listaComponentes;
 //Fabrica fabrica;

 public ModoMontaje(ArrayList<Elemento> listaComponentes){this.listaComponentes=listaComponentes;}


 public abstract void obtencion(Almacen alf);//Y si hacemos que ModoMontaje sea una clase unica?Porque las subclases hacen lo mismo xD

 }
 *
 *
 * **/
