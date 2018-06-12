package vista.proyecto_integrador;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.util.ArrayList;

import vista.EstructVentana;

import controlador.proyecto_integrador.ControladorPI;
import modelo.ProyectoIntegradorPOJO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ConsultaPI extends JPanel implements EstructVentana{
	private JTextField txtFiltro;
	private JButton btnDetalle;
	private JList <ProyectoIntegradorPOJO>listaResultado;
	private JLabel lblFiltro;
	private DefaultListModel<ProyectoIntegradorPOJO>modeloPI;
	private JScrollPane scrollPane;
	private JButton btnExplicacion;

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
		txtFiltro.setBounds(72, 31, 489, 20);
		add(txtFiltro);
		txtFiltro.setColumns(10);
		
		btnDetalle = new JButton("detalle");
		btnDetalle.setBounds(250, 381, 89, 23);
		add(btnDetalle);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 61, 540, 309);
		add(scrollPane);
		
		listaResultado = new JList();
		scrollPane.setViewportView(listaResultado);
		listaResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		btnExplicacion = new JButton("Explicacion");
		btnExplicacion.setBounds(445, 405, 116, 23);
		add(btnExplicacion);
		
		modeloPI = new DefaultListModel();
		
	}

	//Añadir el controlador
	
	public void setControlador(ControladorPI control) {
		btnDetalle.addActionListener(control);	
		btnExplicacion.addActionListener(control);
	}

	public JButton getBtnDetalle() {
		return btnDetalle;
	}

	public String recogeBusqueda() {
		// TODO Auto-generated method stub
		return txtFiltro.getText();
	}

	public void agregarPI(ArrayList<ProyectoIntegradorPOJO> damePI) {
		// TODO Auto-generated method stub
		
		modeloPI.clear();
		
		for (ProyectoIntegradorPOJO proyectoIntegradorPOJO : damePI) {
			modeloPI.addElement(proyectoIntegradorPOJO);
		}
		listaResultado.setModel(modeloPI);
		
	}

	public JButton getBtnExplicacion() {
		return btnExplicacion;
	}
	
	public void msgError(String string) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(getParent(), string, "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	public void msgGood(String string) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(getParent(), string, "NICEE", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}