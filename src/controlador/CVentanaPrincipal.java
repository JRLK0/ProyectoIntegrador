package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import accesoDB.PIPersistencia;
import controlador.area.ControladorArea;
import controlador.proyecto_integrador.ControladorPI;
import modelo.Alumno;
import vista.VentanaPrincipal;
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
	private PIPersistencia piPersis;
	
	private ControladorPI ControladorPI;
	
	private AltaArea vAltaArea;
	private BajaArea vBajaArea;
	private ConsultaArea vConsultaArea;
	private ModificacionArea vModificacionArea;
	
	private ControladorArea controladorArea;
	
	

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		this.vp1 = vp1;
		ControladorPI = new ControladorPI();
		piPersis = new PIPersistencia();
		controladorArea = new ControladorArea();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		
		

		if (source instanceof JMenuItem) {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (source.equals(vp1.getMntmAlta())) {
				ArrayList<Alumno> alumnosTODOS = piPersis.dameAlumnos();
				
				crearPII = new CrearPI();
				agregarAlumnosI = new agregarAlumnos(alumnosTODOS,vp1, true);				
				crearPII.setControlador(ControladorPI);
				
			} else if (source.equals(vp1.getMntmConsultas())) {
				
			} else if (source.equals(vp1.getMntmBaja())) {
				
			} else if (source.equals(vp1.getMntmModificacion())) {
				
			} else if (source.equals(vp1.getMntmConsultasA())) {// #ALUMNOS#
				System.out.println("Boton de consulta de alumnos");
			} else if (source.equals(vp1.getMntmAltaA())) {
				System.out.println("Boton de alta de alumnos");
			} else if (source.equals(vp1.getMntmBajaA())) {
				System.out.println("Boton de baja de alumnos");
			} else if (source.equals(vp1.getMntmModificacionA())) {
				System.out.println("boton de modificacion de alumnos");

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
				controladorArea.setBajaAR(vBajaArea);;
				vBajaArea.setControlador(controladorArea);
				vp1.verPanel(vBajaArea);
			} else if (source.equals(vp1.getMntmModificacionAR())) {
				vModificacionArea = new ModificacionArea();
				controladorArea.setModificacionAR(vModificacionArea);;
				vModificacionArea.setControlador(controladorArea);
				vp1.verPanel(vModificacionArea);
			}
		}
	}
	
}