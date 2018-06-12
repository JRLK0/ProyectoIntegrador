package vista.alumno;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.CVentanaPrincipal;
import controlador.alumnos.ControladorAlumnos;
import vista.EstructVentana;
import javax.swing.JTable;

/**
 * Consultar los alumnos en bases de datos
 *
 */
@SuppressWarnings("serial")
public class ConsultaAlumnos extends JPanel implements EstructVentana{

	

	public void addActionListener(CVentanaPrincipal control) {
		// TODO Auto-generated method stub
		
	}
	
	private JPanel pnlBusqueda;  //Panel de los componentes búsqueda
	private JLabel lblBsqueda;   //"Búsqueda"

	private JLabel lblNombre;   //"Nombre:"
	private JTextField txtNombre;   //Introducir nombre
	
	private JLabel lblApellidos;  //"Apellidos:"
	private JTextField txtApellidos;  //Introducir apellidos
	
	private JButton btnActivarBusqueda;  //Botón "Activar Búsqueda"
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	private JTable table;
	
	public ConsultaAlumnos() throws HeadlessException {

		inicializar();
	}

	@Override
	public void inicializar() {
		setLayout(null);
		
		pnlBusqueda = new JPanel();
		pnlBusqueda.setToolTipText("");
		pnlBusqueda.setBounds(0, 11, 790, 460);
		add(pnlBusqueda);
		pnlBusqueda.setLayout(null);
		
		lblBsqueda = new JLabel("B\u00FAsqueda");
		lblBsqueda.setHorizontalAlignment(SwingConstants.CENTER);
		lblBsqueda.setToolTipText("");
		lblBsqueda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBsqueda.setBounds(217, 11, 79, 23);
		pnlBusqueda.add(lblBsqueda);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(135, 43, 65, 23);
		pnlBusqueda.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(217, 45, 171, 20);
		pnlBusqueda.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(135, 77, 65, 23);
		pnlBusqueda.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(217, 76, 171, 20);
		pnlBusqueda.add(txtApellidos);
		
		btnActivarBusqueda = new JButton("Activar B\u00FAsqueda");
		btnActivarBusqueda.setBounds(217, 121, 140, 23);
		pnlBusqueda.add(btnActivarBusqueda);
		
		table = new JTable();
		table.setBounds(89, 169, 447, 229);
		pnlBusqueda.add(table);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFinalizar.setBounds(360, 543, 89, 23);
	    add(btnFinalizar);
		
	}
	public void setControlador(ControladorAlumnos control) {
		btnActivarBusqueda.addActionListener(control);
		btnFinalizar.addActionListener(control);
	}



	public JButton getBtnActivarBusqueda() {
		return btnActivarBusqueda;
	}


	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}
	
	public void adA() {
		txtNombre.setEnabled(false);
		txtApellidos.setEnabled(false);
	}
	
	public void nombreA() {
		txtNombre.setEnabled(true);
		txtApellidos.setEnabled(true);
	}
}
