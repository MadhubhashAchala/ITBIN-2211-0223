/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import com.sun.jdi.connect.spi.Connection;
//import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String name, String id, String phone, String staddress) {
    con = DBconnector.conn();
    
    try {
        String sqlquery = "UPDATE studentregister SET name = ?, phonenumber = ?, address = ? WHERE id = ?";
        pst = con.prepareStatement(sqlquery);
        pst.setString(1, name);
        pst.setString(2, phone);
        pst.setString(3, staddress);
        pst.setString(4, id);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFUL");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
} 
    
   /* 
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String name, String id, String phone, String staddress){
        
        con = DBconnector.conn();
        
        try {
            String sqlquery = "UPDATE products SET name = '"+name+"', id  = '"+id+"', phonenumber = '"+phone+"' , address = '"+staddress+"' WHERE id = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
      }
    */
}
