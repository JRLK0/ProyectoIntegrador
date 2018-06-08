package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.ModificacionArea;

public class CModificacionAreas implements ActionListener {

	private ModificacionArea modificacionAR;
	private AreaPersistencia ap;
	
	public CModificacionAreas(ModificacionArea modificacionAR) {
		this.modificacionAR = modificacionAR;
		ap = new AreaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
		if (cmd instanceof JRadioButton) {		
			//BajaAreas
			if(cmd.equals(modificacionAR.getRdbtnId())) {
				modificacionAR.isIDactive();
			}
			else if(cmd.equals(modificacionAR.getRdbtnNombre())) {
				modificacionAR.isNombreActive();
			}	
		}
		else if(cmd instanceof JButton) {
			if(cmd.equals(modificacionAR.getBtnActBusqueda())) {
				if(modificacionAR.getRdbtnId().isSelected()) {
					int id = modificacionAR.obtenerIB();
					if(id != 0) {
						ArrayList<Area> listaAreas = ap.obtenerARID(id);
						modificacionAR.cargarTabla(listaAreas);
					}
				}				
				else if(modificacionAR.getRdbtnNombre().isSelected()) {
					String nombre = modificacionAR.obtenerNombre();
					ArrayList<Area> listaAreas = ap.obtenerARNombre(nombre);
					modificacionAR.cargarTabla(listaAreas);
				}
				
			}
		}
	}
}