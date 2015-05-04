package CadenaMontaje;

import java.util.ArrayList;

/**
 * Created by migueldelgadopineda on 28/04/15.
 */
public class Almacen {

    private ArrayList<Elemento> listaElementos;

    public Almacen (ArrayList<Elemento> listaElementos){this.listaElementos=listaElementos;}

    public Elemento dameElemento(Elemento e) throws ExcepcionNoPiezaAlmacen {
        //Veo imposible que el almacen no se mire a si mismo
    	Elemento resultado;
        //Como yo se hacerlo
    	int indice=listaElementos.indexOf(e);
        if(indice!=-1){
        	resultado=listaElementos.get(indice);
        	listaElementos.remove(indice);
        	return resultado;
        }
        else{throw new ExcepcionNoPiezaAlmacen("No tenemos esa pieza");}
        }

    public void meteElemento (Elemento e){

        listaElementos.add(e);


    }

    //GETTERS Y SETTERS

    public ArrayList<Elemento> getLista(){return this.listaElementos;}
    


}
