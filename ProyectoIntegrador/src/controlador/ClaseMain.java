package controlador;

import java.awt.EventQueue;

import vista.VentanaPrincipal;

public class ClaseMain {
//sure
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
<<<<<<< HEAD
				VentanaPrincipal vp = new VentanaPrincipal();
				CVentanaPrincipal cvp= new CVentanaPrincipal(vp);
				vp.setControlador(cvp);
=======
				VentanaPrincipal vp = new VentanaPrincipal("Bienvenidos");
				CVentanaPrincipal control = new CVentanaPrincipal(vp);
				vp.addActionListener(control);
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
				vp.hacerVisible();	
			}
		});
	}
}