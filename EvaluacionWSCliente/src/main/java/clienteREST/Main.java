package clienteREST;

import java.text.ParseException;

import modelos.Respuesta;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		

		ServicesClient ser=new ServicesClient();
		//Titulo r=c.ingresarTitulos("activo","bachillerUniveristario",new Date (01/01/2020)); 
		//8sona p=new Persona();
		//System.out.println("valor "+c.getPersona());
		//System.out.println("valor "+ser.getTitulo());
		
		String entrada = "12/03/2016"; // Entrada recogida como sea (scanner)
		//te fecha = new SimpleDateFormat("dd/MM/yyyy").parse(entrada);
		Respuesta guardarTitulo = ser.guardarTitulo("","profesional");
		System.out.println(guardarTitulo);
	}

	}


