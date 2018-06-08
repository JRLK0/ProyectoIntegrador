package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.AltaArea;

public class CAltaAreas implements ActionListener {

	private AltaArea altaAR;
	private AreaPersistencia ap;
	
	public CAltaAreas(AltaArea altaAR) {
		this.altaAR = altaAR;
		ap = new AreaPersistencia();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object cmd = arg0.getSource();
		
		//JButton
		if(cmd instanceof JButton) {
					
			//AltaAreas
			if(cmd.equals(altaAR.getBtnVerificarId())) {
				if(!altaAR.getSpnId().getValue().equals("")) {
					int id = altaAR.obtenerID();
					boolean isId = ap.consutarID(id);
					if(!isId) {
						altaAR.mostrarCampos();
					}
					else {
						JOptionPane.showMessageDialog(altaAR, "ID existe en la tabla areas","ID existente",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else if(cmd.equals(altaAR.getBtnAnadirArea())) {
				Area area = altaAR.obtenerArea();		
				if(area != null) {					
					ap.guardarArea(area);				
				}				
			}				
			else if(cmd.equals(altaAR.getBtnBorrarCampos())) {						
				altaAR.borrarCampos();				
			}				
		}	
	}
}