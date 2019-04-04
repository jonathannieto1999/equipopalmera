
public class Apartamento extends Alojamiento {
	
	//atributos
	private String piso;

	//constructores
	public Apartamento(String nombre_alojamiento, String ubicacion, int relacion_habitaciones, String piso) {
		super(nombre_alojamiento, ubicacion, relacion_habitaciones);
		this.piso = piso;
	}
	
	//getters y setters

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Apartamento [piso=" + piso + "]";
	}

	

	
	
}
