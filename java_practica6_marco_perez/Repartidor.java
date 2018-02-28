
package practica6;

import java.util.Scanner;

/**
 *
 * @author infor24
 */
public class Repartidor extends Empleado {
    private  String zona;
    
    public Repartidor(){
        
        
    }

  
    public Repartidor(String zona, String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
            
    public void mostrarAtributos(){
    super.mostrarAtributos();
        System.out.println("zona " + this.zona);
            
            
       
}
    @Override
    public  void  perdirAlta(){
     Scanner lector=new Scanner(System.in);
       Repartidor repartidor0=new Repartidor();   
       super.perdirAlta();
        System.out.println("======================");
        System.out.println("Dar de alta Repartidor ");
        System.out.println("----------------------");
        System.out.println("¿Dime la zona del repatidor?");
        this.setZona(lector.nextLine());      
     
    }    
        
        
        
        
    
    
    
    
}
