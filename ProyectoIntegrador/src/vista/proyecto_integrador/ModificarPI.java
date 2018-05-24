package vista.proyecto_integrador;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import vista.EstructVentana;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class ModificarPI extends JPanel implements EstructVentana{
	private JTextField textField;
	private JLabel lblModificarUnProyecto;
	private JButton button;
	private JList list;
	private JButton btnModificarSeleccionado;
	private JButton btnReset;

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

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 41, 312, 20);
		add(textField);

		button = new JButton("Buscar");
		button.setBounds(10, 39, 89, 23);
		add(button);

		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 89, 414, 181);
		add(list);

		btnModificarSeleccionado = new JButton("Modificar seleccionado");
		// TODO que abra la ventana de CrearPi pero en MODO MODIFICAR
		btnModificarSeleccionado.setBounds(38, 285, 153, 20);
		add(btnModificarSeleccionado);

		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReset.setBounds(256, 285, 92, 20);
		add(btnReset);

	}

		public void setControlador() {
			//TODO setControlador  EL CONTROLADORRR
		}
}
