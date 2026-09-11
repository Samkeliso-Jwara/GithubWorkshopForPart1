/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubworkshop;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class GitHubWorkShop {

    public static void main(String[] args) {
        //All the code that refrences the Login Class
        Login obj = new Login();
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your username?");
        String user = input.nextLine();
        
        obj.username = user;
        
        if(obj.CheckUsername()){
            System.out.println("Username Successfully"
                    + " Captured");
        }else{
            System.out.println("Username is not in correct"
                    + " Format");
        }
    }
}
