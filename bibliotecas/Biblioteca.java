package bibliotecas;
import java.util.ArrayList;
import java.util.Scanner;
// Atributos-------------------------------------------------------------------------------------
public class Biblioteca {
    public int id;
    public String nombre;
    public String direccion;
    private ArrayList <Libro> ListaLirbos = new ArrayList<>();
    private ArrayList <Persona> ListaPersonas = new ArrayList<>();
// Variables    
    
//Constructores---------------------------------------------------------------------------------------------------
public Biblioteca(){

}

    public Biblioteca(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
public Biblioteca(Biblioteca b){

}

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getListaLirbos() {
        return ListaLirbos;
    }

    public void setListaLirbos(ArrayList<Libro> ListaLirbos) {
        this.ListaLirbos = ListaLirbos;
    }

    public ArrayList<Persona> getListaPersonas() {
        return ListaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> ListaPersonas) {
        this.ListaPersonas = ListaPersonas;
    }

//Metdos BIBLIOTECA------------------------------------------------------------------------------------------------------------------------
static public Biblioteca crearBiblioteca(){
Scanner sc=new Scanner(System.in);
        Biblioteca miBiblioteca=new Biblioteca();        
        System.out.println("======================");
        System.out.println("CREAR Biblioteca... ");
        System.out.println("----------------------");
        System.out.println("Introduce id de la Biblioteca");
        miBiblioteca.setId(sc.nextInt());     
        System.out.println("¿Dime una direccion para la Biblioteca");
        miBiblioteca.setDireccion(sc.next());    
        System.out.println("¿Introduce el Nombre de la Biblioteca");
       miBiblioteca.setNombre(sc.next());
       
        System.out.println("bien !! se a creadp una biblioteca");
        
        return miBiblioteca;    
}
static public void localizarBiblioteca(ArrayList<Biblioteca>p){
	Scanner lector = new  Scanner(System.in);
	System.out.println("================= ");
	System.out.println("LOCALIZADOR DE LIBROS ");
	System.out.println("------------------------------");
	System.out.println("Que libro quieres buscar ");
	int a =lector.nextInt();
	boolean encontrado=false;
	int i =0;
	while ((i < p.size()) && (encontrado == false)) {
		if (p.get(i).getId() == a) {
			System.out.println("la biblioteca existe, la listamos a continuación:");
			p.get(i).mostrarBiblioteca();
			encontrado = true;
		} else
			i++;
	}
	if (encontrado == false) {
		System.out.println("la biblioteca no existe");
	}
}
public void mostrarBiblioteca() {
	int total_biblio = 0;
	int total_pres_biblio = 0;
	System.out.println("======================");
	System.out.println("FICHA DE LA BIBLIOTECA      ");
	System.out.println("----------------------");
	System.out.println("ID: " + this.getId());
	System.out.println("Nombre: " + this.getNombre());
	System.out.println("Dirección: " + this.getDireccion());
	System.out.println("Libros:");
	for (Libro a : this.ListaLirbos) {
		System.out.print(a.getTitulo() + ", ");
		total_biblio += a.getNumTotales();
		total_pres_biblio += a.getNumPresTotales();
	}
	System.out.println("Total de libros prestados en esta biblioteca :" + total_biblio);
	System.out.println("Total libros prestados en esta biblioteca: " + total_pres_biblio);
	System.out.println("Total administradores: " + ListaPersonas.size());

	System.out.println("Personal: " + this.getListaPersonas());

}
static public void estadisticasRedBibliotecas() {
	System.out.println("Numero de ejemplares prestados totales: " + Libro.num_ejem_pres_glob);
	System.out.println("Numero de ejemplares totales: " + Libro.num_ejem_tot_glob);
	System.out.println("Numero de administradores totales: " + Persona.total_admin);

}





// libros -----------------------------------------------------------------------------------------------------------------------
static public Libro buscarLibro(ArrayList<Libro> p) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Escribe el titulo del libro");
	String buscador = sn.nextLine();
	for (Libro a : p) {
		System.out.println(a.getTitulo());
		if (a.getTitulo().equals(buscador)) {
			System.out.println("Estoy aqui");
			return a;
		}
		;
	}

	return null;

}
static public void altaLibro(ArrayList<Biblioteca> p) {
	Scanner lector = new Scanner(System.in);
	System.out.println("======================");
	System.out.println("LOCALIZADOR DE BIBLIOTECAS ");
	System.out.println("----------------------");
	System.out.println("¿Que biblioteca buscas? Introduce la ID");
	int a = lector.nextInt();
	boolean encontrado = false;
	int i = 0;
	while ((i < p.size()) && (encontrado == false)) {
		if (p.get(i).getId() == a) {
			System.out.println("la biblioteca existe");
			encontrado = true;

			p.get(i).ListaLirbos.add(Libro.crear_Libro());

		} else
			i++;
	}
	if (encontrado == false) {
		System.out.println("la biblioteca no existe");
	}
	
	}	
	
public void quitarLibros() {
	this.ListaLirbos.remove(buscarLibro(ListaLirbos));
	System.out.println("Libro Borrado");

}
static public void bajaLibro(ArrayList<Biblioteca> p) {
	Scanner lector = new Scanner(System.in);
	System.out.println("======================");
	System.out.println("LOCALIZADOR DE BIBLIOTECAS ");
	System.out.println("----------------------");
	System.out.println("¿Que biblioteca buscas? Introduce la ID");
	int a = lector.nextInt();
	boolean encontrado = false;
	int i = 0;
	while ((i < p.size()) && (encontrado == false)) {
		if (p.get(i).getId() == a) {
			System.out.println("la biblioteca existe");
			encontrado = true;

			p.get(i).quitarLibros();
			

		} else
			i++;
	}
	if (encontrado == false) {
		System.out.println("la biblioteca no existe");

	}
}
static public void pedirMostrarLibro(ArrayList<Biblioteca> p) {
	Scanner lector = new Scanner(System.in);
	int buscador = lector.nextInt();
	for (Biblioteca a : p) {
		for (Libro b : a.ListaLirbos) {
			if (b.getIsbn() == buscador) {
				System.out.println("Titulo: " + b.getTitulo());
				System.out.println("Autor: " + b.getAutor());
				System.out.println("ISBN: " + b.getIsbn());
				System.out.println("Ejemplares en stock: " + b.getNumTotales());
				System.out.println("Ejemplares prestados: " + b.getNumPres());					
				System.out.println(a.getId());
				System.out.println(a.getNombre());
				System.out.println(a.getDireccion());
				System.out.println(a.getId());
			}

		}

	}

	
}
static public void consultarLibrobBilioteca(ArrayList<Biblioteca> p) {
	Scanner lector= new Scanner(System.in);
	int buscador=lector.nextInt();
	int buscaid=lector.nextInt();
	for (Biblioteca a : p) {
		for (Libro b : a.ListaLirbos) {
			if (b.getIsbn() == buscador && a.getId()==buscaid) {
				System.out.println("Titulo: " + b.getTitulo());
				System.out.println("Autor: " + b.getAutor());
				System.out.println("ISBN: " + b.getIsbn());
				System.out.println("Ejemplares en stock: " + b.getNumTotales());
				System.out.println("Ejemplares prestados: " + b.getNumPres());
			}
		}
	}
}

static public void reservarLibro(ArrayList<Biblioteca> p) {
	Scanner lector= new Scanner(System.in);
	int buscador=lector.nextInt();
	int buscaid=lector.nextInt();
	for (Biblioteca a : p) {
		for (Libro b : a.ListaLirbos) {
			if (b.getIsbn() == buscador && a.getId()==buscaid) {
				Libro.funmostrarLibro(a.ListaLirbos);
			}
		}
	}
}

static public void devolucionLlbro(ArrayList<Biblioteca> p) {
	Scanner lector= new Scanner(System.in);
	int buscador=lector.nextInt();
	int buscaid=lector.nextInt();
	for (Biblioteca a : p) {
		for (Libro b : a.ListaLirbos) {
			if (b.getIsbn() == buscador && a.getId()==buscaid) {
				Libro.funDevolverLibro(a.ListaLirbos);
			}
		}
	}
}





// Mtetodos personas ----------------------------------------------------------------------------------------------------------
static public Persona buscarPersona(ArrayList<Persona> p) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Escribe el titulo del libro");
	String buscador = sn.nextLine();
	for (Persona a : p) {
		System.out.println(a.getNombre());
		if (a.getNombre().equals(buscador)) {
			System.out.println("Estoy aqui");
			return a;
		}
		;
	}

