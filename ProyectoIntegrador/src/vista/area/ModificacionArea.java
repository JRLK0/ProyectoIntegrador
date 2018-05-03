package vista.area;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import vista.EstructVentana;

@SuppressWarnings("serial")
public class ModificacionArea extends JFrame implements EstructVentana{

	private JRadioButton rbtnId;  //Si selecciona el ID
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
	}	
}