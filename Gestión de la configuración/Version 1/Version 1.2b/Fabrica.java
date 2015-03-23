package cadena_de_montaje;
import processing.core.*;

public class Fabrica {
	
	
	/* POSIBLE OBJETO, NO PARECE NECESARIO
	 * guarda las caracteristicas del modelo (tipo piezas, tiempos produccion, que piezas forman que...)
	 * private Caracteristicas cara;
	 * cara.tipos;
	 * cara.tiempos;tal vez los tiempos se pueden guardar con las piezas, y no hace falta
	 * cara.procesos; (array de matrices, [  [ [entrantes1],[salida1] ]   ,   [ [entrantes2], [salida2] ]   ])
	*/
	
	//Almacenes, el mismo almacen puede aparecer en ambas listas
	private Almacen[] almacenes;//Se obtienen piezas necesarias
	private Almacen[] destino;//Se almacenan piezas producidas
	private Almacen almacen;//almacen para el caso sencillo
	
	//Tipos de piezas, 1 y 2 producen 3
	private static final String tipo1 = "1";
	private static final String tipo2 = "2";
	private static final String tipo3 = "3";
	
	//Atributos para la parte grafica
	PApplet parent;
	
	//Constructor, requiere las listas de los almacenes de los que recibe y envia
	/*public Fabrica(Almacen[] a1, Almacen[] a2){
		this.almacenes=a1;
		this.destino=a2;
	}*/
	
	//Constructor sencillo, solo requiere un almacen
	public Fabrica(Almacen a1){
		this.almacen=a1;
	}
	
	
	public boolean overbox_producir(){
		boolean flag=false;
		if(parent.mouseX>=300&&parent.mouseX<=350&&parent.mouseY>=300&&parent.mouseY<=350){    //((parent.mouseX>aux.getX())&&(parent.mouseX<(aux.getX()+10)))&&((parent.mouseY>aux.getY())&&(parent.mouseY<(aux.getY()+10)))
			flag=true;
			return flag;}
		else return flag;
	}
	
	public void fabricar(){
		Pieza p1, p2;
		String producto=tipo3;
		p1=solicitar(tipo1);
		p2=solicitar(tipo2);
		
		// CASO DE ERROR q no haya piezas  //////
		
		producir(p1, p2, producto);
		//producto.almacenar(destino);	Se almacena ella sola dandole una lista de Almacenes destino creados originalmente
		//almacenar(producto);
	}
	
	private Pieza solicitar(String tipo){
		Pieza fin=null;
		Pieza res=null;
		//Mas adelante cuando haya mas almacenes
		/*for(int i=0; i<almacenes.length && !fin ; i++){
			res=almacenes[i].damePieza();
			fin=res.prestate(tipo);
		
		}	*/
		//Ahora que solo hay un almacen
		res=almacen.damePieza(tipo);
		res.prestate(tipo);
		return res;
	}
	
	private void producir(Pieza p1, Pieza p2, String tipo_producto){
		String tipo=tipo_producto;
		Pieza res=null;
		res=almacen.damePieza(tipo);
		//producto=solicitarPiezaProducto(tipo); producto.validate();/
		// for(int i=0;i<almacene.lista piezas.length;i++){ 
		//if proucto==almacenes.listapiezas.tipo[i]..
		res.almacenate();
		// else "esa pieza no se puede producir
		
	}
	
	
	////////////////////////////////////
	/*private void almacenar(Pieza p1){
		boolean fin=false;
		for(int i=0; i<destino.length && !fin ; i++){
			fin=p1.almacenate(destino[i]);
		} 
		
	}*/
	
	/* 
	 * POSIBLE IMPLEMENTACIÓN POSTERIOR, FABRICA ENGLOBA VARIAS CADENAS DE MONTAJE (QUE ES UNA CLASE NUEVA, QUE HARIA LA FUNCION DE fabrica())
	 * CADA UNA CON UN PROCESO (PIEZA1+PIEZA2=PIEZA3) DISTINTO (O NO),  
	 * 
	 * cadenaMontaje[] cadenas=new cadenaMontaje[cara.procesos.length];
	 * 
	 * public void fabricar(){
	 * for(int i=0; i<Cara.procesos.length; i++){
	 *  	cadenas[i]=cadenaMontaje(almacenes, destino, cara.procesos[i], cara.tiempos[i])
	 * }
	 * for(int i=0; i<cadenas.length; i++){
	 * 		cadenas[i].start();
	 * }
	 * 
	 * public class cadenaMontaje{
	 * public Strin[][][] procesos
	 * 
	 * void start();
	 * }
	*/

}
