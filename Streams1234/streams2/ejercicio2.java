/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

/**
 *
 * @author marco
 */
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) throws main {

        try {
            baseconvertion();
        } catch (Exception ex){
            System.out.println("fallo" + ex.getMessage());

        }
    }

    public static void baseconvertion() throws main {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("dame un numero");
            int numero = sn.nextInt();
            for (int i = 2; i <= 16; i++) {
                System.out.println("  " +numero+" en base :"+i+" es :"+ Integer.toString(numero, i));
            }
                    
    }catch  (Exception ex){
                     System.out.println("Fallo" + ex.getMessage());
        }

    }
}
