/**
 * 
 */
package controlador.proyecto_integrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import accesoDB.PIPersistencia;
import modelo.Alumno;
import vista.VentanaPrincipal;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.agregarAlumnos;

/**
 * @author jorge
 *
 */
public class ControladorPI implements ActionListener {

	private CrearPI crearPI;
	private PIPersistencia piPersis;
	private agregarAlumnos agAlumno;
	private VentanaPrincipal ventanillaPrincipal;

	public ControladorPI(VentanaPrincipal vp1) {
		super();
		ventanillaPrincipal=vp1;
	}

	public void setCrearPI(CrearPI crearPI) {
		this.crearPI = crearPI;
	}

	public void setPiPersis(PIPersistencia piPersis) {
		this.piPersis = piPersis;
	}

	public void setAgAlumno(agregarAlumnos agAlumno) {
		this.agAlumno = agAlumno;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		// crearPI
		if (source.equals(crearPI.getBtnAgregar())) {
			// boton agregar

			ArrayList<Alumno> kiki = piPersis.dameAlumnos();
			System.out.println("hola");
			// funciona pero necesita convertirse a tostring el array list eso se deberia de
			// hacer en la clase de agregarAlumno
			agAlumno = new agregarAlumnos(kiki, ventanillaPrincipal, true);// ESTA MIERDA A VER COMO LO HAGO, HAY QUE PONERLE LA
																// VENTANA PRINCIPAL EN TO EL PUTO MEDIO PRIMO

		} else if (source.equals(crearPI.getBtnQuitar())) {
			// boton quitar

			System.out.println("hola");

		} else if (source.equals(crearPI.getBtnGuardar())) {
			// boton guardar

			System.out.println("hola");

		} else if (source.equals(crearPI.getBtnLimpiar())) {
			// boton limpiar0

			System.out.println("hola");

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