	return null;

}
public void quitarPersona() {
	this.ListaPersonas.remove(buscarPersona(ListaPersonas));
	System.out.println("persona Borrada");
	Persona.total_admin--;
}
static public void altaPersona(ArrayList<Biblioteca> p) {
	Scanner lector = new Scanner(System.in);
	System.out.println("======================");
	System.out.println("LOCALIZADOR DE BIBLIOTECAS ");
	System.out.println("----------------------");
	System.out.println("¿Que biblioteca buscas? Introduce la ID");
	int a = lector.nextInt();
	boolean encontrado = false;
	int i = 0;
	while ((i < p.size()) && (encontrado == false)) {
		if (p.get(i).getId() == a) {
			System.out.println("la biblioteca existe");
			encontrado = true;

			p.get(i).ListaPersonas.add(Persona.crearPersona());

		} else
			i++;
	}
	if (encontrado == false) {
		System.out.println("la biblioteca no existe");

	}
}
static public void bajaPersona(ArrayList<Biblioteca> p) {
	Scanner lector = new Scanner(System.in);
	System.out.println("======================");
	System.out.println("LOCALIZADOR DE BIBLIOTECAS ");
	System.out.println("----------------------");
	System.out.println("¿Que biblioteca buscas? Introduce la ID");
	int a = lector.nextInt();
	boolean encontrado = false;
	int i = 0;
	while ((i < p.size()) && (encontrado == false)) {
		if (p.get(i).getId() == a) {
			System.out.println("la biblioteca existe");
			encontrado = true;

			p.get(i).quitarPersona();
			// remove(buscar_libro(lista_libros));

		} else
			i++;
	}
	if (encontrado == false) {
		System.out.println("la biblioteca no existe");

	}
}

