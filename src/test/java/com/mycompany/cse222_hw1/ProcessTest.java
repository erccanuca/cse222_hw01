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
public class ProcessTest {
    
    public ProcessTest() {
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
     * Test of addUser method, of class Process.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.addUser(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of removeUser method, of class Process.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.removeUser(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of viewUser method, of class Process.
     */
    @Test
    public void testViewUser() {
        System.out.println("viewUser");
        Process instance = new ProcessImpl();
        instance.viewUser();
       
    }

    /**
     * Test of viewTeacher method, of class Process.
     */
    @Test
    public void testViewTeacher() {
        System.out.println("viewTeacher");
        Process instance = new ProcessImpl();
        instance.viewTeacher();
       
    }

    /**
     * Test of addTutor method, of class Process.
     */
    @Test
    public void testAddTutor() {
        System.out.println("addTutor");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.addTutor(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeTutor method, of class Process.
     */
    @Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.removeTutor(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewTutor method, of class Process.
     */
    @Test
    public void testViewTutor() {
        System.out.println("viewTutor");
        Process instance = new ProcessImpl();
        instance.viewTutor();
      
    }

    /**
     * Test of addStudent method, of class Process.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.addStudent(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removeStudent method, of class Process.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Users obj = new Users(2, "Ali", "Kara");
        Process instance = new ProcessImpl();
        boolean expResult = false;
        boolean result = instance.removeStudent(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of viewStudent method, of class Process.
     */
    @Test
    public void testViewStudent() {
        System.out.println("viewStudent");
        Process instance = new ProcessImpl();
        instance.viewStudent();
        
    }

  

    /**
     * Test of viewCourse method, of class Process.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Process instance = new ProcessImpl();
        instance.viewCourse();
       
    }

    public class ProcessImpl implements Process {

        @Override
        public boolean addUser(Users obj) throws NullPointerException {
            return false;
        }

        @Override
        public boolean removeUser(Users obj) throws NullPointerException, Error {
            return false;
        }

        @Override
        public void viewUser() {
        }

        @Override
        public void viewTeacher() {
        }

        @Override
        public boolean addTutor(Users obj) throws NullPointerException, ClassCastException {
            return false;
        }

        @Override
        public boolean removeTutor(Users obj) throws NullPointerException, ClassCastException, Error {
            return false;
        }

        @Override
        public void viewTutor() {
        }

        @Override
        public boolean addStudent(Users obj) throws NullPointerException, ClassCastException {
            return false;
        }

        @Override
        public boolean removeStudent(Users obj) throws NullPointerException, ClassCastException, Error {
            return false;
        }

        @Override
        public void viewStudent() {
        }

        @Override
        public void viewCourse() {
        }
    }

  
}
