package practica1;
import java.util.*;
public class Ejercicio7 {

public static void main(String[] args) {
		
			

Scanner entrada=new Scanner(System.in);
int select=0;
boolean salir=false;
Ejercicio1 ejer1=new Ejercicio1();
Ejercicio2 ejer2=new Ejercicio2();
Ejercicio3 ejer3=new Ejercicio3();
Ejercicio4 ejer4=new Ejercicio4();
Ejercicio5 ejer5=new Ejercicio5();
Ejercicio6 ejer6=new Ejercicio6();
	
while (salir==false){
	System.out.println("secioname una opcion del 1 al 7");
	select=entrada.nextInt();
	switch(select){
	case 1:ejer1.j1();
	break;
	case 2:ejer2.j2();
	break;
	case 3:ejer3.j3();
	break;
	case 4:ejer4.j4();
	break;
	case 5:ejer5.j5();
	break;
	case 6:ejer6.j6();
	break;
	case 7: System.out.println("adeu !!!");;
	break;
		
	}
	}
	
	
}
		
}

