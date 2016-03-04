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
public class TutorsTest {
    
    public TutorsTest() {
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
     * Test of viewCourse method, of class Tutors.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Administor admin = new Administor(0, "", "");
        Tutors instance = new Tutors(2, "", "");
        instance.viewCourse(admin); 
    }

    /**
     * Test of toString method, of class Tutors.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tutors instance = new Tutors(1, "name", "surname");
        Tutors instance2 = new Tutors(1, "name", "surname");
        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
        
    }
    
}
