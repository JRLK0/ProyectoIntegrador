package vista.proyecto_integrador;

import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
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
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class CrearPI extends JPanel {
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JLabel lblNombreDelProyecto;
	private JTextField txtNamePrj;
	private JLabel lblComponentes;
	private JList<String> list;
	private JLabel lblUrlGithubProyecto;
	private JLabel lblNota;
	private JSpinner spinner;
	private JLabel lblAo;
	private JSpinner spinner_1;
	private JLabel lblCurso;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JLabel lblGrupo;
	private JLabel lblArea;
	private JComboBox comboBox;
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

	private void inicializar() {

		setLayout(null);

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

		list = new JList<String>();
		list.setBounds(143, 64, 281, 71);
		add(list);

		lblUrlGithubProyecto = new JLabel("URL GitHub Proyecto:");
		lblUrlGithubProyecto.setBounds(10, 149, 123, 14);
		add(lblUrlGithubProyecto);

		textField = new JTextField();
		textField.setBounds(143, 146, 281, 20);
		add(textField);
		textField.setColumns(10);

		lblNota = new JLabel("Nota:");
		lblNota.setBounds(71, 188, 46, 14);
		add(lblNota);

		spinner = new JSpinner();
		spinner.setBounds(114, 185, 61, 20);
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		add(spinner);

		lblAo = new JLabel("A\u00F1o:");
		lblAo.setBounds(71, 213, 46, 14);
		add(lblAo);

		spinner_1 = new JSpinner();
		spinner_1.setBounds(114, 210, 61, 20);
		spinner_1.setModel(new SpinnerNumberModel(2000, 2000, 2020, 1));
		add(spinner_1);

		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(218, 188, 46, 14);
		add(lblCurso);

		radioButton = new JRadioButton("1\u00BA");
		radioButton.setBounds(270, 184, 46, 23);
		buttonGroup.add(radioButton);
		add(radioButton);

		radioButton_1 = new JRadioButton("2\u00BA");
		radioButton_1.setBounds(331, 184, 46, 23);
		buttonGroup.add(radioButton_1);
		add(radioButton_1);

		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(218, 213, 46, 14);
		add(lblGrupo);

		textField_1 = new JTextField();
		textField_1.setBounds(270, 210, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		lblArea = new JLabel("Area:");
		lblArea.setBounds(10, 247, 46, 14);
		add(lblArea);

		comboBox = new JComboBox();
		comboBox.setBounds(143, 244, 281, 20);
		add(comboBox);

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

		lblIdentificadorunico = new JLabel("Identificador \u00FAnico:");
		lblIdentificadorunico.setBounds(10, 11, 123, 14);
		add(lblIdentificadorunico);

	}

	public void setControlador() {
		// TODO hay que poner el nombre del controlador en los argumentos y añadir todos
		// los botones addactioncommand

	}
}
