package controlador;

import java.awt.EventQueue;

import vista.VentanaPrincipal;

public class ClaseMain {
//sure
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaPrincipal vp = new VentanaPrincipal();
				CVentanaPrincipal cvp= new CVentanaPrincipal(vp);
				vp.setControlador(cvp);
				vp.hacerVisible();	
			}
		});
	}
}