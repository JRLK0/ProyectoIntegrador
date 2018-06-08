package accesoDB;

import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.Grupo;
import modelo.ProyectoIntegradorPOJO;
import vista.area.AltaArea;

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
		} finally {

			try {
				if (rstl != null) {
					rstl.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listaAlumnos;

	}

	public ArrayList<Grupo> cargarGrupo(int i) {
		ArrayList<Grupo> listaGrupo = new ArrayList<Grupo>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;

		try {
			con = acceso.getConexion();
			String query = "SELECT * FROM GRUPOS WHERE CURSO=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, i); // aqui le metes el valor de la
			// primera interrogacion

			rstl = pstmt.executeQuery();

			int idAlu = 0;
			String grupo = "";
			int curso = i;
			

			while (rstl.next()) {
				grupo = rstl.getString(1);
				curso = rstl.getInt(2);
				listaGrupo.add(new Grupo(grupo, curso));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			System.out.println("QQQQ1");
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("qqqqq2");
			e.printStackTrace();
		} finally {

			try {
				if (rstl != null) {
					rstl.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listaGrupo;
	}

	public ArrayList<modelo.Area> cargarArea() {
		
		ArrayList<modelo.Area> listaArea = new ArrayList<modelo.Area>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;

		try {
			con = acceso.getConexion();
			String query = "SELECT * FROM AREAS";
			pstmt = con.prepareStatement(query);
			//pstmt.setInt(1, i); // aqui le metes el valor de la
			// primera interrogacion

			rstl = pstmt.executeQuery();

			int idAre = 0;
			String nombre = "";
			String descripcion = "";
			

			while (rstl.next()) {
				idAre = rstl.getInt(1);
				nombre = rstl.getString(2);
				descripcion = rstl.getString(3);
				listaArea.add(new modelo.Area(idAre, nombre, descripcion));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			System.out.println("QQQQ1");
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("qqqqq2");
			e.printStackTrace();
		} finally {

			try {
				if (rstl != null) {
					rstl.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listaArea;
	}

	public int agregarPI(ProyectoIntegradorPOJO piPJ) {
		// TODO Auto-generated method stub

		int rslt=0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			String query = "INSERT INTO proyectos_integradores(nombre,url,nota,anio,grupo,id_area) VALUES(?, ?, ?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,piPJ.getNombre());
			pstmt.setString(2, piPJ.getUrl());
			pstmt.setInt(3, piPJ.getNota());
			pstmt.setInt(4, piPJ.getAnyo());
			pstmt.setString(5, piPJ.getGrupo());
			pstmt.setInt(6, piPJ.getIdArea());
			
			rslt = pstmt.executeUpdate();
			
			
			
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
		
		return rslt;
	
	}

}
