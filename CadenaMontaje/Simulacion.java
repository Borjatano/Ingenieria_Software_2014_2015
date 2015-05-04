package CadenaMontaje;

import java.util.ArrayList;

public class Simulacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Elemento> stock = new ArrayList<Elemento>();
		Almacen alm=new Almacen(stock);
		Fabrica f=new Fabrica(alm);
		Proveedor prov=new Proveedor(alm,5);
		ControlAbastecimiento control=new ControlAbastecimiento(prov,1);//No tiene cantidad minima, no repone automaticamente
		Pieza ojo =new Pieza(control);
		Pieza boca =new Pieza(control);
		Pieza craneo =new Pieza(control);
		Pieza brazo =new Pieza(control);
		Pieza mano =new Pieza(control);
		Pieza pecho =new Pieza(control);
		Pieza abdomen =new Pieza(control);
		Pieza pierna =new Pieza(control);
		Pieza pie =new Pieza(control);
		stock.add(ojo);
		stock.add(ojo);
		stock.add(boca);
		stock.add(craneo);
		stock.add(brazo);
		stock.add(mano);
		stock.add(brazo);
		stock.add(mano);
		stock.add(pecho);
		stock.add(abdomen);
		stock.add(pierna);
		stock.add(pie);
		stock.add(pierna);
		stock.add(pie);


		//Producto cabeza
		ArrayList<Elemento> montajeCabeza = new ArrayList<Elemento>();
		montajeCabeza.add(ojo);
		montajeCabeza.add(ojo);
		montajeCabeza.add(boca);
		montajeCabeza.add(craneo);
		ModoMontaje modoCabeza=new ModoMontaje(montajeCabeza);
		Producto cabeza=new Producto(modoCabeza);

		//Producto ES
		ArrayList<Elemento> montajeBrazo = new ArrayList<Elemento>();
		montajeBrazo.add(brazo);
		montajeBrazo.add(mano);
		ModoMontaje modoBrazo=new ModoMontaje(montajeBrazo);
		Producto extremidadSuperior=new Producto(modoBrazo);


		//Producto tronco
		ArrayList<Elemento> montajeAbdomen = new ArrayList<Elemento>();
		montajeAbdomen.add(ojo);
		montajeAbdomen.add(ojo);
		montajeAbdomen.add(boca);
		montajeAbdomen.add(craneo);
		ModoMontaje modoAbdomen=new ModoMontaje(montajeAbdomen);
		Producto tronco=new Producto(modoAbdomen);

		//Producto EInferior
		ArrayList<Elemento> montajePierna = new ArrayList<Elemento>();
		montajePierna.add(pie);
		montajePierna.add(pierna);
		ModoMontaje modoPierna=new ModoMontaje(montajePierna);
		Producto extremidadInferior=new Producto(modoPierna);


		//Producto Final ROBOT
		ArrayList<Elemento> montajeRobot = new ArrayList<Elemento>();
		montajeRobot.add(cabeza);
		montajeRobot.add(tronco);
		montajeRobot.add(extremidadSuperior);
		montajeRobot.add(extremidadSuperior);
		montajeRobot.add(extremidadInferior);
		montajeRobot.add(extremidadInferior);
		ModoMontaje modoRobot=new ModoMontaje(montajeRobot);
		Producto robot=new Producto(modoRobot);

		
		//Ver stock al principio
		System.out.println(stock.size());
		
		//Pureba producto cabeza


		//Fabrica 1 cabeza
		System.out.println("Se inicia la fabricacion de cabesitas");
		f.fabricar(cabeza);
		System.out.println(stock.size());


		//Fabrica 2 brazos
		System.out.println("Se inicia la fabricacion de extremidades superiores");
		f.fabricar(extremidadSuperior);
		System.out.println(stock.size());
		f.fabricar(extremidadSuperior);
		System.out.println(stock.size());

		//Fabrica 1 tronco
		System.out.println("Se inicia la fabricacion de tronco");
		f.fabricar(tronco);
		System.out.println(stock.size());


		//Fabrica 2 piernas
		System.out.println("Se inicia la fabricacion de extremidades inferiores");
		f.fabricar(extremidadInferior);
		System.out.println(stock.size());
		f.fabricar(extremidadInferior);
		System.out.println(stock.size());

		//Fabrica 2 robot
		System.out.println("Se inicia la fabricacion de robot");
		f.fabricar(robot);
		System.out.println(stock.size());
		System.out.println("Deberia mantenerse, el segundo roboto no se deberia hacer");
		f.fabricar(robot);
		System.out.println(stock.size());


		//Parece que funciona todo correctamente


	}

}
