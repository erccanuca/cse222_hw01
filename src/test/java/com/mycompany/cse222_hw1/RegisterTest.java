/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class RegisterTest {
    
    public RegisterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class Register.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Register instance = new Register("username", "", 1, "", "");
        String expResult = "username";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsername method, of class Register.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "username2";
        Register instance = new Register("username", "", 1, "", "");
        instance.setUsername(username);
       
    }

    /**
     * Test of getPassword method, of class Register.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Register instance = new Register("username", "1234", 1, "", "");
        String expResult = "1234";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class Register.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "321";
        Register instance = new Register("username", "123", 1, "", "");
        instance.setPassword(password);
        
    }

    /**
     * Test of logIn method, of class Register.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        Register obj = new Register("username", "123", 1, "Hasan", "Can");
        Register instance = new Register("username", "123", 1, "Hasan", "Can");
        boolean expResult = true;
        boolean result = instance.logIn(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of logOut method, of class Register.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        Register obj = new Register("username", "123", 1, "", "");
        Register instance = new Register("username", "123", 1, "", "");
        boolean expResult = true;
        boolean result = instance.logOut(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of equals method, of class Register.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Object();
        Register instance = new Register("username", "123", 1, "", "");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of hashCode method, of class Register.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Register instance = new Register("username", "123", 0, "", "");
        Register instance2 = new Register("username", "123", 1, "", "");
        int result = instance.hashCode();
        int result2 = instance2.hashCode();
        assertEquals(result2, result);
       
}
    
}
