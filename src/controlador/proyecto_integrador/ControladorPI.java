/**
 * 
 */
package controlador.proyecto_integrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import accesoDB.PIPersistencia;
import controlador.CVentanaPrincipal;
import modelo.Alumno;
import modelo.Grupo;
import vista.VentanaPrincipal;
import vista.proyecto_integrador.BajaPI;
import vista.proyecto_integrador.ConsultaPI;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.ModificarPI;
import vista.proyecto_integrador.agregarAlumnos;

/**
 * @author jorge
 *
 */
public class ControladorPI implements ActionListener {

	private CrearPI crearPII;
	private BajaPI BajaPII;
	private ConsultaPI ConsultaPII;
	private ModificarPI ModificarPII;
	private agregarAlumnos agregarAlumnosI;
	private PIPersistencia persistenciaPI;

	public ControladorPI() {
		super();
	}

	public void setCrearPII(CrearPI crearPII) {
		this.crearPII = crearPII;
	}

	public void setBajaPII(BajaPI bajaPII) {
		BajaPII = bajaPII;
	}

	public void setConsultaPII(ConsultaPI consultaPII) {
		ConsultaPII = consultaPII;
	}

	public void setModificarPII(ModificarPI modificarPII) {
		ModificarPII = modificarPII;
	}

	public void setAgregarAlumnosI(agregarAlumnos agregarAlumnosI) {
		this.agregarAlumnosI = agregarAlumnosI;
	}

	public void setPersistenciaPI(PIPersistencia persistenciaPI) {
		this.persistenciaPI = persistenciaPI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		if (source.equals(crearPII.getBtnAgregar())) {
			agregarAlumnosI.hacerVisible();
		} else if (source.equals(agregarAlumnosI.getBtnAgregar())) {

			crearPII.agregarAlumno(agregarAlumnosI.getSelectedItem());

		} else if (source.equals(crearPII.getBtnQuitar())) {
			crearPII.borraAlum();
		} else if (source.equals(crearPII.getRdbtn1())) {

			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(1);

			crearPII.cargarGrupoo(Grupis);

		} else if (source.equals(crearPII.getRdbtn2())) {
			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(2);

			crearPII.cargarGrupoo(Grupis);
		}

	}

}
