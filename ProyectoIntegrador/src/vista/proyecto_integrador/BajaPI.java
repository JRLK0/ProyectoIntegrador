package vista.proyecto_integrador;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import vista.EstructVentana;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BajaPI extends JPanel implements EstructVentana{
	private JTextField textField;
	private JLabel lblDarDeBaja;
	private JList list;
	private JButton btnReset;
	private JButton btnBuscar;
	private JButton btnBorrarSeleccion;

	public BajaPI() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub.
		inicializar();
	}

	@Override
	public void inicializar() {
		
		setLayout(null);
		
		lblDarDeBaja = new JLabel("Dar de baja un proyecto integrador");
		lblDarDeBaja.setBounds(10, 11, 414, 14);
		add(lblDarDeBaja);
		
		textField = new JTextField();
		textField.setBounds(112, 43, 312, 20);
		add(textField);
		textField.setColumns(10);
		
		list = new JList();
		list.setBounds(10, 93, 414, 164);
		add(list);
		
		btnBorrarSeleccion = new JButton("Borrar seleccion");
		btnBorrarSeleccion.setBounds(30, 268, 131, 20);
		btnBorrarSeleccion.setActionCommand("btnBorrarSeleccion");
		add(btnBorrarSeleccion);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 42, 89, 23);
		btnBuscar.setActionCommand("btnBuscar");
		add(btnBuscar);
		
		btnReset = new JButton("reset");
		btnReset.setBounds(275, 267, 89, 23);
		btnReset.setActionCommand("btnReset");
		add(btnReset);
		
		
		
		
		/////////////////////////////////////////////////////
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //por defecto en todo
		//setBounds(250, 250,450,355);  //por defecto en todo
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	//TODO addactionListener
	

	

}
