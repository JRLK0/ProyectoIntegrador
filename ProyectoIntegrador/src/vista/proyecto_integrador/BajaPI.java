package vista.proyecto_integrador;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.proyecto_integrador.CBajaPI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BajaPI extends JFrame{
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

	
	private void inicializar() {
		try {  //por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//esto es pa que se vea en unos laos igual Mac linux windows //por defecto en todo
		} catch (Exception e) {   //por defecto en todo
			// TODO Auto-generated catch block   //por defecto en todo
			e.printStackTrace();   //por defecto en todo
		}
		getContentPane().setLayout(null);
		
		lblDarDeBaja = new JLabel("Dar de baja un proyecto integrador");
		lblDarDeBaja.setBounds(10, 11, 414, 14);
		getContentPane().add(lblDarDeBaja);
		
		textField = new JTextField();
		textField.setBounds(112, 43, 312, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		list = new JList();
		list.setBounds(10, 93, 414, 164);
		getContentPane().add(list);
		
		btnBorrarSeleccion = new JButton("Borrar seleccion");
		btnBorrarSeleccion.setBounds(30, 268, 131, 20);
		btnBorrarSeleccion.setActionCommand("btnBorrarSeleccion");
		getContentPane().add(btnBorrarSeleccion);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 42, 89, 23);
		btnBuscar.setActionCommand("btnBuscar");
		getContentPane().add(btnBuscar);
		
		btnReset = new JButton("reset");
		btnReset.setBounds(275, 267, 89, 23);
		btnReset.setActionCommand("btnReset");
		getContentPane().add(btnReset);
		
		
		
		
		/////////////////////////////////////////////////////
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //por defecto en todo
		setBounds(250, 250,450,355);  //por defecto en todo
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	//TODO addactionListener
	
	public void addActionListener(CBajaPI bpi) {
		btnBorrarSeleccion.addActionListener(bpi);
		btnBuscar.addActionListener(bpi);
		btnReset.addActionListener(bpi);
	}
	

}
