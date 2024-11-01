/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasena;
import java.sql.*;
/**
 *
 * @author jonyA
 */
public class dbConnection {
   static String url="jdbc:mysql://localhost:3306/agenda";
   static String user="root";
   static String pass="@Jonydelfin21334";
    
    public static Connection conectar()
    {
       Connection con=null;
       try
       {
       con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexión exitosa");
       }catch(SQLException e)
       {
        e.printStackTrace();
       }
       
       return con;
               
    }
    
}
