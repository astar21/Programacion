package practica1;

import java.util.*;

public class Ejercicio6{
public void j6(){
		
	

		Scanner entrada = new Scanner(System.in);
		int lista[] = new int[12];
		int lista2[] = new int[12];
		int lista3[]= new int [24];
		int aux=0;
		int aux2=3;
		for (int i = 0; i < 12; i++) {
			System.out.println("dime un numero");
			lista[i] = entrada.nextInt();
		}
	
		for (int i = 0; i < 12; i++) {
			System.out.println("dime otro numero");
			lista2[i] = entrada.nextInt();
		}
		for (int i = 0; i < 12; i+=3) {	
		lista3[aux]=lista[i];
		lista3[aux+1]=lista[i+1];
		lista3[aux+2]=lista[i+2];
			aux+=6;
}
		for (int i = 0; i < 12; i+=3) {	
			lista3[aux2]=lista2[i];
			lista3[aux2+1]=lista2[i+1];
			lista3[aux2+2]=lista2[i+2];
			aux2+=6;
	
}
		for (int i = 0; i < 24; i++) {	
	System.out.println(lista3[i]);
}	
}
}