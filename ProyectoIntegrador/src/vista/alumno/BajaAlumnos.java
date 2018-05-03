package vista.alumno;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import vista.EstructVentana;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

/**
 * Eliminar alumno
 *
 */
@SuppressWarnings("serial")
public class BajaAlumnos extends JFrame implements EstructVentana{
	
	private final ButtonGroup Id_Nombre = new ButtonGroup();  //Solo busca por ID o por Nombre
	
	private JRadioButton rdbtnBusqId;  //Si selecciona ID
	private JTextField txtID;  //Introducir ID
	
	private JRadioButton rdbtnBusqNombre;  //Si selecciona Nombre
	private JTextField txtNombre;  //Introducir Nombre
	private JRadioButton rdbtnBusqApellidos;  //Si el rdbtnNombre está seleecionado y si acepta los apellidos
	private JTextField txtApellidos;  //Introducir Apellidos
	
	private JPanel pnlAlumnos;  //Panel de la tabla alumnos
	private JScrollPane scrpAlumnos;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnEliminar;  //Botón "Eliminar"
	
	public BajaAlumnos() throws HeadlessException {
		super("Eliminar alumnos");
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
		
		rdbtnBusqId = new JRadioButton("Mediante ID");
		Id_Nombre.add(rdbtnBusqId);
		rdbtnBusqId.setBounds(50, 22, 109, 23);
		getContentPane().add(rdbtnBusqId);
		
		txtID = new JTextField();
		txtID.setBounds(165, 23, 118, 20);
		getContentPane().add(txtID);
		txtID.setColumns(10);
		
		rdbtnBusqNombre = new JRadioButton("Mediante Nombre");
		rdbtnBusqNombre.setSelected(true);
		Id_Nombre.add(rdbtnBusqNombre);
		rdbtnBusqNombre.setBounds(50, 48, 109, 23);
		getContentPane().add(rdbtnBusqNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 49, 118, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		rdbtnBusqApellidos = new JRadioButton("Apellidos");
		rdbtnBusqApellidos.setBounds(289, 48, 89, 23);
		getContentPane().add(rdbtnBusqApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(378, 49, 159, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(10, 81, 527, 260);
		getContentPane().add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(165, 352, 89, 23);
		getContentPane().add(btnFinalizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(289, 352, 89, 23);
		getContentPane().add(btnEliminar);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(250, 250, 563, 424);		
	}

	public void hacerVisible() {
		setVisible(true);
	}
}
