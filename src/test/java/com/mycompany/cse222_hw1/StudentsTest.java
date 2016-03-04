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
public class StudentsTest {
    
    public StudentsTest() {
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
     * Test of viewCourse method, of class Students.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Administor admin = new  Administor(0, "", "");
        Students instance = new Students(2, "", "");
        instance.viewCourse(admin);

    }

    /**
     * Test of registerSystem method, of class Students.
     */
    @Test
    public void testRegisterSystem() {
        System.out.println("registerSystem");
        Administor admin = new  Administor(0, "", "");
        Register obj = new Register("", "", 2, "", "");
        Students instance = new Students(2, "", "");
        instance.registerSystem(admin, obj);
        
    }

    /**
     * Test of viewAssignments method, of class Students.
     */
    @Test
    public void testViewAssignments() {
        System.out.println("viewAssignments");
        Assignment assign = new Assignment("", "");
        Students instance = new Students(2, "", "");
        instance.viewAssignments(assign);
       
    }

    /**
     * Test of UploadDocument method, of class Students.
     */
    @Test(expected = NullPointerException.class)
    public void testUploadDocument() {
        System.out.println("UploadDocument");
        Assignable assign = null;
        Students instance = new Students(3, "", "");
        Assignment expResult = new Assignment("q", "qq");
        Assignment result = instance.UploadDocument(assign);
        assertEquals(expResult, result);
       
    }
    
}
