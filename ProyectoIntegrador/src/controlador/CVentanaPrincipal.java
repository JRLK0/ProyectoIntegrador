package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vista.VentanaPrincipal;
import vista.proyecto_integrador.BajaPI;
import vista.proyecto_integrador.ConsultaPI;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.ModificarPI;

public class CVentanaPrincipal implements ActionListener {

	private VentanaPrincipal vp1;
	private CrearPI aPI1;
	private BajaPI bPI2;
	private ConsultaPI cPI0;
	private ModificarPI mPI3;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		super();
		this.vp1 = vp1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		if (source instanceof JMenuItem) {
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (source.equals(vp1.getMntmAlta())) {// #PI#
				System.out.println("boton de alta de PI");
				aPI1 = new CrearPI();
				vp1.verPanel(aPI1);

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
			} else if (source.equals(vp1.getMntmConsultasA())) {// #AREA#
				System.out.println("Boton de consulta de alumnos");
			} else if (source.equals(vp1.getMntmAltaA())) {
				System.out.println("Boton de alta de alumnos");
			} else if (source.equals(vp1.getMntmBajaA())) {
				System.out.println("Boton de baja de alumnos");
			} else if (source.equals(vp1.getMntmModificacionA())) {
				System.out.println("boton de modificacion de alumnos");

				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (source.equals(vp1.getMntmConsultasAR())) {// #Alumnos#
				System.out.println("boton de consulta Area");
			} else if (source.equals(vp1.getMntmAltaAR())) {
				System.out.println("boton de alta de Area");
			} else if (source.equals(vp1.getMntmBajaAR())) {
				System.out.println("boton de baja de Area");
			} else if (source.equals(vp1.getMntmModificacionAR())) {
				System.out.println("Boton de modificacion de Area");
			}
		}
	}
}