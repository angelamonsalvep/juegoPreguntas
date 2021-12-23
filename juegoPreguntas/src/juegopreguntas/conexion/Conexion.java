/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopreguntas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static com.mysql.jdbc.Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/juego_preguntas_db";
     
     public Connection getConexion(){
         // Reseteamos a null la conexion a la bd
         con=null;
         try{
             Class.forName(driver);
             // Nos conectamos a la bd
             con= (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
             // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
             if (con!=null){
                  System.out.println("Conexion establecida");
             }
         }
         // Si la conexion NO fue exitosa mostramos un mensaje de error
         catch (ClassNotFoundException | SQLException e){
              System.out.println("Error de conexion" + e);
         }
         return con;
     }
    
}
