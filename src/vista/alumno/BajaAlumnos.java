package vista.alumno;


import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controlador.CVentanaPrincipal;
import controlador.alumnos.ControladorAlumnos;
import controlador.area.ControladorArea;
import vista.EstructVentana;

/**
 * Eliminar alumno
 *
 */
@SuppressWarnings("serial")
public class BajaAlumnos extends JPanel implements EstructVentana{



	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}
	
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
		
		rdbtnBusqId = new JRadioButton("Mediante ID");
		Id_Nombre.add(rdbtnBusqId);
		rdbtnBusqId.setBounds(50, 22, 109, 23);
		add(rdbtnBusqId);
		
		txtID = new JTextField();
		txtID.setBounds(165, 23, 118, 20);
		add(txtID);
		txtID.setColumns(10);
		
		rdbtnBusqNombre = new JRadioButton("Mediante Nombre");
		rdbtnBusqNombre.setSelected(true);
		Id_Nombre.add(rdbtnBusqNombre);
		rdbtnBusqNombre.setBounds(50, 48, 109, 23);
		add(rdbtnBusqNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 49, 118, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		rdbtnBusqApellidos = new JRadioButton("Apellidos");
		rdbtnBusqApellidos.setBounds(289, 48, 89, 23);
		add(rdbtnBusqApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(378, 49, 159, 20);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(10, 81, 527, 260);
		add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(165, 352, 89, 23);
		add(btnFinalizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(289, 352, 89, 23);
		add(btnEliminar);
		
		
	}
	
	public void setControlador(ControladorAlumnos control) {
		rdbtnBusqApellidos.addActionListener(control);
		rdbtnBusqId.addActionListener(control);
		rdbtnBusqNombre.addActionListener(control);
		btnEliminar.addActionListener(control);
		btnFinalizar.addActionListener(control);
	}

	public ButtonGroup getId_Nombre() {
		return Id_Nombre;
	}

	public JRadioButton getRdbtnBusqId() {
		return rdbtnBusqId;
	}

	public JRadioButton getRdbtnBusqNombre() {
		return rdbtnBusqNombre;
	}


	public JRadioButton getRdbtnBusqApellidos() {
		return rdbtnBusqApellidos;
	}


	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	
	public void adA() {
		txtNombre.setEnabled(false);
		txtApellidos.setEnabled(false);
	}
	
	public void nombreA() {
		txtNombre.setEnabled(true);
		txtApellidos.setEnabled(true);
	}

	
}
