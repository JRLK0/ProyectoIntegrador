/**
 * 
 */
package controlador.proyecto_integrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import accesoDB.PIPersistencia;
import controlador.CVentanaPrincipal;
import modelo.Alumno;
import modelo.Grupo;
import modelo.ProyectoIntegradorPOJO;
import vista.VentanaPrincipal;
import vista.proyecto_integrador.BajaPI;
import vista.proyecto_integrador.ConsultaPI;
import vista.proyecto_integrador.CrearPI;
import vista.proyecto_integrador.ModificarPI;
import vista.proyecto_integrador.agregarAlumnos;

/**
 * @author jorge
 *
 */
public class ControladorPI implements ActionListener {

	private CrearPI crearPII;
	private BajaPI BajaPII;
	private ConsultaPI ConsultaPII;
	private ModificarPI ModificarPII;
	private agregarAlumnos agregarAlumnosI;
	private PIPersistencia persistenciaPI;

	public ControladorPI() {
		super();
	}

	public void setCrearPII(CrearPI crearPII) {
		this.crearPII = crearPII;
	}

	public void setBajaPII(BajaPI bajaPII) {
		BajaPII = bajaPII;
	}

	public void setConsultaPII(ConsultaPI consultaPII) {
		ConsultaPII = consultaPII;
	}

	public void setModificarPII(ModificarPI modificarPII) {
		ModificarPII = modificarPII;
	}

	public void setAgregarAlumnosI(agregarAlumnos agregarAlumnosI) {
		this.agregarAlumnosI = agregarAlumnosI;
	}

	public void setPersistenciaPI(PIPersistencia persistenciaPI) {
		this.persistenciaPI = persistenciaPI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		if (source.equals(crearPII.getBtnAgregar())) {
			agregarAlumnosI.hacerVisible();
		} else if (source.equals(agregarAlumnosI.getBtnAgregar())) {

			crearPII.agregarAlumno(agregarAlumnosI.getSelectedItem());

		} else if (source.equals(crearPII.getBtnQuitar())) {
			crearPII.borraAlum();
		} else if (source.equals(crearPII.getRdbtn1())) {

			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(1);

			crearPII.cargarGrupoo(Grupis);

		} else if (source.equals(crearPII.getRdbtn2())) {
			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(2);

			crearPII.cargarGrupoo(Grupis);
		} else if (source.equals(crearPII.getBtnGuardar())) {

			if (crearPII.recogerDatosPI() != null) {
				ProyectoIntegradorPOJO piPJ = crearPII.recogerDatosPI();
				int nice = persistenciaPI.agregarPI(piPJ);

				if (nice == 0) {
					crearPII.msgError("Inserccion no realizada por fallo con la base de datos");
				} else {
					int x = persistenciaPI.ObtenerLastId(piPJ);

					if (x != -1) {
						crearPII.ponerId(x);
						// ahora hay que agregar a todos los componentes del pi en la tabla
						// correspondiente

						ArrayList<Alumno> alumm = crearPII.DameComponentes();

						int commp = persistenciaPI.AgregarParticipantes(alumm, x);

						if (commp == alumm.size()) {
							crearPII.msgGood("creacion de PI realizada correctamente, número identificador: " + x
									+ " componentes agregados correctamente: " + commp);
						} else {
							crearPII.msgGood("creacion de PI realizada con errores, número identificador: " + x
									+ " componentes agregados correctamente: " + commp + " componentes erroneos: "
									+ (commp - alumm.size()));

						}

					} else {
						crearPII.msgError(
								"El valor devuelto del ID es erroneo. FALLO DEL SISTEMA. Contacte con el administrador.");
					}

				}

			}

			// si es null no hagas nada

		} else if (source.equals(crearPII.getBtnLimpiar())) {
			crearPII.porDefecto();
		}
//baja
		if (source.equals(BajaPII.getBtnBuscar())) {

			String busqueda = BajaPII.recogeBusqueda();

			BajaPII.agregarPI(persistenciaPI.damePI(busqueda));

		} else if (source.equals(BajaPII.getBtnRestaurar())) {
			BajaPII.pordefecto();
		}else if (source.equals(BajaPII.getBtnBorrarSeleccion())) {
				persistenciaPI.eliminarComponentes(BajaPII.borrarSeleccionado());
				int x = persistenciaPI.borrarPI(BajaPII.borrarSeleccionado());
				
				if(x==-1) {
					BajaPII.msgError("No se ha borrado nada");
				}else {
					BajaPII.msgGood("Borrado PI "+BajaPII.borrarSeleccionado().getNombre());
				}
				
				BajaPII.agregarPI(persistenciaPI.damePI(BajaPII.recogeBusqueda()));
		}

	}

}
