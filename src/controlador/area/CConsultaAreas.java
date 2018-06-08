package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.ConsultaArea;

public class CConsultaAreas implements ActionListener {

	private ConsultaArea consultaAR;
	private AreaPersistencia ap;
	
	public CConsultaAreas(ConsultaArea consultaAR) {
		this.consultaAR = consultaAR;
		ap = new AreaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
		if (cmd instanceof JRadioButton) {		
			//BajaAreas
			if(cmd.equals(consultaAR.getRdbtnId())) {
				consultaAR.isIDactive();
			}
			else if(cmd.equals(consultaAR.getRdbtnNombre())) {
				consultaAR.isNombreActive();
			}	
		}
		else if(cmd instanceof JButton) {
			if(cmd.equals(consultaAR.getBtnActBusqueda())) {
				if(consultaAR.getRdbtnId().isSelected()) {
					int id = consultaAR.obtenerIB();
					if(id != 0) {
						ArrayList<Area> listaAreas = ap.obtenerARID(id);
						consultaAR.cargarTabla(listaAreas);
					}
				}				
				else if(consultaAR.getRdbtnNombre().isSelected()) {
					String nombre = consultaAR.obtenerNombre();
					ArrayList<Area> listaAreas = ap.obtenerARNombre(nombre);
					consultaAR.cargarTabla(listaAreas);
				}
				
			}
		}
	}
}