package cadena_de_montaje;

import java.util.ArrayList;


public class Almacen {

	private ArrayList<Pieza> listaPiezas = new ArrayList<Pieza>();
	
public Pieza damePieza(String tipo){

	try{//Busca una pieza dentro de su lista de Piezas
		boolean conseguido=false;
		Pieza resultado = null;

		for (int i = 0; !conseguido; i++) {


			try{ //Cuando encuentra una de su tipo deseado intenta prestarla

				listaPiezas.get(i).prestate(tipo);
				conseguido=true;
				resultado=listaPiezas.get(i);

			}
			catch (Exception e){//catch para el error de que esa pieza no sea del tipo o la disponibilidad sea 0//
			 }
		}
		return resultado;
	}
	catch (Exception e){ //Solo se llega aqui si hay un NullPointerException, que significa que ya hemos mirado todas las piezas y no hemos encontrado ninguna

		System.out.print("No tenemos esa pieza en el almacen");
		return null;

		}
	}
}


/*
*
*
*
//Como lo haria yo


try{

for (int i = 0; i<=listaPiezas.size() ; i++) {
	try{
		return listaPiezas.get(i).prestate(tipo);   //Para ello el metodo prestate deberia devolver la pieza es decir, a si mismo

	}
	catch(){
		//Aqui llega cada vez k la pieza no sea del tipo o no este disponible
	}

}
}

catch(){
//Aqui llega cuando hay nullpointer excp , es decir, no hay esa pieza en almacen
}


*
* */
