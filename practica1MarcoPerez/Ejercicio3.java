package practica1;
import java.util.*;
public class Ejercicio3 {
public void j3(){

	        Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int pos = 0, neg = 0;  
	        int i;
	        int cero = 0;
	        double sumaPos = 0, sumaNeg = 0;  
	        System.out.println("Lectura de los elementos del array: ");
	        for (i = 0; i < numeros.length; i++) {
	            System.out.print("numeros[" + i + "]= ");
	            numeros[i]=sc.nextInt();
	        }
	       
	        for (i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0){
	                sumaPos += numeros[i];
	                pos++;
	            } else if (numeros[i] < 0){ 
	                sumaNeg += numeros[i];
	                neg++;
	            }
	            else  {
	            	cero++;
	            	
	            }
	            
	        }
	        if (pos != 0) {
	            System.out.println("Media de los valores positivos: " + sumaPos / pos);
	     
	        }
	        if (neg != 0) {
	            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
	        }
	        if(cero!=0){
	        	System.out.println("hay"+cero+"ceros");
	        }
	    }
	
	}

