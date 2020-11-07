/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    try{
        String host = "jdbc:derby://localhost:1527/Employees";
        String uName = "Judith";
        String uPass = "judith";
        
        Connection con = DriverManager.getConnection( host,uName, uPass ); 
        
        Statement stmt = con.createStatement();
        String SQL = "SELECT * FROM WORKERS";
        ResultSet rs = stmt.executeQuery( SQL );
        
        while ( rs.next() ) {
            int id_col = rs.getInt("ID");
            String first_name = rs.getString("First_Name");
            String last_name = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");
            
            System.out.println(id_col + " " + first_name + " " + last_name + " " + job);
        }
    }
    catch ( SQLException err ) {
         System.out.println( err.getMessage() );
    }   
    
}
}
