package sql;

import java.sql.*;
import java.sql.DriverManager;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Sql {

    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 

        while (!salir) {

            System.out.println("1. Select");
            System.out.println("2. Update");
            System.out.println("3. Insert");
            System.out.println("4. Salir");
            
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        select();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        update();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        insert();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
        } catch (InputMismatchException e) { //esta ecepcion captura los fallos de el menu a la hora de seleccionar .
                System.out.println("Debes insertar un número  " + e.getMessage());
                sn.next();
                } catch (SQLException ex) {
                System.out.println("Mensaje de error: " + ex.getMessage());
                System.out.println("Mensaje de estado: " + ex.getSQLState());
                System.out.println("Nº error:" + ex.getErrorCode());
            }

             
    
        }
    }
        public static void select()throws SQLException{
              
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer","root","root");
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("Select * from beer");
     while (rs.next()){
    String name=rs.getString("name");
    String brewer=rs.getString("brewer");
            System.out.println(name+"       "+brewer);
     }
     
    
    }
     
            
        
   //----------------------------------------------------------------------------------------------------------------------------------------------     
    public static void update() throws SQLException{
              
     Scanner sn = new Scanner(System.in);
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer","root","root");// Esto conecta con la base de datos 
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("Select * from beer");
     while (rs.next()){
    String name=rs.getString("name");
    String brewer=rs.getString("brewer");
            System.out.println(name+"       "+brewer);
     }
    System.out.println("En que columna hacemos la modificacion");
    String col= sn.nextLine();
    System.out.println("Dime que valor modificaras: (ENTRE COMILLAS PLIS 'valor') ");
        String valor_v = sn.nextLine();
        System.out.println("Dime el valor nuevo: ( ENTRE COMILLAS PLIS 'valor') ");
        String valor_n = sn.nextLine();
        if (col == "name") {
            int update = st.executeUpdate("Update beer set " + col + " = " + valor_n + " WHERE " + col + " = " + valor_v);//Aqui hacemos el update 
        } else {
            System.out.println("fallo al hacer un update"); // por si falla el update te saldra esto mas las excepciones
        }
        System.out.println("sistema actualizado: ");
        ResultSet resultado = st.executeQuery("Select * from Beer");
        System.out.println("***********************");
        while (resultado.next()) {
            String name = resultado.getString("name");
            String brewer = resultado.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");

    }
      
        
   // -----------------------------------------------------------------------------------------------------------------------------------------------------
    public static void insert() throws SQLException {
              
      Scanner sn = new Scanner(System.in);
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beer","root","root");
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("Select * from beer");
     while (rs.next()){
    String name=rs.getString("name");
    String brewer=rs.getString("brewer");
            System.out.println(name+"       "+brewer);
     }
     System.out.println("dame el nombre de una persona:   (ENTRE COMILLAS PLIS 'valor') ");
    String nombre= sn.nextLine();
    System.out.println("Dime su apellido : (ENTRE COMILLAS PLIS 'valor') ");
        String apellido = sn.nextLine();
         int insert = st.executeUpdate("INSERT INTO beer (name,brewer) VALUES (" + nombre + "," + apellido + ")");
        System.out.println("ya as metido una persona en el sisema : ");
        ResultSet resultado = st.executeQuery("Select * from Beer");
        System.out.println("***********************");
        while (resultado.next()) {
            String name = resultado.getString("name");
            String brewer = resultado.getString("brewer");
            System.out.println("*" + name + "  -  " + brewer + "*");
        }
        System.out.println("***********************");
    }
       
        }

    
    // El rowback lo hace ya que si en el insert el apellido no se mete o el nombre no actualiza la tabla 
    //duda como ponner que el fallo es en un insert ,update o select .
    

