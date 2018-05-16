package vista.alumno;

import javax.swing.JPanel;

import controlador.CVentanaPrincipal;
import vista.EstructVentana;

/**
 * Añadir alumnos
 *
 */
@SuppressWarnings("serial")
public class AltaAlumnos extends JPanel implements EstructVentana{

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}
	
	/*private JLabel lblId;  //"ID:"
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
		super("Alta para Alumnos");
		inicializar();
	}

	@Override
	public void inicializar() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		getContentPane().setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(37, 16, 52, 23);
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(116, 18, 125, 20);
		getContentPane().add(txtId);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(37, 50, 65, 23);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(116, 52, 145, 20);
		getContentPane().add(txtNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(37, 84, 74, 23);
		getContentPane().add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(116, 86, 168, 20);
		getContentPane().add(txtApellidos);
		
		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpediente.setBounds(37, 118, 89, 23);
		getContentPane().add(lblExpediente);
		
		txtAExpediente = new JTextArea();
		txtAExpediente.setBounds(37, 140, 355, 79);
		getContentPane().add(txtAExpediente);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(98, 228, 89, 23);
		getContentPane().add(btnFinalizar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(224, 228, 89, 23);
		getContentPane().add(btnLimpiar);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(250, 250, 450, 300);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}*/
}
