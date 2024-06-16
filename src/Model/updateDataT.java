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
public class updateDataT {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void updateTT(String name, String id, String phone, String addres) {
    con = DBconnector.conn();
    
    try {
        String sqlquery = "UPDATE teacher SET tname = ?, tphone = ?, taddress = ? WHERE tid = ?";
        pst = con.prepareStatement(sqlquery);
        pst.setString(1, name);
        pst.setString(2, phone);    
        pst.setString(3, addres);
        pst.setString(4, id);  
      
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

