/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package Controller;


public class studentController {
    
    public void stdentdetails(String name, String id, String phone, String adrs){
        
        new Model.newStudent().addProduct(name, id, phone, adrs);
    }
    
    
}*/

package Controller;

import Model.newStudent;

/**
 * Controller class to manage student details
 */
public class studentController {

    public void studentDetails(String name, String id, String phone, String adrs) {
        new newStudent().addProduct(name, id, phone, adrs);
    }
}

