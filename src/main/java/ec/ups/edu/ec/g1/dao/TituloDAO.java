package ec.ups.edu.ec.g1.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.g1.modelo.Titulo;


@Stateless
public class TituloDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void ingresarTitulo(Titulo titulo) {
		//titulo.setTit_estado("Ingresado");
		em.persist(titulo);
	}
	
	public List<Titulo> buscarTitulos(String filtro) {
		List<Titulo> titulos = em.createQuery("SELECT t FROM Titulo t WHERE t.nombre LIKE '%"+filtro+"%'", Titulo.class).getResultList(); 
		return titulos;
	}
}