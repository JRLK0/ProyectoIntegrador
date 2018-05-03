package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.area.BajaArea;
import vista.area.BajaAreaPanel;

public class CBajaArea implements ActionListener{
	
	public static final String BUSQUEDA="B";
	public static final String FINALIZAR="F";
	public static final String ELIMINAR ="E";
	private BajaArea vBajaArea;
	
	public CBajaArea(BajaArea vBajaArea) {
		this.vBajaArea = vBajaArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case CBajaArea.BUSQUEDA:
			BajaAreaPanel bajaAreaPanel = new BajaAreaPanel();
			vBajaArea.getScrpAreas().setViewportView(bajaAreaPanel);
			break;
		case CBajaArea.FINALIZAR:
			
			break;
		case CBajaArea.ELIMINAR:
	
			break;
		}
	}
}