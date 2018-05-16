package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.area.AltaArea;

public class CAltaArea implements ActionListener {

	private AltaArea VAltaArea;
	
	public CAltaArea(AltaArea vAltaArea) {
		super();
		VAltaArea = vAltaArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "btnCrear":
			JOptionPane.showConfirmDialog(VAltaArea, "Boton crear");
			break;
		case "btnLimpiarDatos":
			JOptionPane.showConfirmDialog(VAltaArea, "Boton limpiar Datos");
			break;
		default:
			JOptionPane.showConfirmDialog(VAltaArea, "Boton NO ASIGNADO");
			break;
		}		
	}
}