package practica1;

import java.util.*;

public class Ejercicio5 {
public void j5(){
		
	

		Scanner entrada = new Scanner(System.in);
		int lista[] = new int[10];
		int lista2[] = new int[10];
		int lista3[]= new int [20];
		int aux=0;
		int aux2=1;
		for (int i = 0; i < 10; i++) {
			System.out.println("dime un numero");
			lista[i] = entrada.nextInt();
		}
	
		for (int i = 0; i < 10; i++) {
			System.out.println("dime un numero");
			lista2[i] = entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {	
		lista3[aux]=lista[i];
			aux+=2;
}
		for (int i = 0; i < 10; i++) {	
			lista3[aux2]=lista2[i];
			aux2+=2;
	
}
		for (int i = 0; i < 20; i++) {	
	System.out.println(lista3[i]);
}	
}
}