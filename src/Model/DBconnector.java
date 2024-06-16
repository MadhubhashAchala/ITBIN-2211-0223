/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package Model;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnector {
    
    public static Connection conn(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String passworld = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(url, user,passworld);
            return conn;
            
        }catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
return null;
    }}
*/
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Class to manage database connections
 */
public class DBconnector {

    public static Connection conn() {
        try {
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String password = ""; // fixed spelling
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
