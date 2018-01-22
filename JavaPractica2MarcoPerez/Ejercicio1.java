
import java.util.*;
public class Ejercicio1{

	 public void tarea1() {
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                num[i][j] = i + j;
            }
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
    }
}
 

