package bibliotecas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		final String usuario = "admin";
		final int passwd = 123;

		boolean salir = false;
		boolean salir1 = false;
		int opcion; 
		int selector;
		ArrayList<Biblioteca> lista_biblio = new ArrayList<>();

		while (!salir1) {
			salir = false;
			Libro.menu1();
			System.out.println("Elige una opción");
			selector = sn.nextInt();
			switch (selector) {
			
			case 1:
				System.out.println("Gestión administrativa");

				while (!salir) {
					Biblioteca.menu1();
					System.out.println("Elige una opción");
					opcion = sn.nextInt();
					switch (opcion) {
					case 1:
						System.out.println("Crea una Biblioteca");
						lista_biblio.add(Biblioteca.crearBiblioteca());
						break;
					case 2:
						System.out.println("Dar de alta un libro");
						Biblioteca.altaLibro(lista_biblio);
						break;
					case 3:
						System.out.println("Dar de baja un libro");
						Biblioteca.bajaLibro(lista_biblio);
						break;
					case 4:
						System.out.println("Dar de alta a una persona");
						Biblioteca.altaPersona(lista_biblio);
						break;
					case 5:
						System.out.println("Dar de baja a una persona");
						Biblioteca.bajaPersona(lista_biblio);
						break;
					case 6:
						System.out.println("Detalles de una Biblioteca");
						Biblioteca.localizarBiblioteca(lista_biblio);
						break;
					case 7:
						System.out.println("Red de Bibliotecas");
						Biblioteca.estadisticasRedBibliotecas();
						break;

					case 8:
						System.out.println("salir");
						salir = true;
						break;
					}
				}

				break;

		
			case 2:
				// usuarios 
				
				System.out.println("Utilidades Usuarios");
			    while(!salir){                	       	      	       	   
				   Libro.menu();            
			     System.out.println("Escribe una de las opciones");
			     opcion = sn.nextInt();
			     switch(opcion){
			         case 1:
			             System.out.println("Has seleccionado la opcion 1 -Consultar Libro");
			             Biblioteca.consultarLibrobBilioteca(lista_biblio);
			           
			             break;
			             
			         case 2:
			             System.out.println("Has seleccionado la opcion 2 - Consultar Libro Biblioteca");
			             Biblioteca.consultarLibrobBilioteca(lista_biblio);
			             break;
			          case 3:
			             System.out.println("Has seleccionado la opcion 3 - Pedir Libro");
			             Biblioteca.reservarLibro(lista_biblio);
			             break;
			          case 4:
			             System.out.println("Has seleccionado la opcion 4 - Devolver libro");
			             Biblioteca.devolucionLlbro(lista_biblio);
			             break;   
			         
			          case 5:
			             salir=true;
			             break;
			          default:
			             System.out.println("Solo nÃºmeros entre 1 y 6");
			     }           
			      
			 }
				break;

			}
			
		} 
	}
}
