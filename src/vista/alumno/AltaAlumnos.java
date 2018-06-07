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
	private JTextField txtId;  //Introducir ID
	
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
		
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(37, 16, 52, 23);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(116, 18, 125, 20);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(37, 50, 65, 23);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(116, 52, 145, 20);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(37, 84, 74, 23);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(116, 86, 168, 20);
		
		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpediente.setBounds(37, 118, 89, 23);
		
		
		txtAExpediente = new JTextArea();
		txtAExpediente.setBounds(37, 140, 355, 79);
		
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(98, 228, 89, 23);
		
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(224, 228, 89, 23);
		
		
		
	}

	

	
}

