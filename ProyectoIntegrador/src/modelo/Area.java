package modelo;

public class Area {

	private String id_area;
	private String nombre;
	private String descripcion;
	
	//Constructor
	public Area(String id_area, String nombre, String descripcion) {
		this.id_area = id_area;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	//Setter y Getters
	public String getId_area() {
		return id_area;
	}

	public void setId_area(String id_area) {
		this.id_area = id_area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}