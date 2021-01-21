package ec.ups.edu.ec.g1.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.g1.modelo.Persona;


@Stateless
public class PersonaDAO {
	@PersistenceContext
	private EntityManager em;
	
	public boolean ingresarPersona(Persona persona) {
		return true;
	}
	
	public List<Persona> listarPersonas()throws Exception{
		try {
			List<Persona> personas = em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
			for (Persona persona : personas) {
				persona.setTitulo(null);
			}
			return personas;
		} catch (Exception e) {
			throw new Exception("Este es el error: "+e.getMessage());
		}
	}
}
