package accesoDB;

import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
			// pstmt.setInt(1, i); // aqui le metes el valor de la
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

		int rslt = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = acceso.getConexion();
			int ll = 1;
			while (consultarRegistro(piPJ) != -1) {
				piPJ.setNombre(piPJ.getNombre() + "(" + ll + ")");
				ll++;
			}
			String query = "INSERT INTO proyectos_integradores(nombre,url,nota,anio,grupo,id_area) VALUES(?, ?, ?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, piPJ.getNombre());
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rslt;

	}

	private int consultarRegistro(ProyectoIntegradorPOJO piPJ) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		int id_proyectoQ = -1;

		try {
			con = acceso.getConexion();
			String query = "SELECT ID_PROYECTO FROM PROYECTOS_INTEGRADORES WHERE NOMBRE=? AND URL=? AND GRUPO=? AND ID_AREA=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, piPJ.getNombre());
			pstmt.setString(2, piPJ.getUrl());
			pstmt.setString(3, piPJ.getGrupo());
			pstmt.setString(4, String.valueOf(piPJ.getIdArea()));

			rslt = pstmt.executeQuery();

			if (rslt.next()) {
				id_proyectoQ = rslt.getInt(1);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return id_proyectoQ;

		// TODO Auto-generated method stub

	}

	public int ObtenerLastId(ProyectoIntegradorPOJO piPJ) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		int id_proyectoQ = -1;

		try {
			con = acceso.getConexion();
			String query = "SELECT ID_PROYECTO FROM PROYECTOS_INTEGRADORES WHERE NOMBRE=? AND URL=? AND GRUPO=? AND ID_AREA=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, piPJ.getNombre());
			pstmt.setString(2, piPJ.getUrl());
			pstmt.setString(3, piPJ.getGrupo());
			pstmt.setString(4, String.valueOf(piPJ.getIdArea()));

			rslt = pstmt.executeQuery();

			id_proyectoQ = rslt.getInt(1);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return id_proyectoQ;

	}

	public int AgregarParticipantes(ArrayList<Alumno> alumm, int x) {
		// TODO Auto-generated method stub

		int rslt = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = acceso.getConexion();

			for (Alumno alumno : alumm) {
				String query = "INSERT INTO participantes(id_alumno,id_proyecto) VALUES(?, ?)";
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, alumno.getId_alumno());
				pstmt.setInt(2, x);
				rslt += pstmt.executeUpdate();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rslt;

		// TODO Auto-generated method stub

	}

	public ArrayList<ProyectoIntegradorPOJO> damePI(String busqueda) {

		ArrayList<ProyectoIntegradorPOJO> listaPI = new ArrayList<ProyectoIntegradorPOJO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;

		try {
			con = acceso.getConexion();
			String query = "SELECT * FROM PROYECTOS_INTEGRADORES WHERE NOMBRE like ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + busqueda + "%");
			rstl = pstmt.executeQuery();

			int idProyecto;
			String nombre;
			String url;
			int nota;
			int anyo; // año
			String grupo;
			int idArea;

			while (rstl.next()) {
				idProyecto = rstl.getInt(1);
				nombre = rstl.getString(2);
				url = rstl.getString(3);
				nota = rstl.getInt(4);
				anyo = rstl.getInt(5);
				grupo = rstl.getString(6);
				idArea = rstl.getInt(7);
				listaPI.add(new ProyectoIntegradorPOJO(idProyecto, nombre, url, nota, anyo, grupo, idArea));
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

		return listaPI;

	}

	public int borrarPI(ProyectoIntegradorPOJO borrarSeleccionado) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int rslt = -1;

		// DELETE FROM T_PEDIDOS WHERE COD_PEDIDO=15;
		try {
			con = acceso.getConexion();
			String query = "DELETE FROM PROYECTOS_INTEGRADORES WHERE ID_PROYECTO=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, borrarSeleccionado.getIdProyecto());

			rslt = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rslt;

	}

	public void eliminarComponentes(ProyectoIntegradorPOJO borrarSeleccionado) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;

		// DELETE FROM T_PEDIDOS WHERE COD_PEDIDO=15;
		try {
			con = acceso.getConexion();
			String query = "DELETE FROM PARTICIPANTES WHERE ID_PROYECTO=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, borrarSeleccionado.getIdProyecto());

			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public int solicitarCurso(String grupo) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;
		int curso = 0;

		try {
			con = acceso.getConexion();
			String query = "SELECT * FROM grupos WHERE grupo = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, grupo);
			rstl = pstmt.executeQuery();

			curso = rstl.getInt(1);

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

		return curso;

	}

	public ArrayList<Alumno> DameLosComponentesDelPI(int idProyecto) {

		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rstl = null;
		ResultSet rstl2 = null;

		try {
			con = acceso.getConexion();
			String query = "SELECT * FROM PARTICIPANTES WHERE ID_PROYECTO=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idProyecto);

			rstl = pstmt.executeQuery();

			int idAlu = 0;
			String nombre = "";
			String apellidos = "";
			String expediente = "";

			while (rstl.next()) {
				String query2 = "SELECT * FROM alumnos WHERE ID_alumno=?";
				pstmt = con.prepareStatement(query2);
				pstmt.setInt(1, rstl.getInt(1));
				
				rstl2 = pstmt.executeQuery();
				
				idAlu = rstl2.getInt(1);
				nombre = rstl2.getString(2);
				apellidos = rstl2.getString(3);
				expediente = rstl2.getString(4);
				listaAlumnos.add(new Alumno(idAlu, expediente, nombre, apellidos));
				
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rstl != null)
					pstmt.close();

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaAlumnos;

	}

}
