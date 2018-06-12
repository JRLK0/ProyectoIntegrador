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
import vista.proyecto_integrador.ModifyyyPI;
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
	private VentanaPrincipal ventanaPrincipal;
	private ModifyyyPI modifyyyPI;

	public ControladorPI() {
		super();
	}

	public void setModifyyyPI(ModifyyyPI modifyyyPI) {
		this.modifyyyPI = modifyyyPI;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
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
		// baja
		if (source.equals(BajaPII.getBtnBuscar())) {

			String busqueda = BajaPII.recogeBusqueda();

			BajaPII.agregarPI(persistenciaPI.damePI(busqueda));

		} else if (source.equals(BajaPII.getBtnRestaurar())) {
			BajaPII.pordefecto();
		} else if (source.equals(BajaPII.getBtnBorrarSeleccion())) {
			persistenciaPI.eliminarComponentes(BajaPII.borrarSeleccionado());
			int x = persistenciaPI.borrarPI(BajaPII.borrarSeleccionado());

			if (x == -1) {
				BajaPII.msgError("No se ha borrado nada");
			} else {
				BajaPII.msgGood("Borrado PI " + BajaPII.borrarSeleccionado().getNombre());
			}

			BajaPII.agregarPI(persistenciaPI.damePI(BajaPII.recogeBusqueda()));
		}

		// modifi

		if (source.equals(ModificarPII.getButtonBuscar())) {

			String busqueda = BajaPII.recogeBusqueda();
			ModificarPII.agregarPI(persistenciaPI.damePI(busqueda));
		} else if (source.equals(ModificarPII.getBtnModificarSeleccionado())) {

			ProyectoIntegradorPOJO pj1 = ModificarPII.modificarSeleccionado();
			
			ventanaPrincipal.verPanel(modifyyyPI);

			ArrayList<modelo.Area> Areas = persistenciaPI.cargarArea();
			modifyyyPI.cargarAreas(Areas);
			
			int curso = persistenciaPI.solicitarCurso(pj1.getGrupo());
			
			ArrayList<Alumno> DameLosComponentesDelPI = persistenciaPI.DameLosComponentesDelPI(pj1.getIdProyecto());
			
			modifyyyPI.cargarModifiPI(pj1, curso, DameLosComponentesDelPI);



			

		} else if (source.equals(ModificarPII.getBtnRestaurar())) {
			ModificarPII.pordefecto();
		}
		/////////////////////////////////////////////////
		
		
		
		if (source.equals(modifyyyPI.getBtnAgregar())) {
			agregarAlumnosI.hacerVisible();
		} else if (source.equals(agregarAlumnosI.getBtnAgregar())) {

			modifyyyPI.agregarAlumno(agregarAlumnosI.getSelectedItem());

		} else if (source.equals(modifyyyPI.getBtnQuitar())) {
			modifyyyPI.borraAlum();
		} else if (source.equals(modifyyyPI.getRdbtn1())) {

			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(1);

			modifyyyPI.cargarGrupoo(Grupis);

		} else if (source.equals(modifyyyPI.getRdbtn2())) {
			ArrayList<Grupo> Grupis = persistenciaPI.cargarGrupo(2);

			modifyyyPI.cargarGrupoo(Grupis);
		} else if (source.equals(modifyyyPI.getBtnGuardar())) {
			modifyyyPI.msgError("No me ha dado tiempo, lo siento.");
			modifyyyPI.msgError("Esto debería de moficiar el PI recogiendo los datos y modificando la tabla PI usando el ID");
			modifyyyPI.msgError("Tambien modificaria los componentes: para simplificar borraria los componentes y añadiria los que apareciesen aqui...");
		} 
		
		
		if(source.equals(ConsultaPII.getBtnDetalle())) {
			String busqueda = ConsultaPII.recogeBusqueda();

			ConsultaPII.agregarPI(persistenciaPI.damePI(busqueda));
		}else if (source.equals(ConsultaPII.getBtnExplicacion())) {
			ConsultaPII.msgError("Tampoco me ha dado tiempo a acabarlo");
			ConsultaPII.msgError("Hubiese puesto que se pudiese filtrar por muchos más campos, individualmente o avanzado");
			ConsultaPII.msgError("Y lo habría puesto de otra forma.");
		}
		

	}

}
