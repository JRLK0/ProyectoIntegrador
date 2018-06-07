package vista.alumno;

import vista.EstructVentana;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controlador.CVentanaPrincipal;
import controlador.alumnos.ControladorAlumnos;
import controlador.area.ControladorArea;

/**
 * Modificar alumnos en bases de datos
 *
 */
@SuppressWarnings("serial")
public class ModificacionAlumnos extends JPanel implements EstructVentana{

	

	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}
	
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
		
		rbtnId = new JRadioButton("Mediante ID");
		rbtnId.setBounds(50, 17, 109, 23);
		add(rbtnId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(165, 18, 118, 20);
		add(txtId);
		
		rbtnNombre = new JRadioButton("Mediante Nombre");
		rbtnNombre.setSelected(true);
		rbtnNombre.setBounds(50, 43, 109, 23);
		add(rbtnNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(165, 44, 118, 20);
		add(txtNombre);
		
		rbtnApellidos = new JRadioButton("Apellidos");
		rbtnApellidos.setBounds(289, 43, 89, 23);
		add(rbtnApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(378, 44, 159, 20);
		add(txtApellidos);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(10, 73, 527, 270);
		add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(163, 352, 89, 23);
		add(btnFinalizar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(287, 352, 89, 23);
	    add(btnModificar);
		
			
	}
	public void setControlador(ControladorAlumnos control) {
		btnFinalizar.addActionListener(control);
		btnModificar.addActionListener(control);
	}

	public JRadioButton getRbtnId() {
		return rbtnId;
	}

	public JRadioButton getRbtnNombre() {
		return rbtnNombre;
	}


	public JRadioButton getRbtnApellidos() {
		return rbtnApellidos;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
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
