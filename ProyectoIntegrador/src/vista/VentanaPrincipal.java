package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.CVentanaPrincipal;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements EstructVentana{
	
	private JPanel panel;
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
	private JLabel lblLogo;
	private JMenuItem mntmConsultasA;
	private JMenuItem mntmConsultasAR;

	public VentanaPrincipal() {
		cargarMenu();
		inicializar();
	}

	public void inicializar() {
		// TODO Auto-generated method stub
		try { // por defecto en todo
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());// esto es pa que se vea en unos
																						// laos igual Mac linux windows
																						// //por defecto en todo
		} catch (Exception e) { // por defecto en todo
			e.printStackTrace(); // por defecto en todo
		}

		/////////////////////////////////////	
		///
		getContentPane().setLayout(null);

		setBackground(SystemColor.text);
		getContentPane().setBackground(SystemColor.text);
		panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(0, 0, 743, 436);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/LogoSample_ByTailorBrands.jpg")));
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(261, 88, 220, 260);
		panel.add(lblLogo);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // por defecto en todo
		setBounds(250, 250, 749, 486); // por defecto en todo
		setResizable(false);

	}

	private void cargarMenu() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnPI = new JMenu("P.I.");
		menuBar.add(mnPI);

		mntmConsultas = new JMenuItem("Consultas");
		mnPI.add(mntmConsultas);

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
		
		mntmAltaAR = new JMenuItem("Alta");
		mntmAltaAR.setActionCommand("AltaAR");
		mnAreas.add(mntmAltaAR);			

		mntmBajaAR = new JMenuItem("Baja");
		mntmBajaAR.setActionCommand("BajaAR");
		mnAreas.add(mntmBajaAR);
		
		mntmModificacionAR = new JMenuItem("Modificacion");
		mntmModificacionAR.setActionCommand("ModificacionAR");
		mnAreas.add(mntmModificacionAR);
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}

	public void addActionListener(CVentanaPrincipal control) {
		mntmAltaAR.addActionListener(control);
		// TODO Auto-generated method stub
		
	}
}