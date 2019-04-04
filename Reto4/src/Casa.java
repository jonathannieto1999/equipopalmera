
public class Casa extends Alojamiento {
	
	//atributos
	private int numero_pisos;
	private double tamano_metros_cuadrados;
	
	//constructores
	public Casa(String nombre_alojamiento, String ubicacion, int relacion_habitaciones, int numero_pisos,
			double tamano_metros_cuadrados) {
		super(nombre_alojamiento, ubicacion, relacion_habitaciones);
		this.numero_pisos = numero_pisos;
		this.tamano_metros_cuadrados = tamano_metros_cuadrados;
	}
	
	//getters y setters
	public int getNumero_pisos() {
		return numero_pisos;
	}
	public void setNumero_pisos(int numero_pisos) {
		this.numero_pisos = numero_pisos;
	}
	public double getTamano_metros_cuadrados() {
		return tamano_metros_cuadrados;
	}
	public void setTamano_metros_cuadrados(double tamano_metros_cuadrados) {
		this.tamano_metros_cuadrados = tamano_metros_cuadrados;
	}
	@Override
	public String toString() {
		return "Casa [numero_pisos=" + numero_pisos + ", tamano_metros_cuadrados=" + tamano_metros_cuadrados + "]";
	}
	
	
}
