package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import accesoDB.PIPersistencia;
import controlador.alumnos.ControladorAlumnos;
import controlador.area.ControladorArea;
import controlador.proyecto_integrador.ControladorPI;
import modelo.Alumno;
import vista.VentanaPrincipal;
import vista.alumno.AltaAlumnos;
import vista.alumno.BajaAlumnos;
import vista.alumno.ConsultaAlumnos;
import vista.alumno.ModificacionAlumnos;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;
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

	private AltaArea vAltaArea;
	private BajaArea vBajaArea;
	private ConsultaArea vConsultaArea;
	private ModificacionArea vModificacionArea;

	private ControladorArea controladorArea;

	private AltaAlumnos vAltaAlumnos;
	private BajaAlumnos vBajaAlumnos;
	private ModificacionAlumnos vModificiacionAlumnos;
	private ConsultaAlumnos vConsultaAlumnos;

	private ControladorAlumnos controladorAlumno;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		this.vp1 = vp1;
		ControladorPI = new ControladorPI();// PI
		persistenciaPI = new PIPersistencia();
		controladorArea = new ControladorArea();// AR
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
				ConsultaPII = new ConsultaPI();
				ConsultaPII.setControlador(ControladorPI);
				ControladorPI.setConsultaPII(ConsultaPII);
				
				vp1.verPanel(ConsultaPII);
				

			} else if (source.equals(vp1.getMntmBaja())) {
				
				BajaPII = new BajaPI();
				BajaPII.setControlador(ControladorPI);
				ControladorPI.setAgregarAlumnosI(agregarAlumnosI);
				vp1.verPanel(BajaPII);

			} else if (source.equals(vp1.getMntmModificacion())) {

				ModificarPII = new ModificarPI();
				ModificarPII.setControlador(ControladorPI);
				ControladorPI.setModificarPII(ModificarPII);
				vp1.verPanel(ModificarPII);
			
				
			} else if (source.equals(vp1.getMntmConsultasA())) {// #ALUMNOS#
				System.out.println("Boton de consulta de alumnos");
				vConsultaAlumnos = new ConsultaAlumnos();// crear
				controladorAlumno.setConsultaAL(vConsultaAlumnos);
				vConsultaAlumnos.setControlador(controladorArea);
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
				vConsultaArea = new ConsultaArea();
				controladorArea.setConsultaAR(vConsultaArea);
				vConsultaArea.setControlador(controladorArea);
				vp1.verPanel(vConsultaArea);
			} else if (source.equals(vp1.getMntmAltaAR())) {
				vAltaArea = new AltaArea();
				controladorArea.setAltaAR(vAltaArea);
				vAltaArea.setControlador(controladorArea);
				vp1.verPanel(vAltaArea);
			} else if (source.equals(vp1.getMntmBajaAR())) {
				vBajaArea = new BajaArea();
				controladorArea.setBajaAR(vBajaArea);
				;
				vBajaArea.setControlador(controladorArea);
				vp1.verPanel(vBajaArea);
			} else if (source.equals(vp1.getMntmModificacionAR())) {
				vModificacionArea = new ModificacionArea();
				controladorArea.setModificacionAR(vModificacionArea);
				;
				vModificacionArea.setControlador(controladorArea);
				vp1.verPanel(vModificacionArea);
			}
		}
	}

}