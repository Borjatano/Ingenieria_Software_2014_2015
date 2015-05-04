package CadenaMontaje;

/**
 * Created by migueldelgadopineda on 28/04/15.
 */
public abstract class Elemento {


    public abstract Elemento fabricar (Almacen alf);

    public Elemento prestate(Almacen alf) throws ExcepcionNoPiezaAlmacen {
        //Elemento resultado = new Elemento();
        //Manda al almacen que le envie elementos hasta que se encuentre?Â¿Como sabe el tamaÃ±o del array del almacen?Â¿Cuando para?
        Elemento resultado;
        //Cambialo si sabes hacerlo de la otra forma
        try {
            resultado=alf.dameElemento(this);
            if(resultado instanceof Pieza){
            	((Pieza) resultado).controlarDisponibilidad(alf);
            }

            return resultado;
        } catch (ExcepcionNoPiezaAlmacen excepcionNoPiezaAlmacen) {
            //Si no esta ese elemento en el almacen, que mande un mensaje a pantalla?
            throw new ExcepcionNoPiezaAlmacen("");
        }




    }
    public void almacenate(Almacen alf){
        alf.meteElemento(this);
    }
}
