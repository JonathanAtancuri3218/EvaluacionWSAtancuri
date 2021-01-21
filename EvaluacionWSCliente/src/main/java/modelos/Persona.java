package modelos;

import java.io.Serializable;

public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int per_id;
	
	private String per_cedula;
	
	private String per_nombre;
	
	private String per_apellido;
	
	private Titulo per_titulo;
	
	public Titulo getPer_titulo() {
		return per_titulo;
	}

	public void setPer_titulo(Titulo per_titulo) {
		this.per_titulo = per_titulo;
	}

	public int getPer_id() {
		return per_id;
	}

	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}

	public String getPer_cedula() {
		return per_cedula;
	}

	public void setPer_cedula(String per_cedula) {
		this.per_cedula = per_cedula;
	}

	public String getPer_nombre() {
		return per_nombre;
	}

	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}

	public String getPer_apellido() {
		return per_apellido;
	}

	public void setPer_apellido(String per_apellido) {
		this.per_apellido = per_apellido;
	}

	@Override
	public String toString() {
		return "Persona [per_id=" + per_id + ", per_cedula=" + per_cedula + ", per_nombre=" + per_nombre
				+ ", per_apellido=" + per_apellido + ", per_titulo=" + per_titulo + "]";
	}
}
