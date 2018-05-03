package vista.area;

import java.awt.Dimension;

import javax.swing.JPanel;

import vista.EstructVentana;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class BajaAreaPanel extends JPanel implements EstructVentana {
	
	private JLabel lblKudhgisughegike;

	public BajaAreaPanel() {
		inicializar();
	}

	@Override
	public void inicializar() {
		setSize(new Dimension(527, 260));
		setLayout(new BorderLayout(0, 0));
		
		lblKudhgisughegike = new JLabel("kudhgisughegike");
		add(lblKudhgisughegike, BorderLayout.CENTER);
	}
}