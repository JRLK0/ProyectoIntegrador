package vista.proyecto_integrador;

import java.awt.Dimension;
import java.awt.HeadlessException;

import vista.EstructVentana;

import controlador.proyecto_integrador.ControladorPI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ConsultaPI extends JPanel implements EstructVentana{
	private JTextField txtFiltro;
	private JButton btnDetalle;
	private JList listaResultado;
	private JLabel lblFiltro;

	public ConsultaPI() throws HeadlessException {
		super();
		inicializar();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub
		/////////////////////////////////////////////////////
		setLayout(null);
		
		lblFiltro = new JLabel("Filtro");
		lblFiltro.setBounds(27, 34, 46, 14);
		add(lblFiltro);
		
		txtFiltro = new JTextField();
		txtFiltro.setBounds(72, 31, 332, 20);
		add(txtFiltro);
		txtFiltro.setColumns(10);
		
		listaResultado = new JList();
		listaResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaResultado.setBounds(27, 89, 377, 140);
		add(listaResultado);
		
		btnDetalle = new JButton("detalle");
		btnDetalle.setBounds(169, 265, 89, 23);
		add(btnDetalle);
		
	}

	//Añadir el controlador
	
	/*public void setControlador(ControladorPI control) {
				
	}*/
}