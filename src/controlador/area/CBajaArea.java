package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import vista.area.BajaArea;

public class CBajaArea implements ActionListener{

	
	public static final String BUSQUEDA="t";
	public static final String FINALIZAR="F";
	public static final String ELIMINAR ="E";


	private BajaArea vBajaArea;
	
	public CBajaArea(BajaArea vBajaArea) {
		super();
		this.vBajaArea = vBajaArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object cmd = e.getSource();
		
		if(cmd instanceof JRadioButton) {
			if(cmd.equals(vBajaArea.getRdbtnId())) {
				vBajaArea.getLblApellidos().setEnabled(false);
				vBajaArea.getTxtApellidos().setEnabled(false);
			}
			else if(cmd.equals(vBajaArea.getRdbtnNombre())) {
				vBajaArea.getLblApellidos().setEnabled(true);
				vBajaArea.getTxtApellidos().setEnabled(true);
			}
		}
		else if(cmd instanceof JButton) {
			if(cmd.equals(vBajaArea.getBtnActBusqueda())) {
				
			}
			else if(cmd.equals(vBajaArea.getBtnFinalizar())) {
				
			}
			else if(cmd.equals(vBajaArea.getBtnEliminar())) {
				JOptionPane.showMessageDialog(vBajaArea, "Los datos de area se ha borrado correctamente");
			}
		}
	}
}