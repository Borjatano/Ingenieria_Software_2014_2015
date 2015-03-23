package cadena_de_montaje;

import processing.core.PApplet;

public class Pieza {

	 int disponibilidad;
	 String tipo;
	 PApplet parent;
	 
	 
	public Pieza(int disponibilidad, String tipo,PApplet p){
		this.disponibilidad=disponibilidad;
		this.tipo=tipo;
		this.parent=p;
	}
	
	public void prestate(String tipo1) /*throws Exception*/{
		if((this.disponibilidad > 0) /*&& (this.tipo == tipo1)*/)
			this.disponibilidad--;
		else if (this.disponibilidad==0);
		//throw new Exception("La pieza no se encuentra disponible");
		parent.text("la pieza" + tipo + "no se encuentra disponible", 400, 400);
	}
	
	public void almacenate(){
		this.disponibilidad++;
	}
	
}