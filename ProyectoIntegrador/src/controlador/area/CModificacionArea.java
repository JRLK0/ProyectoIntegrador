package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.area.ModificacionArea;

public class CModificacionArea implements ActionListener{

	private ModificacionArea vModificacionArea;
	
	public CModificacionArea(ModificacionArea vModificacionArea) {
		super();
		this.vModificacionArea = vModificacionArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "rdbtnId":
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton activar ID");
			vModificacionArea.getLblApellidos().setEnabled(false);
			vModificacionArea.getTxtApellidos().setEnabled(false);
			break;
		case "rdbtnNombre":
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton para el nombre");
			vModificacionArea.getLblApellidos().setEnabled(true);
			vModificacionArea.getTxtApellidos().setEnabled(true);
			break;
		case "btnActBusqueda":
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton activar búsqueda");
			break;
		case "btnReset":
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton resetear");
			break;
		case "btnGuardarCambios":
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton guardar cambios");
			break;
		default:
			JOptionPane.showConfirmDialog(vModificacionArea, "Boton NO ASIGNADO");
			break;
		}
	}

}
