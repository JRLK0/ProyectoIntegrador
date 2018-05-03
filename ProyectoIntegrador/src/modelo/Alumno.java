package modelo;

public class Alumno {

	private int id_alumno;
	private String expediente;
	private String nombre;
	private String apellidos;
	
	//Constructor
	public Alumno(int id_alumno, String expediente, String nombre, String apellidos) {
		this.id_alumno = id_alumno;
		this.expediente = expediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//Setters y Getters
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
}