
public class Ejercicio4 {
	public void ejercicio4(){
	int [][] lista =new int [7][7];
	
	for (int i=0;i<lista.length;i++){
		for (int j=0;j<lista.length;j++){
			if (i==j){
			lista [i][j] =1;
			}else{
				lista [i][j] =0;
			}
	}
	}
	
System.out.println("Esto es la tabla");
for (int i=0;i<lista.length;i++){
	System.out.println("");
	for (int j=0;j<lista.length;j++){
		System.out.print(lista[i][j]+  " ");
	
}

}
}}
