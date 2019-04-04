
public class Alojamiento {
	
	//atributos
	private String nombre_alojamiento;
	private String ubicacion;
	private int relacion_habitaciones;
	
	//constructores
	public Alojamiento(String nombre_alojamiento, String ubicacion, int relacion_habitaciones) {
		super();
		this.nombre_alojamiento = nombre_alojamiento;
		this.ubicacion = ubicacion;
		this.relacion_habitaciones = relacion_habitaciones;
	}
	
	//getters y setters
	public String getNombre_alojamiento() {
		return nombre_alojamiento;
	}
	public void setNombre_alojamiento(String nombre_alojamiento) {
		this.nombre_alojamiento = nombre_alojamiento;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getRelacion_habitaciones() {
		return relacion_habitaciones;
	}
	public void setRelacion_habitaciones(int relacion_habitaciones) {
		this.relacion_habitaciones = relacion_habitaciones;
	}
	@Override
	public String toString() {
		return "Alojamiento [nombre_alojamiento=" + nombre_alojamiento + ", ubicacion=" + ubicacion
				+ ", relacion_habitaciones=" + relacion_habitaciones + "]";
	}
	
	
}
