package vista.proyecto_integrador;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.proyecto_integrador.ControladorPI;
import modelo.Alumno;

public class agregarAlumnos extends JDialog {
	private JScrollPane scrollPane;
	private JButton btnAgregar;
	private JList list;

	public agregarAlumnos(ArrayList<Alumno> ArrayListAlumnos,Frame frame, boolean block) throws HeadlessException {
		super(frame, block);

		inicializar(ArrayListAlumnos);
		

	}

	private void inicializar(ArrayList<Alumno> alAlumno) {

		try { // por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());// esto es pa que se vea en unos
																						// laos igual Mac linux windows
																						// //por defecto en todo
		} catch (Exception e) { // por defecto en todo
			e.printStackTrace(); // por defecto en todo
		}
		////////////////////////////////////////////////////

		getContentPane().setLayout(new BorderLayout(0, 0));

		btnAgregar = new JButton("Agregar");
		getContentPane().add(btnAgregar, BorderLayout.SOUTH);

		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		list = new JList(alAlumno.toArray());

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// setPreferredSize(new Dimension(400, 250)); // por defecto en todo
		setResizable(true);

		// asignamos tamaño a la ventana

		setPreferredSize(new Dimension(620, 580));

		// Se obtienen las dimensiones en pixels de la pantalla.

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

		// Se obtienen las dimensiones en pixels de la ventana.

		Dimension ventana = this.getPreferredSize();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//DISPOSEEEEE

		setBounds(300, 300, 452, 320);

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

	public Alumno getSelectedItem() {
		// TODO Auto-generated method stub
		Alumno alumnoSeleccionado = (Alumno) list.getSelectedValue();
		return alumnoSeleccionado;
	}

}
