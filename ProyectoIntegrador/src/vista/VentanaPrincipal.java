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
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements EstructVentana{
	
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
	
	private JLabel lblLogo;
	
	private JPanel pnlPaneles;
	private JScrollPane scpPaneles;

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
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}

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
}