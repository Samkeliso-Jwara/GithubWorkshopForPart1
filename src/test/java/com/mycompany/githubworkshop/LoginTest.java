/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.githubworkshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    


    /**
     * Test of CheckUsername method, of class Login.
     */
    @Test
    public void testValidUsername() {
        System.out.println("CheckUsername");
        Login instance = new Login();
        instance.username = "Sam*";
        boolean expResult = true;
        boolean result = instance.CheckUsername();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testInValidUsername() {
        System.out.println("CheckUsername");
        Login instance = new Login();
        instance.username = "Samhdvbfjhhs";
        boolean expResult = false;
        boolean result = instance.CheckUsername();
        assertEquals(expResult, result);
     
    }
    
}
