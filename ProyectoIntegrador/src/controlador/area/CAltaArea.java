package controlador.area;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Area;
import vista.area.AltaArea;

public class CAltaArea implements ActionListener {

	public static final String FINALIZAR="F";
	public static final String LIMPIAR="L";
	private ArrayList<Area> areas = new ArrayList<Area>();
	private AltaArea vArea;
	
	public CAltaArea(AltaArea vArea){
		this.vArea = vArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case CAltaArea.FINALIZAR:
			areas.add(new Area(vArea.getTxtId().getText(),vArea.getTxtNombre().getText(),vArea.getTxtDescripcion().getText()));
			vArea.dispose();
			break;

		case CAltaArea.LIMPIAR:
			vArea.getTxtId().setText("");
			vArea.getTxtNombre().setText("");
			vArea.getTxtDescripcion().setText("");
			break;
		}
	}
}