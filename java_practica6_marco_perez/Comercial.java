package practica6;

import java.util.Scanner;


public class Comercial  extends Empleado{
  public  int comision; 
   
  
  public Comercial(){
      
  }

    public Comercial(int comision, String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
  
   @Override
            
    public void mostrarAtributos(){
        super.mostrarAtributos();
       System.out.println("comercial " +this.comision);
   
    
}
    @Override
     public  void perdirAlta(){
     Scanner lector=new Scanner(System.in);
       Comercial comercial0=new Comercial();   
       super.perdirAlta();
        System.out.println("======================");
        System.out.println("Dar de alta Comercial ");
        System.out.println("----------------------");
        System.out.println("¿Dime la com ision del comercial?");
        this.setComision(lector.nextInt());
    
           
}
    
    
    
    
    
    
    
}

