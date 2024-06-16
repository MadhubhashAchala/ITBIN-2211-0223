/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class inquiryUpdateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String name , String id, String suggestion) {
    con = DBconnector.conn();
    
    try {
        String sqlquery = "UPDATE inquiry SET name = ?, suggestion = ? WHERE id = ?";
        pst = con.prepareStatement(sqlquery);
        pst.setString(1, name);
        pst.setString(2, suggestion);    
        pst.setString(3, id);
          
      
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFUL");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }
}
