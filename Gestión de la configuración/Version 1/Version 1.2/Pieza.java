package cadena_de_montaje;
public class Pieza {

	private int disponibilidad;
	private String tipo;
	
	public Pieza(int disponibilidad, String tipo){
		this.disponibilidad=disponibilidad;
		this.tipo=tipo;
	}
	
	public void prestate(String tipo1) throws Exception{
		if((this.disponibilidad > 0) && (this.tipo == tipo1))
			this.disponibilidad--;
		else
			throw new Exception("La pieza no se encuentra disponible");
	}
	
	public void almacenate(Almacen al){
		this.disponibilidad++;
	}
	
}
