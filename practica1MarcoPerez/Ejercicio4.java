package practica1;
import java.util.*;

public class Ejercicio4 {
public void j4(){
		
	
		
			Scanner entrada=new Scanner(System.in);
			int lista[] = new int[10] ;
			for (int i=0;i<10;i++){
				System.out.println("dime un numero");
				lista[i]=entrada.nextInt();
			}
			int aux=10;
			System.out.println("resultado");
			for(int i=0;i<5;i++){
				aux--;
				System.out.println(lista[i]);
				System.out.println(lista[aux]);
			}
			
}
}
