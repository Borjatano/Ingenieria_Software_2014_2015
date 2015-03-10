package cadena_de_montaje;
public class Pieza {

	private int disponibilidad;
	private String tipo;
	
	public boolean prestate(String tipo){
		return true;
	}
	
	public boolean almacenate(Almacen al){
		return true;
	}
	
}
