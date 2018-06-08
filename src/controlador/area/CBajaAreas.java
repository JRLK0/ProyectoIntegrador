package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.BajaArea;

public class CBajaAreas implements ActionListener {

	private BajaArea bajaAR;
	private AreaPersistencia ap;
	
	public CBajaAreas(BajaArea bajaAR) {
		this.bajaAR = bajaAR;
		ap = new AreaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
		if (cmd instanceof JRadioButton) {		
			//BajaAreas
			if(cmd.equals(bajaAR.getRdbtnId())) {
				bajaAR.isIDactive();
			}
			else if(cmd.equals(bajaAR.getRdbtnNombre())) {
				bajaAR.isNombreActive();
			}	
		}
		else if(cmd instanceof JButton) {
			if(cmd.equals(bajaAR.getBtnActBusqueda())) {
				if(bajaAR.getRdbtnId().isSelected()) {
					int id = bajaAR.obtenerIB();
					if(id != 0) {
						ArrayList<Area> listaAreas = ap.obtenerARID(id);
						bajaAR.cargarTabla(listaAreas);
					}
				}				
				else if(bajaAR.getRdbtnNombre().isSelected()) {
					String nombre = bajaAR.obtenerNombre();
					ArrayList<Area> listaAreas = ap.obtenerARNombre(nombre);
					bajaAR.cargarTabla(listaAreas);
				}
			}
		}
	}
}
