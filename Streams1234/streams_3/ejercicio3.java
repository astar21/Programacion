/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author marco
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void Exception(String[] args) throws IOException, FileNotFoundException, Exception {
        try {
            abrir();
        } catch (Exception ex) {
           
            System.out.println("Mensaje de error: " + ex.getMessage());
        }

    }

    public static void abrir() throws Exception {
        File archivo;
        FileReader fr = null;
        BufferedReader br;

        try {
            archivo = new File("C:\\Users\\Admin\\Desktop\\streams3.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            leer(br);
        } catch (Exception e) {
           
            throw new Exception("Error en la apertura del fichero", e.getCause());
        } finally {

            cerrar(fr);
        }
    }

    public static void cerrar(FileReader fr) {
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {

        }
    }

    public static void leer(BufferedReader br) throws IOException {
        String linea;
        while ((linea = br.readLine()) != null) {
            String vector[] = linea.split(" ");
            generarboletin(vector, br);
        }
    }

    public static void generarboletin(String vector[], BufferedReader br) throws IOException {

        FileWriter archivo = new FileWriter("C:\\Users\\Admin\\Desktop\\"
                + vector[0] + vector[1] + vector[2] + ".txt");
        PrintWriter ar = new PrintWriter(archivo);
        int aprobadas = 0;
        int suspensas = 0;
        int convalidadas = 0;

        ar.println("=====Boletin de notas===========");
        ar.println("Nombre:" + vector[0] + " " + vector[1] + " " + vector[2]);
        ar.println("_Modulo------------------------Notas_");
        ar.println("Lenguaje de marcas:" + " " + vector[3]);
        ar.println("Programacion:" + " " + vector[4]);
        ar.println("Entornos de desarrollo:" + " " + vector[5]);
        ar.println("Base de datos:" + " " + vector[6]);
        ar.println("Sistemas Informaticos:" + " " + vector[7]);
        ar.println("FOL:" + " " + vector[8]);
        ar.println("==========================");
        for (int i = 3; i < 9; i++) {
            if (vector[i].equals("c-5")) {
                convalidadas++;
            } else if (Integer.parseInt(vector[i]) < 5) {
                suspensas++;
            } else if (Integer.parseInt(vector[i]) >= 5) {
                aprobadas++;
            }
        }
        ar.println("Modulos aprobados: " + aprobadas);
        ar.println("Modulos suspensos: " + suspensas);
        ar.println("Modulos convalidados: " + convalidadas);
        ar.println("===========================");
        cerrarEscritura(ar);
    }

    public static void cerrarEscritura(PrintWriter ar) throws IOException {

        try {
            if (null != ar) {
                ar.close();
            }
        } catch (Exception e2) {
        }

    }

}

