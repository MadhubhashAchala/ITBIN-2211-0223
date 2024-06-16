/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class addTeacherModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addTeacherDetails(String tname, String tid,String tphone,String taddress){
        con = DBconnector.conn();
        
        try{
           String sql = "INSERT INTO teacher(tname,tid ,tphone,taddress)VALUES(?, ?, ?, ? )"; 
           pst = con.prepareStatement(sql);
           pst.setString(1, tname);
           pst.setString(2, tid);
           pst.setString(3, tphone);
           pst.setString(4, taddress);
           pst.execute();
           JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFULL");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
      }
}
