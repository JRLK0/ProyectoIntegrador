package accesoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Alumno;

public class PIPersistencia {

	private AccesoDB acceso;

	public PIPersistencia() {
		acceso = new AccesoDB();
	}

	public ArrayList<Alumno> dameAlumnos() {

		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;

		try {
			con = acceso.getConexion();
			String query = "SELECT  * FROM ALUMNOS";
			pstmt = con.prepareStatement(query);
			rstl = pstmt.executeQuery();

			int idAlu = 0;
			String nombre = "";
			String apellidos = "";
			String expediente = "";

			while (rstl.next()) {
				idAlu = rstl.getInt(1);
				nombre = rstl.getString(2);
				apellidos = rstl.getString(3);
				expediente = rstl.getString(4);
				listaAlumnos.add(new Alumno(idAlu, expediente, nombre, apellidos));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("QQQQ1");
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("qqqqq2");
			e.printStackTrace();
		}finally {
			
				try {
					if(rstl != null) {
						rstl.close();
						}
					if(pstmt != null) {
						pstmt.close();
					}
					
					if(con != null) {
						con.close();
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		

	return listaAlumnos;

}

}
