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
public class StudentInterfaceTest {
    
    public StudentInterfaceTest() {
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
     * Test of viewCourse method, of class StudentInterface.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Administor admin = new Administor();
        StudentInterface instance = new StudentInterfaceImpl();
        instance.viewCourse(admin);
       
    }

    /**
     * Test of registerSystem method, of class StudentInterface.
     */
    @Test
    public void testRegisterSystem() {
        System.out.println("registerSystem");
        Administor admin = null;
        Register obj = null;
        StudentInterface instance = new StudentInterfaceImpl();
        instance.registerSystem(admin, obj);
       
    }

    /**
     * Test of viewAssignments method, of class StudentInterface.
     */
    @Test
    public void testViewAssignments() {
        System.out.println("viewAssignments");
        Assignment assign = new Assignment("", "");
        StudentInterface instance = new StudentInterfaceImpl();
        instance.viewAssignments(assign);
        
    }

    /**
     * Test of UploadDocument method, of class StudentInterface.
     */
    @Test
    public void testUploadDocument() {
        System.out.println("UploadDocument");
        Assignable assign = null;
        StudentInterface instance = new StudentInterfaceImpl();
        Assignment expResult = null;
        Assignment result = instance.UploadDocument(assign);
        assertEquals(expResult, result);
        
    }

    public class StudentInterfaceImpl implements StudentInterface {

        @Override
        public void viewCourse(Administor admin) {
        }

        @Override
        public void registerSystem(Administor admin, Register obj) {
        }

        @Override
        public void viewAssignments(Assignment assign) {
        }

        @Override
        public Assignment UploadDocument(Assignable assign) throws NullPointerException {
            return null;
        }
    }
    
}
