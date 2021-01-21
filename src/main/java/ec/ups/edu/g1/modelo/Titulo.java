package ec.ups.edu.g1.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


public class Titulo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String  nombre;
	@Column(nullable = false)
	private String  estado ;
	@Column(nullable = false)
	private String registro;
	@Column(nullable = false)
	private String universidad;
	@Column(nullable = false)
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="per_titulo")
	private List<Persona> per_titulo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public List<Persona> getPer_titulo() {
		return per_titulo;
	}
	public void setPer_titulo(List<Persona> per_titulo) {
		this.per_titulo = per_titulo;
	}
	@Override
	public String toString() {
		return "Titulo [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", registro=" + registro
				+ ", universidad=" + universidad + ", per_titulo=" + per_titulo + "]";
	}
	
	

}
