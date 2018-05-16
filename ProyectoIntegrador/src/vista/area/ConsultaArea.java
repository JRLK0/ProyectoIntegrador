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

import controlador.area.CConsultaArea;
import vista.EstructVentana;

@SuppressWarnings("serial")
public class ConsultaArea extends JPanel implements EstructVentana{
	
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
	
	private JButton btnDetalles;
	
	public ConsultaArea() {
		inicializar();
	}

	@Override
	public void inicializar() {
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
		rdbtnId.setActionCommand("rdbtnId");
		pnlBusqueda.add(rdbtnId);
		
		txtId = new JTextField();
		txtId.setBounds(84, 33, 113, 20);
		pnlBusqueda.add(txtId);
		txtId.setColumns(10);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setSelected(true);
		btnGBusqueda.add(rdbtnNombre);
		rdbtnNombre.setBounds(27, 58, 79, 23);
		rdbtnNombre.setActionCommand("rdbtnNombre");
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
		btnActBusqueda.setActionCommand("btnActBusqueda");
		pnlBusqueda.add(btnActBusqueda);
		
		pnlTablaAreas = new JPanel();
		pnlTablaAreas.setBounds(10, 150, 580, 307);
		add(pnlTablaAreas);
		pnlTablaAreas.setLayout(new BorderLayout(0, 0));
		
		scpTablaAreas = new JScrollPane();
		pnlTablaAreas.add(scpTablaAreas, BorderLayout.CENTER);
		
		btnDetalles = new JButton("Detalles");
		btnDetalles.setBounds(255, 468, 89, 23);
		btnDetalles.setActionCommand("btnDetalles");
		add(btnDetalles);
		
	}

	public void addActionListener(CConsultaArea control) {
		rdbtnId.addActionListener(control);
		rdbtnNombre.addActionListener(control);
		btnActBusqueda.addActionListener(control);
		btnDetalles.addActionListener(control);
	}
	
	public JRadioButton getRdbtnId() {
		return rdbtnId;
	}
	
	public JRadioButton getRdbtnNombre() {
		return rdbtnNombre;
	}

	public JLabel getLblApellidos() {
		return lblApellidos;
	}

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}

	/*private JPanel pnlBusqueda;  //Panel de los componentes búsqueda
	private JLabel lblBsqueda;   //"Búsqueda"

	private JLabel lblNombre;   //"Nombre:"
	private JTextField txtNombre;   //Introducir nombre
	
	private JLabel lblId;  //"ID:"
	private JTextField txtId;  //Introducir ID
	
	private JButton btnActivarBusqueda;  //Botón "Activar Búsqueda"
	
	private JPanel pnlArea;	 //Panel de la tabla alumnos
	private JScrollPane scrpArea;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	
	public ConsultaArea() throws HeadlessException {
		super("Consultar Areas");
		inicializar();
	}

	@Override
	public void inicializar() {
getContentPane().setLayout(null);
		
		pnlBusqueda = new JPanel();
		pnlBusqueda.setToolTipText("");
		pnlBusqueda.setBounds(10, 11, 790, 110);
		getContentPane().add(pnlBusqueda);
		pnlBusqueda.setLayout(null);
		
		lblBsqueda = new JLabel("B\u00FAsqueda");
		lblBsqueda.setHorizontalAlignment(SwingConstants.CENTER);
		lblBsqueda.setToolTipText("");
		lblBsqueda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBsqueda.setBounds(341, 11, 79, 23);
		pnlBusqueda.add(lblBsqueda);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(128, 43, 65, 23);
		pnlBusqueda.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(205, 45, 171, 20);
		pnlBusqueda.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(413, 45, 32, 23);
		pnlBusqueda.add(lblId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(455, 45, 171, 20);
		pnlBusqueda.add(txtId);
		
		btnActivarBusqueda = new JButton("Activar B\u00FAsqueda");
		btnActivarBusqueda.setBounds(327, 76, 140, 23);
		pnlBusqueda.add(btnActivarBusqueda);
		
		pnlArea = new JPanel();
		pnlArea.setBounds(10, 132, 790, 400);
		getContentPane().add(pnlArea);
		pnlArea.setLayout(new BorderLayout(0, 0));
		
		scrpArea = new JScrollPane();
		pnlArea.add(scrpArea, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		
		btnFinalizar.setBounds(360, 543, 89, 23);
		getContentPane().add(btnFinalizar);
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(250, 250, 827, 612);
		setResizable(false);
	}

	public void hacerVisible() {
		setVisible(true);
	}*/
}