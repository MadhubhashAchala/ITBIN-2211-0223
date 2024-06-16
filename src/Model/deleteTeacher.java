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
public class deleteTeacher {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(String id){
        
        con = DBconnector.conn();
        
        try{
            String sqlquery = "DELETE FROM teacher WHERE tid = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (SQLException e){
          //  JOptionPane.showMessageDialog(null, "DELETED");
        }
    }
    
}
