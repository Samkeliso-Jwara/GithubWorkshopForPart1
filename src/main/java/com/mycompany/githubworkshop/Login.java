/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubworkshop;

/**
 *
 * @author Student
 */
public class Login {
    
    //CheckUsername (returns T/F)
    //CheckPaswordComplexity (returns T/F)
    //CheckCellNumber (Returns T/F)
    String username;
    public boolean CheckUsername(){
        return username.contains("*") && 
                username.length()<=7;
    }
    
    public boolean CheckMyUsername(){
        return username.contains("*") && 
                username.length()<=7;
    }
    
}
