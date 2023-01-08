/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms1;
import java.sql.*;
/**
 *
 * @author perfect
 */
public class DBConnection {
      
      static final String DB_URL = "jdbc:mysql://localhost/demo";
      static final String USER = "root";
      static final String PASS = "";
      public static Connection connectDB(){
          Connection conn = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
          //open a connection
          conn = DriverManager.getConnection(DB_URL , USER , PASS);
          return conn;
       }catch(Exception ex){
            System.out.println("There was error while connecting DB.");
           return null;
       }
      } 
}
