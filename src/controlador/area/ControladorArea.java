package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;

public class ControladorArea implements ActionListener {

	private AltaArea altaAR;
	private BajaArea bajaAR;
	private ConsultaArea consultaAR;
	private ModificacionArea modificacionAR;
	private AreaPersistencia ap;
	
	public ControladorArea() {}
	
	public void setAltaAR(AltaArea altaAR) {
		this.altaAR = altaAR;
		ap = new AreaPersistencia();
	}
	
	public void setBajaAR(BajaArea bajaAR) {
		this.bajaAR = bajaAR;
		ap = new AreaPersistencia();
	}
	
	public void setConsultaAR(ConsultaArea consultaAR) {
		this.consultaAR = consultaAR;
		ap = new AreaPersistencia();
	}
	
	public void setModificacionAR(ModificacionArea modificacionAR) {
		this.modificacionAR = modificacionAR;
		ap = new AreaPersistencia();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
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
		else if (cmd instanceof JRadioButton) {
			//BajaAreas
			if(cmd.equals(bajaAR.getRdbtnId())) {
				bajaAR.isIDactive();
			}
			else if(cmd.equals(bajaAR.getRdbtnNombre())) {
				bajaAR.isNombreActive();
			}
			else if(cmd.equals(consultaAR.getRdbtnId())) {
				consultaAR.isIDactive();
			}
			else if(cmd.equals(consultaAR.getRdbtnNombre())) {
				consultaAR.isNombreActive();
			}
			else if(cmd.equals(modificacionAR.getRdbtnNombre())) {
				modificacionAR.isNombreActive();
			}
			else if(cmd.equals(modificacionAR.getRdbtnNombre())) {
				modificacionAR.isNombreActive();
			}
		}
	}
}