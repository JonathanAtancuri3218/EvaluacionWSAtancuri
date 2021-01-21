package ec.ups.edu.ec.g1.servicios;

import javax.inject.Inject;

import ec.ups.edu.g1.modelo.Mensaje;
import ec.ups.edu.g1.modelo.Persona;
import ec.ups.edu.g1.modelo.Titulo;
import ec.ups.edu.g1.negocio.GestionTitulosLocal;
import ec.ups.edu.g1.negocio.GestionTitulosON;

	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;


	import javax.ws.rs.Consumes;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.QueryParam;
	import javax.ws.rs.core.MediaType;


	@Path("/cliente")
	public class ServiciosREST{

		@Inject
		private GestionTitulosLocal gestion;
		
		@GET
		@Path("/listarPersonas")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Persona> listarPersonas() throws Exception {
			try {
				return gestion.listarPersonas();
			} catch (Exception e) {
				throw new Exception("Se ah producido un error"+e.getMessage());
			}
		}
		
		@POST
		@Path("/ingresarTitulo")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public void ingresarTitulo(@QueryParam("estado") String estado,
								   @QueryParam("nombre") String nombre,
								   @QueryParam("registro") String registro) throws Exception {
			try {
				Titulo titulo = new Titulo();
			    //Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(registro); 
				titulo.setNombre(nombre);
				titulo.setEstado(estado);
				titulo.setRegistro(registro);
			
				gestion.registrarTitulo(titulo);
			} catch (Exception e) {
				throw new Exception("Se ah producido un error"+e.getMessage());
			}
		}
		
		@GET
		@Path("/buscarTitulos")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Mensaje> buscarTitulos(String filtro) throws Exception {
			try {
				List<Titulo> titulos = gestion.buscarTitulos(filtro);
				if(titulos.size() > 0) {
					List<Mensaje> respuestas = new ArrayList<Mensaje>();
					for(int x = 0; x < titulos.size(); x++) {
						List<Persona> personas = titulos.get(x).getPer_titulo();						
						for (Persona persona : personas) {
							Mensaje r = new Mensaje();
							r.setNombre(titulos.get(x).getNombre());
							r.setIdentificacion(persona.getCedula());
							//r.setFecha(titulos.get(x).getRegistro());
							r.setNombre(persona.getNombre()+" "+persona.getApellido());
							respuestas.add(r);
						}
					}
					return respuestas;
				}
				throw new Exception("No se han encontrado titulos coincidentes");
			} catch (Exception e) {
				throw new Exception("Se ah producido un error"+e.getMessage());
			}
		}
	}


