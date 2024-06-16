/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class addTeacherControll {
    
    public void teacherdetails(String name, String id,String phone,String address){
        new Model.addTeacherModel().addTeacherDetails(name,id,phone,address);
    }
    
}
