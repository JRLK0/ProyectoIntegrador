package vista.proyecto_integrador;

import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

import controlador.proyecto_integrador.ControladorPI;
import modelo.Alumno;

public class agregarAlumnos extends JFrame {
	private JScrollPane scrollPane;
	private JButton btnAgregar;

	public agregarAlumnos(ArrayList<Alumno> ArrayListAlumnos) throws HeadlessException {
		super();

		inicializar(ArrayListAlumnos);
		hacerVisible();

	}

	private void inicializar(ArrayList<Alumno> alAlumno) {
		// TODO Auto-generated method stub

		getContentPane().setLayout(new BorderLayout(0, 0));

		btnAgregar = new JButton("Agregar");
		getContentPane().add(btnAgregar, BorderLayout.SOUTH);

		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);



		

		JList list = new JList(alAlumno.toArray());

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

	}

	public void CargarData() {
		// String [] elementos = {"a","b","c","d"};

		// JList list = new JList(elementos);
	}
	
	public void setControlador(ControladorPI control) {
		
		btnAgregar.addActionListener(control);
		
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	

}
