package vista.area;

import java.awt.Dimension;

import javax.swing.JPanel;

import controlador.area.ControladorArea;
import modelo.Area;
import vista.EstructVentana;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class AltaArea extends JPanel implements EstructVentana{
	
	private JLabel lblId;
	private JTextField txtId;
	private JButton btnIdentificarId;
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
		lblNombre.setEnabled(false);
		lblNombre.setBounds(32, 82, 56, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setBounds(88, 79, 174, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setEnabled(false);
		lblDescripcion.setBounds(32, 132, 73, 14);
		add(lblDescripcion);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setEnabled(false);
		txtDescripcion.setBounds(32, 157, 531, 131);
		add(txtDescripcion);
		
		btnCrear = new JButton("Crear");
		btnCrear.setEnabled(false);
		btnCrear.setBounds(197, 325, 89, 23);
		add(btnCrear);
		
		btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setEnabled(false);
		btnLimpiarDatos.setBounds(308, 325, 114, 23);
		add(btnLimpiarDatos);
		
		btnIdentificarId = new JButton("Identificar ID");
		btnIdentificarId.setBounds(267, 33, 122, 23);
		add(btnIdentificarId);
		
	}

	public void setControlador(ControladorArea control) {
		btnIdentificarId.addActionListener(control);
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

	public JButton getBtnIdentificarId() {
		return btnIdentificarId;
	}

	public int obtenerID() {
		int id = 0;
		try {
			id = Integer.parseInt(txtId.getText());
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(getParent(), "El id debe ser número","Error",JOptionPane.ERROR_MESSAGE);
		}
		return id;
	}

	public void activarCampos() {
		lblId.setEnabled(false);
		txtId.setEnabled(false);
		btnIdentificarId.setEnabled(false);
		
		lblNombre.setEnabled(true);
		txtNombre.setEnabled(true);
		lblDescripcion.setEnabled(true);
		txtDescripcion.setEnabled(true);
		
		btnCrear.setEnabled(true);
		btnLimpiarDatos.setEnabled(true);
	}

	public void limpiarDatos() {
		txtNombre.setText("");
		txtDescripcion.setText("");
	}

	public Area obtenerArea() {
		Area area = null;
		area = new Area(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtDescripcion.getText());
		return area;
	}
	
}