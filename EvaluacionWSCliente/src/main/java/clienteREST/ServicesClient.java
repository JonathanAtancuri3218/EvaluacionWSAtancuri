package clienteREST;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import modelos.Persona;
import modelos.Respuesta;
import modelos.Titulo;

public class ServicesClient {

	private String urlBuscar = "http://localhost:8081/trabajo/rs/cliente/buscarTitulos";
	private String urlIngresar = "http://localhost:8081/trabajo/rs/cliente/ingresarTitulo";
	private String urlListarP = "http://localhost:8081/trabajo/rs/cliente/listarPersonas";

	
	public List<Persona> getPersona() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(urlListarP);

		List<Persona> listado = target.request().get(new GenericType<List<Persona>>() {
		});
		client.close();
		return listado;
	}

	public List<Titulo> getTitulo() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(urlBuscar);

		List<Titulo> listado = target.request().get(new GenericType<List<Titulo>>() {
		});
		client.close();
		return listado;
	}

	public Respuesta guardarTitulo(String estado,String nombre) throws ParseException  {
		
		
		//DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
		//ate fecha = format.parse(registro); // Creamos un date con la entrada en el formato especificado
		
		
		Titulo cat = new Titulo();
		cat.setTit_nombre(nombre);
		cat.setTit_estado(estado);
		//cat.setTit_registro(fecha);

		Client client = ClientBuilder.newClient();		
		WebTarget target = client.target(urlIngresar);
		Respuesta respuesta = target.request().post(Entity.json(cat), Respuesta.class);
			
		return respuesta;
	}

}
