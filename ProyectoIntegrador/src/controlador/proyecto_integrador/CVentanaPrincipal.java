package controlador.proyecto_integrador;

import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.VentanaPrincipal;
import vista.proyecto_integrador.BajaPI;
import vista.proyecto_integrador.ConsultaPI;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.ModificarPI;




public class CVentanaPrincipal implements ActionListener {

	private VentanaPrincipal vp1;

	public CVentanaPrincipal(VentanaPrincipal vp1) {
		super();
		this.vp1 = vp1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();

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
			// TODO

			break;
		case "AltaAR":
			// TODO

			break;
		case "BajaAR":
			// TODO

			break;
		case "ModificacionAR":
			// TODO

			break;

		default:
			JOptionPane.showInternalMessageDialog(vp1, "Boton no definido, por favor definelo dentro del switch");
			break;
		}

	}

}
