/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streasobejtos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Marco
 */
public class Main {
    
//primero creamos la ecepcion para abrir el fichero y leer el obejto 
 public static void main(String[] args) throws excepcion, FileNotFoundException, IOException, ClassNotFoundException {
       
        try {
            abrirfichero();
            leerobjeto();
        } catch (excepcion ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
 //abrimos el fichero
    public static void abrirfichero() throws excepcion, FileNotFoundException, ClassNotFoundException {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        try {
            archivo = new File("C:\\Users\\Marco\\Desktop\\ejercicio4.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            leerarchivo(br);
        } catch (IOException | excepcion e) {
            throw new excepcion("Error en la apertura del fichero", e.getCause());
        } finally {
            cerrarFichero(fr);//cerramos el fichero con finaly 
        }
    }
        public static void cerrarFichero(FileReader fr) {;//cerramos el fichero con 
       
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {
        }
    }
       public static void leerarchivo(BufferedReader br) throws IOException, excepcion, FileNotFoundException, ClassNotFoundException {
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String vector[] = linea.split(" ");
            generarobjeto(vector, br);
        }
    }  
       // Aqui ya generamos el objeto 
       public static void generarobjeto(String vector[], BufferedReader br) throws excepcion, FileNotFoundException, IOException, ClassNotFoundException {
        try {
            File archivo = new File("prueba.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Persona(vector[0], vector[1], vector[2], vector[3], vector[4], vector[5], vector[6], vector[7], vector[8]));
            oos.close();

        } catch (Exception e) {
            throw new excepcion("Error en la creacion del objeto", e.getCause());
        }
    } 
        public static void leerobjeto() throws excepcion, IOException, ClassNotFoundException {
        /*
  Alumno: Pepe García Hernández
------------------------------   -------
Módulo                            Nota
------------------------------   -------
Lenguaje de marcas         5
Programación                   7
Entornos de desarrollo     3
Base de datos                  7
Sistemas informáticos      10
FOL                                  c-5 */
        ObjectInputStream ois = null;
        try {
            File f = new File("prueba.txt");
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
                Persona p = (Persona) ois.readObject();
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Apellidos: " + p.getApellido() + " " + p.getApillido2());
                System.out.println("Lenguaje de marcas: " + p.getM());
                System.out.println("Programacion: " + p.getProg());
                System.out.println("Entornos de desarrollo: " + p.getEnd());
                System.out.println("Base de datos: " + p.getBd());
                System.out.println("Sistemas informaticos: " + p.getSi());
                System.out.println("FOL: " + p.getFol());
        } catch (IOException e) {
            throw new excepcion("Error en la lectura del objeto", e.getCause());
        } finally {
            ois.close();
        }
    }

       
       
       

 }
 
 
 
 
 
 
