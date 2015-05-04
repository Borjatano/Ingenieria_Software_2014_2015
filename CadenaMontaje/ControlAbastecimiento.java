package CadenaMontaje;

/**
 * Created by migueldelgadopineda on 30/04/15.
 */
public class ControlAbastecimiento {



    private Proveedor proveedor;
    private int cantidadMinima;

    public ControlAbastecimiento (Proveedor p, int c){

        this.cantidadMinima=c;
        this.proveedor=p;

    }

    public void verDisponibilidad(Pieza p,Almacen alf){
        int contador=0;
        try{
        	while(true){

        		alf.dameElemento(p);
        		contador++;
        	}

        }catch (ExcepcionNoPiezaAlmacen e){

        	for (int i = 0; i < contador; i++) {
        		alf.meteElemento(p);
        	}

        }
        if(contador<cantidadMinima){
        	this.mandaProveer(p);
        }

    }

    public void mandaProveer(Elemento elemento){
        this.proveedor.provee(elemento);

    }

}
