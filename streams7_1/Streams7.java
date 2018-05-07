
package streams7_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Marco
 */
public class Streams7 {

    public static void muestra(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      int contador=1;
      FileReader A = new FileReader(archivo);
      BufferedReader B = new BufferedReader(A);
      System.out.println("---Listado  alumnos---");
          System.out.println("_________________________");
        
          while((cadena = B.readLine())!=null) {
          System.out.println("---Alumno nº"+contador+"---");
          System.out.println(cadena);
              System.out.println("____________________");
          contador++;
      
        }
      B.close();
        
        
        
    }
    
}
