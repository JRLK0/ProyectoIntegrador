package vista.area;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import vista.EstructVentana;

@SuppressWarnings("serial")
public class ConsultaArea extends JFrame implements EstructVentana{

	private JPanel pnlBusqueda;  //Panel de los componentes búsqueda
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
	}
}