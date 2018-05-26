package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import controlador.CVentanaPrincipal;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements EstructVentana{
	private JMenuBar menuBar;
	private JMenu mnPI;
	private JMenuItem mntmConsultas;
	private JMenuItem mntmAlta;
	private JMenuItem mntmBaja;
	private JMenuItem mntmModificacion;
	private JMenu mnAlumnos;
	private JMenuItem mntmAltaA;
	private JMenuItem mntmBajaA;
	private JMenuItem mntmModificacionA;
	private JMenu mnAreas;
	private JMenuItem mntmAltaAR;
	private JMenuItem mntmBajaAR;
	private JMenuItem mntmModificacionAR;
	private JMenuItem mntmConsultasA;
	private JMenuItem mntmConsultasAR;
	private JScrollPane scrollPane;

	public VentanaPrincipal() {
		cargarMenu();
		inicializar();
	}

	public void inicializar() {
		try { // por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());// esto es pa que se vea en unos
																						// laos igual Mac linux windows
																						// //por defecto en todo
		} catch (Exception e) { // por defecto en todo
			e.printStackTrace(); // por defecto en todo
		}

		setBackground(SystemColor.text);
		getContentPane().setBackground(SystemColor.text);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // por defecto en todo
		setPreferredSize(new Dimension(610, 510)); // por defecto en todo
		setResizable(true);
		


		// asignamos tamaño a la ventana 

		setPreferredSize(new Dimension(620, 580));  

		// Se obtienen las dimensiones en pixels de la pantalla.       

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               

		// Se obtienen las dimensiones en pixels de la ventana.       

		Dimension ventana = this.getPreferredSize();               

		// Una cuenta para situar la ventana en el centro de la pantalla.       

		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	}

	private void cargarMenu() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnPI = new JMenu("P.I.");
		menuBar.add(mnPI);
		
				mntmAlta = new JMenuItem("Alta");
				mnPI.add(mntmAlta);
		
				mntmBaja = new JMenuItem("Baja");
				mnPI.add(mntmBaja);

		mntmConsultas = new JMenuItem("Consultas");
		mnPI.add(mntmConsultas);
		mntmConsultas.setActionCommand("ConsultaPI");

		mntmModificacion = new JMenuItem("Modificacion");
		mnPI.add(mntmModificacion);

		mnAlumnos = new JMenu("Alumnos");
		menuBar.add(mnAlumnos);

		mntmAltaA = new JMenuItem("Alta");
		mnAlumnos.add(mntmAltaA);

		mntmBajaA = new JMenuItem("Baja");
		mnAlumnos.add(mntmBajaA);
		
		mntmConsultasA = new JMenuItem("Consultas");
		mnAlumnos.add(mntmConsultasA);

		mntmModificacionA = new JMenuItem("Modificacion");
		mnAlumnos.add(mntmModificacionA);

		mnAreas = new JMenu("Areas");
		menuBar.add(mnAreas);
		
		mntmAltaAR = new JMenuItem("Alta");
		mnAreas.add(mntmAltaAR);

		mntmBajaAR = new JMenuItem("Baja");
		mnAreas.add(mntmBajaAR);
		
		mntmConsultasAR = new JMenuItem("Consultas");
		mnAreas.add(mntmConsultasAR);
		mntmConsultasAR.setActionCommand("mntmConsultasAR");
		
		mntmModificacionAR = new JMenuItem("Modificacion");
		mnAreas.add(mntmModificacionAR);
		
	}
	
	
	public void hacerVisible() {
		pack();
		setVisible(true);
	}
	
	public void setControlador(CVentanaPrincipal c1) {
		mntmAlta.addActionListener(c1);
		mntmAltaA.addActionListener(c1);
		mntmAltaAR.addActionListener(c1);
		
		mntmBaja.addActionListener(c1);
		mntmBajaA.addActionListener(c1);
		mntmBajaAR.addActionListener(c1);
		
		mntmModificacion.addActionListener(c1);
		mntmModificacionA.addActionListener(c1);
		mntmModificacionAR.addActionListener(c1);
		
		mntmConsultas.addActionListener(c1);
		mntmConsultasA.addActionListener(c1);
		mntmConsultasAR.addActionListener(c1);
	}
//getters de los botones del menu
	public JMenuItem getMntmConsultas() {
		return mntmConsultas;
	}

	public JMenuItem getMntmAlta() {
		return mntmAlta;
	}

	public JMenuItem getMntmBaja() {
		return mntmBaja;
	}

	public JMenuItem getMntmModificacion() {
		return mntmModificacion;
	}

	public JMenuItem getMntmAltaA() {
		return mntmAltaA;
	}

	public JMenuItem getMntmBajaA() {
		return mntmBajaA;
	}

	public JMenuItem getMntmModificacionA() {
		return mntmModificacionA;
	}

	public JMenuItem getMntmAltaAR() {
		return mntmAltaAR;
	}

	public JMenuItem getMntmBajaAR() {
		return mntmBajaAR;
	}

	public JMenuItem getMntmModificacionAR() {
		return mntmModificacionAR;
	}

	public JMenuItem getMntmConsultasA() {
		return mntmConsultasA;
	}

	public JMenuItem getMntmConsultasAR() {
		return mntmConsultasAR;
	}
//final de los getter del menu de la ventana principal
	
	public void verPanel(JPanel obj1) {
		scrollPane.setViewportView(obj1);
	}
		
	
}