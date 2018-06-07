package modelo;

public class Grupo {
	
	String grupo;
	int curso;
	
	public Grupo(String grupo, int curso) {
		super();
		this.grupo = grupo;
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public int getCurso() {
		return curso;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String grupoo = ""+grupo;
		return grupoo;
	}

}
