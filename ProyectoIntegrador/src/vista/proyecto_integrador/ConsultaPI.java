package vista.proyecto_integrador;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;

import controlador.CVentanaPrincipal;
import vista.EstructVentana;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ConsultaPI extends JPanel implements EstructVentana{
	private JTextField textField;
	private JButton btnDetalle;
	private JList list;
	private JLabel lblFiltro;

	public ConsultaPI() throws HeadlessException {
		super();
		inicializar();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub
		setPreferredSize(new Dimension(250, 100));
		/////////////////////////////////////////////////////
		setLayout(null);
		
		lblFiltro = new JLabel("Filtro");
		lblFiltro.setBounds(27, 34, 46, 14);
		add(lblFiltro);
		
		textField = new JTextField();
		textField.setBounds(72, 31, 332, 20);
		add(textField);
		textField.setColumns(10);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(27, 89, 377, 140);
		add(list);
		
		btnDetalle = new JButton("detalle");
		btnDetalle.setBounds(169, 265, 89, 23);
		add(btnDetalle);
		
	}



	public void setControlador() {
		// TODO poner el controlador en los argumentos del metodo.
		
	}
	
	

}