// menus-----------------------------------------
static void menu1() {

	System.out.println("1. Crear Biblioteca");
	System.out.println("2. Dar de alta Libro");
	System.out.println("3. Dar de baja Libro");
	System.out.println("4. Dar de alta gestor de Biblioteca");
	System.out.println("5. Dar de alta gestor de Biblioteca");
	System.out.println("6.Detalles de una Biblioteca");
	System.out.println("7. Detalles de la red de Bibliotecas");
	System.out.println("8. salir");

}
static public void utilidad_usuarios() {

	// variables--------------------------------------------------------------

	Scanner sn = new Scanner(System.in);

	final String usuario = "admin";
	final int passwd = 123;

	boolean salir = false;
	boolean salir1 = false;
	int opcion; // Guardaremos la opcion del usuario
	int selector;// primera seleccion
	ArrayList<Biblioteca> lista_biblio = new ArrayList<>();
	ArrayList<Libro> lista_libros = new ArrayList<>();


	System.out.println("Utilidades Usuarios");
	while (!salir) {
		Libro.menu();
		System.out.println("Escribe una de las opciones");
		opcion = sn.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Has seleccionado la opcion 1 -Consultar Libro");
			Libro.funmostrarLibro(lista_libros);
			
			break;

		case 2:
			System.out.println("Has seleccionado la opcion 2 - Prestar libro");
			Libro.funmostrarLibro(lista_libros);
			break;
		case 3:
			System.out.println("Has seleccionado la opcion 3 - Devolver libro");
			Libro.funDevolverLibro(lista_libros);
			break;
		case 4:
			System.out.println("Has seleccionado la opcion 4 - Localizar libro");
			Libro.localizarLibro(lista_libros);
			break;
		case 5:
			System.out.println("Has seleccionado la opcion 5 - Mostrar libro");
			Libro.funmostrarLibro(lista_libros);
			break;
		case 6:
			System.out.println("Has seleccionado la opcion 6 - Mostrar todos los libros");
			for (Libro nombre : lista_libros)

				System.out.println(nombre.getTitulo());
			break;
		case 7:
			salir = true;
			break;
		default:
			System.out.println("Solo nÃºmeros entre 1 y 6");
		}

	}
}
}


















