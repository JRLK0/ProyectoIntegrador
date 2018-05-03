package vista.alumno;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import vista.EstructVentana;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * Modificar alumnos en bases de datos
 *
 */
@SuppressWarnings("serial")
public class ModificacionAlumnos extends JFrame implements EstructVentana{
	
	private JRadioButton rbtnId;  //Si selecciona el ID
	private JTextField txtId;  //Introducir ID
	
	private JRadioButton rbtnNombre;  //Si selecciona Nombre
	private JTextField txtNombre;  //Introducir Nombre
	
	private JRadioButton rbtnApellidos;  //Si selecciona Apellidos
	private JTextField txtApellidos;  //Introducir Apellidos
	
	private JPanel pnlAlumnos;  //Panel de la tabla alumnos
	private JScrollPane scrpAlumnos;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnModificar;  //Botón "Modificar"

	public ModificacionAlumnos() throws HeadlessException {
		super("Modificación de alumnos");
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
		
		rbtnId = new JRadioButton("Mediante ID");
		rbtnId.setBounds(50, 17, 109, 23);
		getContentPane().add(rbtnId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(165, 18, 118, 20);
		getContentPane().add(txtId);
		
		rbtnNombre = new JRadioButton("Mediante Nombre");
		rbtnNombre.setSelected(true);
		rbtnNombre.setBounds(50, 43, 109, 23);
		getContentPane().add(rbtnNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(165, 44, 118, 20);
		getContentPane().add(txtNombre);
		
		rbtnApellidos = new JRadioButton("Apellidos");
		rbtnApellidos.setBounds(289, 43, 89, 23);
		getContentPane().add(rbtnApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(378, 44, 159, 20);
		getContentPane().add(txtApellidos);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(10, 73, 527, 270);
		getContentPane().add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(163, 352, 89, 23);
		getContentPane().add(btnFinalizar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(287, 352, 89, 23);
		getContentPane().add(btnModificar);
		
		// TODO Auto-generated method stub
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(250, 250, 563, 424);	
	}

	public void hacerVisible() {
		setVisible(true);
	}
}
