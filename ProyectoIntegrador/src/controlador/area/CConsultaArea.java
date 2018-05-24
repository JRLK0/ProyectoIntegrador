package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			vConsultaArea.getLblApellidos().setEnabled(false);
			vConsultaArea.getTxtApellidos().setEnabled(false);
			break;
		case "rdbtnNombre":
			vConsultaArea.getLblApellidos().setEnabled(true);
			vConsultaArea.getTxtApellidos().setEnabled(true);
			break;
		case "btnActBusqueda":
			break;
		case "btnDetalles":
			break;
		}
	}
}