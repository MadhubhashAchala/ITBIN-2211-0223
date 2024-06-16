
/*package Model;

import java.sql.Connection; // Corrected import for Connection
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class newStudent {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(String name, String id, String phone, String adrs) {
        con = (Connection) DBconnector.conn();
        
        try {
            String sqlquery = "INSERT INTO studentregister(name, id, phonenumber, address) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, name);
            pst.setString(2, id);
            pst.setString(3, phone);
            pst.setString(4, adrs);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULLY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
*/
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Class to manage student database operations
 */
public class newStudent {

    public void addProduct(String name, String id, String phone, String adrs) {
        try (Connection con = DBconnector.conn(); 
             PreparedStatement pst = con.prepareStatement("INSERT INTO studentregister(name, id, phonenumber, address) VALUES (?, ?, ?, ?)")) {
             
            pst.setString(1, name);
            pst.setString(2, id);
            pst.setString(3, phone);
            pst.setString(4, adrs);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Inserted SUCCESSFULLY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
