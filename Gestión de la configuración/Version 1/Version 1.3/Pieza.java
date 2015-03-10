package cadena_de_montaje;

import processing.core.PApplet;

public class Pieza {

	 private int disponibilidad;
	 private String tipo;
	 private PApplet parent;
	 
	 
	public Pieza(int disponibilidad, String tipo,PApplet p){
		this.disponibilidad=disponibilidad;
		this.tipo=tipo;
		this.parent=p;
	}
	
	public int getDisponibilidad() {
		return disponibilidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void prestate(String tipo1) throws Exception{
		if( this.disponibilidad>0 && this.tipo.equals(tipo1) )
			this.disponibilidad--;
		else /*if (this.disponibilidad==0)*/{
			//parent.text("la pieza" + tipo + "no se encuentra disponible", 400, 400);
			throw new Exception();
		}
	}

	public void almacenate(){
		this.disponibilidad++;
	}
	
}