package vista.proyecto_integrador;

import java.awt.HeadlessException;

import vista.EstructVentana;

import controlador.proyecto_integrador.ControladorPI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class ModificarPI extends JPanel implements EstructVentana{
	private JTextField txtBuscar;
	private JLabel lblModificarUnProyecto;
	private JButton button;
	private JList listResultado;
	private JButton btnModificarSeleccionado;
	private JButton btnRestaurar;

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

		listResultado = new JList();
		listResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listResultado.setBounds(10, 89, 414, 181);
		add(listResultado);

		btnModificarSeleccionado = new JButton("Modificar seleccionado");
		// TODO que abra la ventana de CrearPi pero en MODO MODIFICAR
		btnModificarSeleccionado.setBounds(38, 285, 153, 20);
		add(btnModificarSeleccionado);

		btnRestaurar = new JButton("Restaurar");
		btnRestaurar.setBounds(256, 285, 92, 20);
		add(btnRestaurar);

	}

	//Añadir el controlador
	
	/*public void setControlador(ControladorPI control) {
				
	}*/
}
