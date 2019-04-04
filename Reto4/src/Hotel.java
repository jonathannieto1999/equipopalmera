
public class Hotel extends Alojamiento {
	
	//atributos
	private int numero_estrellas;

	//constructores
	public Hotel(String nombre_alojamiento, String ubicacion, int relacion_habitaciones, int numero_estrellas) {
		super(nombre_alojamiento, ubicacion, relacion_habitaciones);
		this.numero_estrellas = numero_estrellas;
	}
	
	//getters y setters

	public int getNumero_estrellas() {
		return numero_estrellas;
	}

	public void setNumero_estrellas(int numero_estrellas) {
		this.numero_estrellas = numero_estrellas;
	}

	@Override
	public String toString() {
		return "Hotel [numero_estrellas=" + numero_estrellas + "]";
	}
	
	
}
