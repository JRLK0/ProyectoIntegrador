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
import vista.EstructVentana;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JButton btnComenzar;
	private JLabel lblBusqueda;
	
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
		
		rdbtnBusqId = new JRadioButton("ID");
		Id_Nombre.add(rdbtnBusqId);
		rdbtnBusqId.setBounds(10, 22, 53, 23);
		add(rdbtnBusqId);
		
		txtID = new JTextField();
		txtID.setBounds(78, 23, 89, 20);
		add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(78, 52, 118, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		rdbtnBusqApellidos = new JRadioButton("Apellidos");
		rdbtnBusqApellidos.setBounds(226, 51, 72, 23);
		add(rdbtnBusqApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(304, 52, 159, 20);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(27, 121, 527, 238);
		add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.NORTH);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFinalizar.setBounds(162, 370, 89, 23);
		add(btnFinalizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(292, 370, 89, 23);
		add(btnEliminar);
		
		rdbtnBusqNombre = new JRadioButton("Nombre");
		rdbtnBusqNombre.setBounds(10, 48, 63, 30);
		add(rdbtnBusqNombre);
		rdbtnBusqNombre.setSelected(true);
		Id_Nombre.add(rdbtnBusqNombre);
		
		lblBusqueda = new JLabel("    B\u00DASQUEDA");
		lblBusqueda.setBounds(226, 0, 72, 34);
		add(lblBusqueda);
		
		btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComenzar.setBounds(206, 87, 118, 23);
		add(btnComenzar);
		
		
	}
	
	public void setControlador(ControladorAlumnos control) {
		rdbtnBusqApellidos.addActionListener(control);
		rdbtnBusqId.addActionListener(control);
		rdbtnBusqNombre.addActionListener(control);
		btnComenzar.addActionListener(control);
		btnEliminar.addActionListener(control);
		btnFinalizar.addActionListener(control);
	}

	public JButton getBtnComenzar() {
		return btnComenzar;
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
	
	public void idA() {
		txtNombre.setEnabled(false);
		txtApellidos.setEnabled(false);
	}
	
	public void nombreA() {
		txtNombre.setEnabled(true);
		txtApellidos.setEnabled(true);
	}
}
