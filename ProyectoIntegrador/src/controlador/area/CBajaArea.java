package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.area.BajaArea;

public class CBajaArea implements ActionListener{
<<<<<<< HEAD
	
	public static final String BUSQUEDA="t";
	public static final String FINALIZAR="F";
	public static final String ELIMINAR ="E";
=======

>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
	private BajaArea vBajaArea;
	
	public CBajaArea(BajaArea vBajaArea) {
		super();
		this.vBajaArea = vBajaArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "rdbtnId":
			JOptionPane.showConfirmDialog(vBajaArea, "Boton activar ID");
			vBajaArea.getLblApellidos().setEnabled(false);
			vBajaArea.getTxtApellidos().setEnabled(false);
			break;
		case "rdbtnNombre":
			JOptionPane.showConfirmDialog(vBajaArea, "Boton para el nombre");
			vBajaArea.getLblApellidos().setEnabled(true);
			vBajaArea.getTxtApellidos().setEnabled(true);
			break;
		case "btnActBusqueda":
			JOptionPane.showConfirmDialog(vBajaArea, "Boton activar búsqueda");
			break;
		case "btnEliminar":
			JOptionPane.showConfirmDialog(vBajaArea, "Boton eliminar");
			break;
		case "btnFinalizar":
			JOptionPane.showConfirmDialog(vBajaArea, "Boton Finalizar");
			break;
		default:
			JOptionPane.showConfirmDialog(vBajaArea, "Boton NO ASIGNADO");
			break;
		}
	}
}