package vista.proyecto_integrador;

import vista.EstructVentana;

import controlador.proyecto_integrador.ControladorPI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CrearPI extends JPanel implements EstructVentana{
	private JTextField txtUrl;
	private final ButtonGroup btnGCursos = new ButtonGroup();
	private JTextField txtGrupo;
	private JLabel lblNombreDelProyecto;
	private JTextField txtNamePrj;
	private JLabel lblComponentes;
	private JList<String> listComponentes;
	private JLabel lblUrlGithubProyecto;
	private JLabel lblNota;
	private JSpinner spnNota;
	private JLabel lblAnyo;
	private JSpinner spnAnyo;
	private JLabel lblCurso;
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn2;
	private JLabel lblGrupo;
	private JLabel lblArea;
	private JComboBox cmbArea;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JLabel lblIdentificadorunico;
	private JTextField txtIdun;
	private JButton btnQuitar;
	private JButton btnAgregar;

	public CrearPI() {
		super();
		inicializar();

	}
	@Override
	public void inicializar() {

		setLayout(null);
		
		lblIdentificadorunico = new JLabel("Identificador \u00FAnico:");
		lblIdentificadorunico.setBounds(10, 11, 123, 14);
		add(lblIdentificadorunico);

		txtIdun = new JTextField();
		txtIdun.setBounds(143, 8, 281, 20);
		txtIdun.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtIdun);
		txtIdun.setColumns(10);

		lblNombreDelProyecto = new JLabel("Nombre del proyecto:");
		lblNombreDelProyecto.setBounds(10, 36, 123, 14);
		add(lblNombreDelProyecto);

		txtNamePrj = new JTextField();
		txtNamePrj.setBounds(143, 33, 281, 20);
		txtNamePrj.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtNamePrj);
		txtNamePrj.setColumns(10);

		lblComponentes = new JLabel("Componentes:");
		lblComponentes.setBounds(10, 61, 123, 14);
		add(lblComponentes);

		listComponentes = new JList<String>();
		listComponentes.setBounds(143, 64, 281, 71);
		add(listComponentes);

		lblUrlGithubProyecto = new JLabel("URL GitHub Proyecto:");
		lblUrlGithubProyecto.setBounds(10, 149, 123, 14);
		add(lblUrlGithubProyecto);

		txtUrl = new JTextField();
		txtUrl.setBounds(143, 146, 281, 20);
		add(txtUrl);
		txtUrl.setColumns(10);

		lblNota = new JLabel("Nota:");
		lblNota.setBounds(71, 188, 46, 14);
		add(lblNota);

		spnNota = new JSpinner();
		spnNota.setBounds(114, 185, 61, 20);
		spnNota.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		add(spnNota);

		lblAnyo = new JLabel("A\u00F1o:");
		lblAnyo.setBounds(71, 213, 46, 14);
		add(lblAnyo);

		spnAnyo = new JSpinner();
		spnAnyo.setBounds(114, 210, 61, 20);
		spnAnyo.setModel(new SpinnerNumberModel(2000, 2000, 2020, 1));
		add(spnAnyo);

		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(218, 188, 46, 14);
		add(lblCurso);

		rdbtn1 = new JRadioButton("1\u00BA");
		rdbtn1.setBounds(270, 184, 46, 23);
		btnGCursos.add(rdbtn1);
		add(rdbtn1);

		rdbtn2 = new JRadioButton("2\u00BA");
		rdbtn2.setBounds(331, 184, 46, 23);
		btnGCursos.add(rdbtn2);
		add(rdbtn2);

		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(218, 213, 46, 14);
		add(lblGrupo);

		txtGrupo = new JTextField();
		txtGrupo.setBounds(270, 210, 86, 20);
		add(txtGrupo);
		txtGrupo.setColumns(10);

		lblArea = new JLabel("Area:");
		lblArea.setBounds(10, 247, 46, 14);
		add(lblArea);

		cmbArea = new JComboBox();
		cmbArea.setBounds(143, 244, 281, 20);
		add(cmbArea);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(86, 275, 89, 23);
		add(btnGuardar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(267, 275, 89, 23);
		add(btnLimpiar);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 86, 89, 23);
		add(btnAgregar);

		btnQuitar = new JButton("Quitar");
		btnQuitar.setBounds(10, 112, 89, 23);
		add(btnQuitar);

	}

	//Añadir el controlador
		
	/*public void setControlador(ControladorPI control) {
			
	}*/
}
