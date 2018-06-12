package controlador;

import java.awt.EventQueue;

import accesoDB.AreaPersistencia;
import accesoDB.PIPersistencia;
import controlador.area.ControladorAreas;
import controlador.proyecto_integrador.ControladorPI;
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

public class ClaseMain {
//sure
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				VentanaPrincipal vp = new VentanaPrincipal();
				
				CrearPI crearPI = new CrearPI();
				BajaPI bajaPI = new BajaPI();
				ConsultaPI consultaPI = new ConsultaPI();
				ModificarPI modificarPI = new ModificarPI();
				PIPersistencia persistenciaPI = new PIPersistencia();
				agregarAlumnos agregarAlumnos = new agregarAlumnos(persistenciaPI.dameAlumnos(), vp, true);
				
				AltaArea altaAR = new AltaArea();
				BajaArea bajaAR = new BajaArea();
				ConsultaArea consultaAR = new ConsultaArea();
				ModificacionArea modificacionAR = new ModificacionArea();
				AreaPersistencia arp = new AreaPersistencia();
				
				ControladorPI controladorPI = new ControladorPI();
				controladorPI.setAgregarAlumnosI(agregarAlumnos);
				controladorPI.setBajaPII(bajaPI);
				controladorPI.setConsultaPII(consultaPI);
				controladorPI.setCrearPII(crearPI);
				controladorPI.setModificarPII(modificarPI);
				controladorPI.setPersistenciaPI(persistenciaPI);
				
				ControladorAreas controladorAR = new ControladorAreas();
				controladorAR.setAltaAR(altaAR);
				controladorAR.setBajaAR(bajaAR);
				controladorAR.setConsultaAR(consultaAR);
				controladorAR.setModificacionAR(modificacionAR);
				controladorAR.setArp(arp);
				
				CVentanaPrincipal cvp= new CVentanaPrincipal(vp);
				cvp.setAgregarAlumnosI(agregarAlumnos);
				cvp.setBajaPII(bajaPI);
				cvp.setConsultaPII(consultaPI);
				cvp.setControladorPI(controladorPI);
				cvp.setCrearPII(crearPI);
				cvp.setModificarPII(modificarPI);
				cvp.setPersistenciaPI(persistenciaPI);
				
				cvp.setAltaAR(altaAR);
				cvp.setBajaAR(bajaAR);
				cvp.setConsultaAR(consultaAR);
				cvp.setModificacionAR(modificacionAR);
				
				crearPI.setControlador(controladorPI);
				bajaPI.setControlador(controladorPI);
				consultaPI.setControlador(controladorPI);
				modificarPI.setControlador(controladorPI);
				agregarAlumnos.setControlador(controladorPI);
				
				altaAR.setControlador(controladorAR);
				bajaAR.setControlador(controladorAR);
				consultaAR.setControlador(controladorAR);
				modificacionAR.setControlador(controladorAR);
				
				vp.setControlador(cvp);
				
				vp.hacerVisible();
				
			}
		});
	}
}