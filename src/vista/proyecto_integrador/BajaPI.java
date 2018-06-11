package vista.proyecto_integrador;

import java.awt.HeadlessException;

import vista.EstructVentana;

import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.proyecto_integrador.ControladorPI;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class BajaPI extends JPanel implements EstructVentana{
	private JTextField txtBusqueda;
	private JLabel lblDarDeBaja;
	private JList listaResultado;
	private JButton btnRestaurar;
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
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(112, 43, 312, 20);
		add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		listaResultado = new JList();
		listaResultado.setToolTipText("");
		listaResultado.setBounds(10, 93, 414, 164);
		add(listaResultado);
		
		btnBorrarSeleccion = new JButton("Borrar seleccion");
		btnBorrarSeleccion.setBounds(30, 268, 131, 20);
		add(btnBorrarSeleccion);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 42, 89, 23);
		add(btnBuscar);
		
		btnRestaurar = new JButton("Restaurar");
		btnRestaurar.setBounds(275, 267, 89, 23);
		add(btnRestaurar);
		
		
		
		
		/////////////////////////////////////////////////////
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //por defecto en todo
		//setBounds(250, 250,450,355);  //por defecto en todo
	}
	
	//Añadir el controlador
		
	public void setControlador(ControladorPI control) {			
		btnBorrarSeleccion.addActionListener(control);
		btnBuscar.addActionListener(control);
		btnRestaurar.addActionListener(control);
	}

	public JButton getBtnRestaurar() {
		return btnRestaurar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnBorrarSeleccion() {
		return btnBorrarSeleccion;
	}
	
	
	
}