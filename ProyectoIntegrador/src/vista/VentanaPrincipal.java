package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.CVentanaPrincipal;
<<<<<<< HEAD
import controlador.area.CAltaArea;
import controlador.area.CBajaArea;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;
=======
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

import javax.swing.JLabel;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.Dimension;
=======
import java.awt.HeadlessException;
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

import javax.swing.ImageIcon;
<<<<<<< HEAD
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
=======
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

@SuppressWarnings("serial")
<<<<<<< HEAD
public class VentanaPrincipal extends JFrame {
=======
public class VentanaPrincipal extends JFrame implements EstructVentana{
	
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
	private JMenuBar menuBar;
	private JMenu mnPI;
	private JMenuItem mntmConsultas;
	private JMenuItem mntmAlta;
	private JMenuItem mntmBaja;
	private JMenuItem mntmModificacion;
	private JMenu mnAlumnos;
	private JMenuItem mntmConsultasA;
	private JMenuItem mntmAltaA;
	private JMenuItem mntmBajaA;
	private JMenuItem mntmModificacionA;
	private JMenu mnAreas;
	private JMenuItem mntmConsultasAR;
	private JMenuItem mntmAltaAR;
	private JMenuItem mntmBajaAR;
	private JMenuItem mntmModificacionAR;
<<<<<<< HEAD
	private JMenuItem mntmConsultasA;
	private JMenuItem mntmConsultasAR;
	private JScrollPane scrollPane;
=======
	
	private JLabel lblLogo;
	
	private JPanel pnlPaneles;
	private JScrollPane scpPaneles;
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

	public VentanaPrincipal(String title) throws HeadlessException {
		super(title);
		getContentPane().setBackground(Color.WHITE);
		inicializar();
		cargarMenu();
	}

	public void inicializar() {

		try { // por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());// esto es pa que se vea en unos
																						// laos igual Mac linux windows
																						// //por defecto en todo
		} catch (Exception e) { // por defecto en todo
			e.printStackTrace(); // por defecto en todo
		}
<<<<<<< HEAD

		setBackground(SystemColor.text);
		getContentPane().setBackground(SystemColor.text);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // por defecto en todo
	setBounds(250, 250, 704, 520); // por defecto en todo
	setResizable(true);
		


		// asignamos tamaño a la ventana 

		setPreferredSize(new Dimension(600, 400));  

		// Se obtienen las dimensiones en pixels de la pantalla.       

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               

		// Se obtienen las dimensiones en pixels de la ventana.       

		Dimension ventana = this.getPreferredSize();               

		// Una cuenta para situar la ventana en el centro de la pantalla.       

		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);

=======
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // por defecto en todo
		setBounds(250, 250, 749, 486); // por defecto en todo
		setResizable(false);
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

		
	}

	private void cargarMenu() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnPI = new JMenu("P.I.");
		menuBar.add(mnPI);

		mntmConsultas = new JMenuItem("Consultas");
		mnPI.add(mntmConsultas);
		mntmConsultas.setActionCommand("ConsultaPI");

		mntmAlta = new JMenuItem("Alta");
		mnPI.add(mntmAlta);

		mntmBaja = new JMenuItem("Baja");
		mnPI.add(mntmBaja);

		mntmModificacion = new JMenuItem("Modificacion");
		mnPI.add(mntmModificacion);

		mnAlumnos = new JMenu("Alumnos");
		menuBar.add(mnAlumnos);
		
		mntmConsultasA = new JMenuItem("Consultas");
		mnAlumnos.add(mntmConsultasA);

		mntmAltaA = new JMenuItem("Alta");
		mnAlumnos.add(mntmAltaA);

		mntmBajaA = new JMenuItem("Baja");
		mnAlumnos.add(mntmBajaA);

		mntmModificacionA = new JMenuItem("Modificacion");
		mnAlumnos.add(mntmModificacionA);

		mnAreas = new JMenu("Areas");
		menuBar.add(mnAreas);
		
		mntmConsultasAR = new JMenuItem("Consultas");
		mntmConsultasAR.setActionCommand("ConsultasAR");
		mnAreas.add(mntmConsultasAR);
<<<<<<< HEAD
		mntmConsultasAR.setActionCommand("mntmConsultasAR");
=======
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
		
		mntmAltaAR = new JMenuItem("Alta");
<<<<<<< HEAD
		mnAreas.add(mntmAltaAR);
=======
		mntmAltaAR.setActionCommand("AltaAR");
		mnAreas.add(mntmAltaAR);			
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git

		mntmBajaAR = new JMenuItem("Baja");
		mntmBajaAR.setActionCommand("BajaAR");
		mnAreas.add(mntmBajaAR);
		
		mntmModificacionAR = new JMenuItem("Modificacion");
		mntmModificacionAR.setActionCommand("ModificacionAR");
		mnAreas.add(mntmModificacionAR);
<<<<<<< HEAD
		
=======
		getContentPane().setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(261, 104, 220, 227);
		lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/LogoSample_ByTailorBrands.jpg")));
		getContentPane().add(lblLogo);
		
		pnlPaneles = new JPanel();
		pnlPaneles.setBackground(Color.WHITE);
		pnlPaneles.setBounds(0, 0, 743, 436);
		getContentPane().add(pnlPaneles);
		pnlPaneles.setLayout(new BorderLayout(0, 0));
		
		scpPaneles = new JScrollPane();
		scpPaneles.setBackground(Color.WHITE);
		pnlPaneles.add(scpPaneles, BorderLayout.CENTER);
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}
<<<<<<< HEAD
	
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
		
	
=======

	public void addActionListener(CVentanaPrincipal control) {
		mntmAltaAR.addActionListener(control);
		mntmBajaAR.addActionListener(control);
		mntmConsultasAR.addActionListener(control);
		mntmModificacionAR.addActionListener(control);
	}

	public JScrollPane getScpPaneles() {
		return scpPaneles;
	}

	public JLabel getLblLogo() {
		return lblLogo;
	}
>>>>>>> branch 'master' of git@github.com:JorgeMO17/ProyectoIntegrador.git
}