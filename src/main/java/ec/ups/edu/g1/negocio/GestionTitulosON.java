
package ec.ups.edu.g1.negocio;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.ec.g1.dao.PersonaDAO;
import ec.ups.edu.ec.g1.dao.TituloDAO;
import ec.ups.edu.g1.modelo.Persona;
import ec.ups.edu.g1.modelo.Titulo;

public class GestionTitulosON {
	

	@Stateless
	public class gestionTitulos implements GestionTitulosLocal , GestionTitulosRemoto{
		@Inject
		private PersonaDAO pdao;
		
		@Inject TituloDAO tdao;

		
		public List<Persona> listarPersonas() throws Exception{
			try {
				return pdao.listarPersonas();
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}

		public void registrarTitulo(Titulo titulo) throws Exception {
			try {
				tdao.ingresarTitulo(titulo);
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}
		
		public List<Titulo> buscarTitulos(String filtro) throws Exception {
			try {
				return tdao.buscarTitulos(filtro);
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}

	}
}
