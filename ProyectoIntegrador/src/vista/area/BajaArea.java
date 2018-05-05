package vista.area;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controlador.proyecto_integrador.CVentanaPrincipal;
import vista.EstructVentana;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Color;

@SuppressWarnings("serial")
public class BajaArea extends JPanel implements EstructVentana{

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
	
	private JButton btnEliminar;
	private JButton btnFinalizar;
	
	public BajaArea() {
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
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setBounds(301, 468, 89, 23);
		add(btnEliminar);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(201, 468, 89, 23);
		add(btnFinalizar);
		
	}

	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}
}