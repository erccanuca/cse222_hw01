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
public class AdminInterfaceTest {
    
    public AdminInterfaceTest() {
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
     * Test of addCourse method, of class AdminInterface.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Courses obj = new Courses();
        AdminInterface instance = new AdminInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addCourse(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of removeCourses method, of class AdminInterface.
     */
    @Test
    public void testRemoveCourses() throws Exception {
        System.out.println("removeCourses");
        Courses obj = new Courses();
        AdminInterface instance = new AdminInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.removeCourses(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addTeacher method, of class AdminInterface.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Users obj = new Users();
        AdminInterface instance = new AdminInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addTeacher(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removeTeacher method, of class AdminInterface.
     */
    @Test
    public void testRemoveTeacher() throws Exception {
        System.out.println("removeTeacher");
        Users obj = new Users();
        AdminInterface instance = new AdminInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.removeTeacher(obj);
        assertEquals(expResult, result);
        
    }

    public class AdminInterfaceImpl implements AdminInterface {

        @Override
        public boolean addCourse(Courses obj) throws NullPointerException {
            return false;
        }

        @Override
        public boolean removeCourses(Courses obj) throws Error, NullPointerException {
            return false;
        }

        @Override
        public boolean addTeacher(Users obj) throws ClassCastException, NullPointerException {
            return false;
        }

        @Override
        public boolean removeTeacher(Users obj) throws ClassCastException, Error, NullPointerException {
            return false;
        }
    }
    
}
