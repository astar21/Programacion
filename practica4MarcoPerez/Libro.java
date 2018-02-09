package practica4;
import java.util.*;
import java.util.ArrayList;

public class Libro {
private String titulo ;
private String autor;
private int isbn;
private int numPres;
private int numTotales;
static public int num_ejem_pres_glob;
static public int num_ejem_tot_glob;

public Libro(){
	
}

public Libro(String titulo, String autor, int isbn, int numPres, int numPresTotales) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.isbn = isbn;
	this.numPres = numPres;
	this.numTotales = numPresTotales;
	  Libro.num_ejem_tot_glob+=this.numTotales;
} 
public Libro(Libro c){
	super();
	this.titulo = c. titulo;
	this.autor = c.autor;
	this.isbn =c. isbn;
	this.numPres =0;
	this.numTotales = c.numTotales;
	Libro.num_ejem_tot_glob+=this.numTotales;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public int getIsbn() {
	return isbn;
}

public void setIsbn(int isbn) {
	this.isbn = isbn;
}

public int getNumPres() {
	return numPres;
}

public void setNumPres(int numPres) {
	this.numPres = numPres;
}

public int getNumTotales() {
	return numTotales;
}

public void setNumTotales(int numTotales) {
	this.numPres = numTotales;
}


public int getNumPresTotales() {
	return numTotales;
}

public void setNumPresTotales(int numPresTotales) {
	this.numTotales = numPresTotales;
}

public static int getNum_ejem_pres_glob() {
	return num_ejem_pres_glob;
}

public static void setNum_ejem_pres_glob(int num_ejem_pres_glob) {
	Libro.num_ejem_pres_glob = num_ejem_pres_glob;
}

public static int getNum_ejem_tot_glob() {
	return num_ejem_tot_glob;
}

public static void setNum_ejem_tot_glob(int num_ejem_tot_glob) {
	Libro.num_ejem_tot_glob = num_ejem_tot_glob;
}
//Metodos 
public boolean prestarLibro(){
	if (this.numTotales>this.numPres){
		this.numPres ++;
		 Libro.num_ejem_pres_glob++; 
		 return true;
	}else{
		return false;
	}
}
 public  static void FunPedirLibro(ArrayList<Libro> L){
	Scanner  entrada =new Scanner(System.in);
	System.out.println("que libro quieres  pedir : ");
	int a = entrada.nextInt();
	boolean encontrado =false;
	int i =0;
	while ((i<L.size())&& (encontrado==false)){
		if(L.get(i).getIsbn()==a){
		if(L.get(i).prestarLibro()){
			System.out.println("El ejemplar existe ");
		}else{
			System.out.println("todos los ejemplaeres estan prestados");
		}
		encontrado= true;
		}else{
			i++;
		}
		if (encontrado ==false){
			System.out.println("El libro nose a encontrado");
		}
	}
}
public boolean devolverLibro(){
	if(this.numPres>0){
		this.numPres--;
		Libro.num_ejem_pres_glob--;  
		return true;
	}else{
		return false;
	}
}
	public static void funDevolverLibro(ArrayList<Libro> L){
		Scanner entrada= new Scanner(System.in);
		System.out.println("que libro quieres  evolver: ");
		int a = entrada.nextInt();
		boolean encontrado =false;
		int i =0;
		while ((i<L.size())&& (encontrado==false)){
			if(L.get(i).getIsbn()==a){
			if(L.get(i).prestarLibro()){
				System.out.println("El ejemplar existe ");
			}else{
				System.out.println("No puedes devolver este libro");
			}
			encontrado= true;
			}else{
				i++;
			}
			if (encontrado ==false){
				System.out.println("El libro no a asido prestado");
			}
		}
		}
		 public void mostrarLibro(){
		        System.out.println("======================");
		        System.out.println("FICHA DEL LIBRO       ");
		        System.out.println("----------------------");
		        System.out.println("Titulo: "+ this.getTitulo());
		        System.out.println("Autor: "+ this.getAutor());
		        System.out.println("Ejemplares prestados: "+this.getNumPres());
		        System.out.println("Ejemplares totales: "+this.getNumPresTotales());
		        System.out.println("======================");
	
}
		 static public void funmostrarLibro(ArrayList<Libro> L){
		        Scanner entrada=new Scanner(System.in);
		        System.out.println("Â¿QuÃ© libro deseas que te mostremos? Introduce el ISBN");
		        int a=entrada.nextInt();
		        boolean encontrado=false;
		        int i = 0;
		        while ((i < L.size()) && (encontrado==false)) {
		            if (L.get(i).getIsbn()==a){
		                System.out.println("El ejemplar existe. A continuaciÃ³n le mostramos la ficha del libro");
		                L.get(i).mostrarLibro();
		                encontrado=true;                
		            }else i++;
		            
		        }
		        if (encontrado==false){
		            System.out.println("El ejemplar no existe. El libro NO puede ser mostrado");            
		        }
		    }    
		  static public void localizarLibro(ArrayList<Libro> L){
		        Scanner lector=new Scanner(System.in);
		        System.out.println("======================");
		        System.out.println("LOCALIZADOR DE LIBROS ");
		        System.out.println("----------------------");
		        System.out.println("Que libro deseas localizar? Introduce el ISBN");
		        int a=lector.nextInt();
		        boolean encontrado=false;
		        int i = 0;
		        while ((i < L.size()) && (encontrado==false)) {
		            if (L.get(i).getIsbn()==a){
		                System.out.println("El ejemplar existe.");
		                L.get(i).mostrarLibro();
		                encontrado=true;                
		            }else i++;            
		        }
		        if (encontrado==false){
		            System.out.println("El ejemplar no existe. ");            
		        }        
		    }
		    static public Libro crear_Libro(){
		        Scanner lector=new Scanner(System.in);
		        Libro milibro=new Libro();        
		        System.out.println("======================");
		        System.out.println(" Creando libro... ");
		        System.out.println("----------------------");
		        System.out.println("¿Introduce el TITULO del libro?");
		        milibro.setTitulo(lector.nextLine());      
		        System.out.println("¿Introduce el AUTOR del libro?");
		        milibro.setAutor(lector.nextLine());
		        System.out.println("¿Introduce el ISBN del libro?");
		        milibro.setIsbn(lector.nextInt());        
		        System.out.println("¿Nmuero de ejemplares del libro?");
		        milibro.setNumTotales(lector.nextInt()); 
		        milibro.setNumPresTotales(0);
		        return milibro;    
		    }    



}