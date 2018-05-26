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

import controlador.area.ControladorArea;
import vista.EstructVentana;
import javax.swing.JTable;

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
	private JTable tblAreas;
	
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
		lblApellidos.setBounds(266, 62, 54, 14);
		pnlBusqueda.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(322, 59, 152, 20);
		pnlBusqueda.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		btnActBusqueda = new JButton("Comenzar");
		btnActBusqueda.setBounds(239, 94, 102, 23);
		btnActBusqueda.setActionCommand("btnActBusqueda");
		pnlBusqueda.add(btnActBusqueda);
		
		pnlTablaAreas = new JPanel();
		pnlTablaAreas.setBounds(10, 150, 580, 307);
		add(pnlTablaAreas);
		pnlTablaAreas.setLayout(new BorderLayout(0, 0));
		
		scpTablaAreas = new JScrollPane();
		pnlTablaAreas.add(scpTablaAreas, BorderLayout.CENTER);
		
		tblAreas = new JTable();
		scpTablaAreas.setViewportView(tblAreas);
		
		btnDetalles = new JButton("Detalles");
		btnDetalles.setBounds(255, 468, 89, 23);
		btnDetalles.setActionCommand("btnDetalles");
		add(btnDetalles);
		
	}

	public void setControlador(ControladorArea control) {
		btnActBusqueda.addActionListener(control);
		btnDetalles.addActionListener(control);
	}

	public JRadioButton getRdbtnId() {
		return rdbtnId;
	}

	public JRadioButton getRdbtnNombre() {
		return rdbtnNombre;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}

	public JButton getBtnActBusqueda() {
		return btnActBusqueda;
	}

	public JButton getBtnDetalles() {
		return btnDetalles;
	}
	
	public void isIDactive() {
		lblApellidos.setEnabled(false);
		txtApellidos.setEnabled(false);
	}
	
	public void isNombreActive() {
		lblApellidos.setEnabled(true);
		txtApellidos.setEnabled(true);
	}
}