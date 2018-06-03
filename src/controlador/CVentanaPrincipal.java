package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import accesoDB.PIPersistencia;
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

public class CVentanaPrincipal implements ActionListener {

	private ControladorPI ControladorPI;
	private VentanaPrincipal vp1;
	private CrearPI aPI1;
	private BajaPI bPI2;
	private ConsultaPI cPI0;
	private ModificarPI mPI3;
	private AltaArea vAltaArea;
	private BajaArea vBajaArea;
	private ModificacionArea vModificacionArea;
	private ConsultaArea vConsultaArea;
	private PIPersistencia piPersis;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		this.vp1 = vp1;
		vConsultaArea = new ConsultaArea();
		vAltaArea = new AltaArea();
		vBajaArea = new BajaArea();
		vModificacionArea = new ModificacionArea();		
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		ControladorPI = new ControladorPI();


		if (source instanceof JMenuItem) {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (source.equals(vp1.getMntmAlta())) {// #PI#
				System.out.println("boton de alta de PI");
				aPI1 = new CrearPI();
				piPersis = new PIPersistencia();
				vp1.verPanel(aPI1);
				aPI1.setControlador(ControladorPI);
				ControladorPI.setCrearPI(aPI1);
				ControladorPI.setPiPersis(piPersis);
				
				

			} else if (source.equals(vp1.getMntmConsultas())) {
				System.out.println("boton de consulta de PI");
				cPI0 = new ConsultaPI();
				vp1.verPanel(cPI0);

			} else if (source.equals(vp1.getMntmBaja())) {
				System.out.println("boton de baja de PI");
				bPI2 = new BajaPI();
				vp1.verPanel(bPI2);

			} else if (source.equals(vp1.getMntmModificacion())) {
				System.out.println("boton modificacion de PI");
				mPI3 = new ModificarPI();
				vp1.verPanel(mPI3);

				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
				vp1.verPanel(vConsultaArea);
			} else if (source.equals(vp1.getMntmAltaAR())) {
				vp1.verPanel(vAltaArea);
			} else if (source.equals(vp1.getMntmBajaAR())) {
				vp1.verPanel(vBajaArea);
			} else if (source.equals(vp1.getMntmModificacionAR())) {
				vp1.verPanel(vModificacionArea);
			}
		}
	}
}