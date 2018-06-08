package accesoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Area;
import vista.area.AltaArea;

public class AreaPersistencia {

	private AccesoDB acc;
	
	public AreaPersistencia() {
		acc = new AccesoDB();
	}

	public boolean consutarID(int id) {
		boolean verificar = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConexion();
			String query = "SELECT * FROM areas WHERE id_area = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rslt = pstmt.executeQuery();
			
			if(rslt.next()) {
				verificar = true;
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
		return verificar;
	}

	public void guardarArea(Area area) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acc.getConexion();
			String query = "INSERT INTO areas VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, area.getId_area());
			pstmt.setString(2, area.getNombre());
			pstmt.setString(3, area.getDescripcion());
			int rslt = pstmt.executeUpdate();
			
			if(rslt > 0) {
				JOptionPane.showMessageDialog(new AltaArea(), "La area se ha guardado en la base de datos","Guardado correctamente",JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(new AltaArea(), "La area no se ha guardado en la base de datos","Guardado fallido",JOptionPane.ERROR_MESSAGE);
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
	}

	public ArrayList<Area> obtenerARID(int id) {
		ArrayList<Area> listaAreas = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConexion();
			String query = "SELECT * FROM areas WHERE id_area = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rslt = pstmt.executeQuery();
			
			while(rslt.next()) {
				listaAreas.add(new Area(rslt.getInt(1), rslt.getString(2), rslt.getString(3)));
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
		return listaAreas;
	}

	public ArrayList<Area> obtenerARNombre(String nombre) {
		ArrayList<Area> listaAreas = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConexion();
			String query = "SELECT * FROM areas WHERE nombre = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nombre);
			rslt = pstmt.executeQuery();
			
			while(rslt.next()) {
				listaAreas.add(new Area(rslt.getInt(1), rslt.getString(2), rslt.getString(3)));
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
		return listaAreas;
	}
	
	public ArrayList<Area> obtenerAR() {
		ArrayList<Area> listaAreas = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acc.getConexion();
			String query = "SELECT * FROM areas";
			pstmt = con.prepareStatement(query);
			rslt = pstmt.executeQuery();
			
			while(rslt.next()) {
				listaAreas.add(new Area(rslt.getInt(1), rslt.getString(2), rslt.getString(3)));
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
		return listaAreas;
	}
}