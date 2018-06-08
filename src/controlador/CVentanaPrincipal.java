package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import accesoDB.PIPersistencia;
import controlador.alumnos.ControladorAlumnos;
import controlador.area.CAltaAreas;
import controlador.area.CBajaAreas;
import controlador.proyecto_integrador.ControladorPI;
import vista.VentanaPrincipal;
import vista.alumno.AltaAlumnos;
import vista.alumno.BajaAlumnos;
import vista.alumno.ConsultaAlumnos;
import vista.alumno.ModificacionAlumnos;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.proyecto_integrador.BajaPI;
import vista.proyecto_integrador.ConsultaPI;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.ModificarPI;
import vista.proyecto_integrador.agregarAlumnos;

public class CVentanaPrincipal implements ActionListener {

	private VentanaPrincipal vp1;

	private CrearPI crearPII;
	private BajaPI BajaPII;
	private ConsultaPI ConsultaPII;
	private ModificarPI ModificarPII;
	private agregarAlumnos agregarAlumnosI;
	private PIPersistencia persistenciaPI;

	private ControladorPI ControladorPI;

	private AltaAlumnos vAltaAlumnos;
	private BajaAlumnos vBajaAlumnos;
	private ModificacionAlumnos vModificiacionAlumnos;
	private ConsultaAlumnos vConsultaAlumnos;

	private ControladorAlumnos controladorAlumno;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		this.vp1 = vp1;
		ControladorPI = new ControladorPI();// PI
		persistenciaPI = new PIPersistencia();
		controladorAlumno = new ControladorAlumnos();// CA

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source instanceof JMenuItem) {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (source.equals(vp1.getMntmAlta())) {

				crearPII = new CrearPI();
				agregarAlumnosI = new agregarAlumnos(persistenciaPI.dameAlumnos(), vp1, true);

				crearPII.setControlador(ControladorPI);
				agregarAlumnosI.setControlador(ControladorPI);

				ControladorPI.setCrearPII(crearPII);
				ControladorPI.setPersistenciaPI(persistenciaPI);
				ControladorPI.setAgregarAlumnosI(agregarAlumnosI);
				vp1.verPanel(crearPII);
				
				ArrayList<modelo.Area> Areas = persistenciaPI.cargarArea();
				crearPII.cargarAreas(Areas);

			} else if (source.equals(vp1.getMntmConsultas())) {

			} else if (source.equals(vp1.getMntmBaja())) {

			} else if (source.equals(vp1.getMntmModificacion())) {

			} else if (source.equals(vp1.getMntmConsultasA())) {// #ALUMNOS#
				System.out.println("Boton de consulta de alumnos");
				vConsultaAlumnos = new ConsultaAlumnos();// crear
				controladorAlumno.setConsultaAL(vConsultaAlumnos);
				vConsultaAlumnos.setControlador(controladorAlumno);
				vp1.verPanel(vConsultaAlumnos);
			} else if (source.equals(vp1.getMntmAltaA())) {
				System.out.println("Boton de alta de alumnos");
				vAltaAlumnos = new AltaAlumnos();// crear
				controladorAlumno.setAltaAL(vAltaAlumnos);
				vAltaAlumnos.setControlador(controladorAlumno);
				vp1.verPanel(vAltaAlumnos);
			} else if (source.equals(vp1.getMntmBajaA())) {
				System.out.println("Boton de baja de alumnos");
				vBajaAlumnos = new BajaAlumnos();// crear
				controladorAlumno.setBajaAL(vBajaAlumnos);
				vBajaAlumnos.setControlador(controladorAlumno);
				vp1.verPanel(vBajaAlumnos);
			} else if (source.equals(vp1.getMntmModificacionA())) {
				System.out.println("boton de modificacion de alumnos");
				vModificiacionAlumnos = new ModificacionAlumnos();// crear
				controladorAlumno.setModificacionAL(vModificiacionAlumnos);
				vModificiacionAlumnos.setControlador(controladorAlumno);
				vp1.verPanel(vModificiacionAlumnos);

				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (source.equals(vp1.getMntmConsultasAR())) {// #AREA#
				
			} else if (source.equals(vp1.getMntmAltaAR())) {				
				AltaArea altaAR = new AltaArea();
				CAltaAreas control = new CAltaAreas(altaAR);
				altaAR.setControlador(control);
				vp1.verPanel(altaAR);
			} else if (source.equals(vp1.getMntmBajaAR())) {
				BajaArea bajaAR = new BajaArea();
				CBajaAreas control = new CBajaAreas(bajaAR);
				bajaAR.setControlador(control);
				vp1.verPanel(bajaAR);
			} else if (source.equals(vp1.getMntmModificacionAR())) {
				
			}
		}
	}
}