package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import vista.area.AltaArea;

public class CAltaArea implements ActionListener {

	private AltaArea vAltaArea;
	
	public CAltaArea(AltaArea vAltaArea) {
		super();
		this.vAltaArea = vAltaArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object cmd = e.getSource();
		
		if(cmd instanceof JButton) {
			if(cmd.equals(vAltaArea.getBtnCrear())) {
				JOptionPane.showConfirmDialog(vAltaArea, "Los datos de area se ha guardado correctamente");
				vAltaArea.getTxtDescripcion().setText("");
				vAltaArea.getTxtId().setText("");
				vAltaArea.getTxtNombre().setText("");
			}
			else if(cmd.equals(vAltaArea.getBtnLimpiarDatos())){
				vAltaArea.getTxtDescripcion().setText("");
				vAltaArea.getTxtId().setText("");
				vAltaArea.getTxtNombre().setText("");
			}
		}
	}
}