package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			vModificacionArea.getLblApellidos().setEnabled(false);
			vModificacionArea.getTxtApellidos().setEnabled(false);
			break;
		case "rdbtnNombre":
			vModificacionArea.getLblApellidos().setEnabled(true);
			vModificacionArea.getTxtApellidos().setEnabled(true);
			break;
		case "btnActBusqueda":
			break;
		case "btnReset":
			break;
		case "btnGuardarCambios":
			break;
		}
	}

}
