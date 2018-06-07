package accesoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.Area;
import vista.alumno.AltaAlumnos;
import vista.area.AltaArea;

public class AlumnoPersistencia {
	
	private AccesoDB acceso;
	
	public AlumnoPersistencia () {
		acceso = new AccesoDB();
	}
		Connection con = null;
		PreparedStatement pstmt = null;
	
		public void guardarAlumno(Alumno alumno) {
			
			try {
				con = acceso.getConexion();
				String query = "INSERT INTO alumno VALUES( ?, ?, ?)";
				pstmt = con.prepareStatement(query);
				
				pstmt.setString(1,alumno.getNombre());
				pstmt.setString(2, alumno.getApellidos());
				pstmt.setString(3, alumno.getExpediente());
				pstmt = con.prepareStatement(query);
				int rslt = pstmt.executeUpdate();
				
				if(rslt > 0) {
					JOptionPane.showMessageDialog(new AltaAlumnos(), "El alumno se ha guardado en la base de datos","Guardado correctamente",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(new AltaAlumnos(), "El alumno no se ha guardado en la base de datos","Guardado fallido",JOptionPane.ERROR_MESSAGE);
				}
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		
	}

		
	
}
