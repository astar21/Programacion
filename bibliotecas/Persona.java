package bibliotecas;
import java.util.Scanner;
public class Persona {
    public String  nombre;
    public String apellidos;
    public  int DNI ;
    public String cargo;
    static int total_admin=0;
    
    public Persona(){

}

    public Persona(String nombre, String apellidos, int DNI, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.cargo = cargo;
    }
    
    
    public Persona( Persona P){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 // Metodos--------------------------------------
    
	static public Persona crearPersona(){
        Scanner lector=new Scanner(System.in);
        Persona persona0=new Persona();        
        System.out.println("======================");
        System.out.println("ALTA PERSONA... ");
        System.out.println("----------------------");
        System.out.println("Introduce el nombre de la persona");
        persona0.setNombre(lector.nextLine());      
        System.out.println("Introduce el apellido");
        persona0.setApellidos(lector.nextLine());
        System.out.println("Introduce el DNI");
        persona0.setDNI(lector.nextInt());        
        System.out.println("Introduce su cargo");
        persona0.setCargo(lector.nextLine()); 
        
        total_admin++;
        
        return persona0;    
    }
    
    
    
    
    
    
    
    
    
}


