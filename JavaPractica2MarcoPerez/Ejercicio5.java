
public class Ejercicio5 {
	public void ejercicio5() {
		int[][] lista = new int[8][6];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0|| i==7|| j==5) {
					lista[i][j] = 1;
				} else if (lista[i][j] == lista[i][0]){
					lista[i][j]=1;
				}else{
					lista [i][j]=0;
					
				}
			}
		}

		System.out.println("Esto es la tabla");
		for (int i = 0; i < 8; i++) {
			System.out.println("");
			for (int j = 0; j < 6; j++) {
				System.out.print(lista[i][j] + " ");

			}

		}
	}
}
