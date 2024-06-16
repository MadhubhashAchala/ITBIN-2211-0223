/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class addModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(String name, String id,String phone,String address){
        con = DBconnector.conn();
        
        try{
           String sql = "INSERT INTO teacher(tname ,tid,tphone,taddress)VALUES(?, ?, ?, ? )"; 
           pst = con.prepareStatement(sql);
           pst.setString(1, name);
           pst.setString(2, id);
           pst.setString(3, phone);
           pst.setString(4, address);
           pst.execute();
           JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFULL");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     } 
    
}
