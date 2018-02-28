
package practica6;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author infor24
 */
public class  Empleado {
      private  String  nombre;
   private String apellido1;
   private String apellido2;
   private String nif;
   private int edad;
   private int salario;
   


public Empleado(){

}

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

public void mostrarAtributos(){
    System.out.println("nombre " +this.nombre);
    System.out.println("apellido1 " +this.apellido1);
    System.out.println("apellido2 " +this.apellido2);
    System.out.println("nif " +this.nif);
    System.out.println("edad " +this.edad);
    System.out.println("salario " +this.salario);
           
}
public  void  perdirAlta(){
     Scanner lector=new Scanner(System.in);       
        System.out.println("======================");
        System.out.println("Dar de alta empelado ");
        System.out.println("----------------------");
        System.out.println("¿Dime el nombre de el empleado?");
        this.setNombre(lector.nextLine());      
        System.out.println("¿Introduce el primer apellido");
        this.setApellido1(lector.nextLine());
        System.out.println("¿Introduce el segundo apellido");
        this.setApellido2(lector.nextLine());
        System.out.println("¿Introduce el nif");
        this.setNif(lector.nextLine());
        System.out.println("¿Introduce la edad?");
        this.setEdad(lector.nextInt()); 
        System.out.println("Ã‚Â¿Introduce el salario");
         this.setSalario(lector.nextInt());
     
    }    


}

