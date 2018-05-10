package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controlador.area.CAltaArea;
import controlador.area.CBajaArea;
import controlador.area.CConsultaArea;
import controlador.area.CModificacionArea;
import controlador.proyecto_integrador.CBajaPI;
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

	private VentanaPrincipal vp1;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		this.vp1 = vp1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();

		vp1.getLblLogo().setVisible(false);
		
		switch (cmd) {
		case "AltaPI":
			// TODO abrir ventana de crear PI con su titulo.
			String tx1 = JOptionPane.showInputDialog(vp1, "Titulo proyecto Integrador:", "Insertar titutlo");
			CrearPI crPI = new CrearPI("Crear proyecto Integrador " + tx1);
			crPI.hacerVisible();
			break;
		case "BajaPI":
			// TODO  ventana de dar de baja PI, titulo por defecto(no agregar)
			System.out.println("Iniciando baja.");
			BajaPI bjPI = new BajaPI();
			bjPI.hacerVisible();
			CBajaPI cbjPI = new CBajaPI(bjPI);
			bjPI.addActionListener(cbjPI);

			break;
		case "ModificacionPI":
			// TODO ventana modificacion PI

			ModificarPI mdPI = new ModificarPI();
			mdPI.hacerVisible();

			break;
		case "ConsultaPI":
			// TODO ventana modidificacion ConsultaPI
			
			ConsultaPI cnPI = new ConsultaPI();
			cnPI.hacerVisible();

			break;
		case "ConsultaA":
			// TODO

			break;
		case "AltaA":
			// TODO

			break;
		case "BajaA":
			// TODO

			break;
		case "ModificacionA":
			// TODO

			break;
		case "ConsultasAR":
			ConsultaArea consultaArea = new ConsultaArea();
			CConsultaArea cConsultaArea = new CConsultaArea(consultaArea);
			consultaArea.addActionListener(cConsultaArea);
			vp1.getScpPaneles().setViewportView(consultaArea);
			break;
		case "AltaAR":
			AltaArea altaArea = new AltaArea();
			CAltaArea cAltaArea = new CAltaArea(altaArea);
			altaArea.addActionListener(cAltaArea);
			vp1.getScpPaneles().setViewportView(altaArea);
			break;
		case "BajaAR":
			BajaArea bajaArea = new BajaArea();
			CBajaArea cBajaArea = new CBajaArea(bajaArea);
			bajaArea.addActionListener(cBajaArea);
			vp1.getScpPaneles().setViewportView(bajaArea);
			break;
		case "ModificacionAR":
			ModificacionArea modificacionArea = new ModificacionArea();
			CModificacionArea cModificacionArea = new CModificacionArea(modificacionArea);
			modificacionArea.addActionListener(cModificacionArea);
			vp1.getScpPaneles().setViewportView(modificacionArea);
			break;

		default:
			JOptionPane.showInternalMessageDialog(vp1, "Boton no definido, por favor definelo dentro del switch");
			break;
		}
	}
}