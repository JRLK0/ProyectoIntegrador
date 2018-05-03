package controlador.proyecto_integrador;

import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.proyecto_integrador.BajaPI;




public class CBajaPI implements ActionListener{
	
	private BajaPI bpi;

	
	
	public CBajaPI(BajaPI bpi) {
		super();
		this.bpi = bpi;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		switch (cmd) {
		case "btnBorrarSeleccion":
			//JOptionPane.showMessageDialog(null, "Boton Borrar", "INFO",MessageType.INFO);
			JOptionPane.showConfirmDialog(bpi, "Boton borrar");
			break;
			
		case "btnBuscar":
			JOptionPane.showConfirmDialog(bpi, "Boton buscar");
		break;
		
		case "btnReset":
			JOptionPane.showConfirmDialog(bpi, "Boton reset");
		break;

		default:
			JOptionPane.showConfirmDialog(bpi, "Boton NO ASIGNADO");
			break;
		}
	}

}
