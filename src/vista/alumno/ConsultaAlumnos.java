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
import controlador.area.ControladorArea;
import vista.EstructVentana;

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
	
	private JLabel lblId;  //"ID:"
	private JTextField txtId;  //Introducir ID
	
	private JButton btnActivarBusqueda;  //Botón "Activar Búsqueda"
	
	private JPanel pnlAlumnos;	 //Panel de la tabla alumnos
	private JScrollPane scrpAlumnos;  //En caso de que la tabla sea sobredimensionada
	
	private JButton btnFinalizar;  //Botón "Finalizar"
	
	public ConsultaAlumnos() throws HeadlessException {

		inicializar();
	}

	@Override
	public void inicializar() {
		setLayout(null);
		
		pnlBusqueda = new JPanel();
		pnlBusqueda.setToolTipText("");
		pnlBusqueda.setBounds(10, 11, 790, 132);
		add(pnlBusqueda);
		pnlBusqueda.setLayout(null);
		
		lblBsqueda = new JLabel("B\u00FAsqueda");
		lblBsqueda.setHorizontalAlignment(SwingConstants.CENTER);
		lblBsqueda.setToolTipText("");
		lblBsqueda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBsqueda.setBounds(341, 11, 79, 23);
		pnlBusqueda.add(lblBsqueda);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(10, 63, 65, 23);
		pnlBusqueda.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(85, 65, 171, 20);
		pnlBusqueda.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(266, 63, 65, 23);
		pnlBusqueda.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(341, 65, 171, 20);
		pnlBusqueda.add(txtApellidos);
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(522, 63, 43, 23);
		pnlBusqueda.add(lblId);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(575, 65, 171, 20);
		pnlBusqueda.add(txtId);
		
		btnActivarBusqueda = new JButton("Activar B\u00FAsqueda");
		btnActivarBusqueda.setBounds(322, 98, 140, 23);
		pnlBusqueda.add(btnActivarBusqueda);
		
		pnlAlumnos = new JPanel();
		pnlAlumnos.setBounds(10, 154, 790, 378);
		add(pnlAlumnos);
		pnlAlumnos.setLayout(new BorderLayout(0, 0));
		
		scrpAlumnos = new JScrollPane();
		pnlAlumnos.add(scrpAlumnos, BorderLayout.CENTER);
		
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
