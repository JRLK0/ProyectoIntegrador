package vista.area;

import javax.swing.JPanel;

import controlador.area.CAltaAreas;
import controlador.area.ControladorArea;
import modelo.Area;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class AltaArea extends JPanel{
	private JTextField txtNombre;
	private JLabel lblId;
	private JButton btnVerificarId;
	private JLabel lblNombre;
	private JLabel lblDescripcion;
	private JTextArea txtDescripcion;
	private JButton btnBorrarCampos;
	private JButton btnAnadirArea;
	private JSpinner spnId;
	
	public AltaArea() {
		super();
		inicializar();
	}

	public void inicializar() {
		
		lblId = new JLabel("ID:");
		
		btnVerificarId = new JButton("Verificar ID");
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setEnabled(false);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setEnabled(false);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setEnabled(false);
		
		btnBorrarCampos = new JButton("Borrar Campos");
		btnBorrarCampos.setEnabled(false);
		
		btnAnadirArea = new JButton("A\u00F1adir area");
		btnAnadirArea.setEnabled(false);
		
		spnId = new JSpinner();
		spnId.setModel(new SpinnerNumberModel(1, 1, 999, 1));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(lblId)
							.addGap(18)
							.addComponent(spnId, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnVerificarId))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDescripcion)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombre)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addComponent(btnBorrarCampos)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAnadirArea)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(btnVerificarId)
						.addComponent(spnId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescripcion)
						.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBorrarCampos)
						.addComponent(btnAnadirArea))
					.addGap(28))
		);
		setLayout(groupLayout);
	}
	
	public void setControlador(CAltaAreas control) {
		btnVerificarId.addActionListener(control);
		btnAnadirArea.addActionListener(control);
		btnBorrarCampos.addActionListener(control);
	}
	
	public JButton getBtnVerificarId() {
		return btnVerificarId;
	}

	public JButton getBtnBorrarCampos() {
		return btnBorrarCampos;
	}

	public JButton getBtnAnadirArea() {
		return btnAnadirArea;
	}

	public int obtenerID() {
		int id = (int)spnId.getValue();
		return id;
	}

	public JSpinner getSpnId() {
		return spnId;
	}

	public void mostrarCampos() {
		lblId.setEnabled(false);
		spnId.setEnabled(false);
		lblNombre.setEnabled(true);
		txtNombre.setEnabled(true);
		lblDescripcion.setEnabled(true);
		txtDescripcion.setEnabled(true);
		btnAnadirArea.setEnabled(true);
		btnBorrarCampos.setEnabled(true);
	}

	public void borrarCampos() {
		txtNombre.setText("");
		txtDescripcion.setText("");
	}

	public Area obtenerArea() {
		Area area = null;
		area = new Area((int)spnId.getValue(), txtNombre.getText(), txtDescripcion.getText());
		return area;
	}
}