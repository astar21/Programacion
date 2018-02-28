package practica6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
   Comercial comercial0=new Comercial(); 
   Repartidor repartidor0=new Repartidor();
   Empleado empleado0=new Empleado();
   
  
   ArrayList<Empleado> lista_Empleado = new ArrayList<>();
 
    
   
   
   Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion=0;              
           while(!salir){
           System.out.println("1. Opcion 1 - Dar de alta Empleado");
           System.out.println("2. Opcion 2 - Dar de alta Comercial ");
           System.out.println("3. Opcion 3 - Dar de alta Repartidor"); 
           System.out.println("4. Opcion 4 - Mostrar Empleado");
           System.out.println("5. Opcion 5 - Mostrar Comercial");
           System.out.println("6. Opcion 6 - Mostrar  Repartidor");
           System.out.println("7. Salir");
            
           System.out.println("Escribe una de las opciones");
           
           opcion = sn.nextInt();
           switch(opcion){
        
               case 1:
                   System.out.println("Has seleccionado la opcion 1 - Dar de alta Empleado");
                   empleado0.perdirAlta();
                   lista_Empleado.add(empleado0);
       
                   break;
                   
               case 2:
                   System.out.println("Has seleccionado la opcion 2 - Dar de alta Comercial ");
                  comercial0.perdirAlta();
                  lista_Empleado.add(comercial0);
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3 - Dar de alta Repartidor");
                  repartidor0.perdirAlta();
                  lista_Empleado.add(repartidor0);
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4 - Mostrar Empleado");
                  Main.pedir_mostrar_Empleado(lista_Empleado);
                   break;
                case 5:
                   System.out.println("Has seleccionado la opcion 5 -Mostrar Comercial ");
                Main.pedir_mostrar_Comercial(lista_Empleado);
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6 - Mostrar  Repartidor");
                   Main.pedir_mostrar_Repartidorl(lista_Empleado);
                   break;
                case 7:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo nÃºmeros entre 1 y 7");
           } 

}
    
}
    
 static public void pedir_mostrar_Empleado(ArrayList<Empleado> p){
     
    Scanner lector=new Scanner(System.in);
        System.out.println("Â¿que empleado quieres encontrar ");
        String a=lector.next();
        boolean encontrado=false;
        for(Empleado i: p){
        	if(i.getNombre().equals(a)){
        		encontrado=true;
        		i.mostrarAtributos();
        	}if (encontrado==false){
        		System.out.println("el empleado no existe");
        }  
    }   
 }
 
 
 static public void pedir_mostrar_Comercial(ArrayList<Empleado> p){
     
	    Scanner lector=new Scanner(System.in);
	        System.out.println("Â¿que comercial quieres encontrar ");
	        String a=lector.next();
	        boolean encontrado=false;
	        for(Empleado i: p){
	        	if(i.getNombre().equals(a)){
	        		encontrado=true;
	        		i.mostrarAtributos();;
	        	}if (encontrado==false){
	        		System.out.println("el empleado no existe");
	        }  
	    }   
	 }
	 
 
 static public void pedir_mostrar_Repartidorl(ArrayList<Empleado> p){
     
	    Scanner lector=new Scanner(System.in);
	        System.out.println("Â¿que comercial quieres encontrar ");
	        String a=lector.next();
	        boolean encontrado=false;
	        for(Empleado i: p){
	        	if(i.getNombre().equals(a)){
	        		encontrado=true;
	        		i.mostrarAtributos();;
	        	}if (encontrado==false){
	        		System.out.println("el empleado no existe");
	        }  
	    }   
	 }
 
 
 
 
 
 
 
 
 
 
 
 

	 }
 
 
 
 
 
 

    
