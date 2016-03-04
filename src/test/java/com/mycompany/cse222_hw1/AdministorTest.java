/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import com.sun.prism.Texture;
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
public class AdministorTest {
    
    public AdministorTest() {
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
     * Test of addCourse method, of class Administor.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Courses obj = new Courses(11, "");
        Administor instance = new Administor(0, "", "");
        boolean expResult = true;
        boolean result = instance.addCourse(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removeCourses method, of class Administor.
     */
    @Test(expected = Error.class)
    public void testRemoveCourses() {
        System.out.println("removeCourses");
        Courses obj = new Courses(11, "");
        Administor instance = new Administor(0, "", "");
        boolean expResult = false;
        boolean result = instance.removeCourses(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addTeacher method, of class Administor.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Teachers obj = new Teachers(1, "", "");
        Administor instance = new Administor(0, "", "");
        boolean expResult = true;
        boolean result = instance.addTeacher(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeTeacher method, of class Administor.
     */
    @Test(expected = NullPointerException.class)
    public void testRemoveTeacher() {
        System.out.println("removeTeacher");
        Users obj = null;
        Administor instance = new Administor(0, "", "");
        boolean expResult = false;
        boolean result = instance.removeTeacher(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Administor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administor instance = new Administor(0, "ercan", "uca");
        String expResult = "";
        String result = instance.toString();
        assertNotNull(expResult, result);   
    }
    
}
