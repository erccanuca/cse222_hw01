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
public class UsersTest {
    
    public UsersTest() {
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
     * Test of getID method, of class Users.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Users instance = new Users(1, "", "");
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setID method, of class Users.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        Users instance = new Users(1, "", "");
        instance.setID(id);
    }

    /**
     * Test of getName method, of class Users.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Users instance = new Users(1, "name", "");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSurname method, of class Users.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Users instance = new Users(1, "", "surname");
        String expResult = "surname";
        String result = instance.getSurname();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class Users.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name2";
        Users instance = new Users(1, "name", "");
        instance.setName(name);
       
    }

    /**
     * Test of setSurname method, of class Users.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "surname1";
        Users instance = new Users(1, "", "surname");
        instance.setSurname(surname);
     
    }

    /**
     * Test of toString method, of class Users.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Users instance = new Users(1, "name", "surname");
        Users instance2 = new Users(1, "name", "surname");

        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
       
    }
    
}
