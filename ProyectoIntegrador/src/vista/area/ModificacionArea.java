package vista.area;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controlador.proyecto_integrador.CVentanaPrincipal;
import vista.EstructVentana;
import java.awt.Color;

@SuppressWarnings("serial")
public class ModificacionArea extends JPanel implements EstructVentana{
	
	private JPanel pnlBusqueda;
	private JLabel lblBusqueda;
	private final ButtonGroup btnGBusqueda = new ButtonGroup();
	private JRadioButton rdbtnId;
	private JTextField txtId;
	private JRadioButton rdbtnNombre;
	private JTextField txtNombre;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JButton btnActBusqueda;
	
	private JPanel pnlTablaAreas;
	private JScrollPane scpTablaAreas;
	
	private JButton btnGuardarCambios;
	private JButton btnReset;
	
	public ModificacionArea() {
		inicializar();
	}

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub
		setPreferredSize(new Dimension(600, 500));
		setLayout(null);
		
		pnlBusqueda = new JPanel();
		pnlBusqueda.setBounds(10, 11, 580, 128);
		add(pnlBusqueda);
		pnlBusqueda.setLayout(null);
		
		lblBusqueda = new JLabel("B\u00FAsqueda");
		lblBusqueda.setBounds(260, 8, 60, 17);
		pnlBusqueda.add(lblBusqueda);
		lblBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		rdbtnId = new JRadioButton("ID");
		btnGBusqueda.add(rdbtnId);
		rdbtnId.setBounds(27, 32, 51, 23);
		pnlBusqueda.add(rdbtnId);
		
		txtId = new JTextField();
		txtId.setBounds(84, 33, 113, 20);
		pnlBusqueda.add(txtId);
		txtId.setColumns(10);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setSelected(true);
		btnGBusqueda.add(rdbtnNombre);
		rdbtnNombre.setBounds(27, 58, 79, 23);
		pnlBusqueda.add(rdbtnNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(112, 59, 144, 20);
		pnlBusqueda.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(266, 62, 46, 14);
		pnlBusqueda.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(322, 59, 152, 20);
		pnlBusqueda.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		btnActBusqueda = new JButton("Comenzar");
		btnActBusqueda.setBounds(245, 94, 89, 23);
		pnlBusqueda.add(btnActBusqueda);
		
		pnlTablaAreas = new JPanel();
		pnlTablaAreas.setBounds(10, 150, 580, 307);
		add(pnlTablaAreas);
		pnlTablaAreas.setLayout(new BorderLayout(0, 0));
		
		scpTablaAreas = new JScrollPane();
		pnlTablaAreas.add(scpTablaAreas, BorderLayout.CENTER);
		
		btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(204, 0, 0));
		btnReset.setBackground(new Color(204, 0, 0));
		btnReset.setBounds(314, 468, 89, 23);
		add(btnReset);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.setForeground(Color.BLUE);
		btnGuardarCambios.setBackground(Color.BLUE);
		btnGuardarCambios.setBounds(181, 468, 123, 23);
		add(btnGuardarCambios);
		
	}

	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}

	/*private JRadioButton rbtnId;  //Si selecciona el ID
	private JTextField txtId;  //Introducir ID
	
	private JRadioButton rbtnNombre;  //Si selecciona Nombre
	private JTextField txtNombre;  //Introducir Nombre
	
	private JRadioButton rbtnDescripcion;  //Si selecciona Descripción
	private JTextField txtDescripcion;  //Introducir Descripción
	
	private JPanel pnlAreas;  //Panel de la tabla area
	private JScrollPane scrpAreas;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnModificar;  //Botón "Modificar"
	
	public ModificacionArea() throws HeadlessException {
		super("Modificar Área");
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
		
		rbtnDescripcion = new JRadioButton("Descripci\u00F3n");
		rbtnDescripcion.setBounds(289, 43, 89, 23);
		getContentPane().add(rbtnDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(378, 44, 159, 20);
		getContentPane().add(txtDescripcion);
		
		pnlAreas = new JPanel();
		pnlAreas.setBounds(10, 73, 527, 270);
		getContentPane().add(pnlAreas);
		pnlAreas.setLayout(new BorderLayout(0, 0));
		
		scrpAreas = new JScrollPane();
		pnlAreas.add(scrpAreas, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(163, 352, 89, 23);
		getContentPane().add(btnFinalizar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(287, 352, 89, 23);
		getContentPane().add(btnModificar);
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(250, 250, 563, 424);
		setResizable(false);
	}

	public void hacerVisible() {
		setVisible(true);
	}*/	
}