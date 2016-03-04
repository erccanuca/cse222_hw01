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
public class AssignableTest {
    
    public AssignableTest() {
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
     * Test of getAssignmentDeadline method, of class Assignment.
     */
    @Test
    public void testGetAssignmentDeadline() {
        System.out.println("getAssignmentDeadline");
        Assignable instance = new Assignable("", "","","",0);
        String expResult = "";
        String result = instance.getAssignmentDeadline();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAssignmentDeadline method, of class Assignment.
     */
    @Test
    public void testSetAssignmentDeadline() {
        System.out.println("setAssignmentDeadline");
        String assignmentDeadline = "";
        Assignable instance = new Assignable("", "", "", "",0);
        instance.setAssignmentDeadline(assignmentDeadline);
        
    }

    /**
     * Test of getAssignmentLateline method, of class Assignment.
     */
    @Test
    public void testGetAssignmentLateline() {
        System.out.println("getAssignmentLateline");
        Assignable instance = new Assignable("", "", "", "20.11.2013",0);
        String expResult = "20.11.2013";
        String result = instance.getAssignmentLateline();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAssignmentLateline method, of class Assignment.
     */
    @Test
    public void testSetAssignmentLateline() {
        System.out.println("setAssignmentLateline");
        String assignmentLateline = "";
        Assignable instance = new Assignable("", "", "", "",0);
        instance.setAssignmentLateline(assignmentLateline);
        
    }

    /**
     * Test of getGrade method, of class Assignable.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Assignable instance = new Assignable("", "", "", "", 24);
        int expResult = 24;
        int result = instance.getGrade();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setGrade method, of class Assignable.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        int grade = 0;
        Assignable instance = new Assignable("", "", "", "", 67);;
        instance.setGrade(grade);
       
    }

    /**
     * Test of toString method, of class Assignable.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Assignable instance = new Assignable("", "", "", "", 67);
        Assignable instance2 = new Assignable("", "", "", "", 67);
        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
       
    }
    
}
