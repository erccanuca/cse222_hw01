/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import java.util.ArrayList;
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
public class AssignmentTest {
    
    public AssignmentTest() {
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
     * Test of getAssignment method, of class Assignment.
     */
    @Test
    public void testGetAssignment() {
        System.out.println("getAssignment");
        Assignment instance = new Assignment("", "");
        String expResult = "";
        String result = instance.getAssignment();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAssignment method, of class Assignment.
     */
    @Test
    public void testSetAssignment() {
        System.out.println("setAssignment");
        String assignment = "";
        Assignment instance = new Assignment("", "");
        instance.setAssignment(assignment); 
    }

    /**
     * Test of getAssignmentType method, of class Assignment.
     */
    @Test
    public void testGetAssignmentType() {
        System.out.println("getAssignmentType");
        Assignment instance = new Assignment("", "");
        String expResult = "";
        String result = instance.getAssignmentType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAssignmentType method, of class Assignment.
     */
    @Test
    public void testSetAssignmentType() {
        System.out.println("setAssignmentType");
        String assignmentType = "";
        Assignment instance = new Assignment("", "");
        instance.setAssignmentType(assignmentType);
      
    }

   
    /**
     * Test of toString method, of class Assignment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Assignment instance = new Assignment("", "");
        String expResult = "Assignment{assignment=, assignmentType=}";
        String result = instance.toString();
        assertEquals(expResult, result);    
    }

    /**
     * Test of getAssignments method, of class Assignment.
     */
    @Test
    public void testGetAssignments() {
        System.out.println("getAssignments");
        Assignment instance = new Assignment("", "");;
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getAssignments();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAssignments method, of class Assignment.
     */
    @Test
    public void testSetAssignments() {
        System.out.println("setAssignments");
        ArrayList assignments = new ArrayList();
        Assignment instance = new Assignment("", "");
        instance.setAssignments(assignments);
        
    }

    /**
     * Test of viewAssignments method, of class Assignment.
     */
    @Test
    public void testViewAssignments() {
        System.out.println("viewAssignments");
        Assignment instance = new Assignment("", "");
        instance.viewAssignments();
       
    }
    
}
