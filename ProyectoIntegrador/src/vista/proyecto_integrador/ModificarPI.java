package vista.proyecto_integrador;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class ModificarPI extends JFrame{
	private JTextField textField;
	private JLabel lblModificarUnProyecto;
	private JButton button;
	private JList list;
	private JButton btnModificarSeleccionado;
	private JButton btnReset;

	public ModificarPI() throws HeadlessException {
		super();

		inicializar();
	
	}

	private void inicializar() {
		// TODO Auto-generated method stub
		
		try {  //por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//esto es pa que se vea en unos laos igual Mac linux windows //por defecto en todo
		} catch (Exception e) {   //por defecto en todo
			// TODO Auto-generated catch block   //por defecto en todo
			e.printStackTrace();   //por defecto en todo
		}
		
		///////////////////////////////////////////////////////////////////////
		getContentPane().setLayout(null);
		
		lblModificarUnProyecto = new JLabel("Modificar un proyecto integrador");
		lblModificarUnProyecto.setBounds(10, 11, 414, 14);
		getContentPane().add(lblModificarUnProyecto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 41, 312, 20);
		getContentPane().add(textField);
		
		button = new JButton("Buscar");
		button.setBounds(10, 39, 89, 23);
		getContentPane().add(button);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 89, 414, 181);
		getContentPane().add(list);
		
		btnModificarSeleccionado = new JButton("Modificar seleccionado");
		//TODO que abra la ventana de CrearPi pero en MODO MODIFICAR
		btnModificarSeleccionado.setBounds(38, 285, 153, 20);
		getContentPane().add(btnModificarSeleccionado);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReset.setBounds(256, 285, 92, 20);
		getContentPane().add(btnReset);
		
		
		
		
		/////////////////////////////////////////////////////
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //por defecto en todo
		setBounds(250, 250,450,355);  //por defecto en todo
	}

	
	public void hacerVisible() {
		setVisible(true);
	}
}
