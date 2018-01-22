
public class Ejercicio3 {


	public void ejercicio3(){
		int [][] lista =new int [3][3];
		int [][] lista1=new int [3][3];
		int [][] listaSuma =new int [3][3];
		
		for (int i=0;i<lista.length;i++){
			for (int j=0;j<lista.length;j++){
				lista [i][j] =i+j;
		}
		}
	System.out.println("Esto es la tabla");
	for (int i=0;i<lista.length;i++){
		System.out.println("");
		for (int j=0;j<lista.length;j++){
			System.out.print(lista[i][j]+ " ");
		
	}

	}
	// Aqui --------------------------------------------------------------------------------------------------------
	for (int i=0;i<lista1.length;i++){
		for (int j=0;j<lista1.length;j++){
			lista1 [i][j] =i+j;
	}
	}
System.out.print("Esto es la tabla");
for (int i=0;i<lista1.length;i++){
	System.out.println("");
	for (int j=0;j<lista1.length;j++){
		System.out.print(lista1[i][j]+ " ");
		
}

}
//suma.....................................................................................
for (int i=0;i<listaSuma.length;i++){
	for (int j=0;j<listaSuma.length;j++){
		listaSuma [i][j] =lista[i][j]+lista1[i][j];
}
}
System.out.print("Esto es la tabla");
for (int i=0;i<listaSuma.length;i++){
System.out.println("");
for (int j=0;j<listaSuma.length;j++){
	System.out.print(listaSuma[i][j]+ " ");
	
}

}
	
	

	}
}