package CadenaMontaje;

/**
 * Created by migueldelgadopineda on 30/04/15.
 */
public class Producto extends Elemento {

    private ModoMontaje modoMontaje;

    public Producto (ModoMontaje mm){this.modoMontaje=mm;}


    @Override
    public Elemento fabricar(Almacen alf) {
        try {
            modoMontaje.obtencion(alf);
            System.out.println("Se ha producido un poducto");
            //Una vez se ha obtenido,manda dibujarse y se almacena
            //AQUI VA EL DIBUJARSE
            this.almacenate(alf);

        } catch (ExcepcionNoPiezaAlmacen excepcionNoPiezaAlmacen) {
            //excepcionNoPiezaAlmacen.printStackTrace();
            //Pasaria algo?
        }

        return this;
    }
}
