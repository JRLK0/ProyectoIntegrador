package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.area.ConsultaArea;

public class CConsultaArea implements ActionListener{

	private ConsultaArea vConsultaArea;
	
	public CConsultaArea(ConsultaArea vConsultaArea) {
		super();
		this.vConsultaArea = vConsultaArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "rdbtnId":
			JOptionPane.showConfirmDialog(vConsultaArea, "Boton activar ID");
			vConsultaArea.getLblApellidos().setEnabled(false);
			vConsultaArea.getTxtApellidos().setEnabled(false);
			break;
		case "rdbtnNombre":
			JOptionPane.showConfirmDialog(vConsultaArea, "Boton para el nombre");
			vConsultaArea.getLblApellidos().setEnabled(true);
			vConsultaArea.getTxtApellidos().setEnabled(true);
			break;
		case "btnActBusqueda":
			JOptionPane.showConfirmDialog(vConsultaArea, "Boton activar búsqueda");
			break;
		case "btnDetalles":
			JOptionPane.showConfirmDialog(vConsultaArea, "Boton detalles");
			break;
		default:
			JOptionPane.showConfirmDialog(vConsultaArea, "Boton NO ASIGNADO");
			break;
		}
	}
}