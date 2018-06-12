package vista.area;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controlador.area.ControladorAreas;
import modelo.Area;
import vista.EstructVentana;
import java.awt.Color;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ModificacionArea extends JPanel implements EstructVentana{
	
	private JPanel pnlBusqueda;
	private JLabel lblBusqueda;
	private final ButtonGroup btnGBusqueda = new ButtonGroup();
	private JRadioButton rdbtnId;
	private JTextField txtId;
	private JRadioButton rdbtnNombre;
	private JTextField txtNombre;
	private JButton btnActBusqueda;
	
	private JPanel pnlTablaAreas;
	private JScrollPane scpTablaAreas;
	
	private JButton btnGuardarCambios;
	private JTable tblAreas;
	private DefaultTableModel dTabModel;
	private static final String COLUMNA1="ID_AREA";
	private static final String COLUMNA2="NOMBRE";
	private static final String COLUMNA3="DESCRIPCI�N";
	
	public ModificacionArea() {
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
		rdbtnId.setBounds(27, 53, 51, 23);
		pnlBusqueda.add(rdbtnId);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(84, 54, 113, 20);
		pnlBusqueda.add(txtId);
		txtId.setColumns(10);
		
		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setSelected(true);
		btnGBusqueda.add(rdbtnNombre);
		rdbtnNombre.setBounds(309, 53, 79, 23);
		pnlBusqueda.add(rdbtnNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(394, 54, 144, 20);
		pnlBusqueda.add(txtNombre);
		txtNombre.setColumns(10);
		
		btnActBusqueda = new JButton("Comenzar");
		btnActBusqueda.setBounds(238, 94, 103, 23);
		pnlBusqueda.add(btnActBusqueda);
		
		pnlTablaAreas = new JPanel();
		pnlTablaAreas.setBounds(10, 150, 580, 307);
		add(pnlTablaAreas);
		pnlTablaAreas.setLayout(new BorderLayout(0, 0));
		
		scpTablaAreas = new JScrollPane();
		pnlTablaAreas.add(scpTablaAreas, BorderLayout.CENTER);
		
		tblAreas = new JTable();
		scpTablaAreas.setViewportView(tblAreas);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.setForeground(Color.BLUE);
		btnGuardarCambios.setBounds(223, 468, 153, 23);
		add(btnGuardarCambios);
		
	}

	public void setControlador(ControladorAreas control) {
		rdbtnId.addActionListener(control);
		rdbtnNombre.addActionListener(control);
		btnActBusqueda.addActionListener(control);
		btnGuardarCambios.addActionListener(control);
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

	public JButton getBtnActBusqueda() {
		return btnActBusqueda;
	}

	public JButton getBtnGuardarCambios() {
		return btnGuardarCambios;
	}
	
	public void isIDactive() {
		txtId.setEnabled(true);
		txtNombre.setEnabled(false);
	}
	
	public void isNombreActive() {
		txtId.setEnabled(false);
		txtNombre.setEnabled(true);
	}

	public int obtenerIB() {
		int id = 0;
		try{
			id = Integer.parseInt(txtId.getText());
		} catch(Exception e){
			JOptionPane.showMessageDialog(getParent(), "El ID debe ser n�mero","Error de ID",JOptionPane.ERROR_MESSAGE);
		}
		return id;
	}

	public void cargarTabla(ArrayList<Area> listaAreas) {
		
		dTabModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int arg0, int arg1) {
				return true;
			}
		};
		
		tblAreas.setModel(dTabModel);
		
		dTabModel.addColumn(COLUMNA1);
		dTabModel.addColumn(COLUMNA2);
		dTabModel.addColumn(COLUMNA3);
		
		tblAreas.getColumn(COLUMNA1);
		tblAreas.getColumn(COLUMNA2);
		tblAreas.getColumn(COLUMNA3);
		
		Object[] fila = new Object[3];
		
		for(Area itera : listaAreas) {
			fila[0] = itera.getId_area();
			fila[1] = itera.getNombre();
			fila[2] = itera.getDescripcion();
			dTabModel.addRow(fila);
		}
	}

	public String obtenerNombre() {
		String nombre = txtNombre.getText();
		return nombre;
	}
}