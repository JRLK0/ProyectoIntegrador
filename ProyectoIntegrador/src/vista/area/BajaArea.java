package vista.area;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.area.CBajaArea;
import vista.EstructVentana;

@SuppressWarnings("serial")
public class BajaArea extends JFrame implements EstructVentana{

private final ButtonGroup Id_Nombre = new ButtonGroup();  //Solo busca por ID o por Nombre
	
	private JRadioButton rdbtnBusqId;  //Si selecciona ID
	private JTextField txtID;  //Introducir ID
	
	private JRadioButton rdbtnBusqNombre;  //Si selecciona Nombre
	private JTextField txtNombre;  //Introducir Nombre
	private JRadioButton rdbtnBusqDescripcion;  //Si el rdbtnNombre está seleccionado y si acepta la descripción
	private JTextField txtDescripcion;  //Introducir descripción
	private JButton btnActivarBsqueda;  //Empezar a buscar
	
	private JPanel pnlAreas;  //Panel de la tabla area
	private JScrollPane scrpAreas;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnEliminar;  //Botón "Eliminar"
	
	public BajaArea() throws HeadlessException {
		super("Bajada de Áreas");
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
		
		rdbtnBusqDescripcion = new JRadioButton("Descripcion");
		rdbtnBusqDescripcion.setBounds(289, 48, 89, 23);
		getContentPane().add(rdbtnBusqDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(378, 49, 159, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		btnActivarBsqueda = new JButton("Activar Búsqueda");
		btnActivarBsqueda.setBounds(213, 80, 133, 23);
		getContentPane().add(btnActivarBsqueda);
		btnActivarBsqueda.setActionCommand(CBajaArea.BUSQUEDA);
		
		pnlAreas = new JPanel();
		pnlAreas.setBounds(10, 114, 527, 294);
		getContentPane().add(pnlAreas);
		pnlAreas.setLayout(new BorderLayout(0, 0));
		
		scrpAreas = new JScrollPane();
		pnlAreas.add(scrpAreas, BorderLayout.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(165, 419, 89, 23);
		getContentPane().add(btnFinalizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(289, 419, 89, 23);
		getContentPane().add(btnEliminar);
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(250, 250, 563, 481);
		setResizable(false);
	}


	public void hacerVisible() {
		setVisible(true);
	}

	public JScrollPane getScrpAreas() {
		return scrpAreas;
	}
	
	public void addActionPerfomed(CBajaArea control) {
		btnActivarBsqueda.addActionListener(control);
	}
}