package accesoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Area;

public class AreaPersistencia {

	private AccesoDB acc;
	
	public AreaPersistencia() {
		acc = new AccesoDB();
	}

	public boolean comprobarID(int id) {
		boolean resultado = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConexion();
			String query = "SELECT id_area FROM areas WHERE id_areas = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rslt = pstmt.executeQuery();
			
			if(rslt.next()) {
				resultado = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rslt != null) rslt.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultado;
	}

	public String guardarArea(Area area) {
		String msg = "";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConexion();
			String query = "INSERT INTO areas VALUES(?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, area.getId_area());
			pstmt.setString(2, area.getNombre());
			pstmt.setString(3, area.getDescripcion());
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				msg ="La area se ha guardado en la base de datos";
			}
			else {
				msg ="Error al guardar la area";
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return msg;
	}

}