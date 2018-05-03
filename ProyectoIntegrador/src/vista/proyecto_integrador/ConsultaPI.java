package vista.proyecto_integrador;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

public class ConsultaPI extends JFrame{
	private JTextField textField;
	private JButton btnDetalle;
	private JList list;
	private JLabel lblFiltro;

	public ConsultaPI() throws HeadlessException {
		super("Consultas");
		inicializar();
		// TODO Auto-generated constructor stub
	}



	private void inicializar() {
		try {  //por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//esto es pa que se vea en unos laos igual Mac linux windows //por defecto en todo
		} catch (Exception e) {   //por defecto en todo
			// TODO Auto-generated catch block   //por defecto en todo
			e.printStackTrace();   //por defecto en todo
		}
		/////////////////////////////////////////////////////
		getContentPane().setLayout(null);
		
		lblFiltro = new JLabel("Filtro");
		lblFiltro.setBounds(27, 34, 46, 14);
		getContentPane().add(lblFiltro);
		
		textField = new JTextField();
		textField.setBounds(72, 31, 332, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(27, 89, 377, 140);
		getContentPane().add(list);
		
		btnDetalle = new JButton("detalle");
		btnDetalle.setBounds(169, 265, 89, 23);
		getContentPane().add(btnDetalle);
		
		
		/////////////////////////////////////////////////////
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //por defecto en todo
		setBounds(250, 250,450,355);  //por defecto en todo
	}
	
	
	
	public void hacerVisible() {
		setVisible(true);
	}
}
