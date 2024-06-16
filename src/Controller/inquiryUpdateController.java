/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class inquiryUpdateController {
    
    public void update(String name, String id, String suggestion){
       
        new Model.inquiryUpdateData().update(name, id, suggestion);
    }
    
}
