package cadena_de_montaje;

import java.util.Random;
import java.util.Arrays;


public class pruebas {




	public static void main(String[] args) {

		System.out.println("Iniciando pruebas\n");

		Random rand = new Random();

		System.out.println("Pasamos a las pruebas de Pieza:");

		testPieza(0, "tipo1");
		testPieza(1, "tipo1");
		testPieza(-1, "tipo1");
		for (int i=0; i<10; i++){
			int disp=rand.nextInt(101)-50;//desde -50 hasta 50 ambos inclusive
			testPieza(disp, "tipo1");
		}

		System.out.println("Fin de las pruebas de Pieza\n\n");
		
		System.out.println("Pasamos a las pruebas de Almacen:");
		
		Pieza p1 =new Pieza (2,"1",null);
		Pieza p2 =new Pieza (3,"2",null);
		Pieza producto=new Pieza (1,"3",null);
		Pieza [] listaPiezas = {p1,p2,producto};

		testAlmacen(listaPiezas);

	}




	private static void testPieza(int disponibilidad, String tipo){

		boolean res=true;

		Pieza a = new Pieza(disponibilidad,tipo, null);

		//PRUEBAS CREACION
		if (a.getDisponibilidad()!=disponibilidad){
			System.out.printf("Error al crear pieza con disponibilidad %d\n", disponibilidad);
			res=false;
		}
		if (!a.getTipo().equals(tipo)){
			System.out.printf("Error al crear pieza con tipo %s\n", tipo);
			res=false;
		}


		//PRUEBAS PRESTATE
		if (disponibilidad>0){
			try{
				a.prestate(tipo);
				if (a.getDisponibilidad()!=disponibilidad-1){
					System.out.printf("Error tras prestar la pieza se obtiene %d, y se esperaba %d\n", a.getDisponibilidad(), (disponibilidad-1));
					res=false;
				}
				if (!a.getTipo().equals(tipo)){
					System.out.printf("Error al prestar pieza se cambia el tipo, se obtiene %s y se esperaba %s\n",a.getTipo(), tipo);
					res=false;
				}
			}
			catch (Exception e){
				System.out.printf("Error al prestar pieza con disponibilidad %d y con tipo %s\n", disponibilidad, tipo);
				res=false;
			}

			try{
				a.prestate("tipoFalso");
				System.out.printf("Error al prestar pieza con tipo %s, pasandole tipo &s\n", tipo, "tipoFalso");
				res=false;
			}
			catch (Exception e){
				//CORRECTO
			}
		}

		else{
			try{
				a.prestate(tipo);
				System.out.printf("Error al prestar pieza con disponibilidad %d < 0\n", disponibilidad);
				res=false;
			}
			catch (Exception e){
				//CORRECTO
			}

			try{
				a.prestate("tipoFalso");
				System.out.printf("Error al prestar pieza disponibilidad %d < 0 y con tipo %s, pasandole tipo &s\n", disponibilidad, tipo, "tipoFalso");
				res=false;
			}
			catch (Exception e){
				//CORRECTO
			}
		}


		//PRUEBAS ALMACENATE
		a = new Pieza(disponibilidad,tipo, null);//se vuelve a crear

		a.almacenate();
		if (a.getDisponibilidad()!=disponibilidad+1){
			System.out.printf("Error tras almacenar la pieza se obtiene %d, y se esperaba %d\n", a.getDisponibilidad(), (disponibilidad+1));
			res=false;
		}
		
		if (res)
			System.out.printf("prueba Pieza(%d,%s)=correcta\n", disponibilidad, tipo);

	}
	
	private static void testAlmacen(Pieza[] piezas){
		
		Almacen a = new Almacen(piezas,null);
		boolean res=true;
		
		Pieza[] lista= new Pieza[piezas.length];
		//No tratado null, vacio...
		for (int i=0; i<piezas.length;i++){
			lista[i] = a.damePieza();
		}
		
		if(! Arrays.equals(lista, piezas)){
			System.out.println("No funciona correctamente, la lista almacenada no es la pasada");
			res=false;
		}
		
		
		Pieza ini = a.damePieza();
		
		if(ini.equals(lista[1])){
			System.out.println("No funciona correctamente el ciclo de piezas del almacen");
			res=false;
		}
		
		if(res)
			System.out.printf("prueba Almacen=correcta\n");
		
	}

}
