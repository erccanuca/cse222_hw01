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
public class Process_AssignmentsTest {
    
    public Process_AssignmentsTest() {
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
     * Test of addAssignment method, of class Process_Assignments.
     */
    @Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment obj = new Assignment("HW", ".pdf");
        Process_Assignments instance = new Process_AssignmentsImpl();
        boolean expResult = false;
        boolean result = instance.addAssignment(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeAssignment method, of class Process_Assignments.
     */
    @Test
    public void testRemoveAssignment() {
        System.out.println("removeAssignment");
        Assignment obj = new Assignment("HW", ".pdf");
        Process_Assignments instance = new Process_AssignmentsImpl();
        boolean expResult = false;
        boolean result = instance.removeAssignment(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of viewAssignment method, of class Process_Assignments.
     */
    @Test
    public void testViewAssignment() {
        System.out.println("viewAssignment");
        Process_Assignments instance = new Process_AssignmentsImpl();
        instance.viewAssignment();
       
    }

  

    public class Process_AssignmentsImpl implements Process_Assignments {

        @Override
        public boolean addAssignment(Assignment obj) throws NullPointerException {
            return false;
        }

        @Override
        public boolean removeAssignment(Assignment obj) throws NullPointerException, Error {
            return false;
        }

        @Override
        public void viewAssignment() {
        }
    }

    
    
}
