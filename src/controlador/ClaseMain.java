package controlador;

import java.awt.EventQueue;

import controlador.area.ControladorArea;
import vista.VentanaPrincipal;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;

public class ClaseMain {
//sure
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				//Declarar las vistas
				VentanaPrincipal vp = new VentanaPrincipal();
				
				AltaArea vAltaArea = new AltaArea();
				BajaArea vBajaArea = new BajaArea();
				ConsultaArea vConsultaArea = new ConsultaArea();
				ModificacionArea vModificacionArea = new ModificacionArea();
				
				//Declarar los controladores
				
				CVentanaPrincipal cvp= new CVentanaPrincipal(vp);
				ControladorArea cVentAreas = new ControladorArea(vAltaArea, vBajaArea, vConsultaArea, vModificacionArea);
				
				//Añadir controladores a la vista
				
				vp.setControlador(cvp);
				
				vAltaArea.setControlador(cVentAreas);
				vBajaArea.setControlador(cVentAreas);
				vConsultaArea.setControlador(cVentAreas);
				vModificacionArea.setControlador(cVentAreas);
				
				//Hacer visible la VentanaPrincipal
				
				vp.hacerVisible();
			}
		});
	}
}