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

public class ControladorArea implements ActionListener{

	private AltaArea vAltaArea;
	private BajaArea vBajaArea;
	private ConsultaArea vConsultaArea;
	private ModificacionArea vModificacionArea;
	private AreaPersistencia ap;
	
	public ControladorArea(AltaArea vAltaArea, BajaArea vBajaArea, ConsultaArea vConsultaArea, ModificacionArea vModificacionArea) {
		this.vAltaArea = vAltaArea;
		this.vBajaArea = vBajaArea;
		this.vConsultaArea = vConsultaArea;
		this.vModificacionArea = vModificacionArea;
		ap = new AreaPersistencia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
		if(cmd instanceof JButton) {
			//AltaArea
			if(cmd.equals(vAltaArea.getBtnCrear())) {
				if(vAltaArea.getTxtNombre().getText().equals("")) {
					Area area = vAltaArea.obtenerArea();
					String msg = ap.guardarArea(area);
					JOptionPane.showMessageDialog(vAltaArea, msg,"Subir area",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(vAltaArea, "El campo nombre debe ser rellenable","Fallo a la subida",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(cmd.equals(vAltaArea.getBtnLimpiarDatos())) {
				vAltaArea.limpiarDatos();
			}
			else if (cmd.equals(vAltaArea.getBtnIdentificarId())) {
				int id = vAltaArea.obtenerID();
				if(id > 0) {
					if(!ap.comprobarID(id)) {
						vAltaArea.activarCampos();
					}
					else {
						JOptionPane.showMessageDialog(vAltaArea, "ID existente","ID ocupado",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(vAltaArea, "ID no valido","ID",JOptionPane.ERROR_MESSAGE);
				}
			}
			//BajaArea
			else if(cmd.equals(vBajaArea.getBtnActBusqueda())) {
				
			}
			else if(cmd.equals(vBajaArea.getBtnEliminar())) {
				
			}
			else if(cmd.equals(vBajaArea.getBtnFinalizar())) {
				
			}
			//ConsultaArea
			else if(cmd.equals(vConsultaArea.getBtnActBusqueda())) {
				
			}
			else if(cmd.equals(vConsultaArea.getBtnDetalles())) {
				
			}
			//ModificacionArea
			else if(cmd.equals(vModificacionArea.getBtnActBusqueda())) {
				
			}
			else if(cmd.equals(vModificacionArea.getBtnActBusqueda())) {
				
			}
			else if(cmd.equals(vModificacionArea.getBtnRestaurar())) {
				
			}
		}
		else if(cmd instanceof JRadioButton) {
			//BajaArea
			if(cmd.equals(vBajaArea.getRdbtnId())) {
				vBajaArea.isIDactive();
			}
			else if(cmd.equals(vBajaArea.getRdbtnNombre())) {
				vBajaArea.isNombreActive();
			}
			//ConsultaArea
			if(cmd.equals(vConsultaArea.getRdbtnId())) {
				vConsultaArea.isIDactive();
			}
			else if(cmd.equals(vConsultaArea.getRdbtnNombre())) {
				vConsultaArea.isNombreActive();
			}
			//ModificacionArea
			if(cmd.equals(vModificacionArea.getRdbtnId())) {
				vModificacionArea.isIDactive();
			}
			else if(cmd.equals(vModificacionArea.getRdbtnNombre())) {
				vModificacionArea.isNombreActive();
			}
		}
	}
}