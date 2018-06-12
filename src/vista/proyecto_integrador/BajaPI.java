package vista.proyecto_integrador;

import java.awt.HeadlessException;

import vista.EstructVentana;

import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.proyecto_integrador.ControladorPI;
import modelo.Alumno;
import modelo.ProyectoIntegradorPOJO;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class BajaPI extends JPanel implements EstructVentana{
	private JTextField txtBusqueda;
	private JLabel lblDarDeBaja;
	private JList <ProyectoIntegradorPOJO>listaResultado;
	private JButton btnRestaurar;
	private JButton btnBuscar;
	private JButton btnBorrarSeleccion;
	private DefaultListModel<ProyectoIntegradorPOJO>modeloPI;

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
		txtBusqueda.setBounds(133, 36, 298, 23);
		add(txtBusqueda);
		txtBusqueda.setColumns(10);
		modeloPI = new DefaultListModel();
		
		btnBorrarSeleccion = new JButton("Borrar seleccion");
		btnBorrarSeleccion.setBounds(147, 268, 131, 20);
		add(btnBorrarSeleccion);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 36, 113, 23);
		add(btnBuscar);
		
		btnRestaurar = new JButton("Restaurar Filtro");
		btnRestaurar.setBounds(10, 59, 113, 23);
		add(btnRestaurar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 414, 167);
		add(scrollPane);
		
		listaResultado = new JList();
		scrollPane.setViewportView(listaResultado);
		listaResultado.setToolTipText("");
		
		
		
		
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
	
	public void agregarPI(ArrayList<ProyectoIntegradorPOJO> arraListPI) {
		// TODO Auto-generated method stub

		modeloPI.clear();
		
		for (ProyectoIntegradorPOJO proyectoIntegradorPOJO : arraListPI) {
			modeloPI.addElement(proyectoIntegradorPOJO);
		}
		listaResultado.setModel(modeloPI);
		
		
	}//end agregarPIs

	public String recogeBusqueda() {
		// TODO Auto-generated method stub
		return txtBusqueda.getText();
	}
}