package vista.proyecto_integrador;

import java.awt.HeadlessException;
import java.util.ArrayList;

import vista.EstructVentana;

import controlador.proyecto_integrador.ControladorPI;
import modelo.ProyectoIntegradorPOJO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ModificarPI extends JPanel implements IVpi {
	private JTextField txtBuscar;
	private JLabel lblModificarUnProyecto;
	private JButton button;
	private JList<ProyectoIntegradorPOJO> listResultado;
	private JButton btnModificarSeleccionado;
	private JButton btnRestaurar;
	private JScrollPane scrollPane;
	private DefaultListModel<ProyectoIntegradorPOJO> modeloPI;

	public ModificarPI() throws HeadlessException {
		super();

		inicializar();

	}

	@Override
	public void inicializar() {

		///////////////////////////////////////////////////////////////////////
		setLayout(null);

		lblModificarUnProyecto = new JLabel("Modificar un proyecto integrador");
		lblModificarUnProyecto.setBounds(10, 11, 414, 14);
		add(lblModificarUnProyecto);

		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(112, 41, 312, 20);
		add(txtBuscar);

		button = new JButton("Buscar");
		button.setBounds(10, 39, 89, 23);
		add(button);

		btnModificarSeleccionado = new JButton("Modificar seleccionado");
		// TODO que abra la ventana de CrearPi pero en MODO MODIFICAR
		btnModificarSeleccionado.setBounds(38, 285, 153, 20);
		add(btnModificarSeleccionado);

		btnRestaurar = new JButton("Restaurar");
		btnRestaurar.setBounds(256, 285, 92, 20);
		add(btnRestaurar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 447, 203);
		add(scrollPane);

		listResultado = new JList();
		modeloPI = new DefaultListModel();
		scrollPane.setViewportView(listResultado);
		listResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	}

	@Override
	public void setControlador(ControladorPI control) {
		// TODO Auto-generated method stub

	}

	public void agregarPI(ArrayList<ProyectoIntegradorPOJO> arraListPI) {
		// TODO Auto-generated method stub

		modeloPI.clear();

		for (ProyectoIntegradorPOJO proyectoIntegradorPOJO : arraListPI) {
			modeloPI.addElement(proyectoIntegradorPOJO);
		}
		listResultado.setModel(modeloPI);
	}
	
	public String recogeBusqueda() {
		// TODO Auto-generated method stub
		return txtBuscar.getText();
	}

}
