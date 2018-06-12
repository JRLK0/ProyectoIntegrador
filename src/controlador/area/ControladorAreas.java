package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import accesoDB.AreaPersistencia;
import modelo.Area;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;

public class ControladorAreas implements ActionListener {

	private AltaArea altaAR;
	private BajaArea bajaAR;
	private ConsultaArea consultaAR;
	private ModificacionArea modificacionAR;
	private AreaPersistencia ap;

	public void setAltaAR(AltaArea altaAR) {
		this.altaAR = altaAR;
	}

	public void setBajaAR(BajaArea bajaAR) {
		this.bajaAR = bajaAR;
	}

	public void setConsultaAR(ConsultaArea consultaAR) {
		this.consultaAR = consultaAR;
	}

	public void setModificacionAR(ModificacionArea modificacionAR) {
		this.modificacionAR = modificacionAR;
	}

	public void setArp(AreaPersistencia ap) {
		this.ap = ap;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		Object cmd = ev.getSource();

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
					altaAR.restaurarTabla();							
					altaAR.borrarCampos();						
				}									
			}											
			else if(cmd.equals(altaAR.getBtnBorrarCampos())) {										
				altaAR.borrarCampos();							
			}
			else if(cmd.equals(bajaAR.getBtnActBusqueda())) {
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
			else if(cmd.equals(consultaAR.getBtnActBusqueda())) {
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
			else if(cmd.equals(modificacionAR.getBtnActBusqueda())) {
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
		else if (cmd instanceof JRadioButton) {		
				//BajaAreas
				if(cmd.equals(bajaAR.getRdbtnId())) {
					bajaAR.isIDactive();
				}
				else if(cmd.equals(bajaAR.getRdbtnNombre())) {
					bajaAR.isNombreActive();
				}
				//ConsultaAreas
				else if(cmd.equals(consultaAR.getRdbtnId())) {
					consultaAR.isIDactive();
				}
				else if(cmd.equals(consultaAR.getRdbtnNombre())) {
					consultaAR.isNombreActive();
				}
				//ModificacionAreas
				else if(cmd.equals(modificacionAR.getRdbtnId())) {
					modificacionAR.isIDactive();
				}
				else if(cmd.equals(modificacionAR.getRdbtnNombre())) {
					modificacionAR.isNombreActive();
				}
			}	

	
	}
}