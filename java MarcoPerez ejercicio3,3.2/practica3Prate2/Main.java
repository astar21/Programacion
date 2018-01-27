package practica3Prate2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//LLamamos clase scaner
		Scanner sc=new Scanner(System.in);
		// definimos los objetos
		String raza,clase;
		int  nivel,bganadas,berdidas;
		//otras variables
		boolean salir=false;
		
		//creamos el objeto  pj
		 Personajes pj= new Personajes();
		 //llenamos el primer objeto  por consola
		 System.out.println("Que clase te gustaria ser");
		 clase=sc.nextLine();
		 System.out.println("Dime  que raza te gustria ser?");
		 raza=sc.nextLine();
		nivel=5;
		 pj.setClase(clase);
		 pj.setRaza(raza);;
		 //creamos el segundo objeto y lo rellenamos aqui
		 Personajes pj2 = new Personajes("orco","guerrero",20,5,3);
		 //creamos el 3 objeto como una copia del primero
		 Personajes pj3 = new Personajes(pj);
		 //mostramos el primerp pj
		 System.out.println("Personaje1******************************************************************************************************************************");
		 System.out.println("Clase :  "+ pj.getClase());
		 System.out.println("Raza: " + pj.getRaza());
		 System.out.println("nivel  "+ pj.getNivel());
		 System.out.println("batallas ganadas : "+ pj.getbPanadas());
		 System.out.println("batallas perdidas : "+ pj.getbPerdidas());
		 //mostramos el segundo pj
		 System.out.println("Personaje2*****************************************************************************************************************************");
		 System.out.println("Clase:  "+ pj2.getClase());
		 System.out.println("Raza : " + pj2.getRaza());
		 System.out.println("nivel  "+ pj2.getNivel());
		 System.out.println("batallas ganadas : "+ pj2.getbPanadas());
		 System.out.println("batallas perdidas : "+ pj2.getbPerdidas());
		 //mostramos el 3 pej
		 System.out.println("Personaje3*******************************************************************************************************************************");
		 System.out.println("Clase:  "+ pj3.getClase());
		 System.out.println("Raza : " + pj3.getRaza());
		 System.out.println("nivel  "+ pj3.getNivel());
		 System.out.println("batallas ganadas : "+ pj3.getbPanadas());
		 System.out.println("batallas perdidas : "+ pj3.getbPerdidas());
		 //cremos un menu 
		 pj.menu();
		 int selector=sc.nextInt();
		 
		 while(salir==false){
			 switch(selector){
		 case 1:pj.entrenar();
		 	pj.spacio();
			 pj.menu();
			 selector=sc.nextInt();
			 break;
		 case 2: System.out.println("Estadisticas");
		 System.out.println("Personaje1*********************************************************************************************************************************");
		 System.out.println("Clase :  "+ pj.getClase());
		 System.out.println("Raza: " + pj.getRaza());
		 System.out.println("nivel  "+ pj.getNivel());
		 System.out.println("batallas ganadas : "+ pj.getbPanadas());
		 System.out.println("batallas perdidas : "+ pj.getbPerdidas());
		 pj.spacio();
		 pj.menu();
		 selector=sc.nextInt();
		 break;
		 case 3: pj.batalla();
		 pj.spacio();
		 pj.menu();
		 selector=sc.nextInt();
		 break;
		 case 4: System.out.println("hasta luegaaa");
		 salir=true;
		 break;
	
			
			 }
			 
		 }
		 
		 
	}

}
