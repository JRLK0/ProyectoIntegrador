package vista.alumno;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.CVentanaPrincipal;
import controlador.area.ControladorArea;
import modelo.Alumno;
import modelo.Area;
import vista.EstructVentana;

/**
 * Añadir alumnos
 *
 */
@SuppressWarnings("serial")
public class AltaAlumnos extends JPanel implements EstructVentana{

	

	

	public Object getBtnCrear() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private JLabel lblId;  //"ID:"
	
	private JLabel lblNombre;  //"Nombre:"
	private JTextField txtNombre;  //Introducir nombre
	
	private JLabel lblApellidos;  //"Apellidos:"
	private JTextField txtApellidos;  //Introducir apellidos
	
	private JLabel lblExpediente;  //"Expediente:"
	private JTextArea txtAExpediente;  //"Introducir expediente"
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnLimpiar;	 //Botón Limpiar
	
	public AltaAlumnos() throws HeadlessException {
		
		inicializar();
	}

	@Override
	public void inicializar() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setLayout(null);
		
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(216, 40, 19, 16);
		add(lblId);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(181, 71, 54, 16);
		add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(172, 101, 63, 16);
		add(lblApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(245, 70, 101, 20);
		add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(245, 100, 138, 20);
		add(txtApellidos);
		
		
		txtAExpediente = new JTextArea();
		txtAExpediente.setBounds(245, 131, 101, 22);
		add(txtAExpediente);
		
		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpediente.setBounds(159, 134, 76, 16);
		add(lblExpediente);
		
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(193, 199, 71, 23);
		add(btnFinalizar);
		
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(330, 199, 65, 23);
		add(btnLimpiar);
		
		
	}
	
	public void setControlador(ControladorArea control) {
		btnFinalizar.addActionListener(control);
		btnLimpiar.addActionListener(control);
		
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	
	public void mostrarCampos() {
		lblId.setEnabled(false);
		txtApellidos.setEnabled(false);
		lblNombre.setEnabled(true);
		txtNombre.setEnabled(true);
		lblExpediente.setEnabled(true);
		txtAExpediente.setEnabled(true);
		btnFinalizar.setEnabled(true);
		btnLimpiar.setEnabled(true);
		lblApellidos.setEnabled(true);
	}
	
	public void borrarCampos() {
		txtNombre.setText("");
		txtAExpediente.setText("");
		txtApellidos.setText("");
	}
	
	
	
}

