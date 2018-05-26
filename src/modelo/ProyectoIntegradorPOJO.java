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
	private ArrayList<Alumno> componentes;

	public ProyectoIntegradorPOJO(int idProyecto, String nombre, String url, int nota, int anyo, String grupo,
			int idArea, ArrayList<Alumno> componentes) {
		super();
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.url = url;
		this.nota = nota;
		this.anyo = anyo;
		this.grupo = grupo;
		this.idArea = idArea;
		this.componentes = componentes;
	}

}
