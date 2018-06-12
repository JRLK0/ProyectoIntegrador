package modelo;

import java.util.ArrayList;

public class ProyectoIntegradorPOJO {

	private int idProyecto;
	private String nombre;
	private String url;
	private int nota;
	private int anyo; // año
	private String grupo;
	private int idArea;
	// private ArrayList<Alumno> componentes;

	public ProyectoIntegradorPOJO(int idProyecto, String nombre, String url, int nota, int anyo, String grupo,
			int idArea) {
		super();
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.url = url;
		this.nota = nota;
		this.anyo = anyo;
		this.grupo = grupo;
		this.idArea = idArea;
		// this.componentes = componentes;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String pii = "Id: " + idProyecto + " || nombre: " + nombre + " || URL" + url + " || nota: " + nota + " || año: " + anyo
				+ " || grupo: " + grupo + " || Id Area: " + idArea;
		return pii;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUrl() {
		return url;
	}

	public int getNota() {
		return nota;
	}

	public int getAnyo() {
		return anyo;
	}

	public String getGrupo() {
		return grupo;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
