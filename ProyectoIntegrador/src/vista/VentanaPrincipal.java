package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import controlador.area.CAltaArea;
import controlador.area.CBajaArea;
import vista.area.AltaArea;
import vista.area.BajaArea;
import vista.area.ConsultaArea;
import vista.area.ModificacionArea;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
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

	private void inicializar() {
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
		panel.setBounds(0, 0, 488, 260);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Imagenes/LogoSample_ByTailorBrands.jpg")));
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(127, 0, 220, 260);
		panel.add(lblLogo);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // por defecto en todo
		setBounds(250, 250, 504, 320); // por defecto en todo
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
		mnAreas.add(mntmConsultasAR);
		mntmConsultasAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaArea consultaArea = new ConsultaArea();
				consultaArea.hacerVisible();
			}
		});
		
		mntmAltaAR = new JMenuItem("Alta");
		mnAreas.add(mntmAltaAR);
		mntmAltaAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltaArea altaArea = new AltaArea();
				CAltaArea cAltaArea = new CAltaArea(altaArea);
				altaArea.addActionListener(cAltaArea);
				altaArea.hacerVisible();
			}
		});

		mntmBajaAR = new JMenuItem("Baja");
		mnAreas.add(mntmBajaAR);
		mntmBajaAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BajaArea bajaArea = new BajaArea();
				CBajaArea cBajaArea = new CBajaArea(bajaArea);
				bajaArea.addActionPerfomed(cBajaArea);
				bajaArea.hacerVisible();
			}
		});
		
		mntmModificacionAR = new JMenuItem("Modificacion");
		mnAreas.add(mntmModificacionAR);
		mntmModificacionAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModificacionArea modificacionArea = new ModificacionArea();
				modificacionArea.hacerVisible();
			}
		});
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}
}