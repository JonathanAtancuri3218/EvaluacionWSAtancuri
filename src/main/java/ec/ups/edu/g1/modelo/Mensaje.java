package ec.ups.edu.g1.modelo;

import java.util.Date;

public class Mensaje {
	
	private String titulo;
	private Date fecha;
	private String identificacion;
	private String nombre;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Mensaje [titulo=" + titulo + ", fecha=" + fecha + ", identificacion=" + identificacion + ", nombre="
				+ nombre + "]";
	}
	
	

}
