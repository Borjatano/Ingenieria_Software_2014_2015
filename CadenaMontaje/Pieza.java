package CadenaMontaje;

/**
 * Created by migueldelgadopineda on 30/04/15.
 */
public class Pieza extends Elemento {

    ControlAbastecimiento controlAbastecimiento;
    //Algo Para saber como se dibujan

    public Pieza(ControlAbastecimiento cA){this.controlAbastecimiento=cA;}

    @Override
    public Elemento fabricar(Almacen alf) {//Proveer

        this.controlAbastecimiento.mandaProveer(this);

        return this;
    }

    public void controlarDisponibilidad(Almacen alf){
    	this.controlAbastecimiento.verDisponibilidad(this,alf);
    }

}
