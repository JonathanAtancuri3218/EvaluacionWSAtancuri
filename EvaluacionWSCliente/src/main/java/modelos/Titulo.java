package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Titulo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int tit_id;
	
	private String tit_nombre;
	
	private String tit_estado;
	
	private Date tit_registro;
	
	private List<Persona> per_titulo;

	public List<Persona> getPer_titulo() {
		return per_titulo;
	}

	public void setPer_titulo(List<Persona> per_titulo) {
		this.per_titulo = per_titulo;
	}

	public int getTit_id() {
		return tit_id;
	}

	public void setTit_id(int tit_id) {
		this.tit_id = tit_id;
	}

	public String getTit_nombre() {
		return tit_nombre;
	}

	public void setTit_nombre(String tit_nombre) {
		this.tit_nombre = tit_nombre;
	}

	public String getTit_estado() {
		return tit_estado;
	}

	public void setTit_estado(String tit_estado) {
		this.tit_estado = tit_estado;
	}

	public Date getTit_registro() {
		return tit_registro;
	}

	public void setTit_registro(Date tit_registro) {
		this.tit_registro = tit_registro;
	}

	@Override
	public String toString() {
		return "Titulo [tit_id=" + tit_id + ", tit_nombre=" + tit_nombre + ", tit_estado=" + tit_estado
				+ ", tit_registro=" + tit_registro + ", per_titulo=" + per_titulo + "]";
	}
}
