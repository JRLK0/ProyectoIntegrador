/**
 * 
 */
package controlador.proyecto_integrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import accesoDB.PIPersistencia;
import vista.proyecto_integrador.CrearPI;

/**
 * @author jorge
 *
 */
public class ControladorPI implements ActionListener {

	private CrearPI crearPI;
	private PIPersistencia piPersis;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		// crearPI
		if (source.equals(crearPI.getBtnAgregar())) {
			// boton agregar
			
			piPersis.dameAlumnos();
			

		} else if (source.equals(crearPI.getBtnQuitar())) {
			// boton quitar

		} else if (source.equals(crearPI.getBtnGuardar())) {
			// boton guardar

		} else if (source.equals(crearPI.getBtnLimpiar())) {
			// boton limpiar

		} else if (source.equals(crearPI.getRdbtn1())) {
			// click en radio button anyo 1

		} else if (source.equals(crearPI.getRdbtn2())) {
			// click en radio button anyo 2

		}

		// BajaPI

		// Modificacion PI

		// ConsultaPIs

	}

	// TODO Aquí se concentrará todos los controladores del apartado PI

}
