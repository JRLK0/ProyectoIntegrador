package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;

public class ControladorArea implements ActionListener{

	private AltaArea vAltaArea;
	private BajaArea vBajaArea;
	private ConsultaArea vConsultaArea;
	private ModificacionArea vModificacionArea;
	
	public ControladorArea(AltaArea vAltaArea, BajaArea vBajaArea, ConsultaArea vConsultaArea, ModificacionArea vModificacionArea) {
		super();
		this.vAltaArea = vAltaArea;
		this.vBajaArea = vBajaArea;
		this.vConsultaArea = vConsultaArea;
		this.vModificacionArea = vModificacionArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object cmd = e.getSource();
		
		if(cmd instanceof JButton) {
			//AltaArea
			if(cmd.equals(vAltaArea.getBtnCrear())) {
				
			}
			else if(cmd.equals(vAltaArea.getBtnLimpiarDatos())) {
				
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
