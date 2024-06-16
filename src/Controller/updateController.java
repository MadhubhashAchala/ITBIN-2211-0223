/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class updateController {
    
    public void update(String name, String id, String phone, String staddress){
       
        new Model.updateData().update(name, id, phone, staddress);
    }
    
}
