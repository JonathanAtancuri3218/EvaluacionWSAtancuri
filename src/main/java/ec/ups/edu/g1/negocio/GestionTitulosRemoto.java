package ec.ups.edu.g1.negocio;

import java.util.List;

import javax.ejb.Remote;

import ec.ups.edu.g1.modelo.Persona;
import ec.ups.edu.g1.modelo.Titulo;

@Remote
public interface GestionTitulosRemoto {
	
	public List<Persona> listarPersonas() throws Exception;
	public void registrarTitulo(Titulo titulo) throws Exception;
	public List<Titulo> buscarTitulos(String filtro) throws Exception;
	

}
