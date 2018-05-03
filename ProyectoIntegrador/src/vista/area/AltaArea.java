package vista.area;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.area.CAltaArea;
import vista.EstructVentana;

@SuppressWarnings("serial")
public class AltaArea extends JFrame implements EstructVentana{

	private JLabel lblId;  //"ID:"
	private JTextField txtId;  //Introducir ID
	
	private JLabel lblNombre;  //"Nombre:"
	private JTextField txtNombre;  //Introducir nombre
	
	private JLabel lblDescripcion;  //"Decripción:"
	private JTextArea txtDescripcion;  //"Introducir descripción"
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JButton btnLimpiar;	 //Botón Limpiar
	
	public AltaArea() throws HeadlessException {
		super("Alta para Áreas");
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
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(37, 16, 52, 23);
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(116, 18, 125, 20);
		getContentPane().add(txtId);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(37, 50, 65, 23);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(116, 52, 145, 20);
		getContentPane().add(txtNombre);
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcion.setBounds(37, 84, 89, 23);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setBounds(37, 118, 355, 29);
		getContentPane().add(txtDescripcion);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(96, 158, 89, 23);
		getContentPane().add(btnFinalizar);
		btnFinalizar.setActionCommand(CAltaArea.FINALIZAR);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(222, 158, 89, 23);
		getContentPane().add(btnLimpiar);
		btnLimpiar.setActionCommand(CAltaArea.LIMPIAR);
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(250, 250, 450, 230);
		setResizable(false);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	//Eventos de botones
	public void addActionListener(CAltaArea control) {
		btnFinalizar.addActionListener(control);
		btnLimpiar.addActionListener(control);
	}
	
	//Setter y Getter para utilizar a la hora de escribir por teclado
	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextArea txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}

	
	
}