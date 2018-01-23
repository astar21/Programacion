package practica1;
import java.util.Scanner;
public class Ejercicio2 {
public void j2(){
    
    int[] num;
    num = new int[5];
   Scanner entrada = new Scanner (System.in);
   for (int i=0;i <5;i++){
        System.out.print("Dime un numero: ");
       num[i]=entrada.nextInt();
   }
   for (int i=5;i <1;i--){
       System.out.println(num[i]);
   }
}
}
