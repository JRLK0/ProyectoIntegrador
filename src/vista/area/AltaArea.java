package vista.area;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.area.ControladorArea;
import vista.EstructVentana;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class AltaArea extends JPanel implements EstructVentana{
	
	private JLabel lblId;
	private JTextField txtId;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblDescripcion;
	private JTextArea txtDescripcion;
	private JButton btnLimpiarDatos;
	private JButton btnCrear;
	
	public AltaArea() {
		inicializar();
	}

	@Override
	public void inicializar() {
		setPreferredSize(new Dimension(600, 400));
		setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(32, 37, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(88, 34, 122, 20);
		add(txtId);
		txtId.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(32, 82, 56, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(88, 79, 174, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setBounds(32, 132, 73, 14);
		add(lblDescripcion);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setBounds(32, 157, 531, 131);
		add(txtDescripcion);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(197, 325, 89, 23);
		add(btnCrear);
		btnCrear.setActionCommand("btnCrear");
		
		btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setBounds(308, 325, 114, 23);
		add(btnLimpiarDatos);
		btnLimpiarDatos.setActionCommand("btnLimpiarDatos");
		
	}

	public void setControlador(ControladorArea control) {
		btnCrear.addActionListener(control);
		btnLimpiarDatos.addActionListener(control);
		
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextArea getTxtDescripcion() {
		return txtDescripcion;
	}

	public JButton getBtnLimpiarDatos() {
		return btnLimpiarDatos;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}
}