import java.util.*;
public class Ejerecicio6 {
	
	public void ejercicio6() {
		Scanner entrada=new Scanner(System.in);
		System.out.print("dame un numero");
int a=entrada.nextInt();
System.out.print("dame otro numero");
int b=entrada.nextInt();
int[][] lista = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0|| i==(a-1)|| j==(b-1)) {
					lista[i][j] = 1;
				} else if (lista[i][j] == lista[i][0]){
					lista[i][j]=1;
				}else{
					lista [i][j]=0;
					
				}
			}
		}

		System.out.println("Esto es la tabla");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = 0; j < b; j++) {
				System.out.print(lista[i][j] + " ");

			}

		}
	}
}

