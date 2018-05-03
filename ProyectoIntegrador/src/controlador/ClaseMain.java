package controlador;

import java.awt.EventQueue;

import vista.VentanaPrincipal;

public class ClaseMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaPrincipal vp = new VentanaPrincipal();
				vp.hacerVisible();	
			}
		});
	}
}