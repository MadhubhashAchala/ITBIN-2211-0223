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
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class addinquiryModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addinquiryDetails(String name, String id,String suggestion){
        con = DBconnector.conn();
        
        try{
           String sql = "INSERT INTO inquiry(name,id ,suggestion)VALUES(?, ?, ? )"; 
           pst = con.prepareStatement(sql);
           pst.setString(1, name);
           pst.setString(2, id);
           pst.setString(3, suggestion);
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFULL");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
      }
    
}
