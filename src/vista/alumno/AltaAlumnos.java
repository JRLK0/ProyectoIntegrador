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

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import controlador.CVentanaPrincipal;
import controlador.alumnos.ControladorAlumnos;
import controlador.area.ControladorArea;
import modelo.Alumno;
import modelo.Area;
import vista.EstructVentana;
import javax.swing.JSpinner;

/**
 * Añadir alumnos
 *
 */
@SuppressWarnings("serial")
public class AltaAlumnos extends JPanel implements EstructVentana{

	

	
	
	private JLabel lblId;  //"ID:"
	
	private JLabel lblNombre;  //"Nombre:"
	private JTextField txtNombre;  //Introducir nombre
	
	private JLabel lblApellidos;  //"Apellidos:"
	private JTextField txtApellidos;  //Introducir apellidos
	
	private JLabel lblExpediente;  //"Expediente:"
	private JTextArea txtAExpediente;  //"Introducir expediente"
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnLimpiar;	 //Botón Limpiar
	private JSpinner spnId;
	
	public AltaAlumnos() throws HeadlessException {
		
		inicializar();
	}

	@Override
	public void inicializar() {
		setLayout(null);

		
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(159, 51, 19, 16);
		add(lblId);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(124, 78, 54, 16);
		add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(113, 119, 63, 16);
		add(lblApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(188, 77, 112, 20);
		add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(186, 118, 184, 20);
		add(txtApellidos);
		
		
		txtAExpediente = new JTextArea();
		txtAExpediente.setBounds(196, 159, 124, 22);
		add(txtAExpediente);
		
		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpediente.setBounds(102, 162, 76, 16);
		add(lblExpediente);
		
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(159, 218, 71, 23);
		add(btnFinalizar);
		
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(305, 218, 65, 23);
		add(btnLimpiar);
		
		spnId = new JSpinner();
		spnId.setBounds(188, 50, 54, 20);
		add(spnId);
		
		
	}
	
	public void setControlador(ControladorAlumnos control) {
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

	public Alumno cogerDatos() {
		
		Alumno alumno =null;
		alumno = new Alumno( (int) spnId.getValue(), txtNombre.getText(), txtApellidos.getText(), txtAExpediente.getText());
		return alumno;
	}

	
}

