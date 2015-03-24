package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 17/03/15.
 */
public abstract class Producto implements Elemento{

    ArrayList<Elemento> componentes;

    @Override
    public Elemento prestate(ArrayList<Almacen> almacenes) throws ExcepcionNoPiezaNingunAlmacen {
        Elemento resultado = null;
        Boolean encontrado=false;


            for (int i = 0;i<almacenes.size()&&!encontrado ; i++) {


                try{

                    resultado= almacenes.get(i).dameElemento(this);
                    encontrado=true;


                }catch (ExcepcionNoPiezaAlmacen e){
                    //El almacen no tiene esa pieza, asique pasamos al siguiente

                }



            }

        if(!encontrado){throw new ExcepcionNoPiezaNingunAlmacen("No hay pieza en ningun almacen");}

        return resultado;
    }

    @Override
    public void almacenate(ArrayList<Almacen> almacenes) {
        Boolean almacenado=false;

        for (int i = 0; !almacenado; i++) {

            almacenes.get(i).almacena(this);
            almacenado=true;


        }



    }


    @Override
    public abstract Elemento algoritmo(ArrayList<Almacen> almacenes) ;




}
