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
public class MySystemTest {
    
    public MySystemTest() {
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
     * Test of getUsers method, of class MySystem.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getUsers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTeachers method, of class MySystem.
     */
    @Test
    public void testGetTeachers() {
        System.out.println("getTeachers");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getTeachers();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTutors method, of class MySystem.
     */
    @Test
    public void testGetTutors() {
        System.out.println("getTutors");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getTutors();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getStudents method, of class MySystem.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getStudents();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCourses method, of class MySystem.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList<Courses> expResult = new ArrayList();
        ArrayList<Courses> result = instance.getCourses();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getOldcourses method, of class MySystem.
     */
    @Test
    public void testGetOldcourses() {
        System.out.println("getOldcourses");
        AbstractClassImpl instance =  new AbstractClassImpl();
        ArrayList<Courses> expResult = new ArrayList();
        ArrayList<Courses> result = instance.getOldcourses();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addUser method, of class MySystem.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        Users obj = new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = true;
        boolean result = instance.addUser(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removeUser method, of class MySystem.
     */
    @Test(expected = Error.class)
    public void testRemoveUser() {
        System.out.println("removeUser");
        Users obj =new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = false;
        boolean result = instance.removeUser(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of addTutor method, of class MySystem.
     */
    @Test(expected = ClassCastException.class)
    public void testAddTutor() {
        System.out.println("addTutor");
        Users obj =new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = false;
        boolean result = instance.addTutor(obj);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of removeTutor method, of class MySystem.
     */
    @Test(expected = ClassCastException.class)
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        Users obj =new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = false;
        boolean result = instance.removeTutor(obj);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of addStudent method, of class MySystem.
     */
    @Test(expected = ClassCastException.class)
    public void testAddStudent() {
        System.out.println("addStudent");
        Users obj = new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = false;
        boolean result = instance.addStudent(obj);
        assertEquals(expResult, result);
        
      
    }

    /**
     * Test of removeStudent method, of class MySystem.
     */
    @Test(expected = ClassCastException.class)
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Users obj = new Users(1, "", "");
        AbstractClassImpl instance =  new AbstractClassImpl();
        boolean expResult = false;
        boolean result = instance.removeStudent(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewUser method, of class MySystem.
     */
    @Test
    public void testViewUser() {
        System.out.println("viewUser");
        AbstractClassImpl instance =  new AbstractClassImpl();
        instance.viewUser();
      
    }

    /**
     * Test of viewTeacher method, of class MySystem.
     */
    @Test
    public void testViewTeacher() {
        System.out.println("viewTeacher");
        AbstractClassImpl instance =  new AbstractClassImpl();
        instance.viewTeacher();
      
    }

    /**
     * Test of viewTutor method, of class MySystem.
     */
    @Test
    public void testViewTutor() {
        System.out.println("viewTutor");
        AbstractClassImpl instance =  new AbstractClassImpl();
        instance.viewTutor();
      
    }

    /**
     * Test of viewStudent method, of class MySystem.
     */
    @Test
    public void testViewStudent() {
        System.out.println("viewStudent");
        AbstractClassImpl instance =  new AbstractClassImpl();
        instance.viewStudent();
      
    }

    /**
     * Test of viewCourse method, of class MySystem.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        AbstractClassImpl instance =  new AbstractClassImpl();
        instance.viewCourse();
      
    }

    public class AbstractClassImpl extends MySystem {

        public AbstractClassImpl() {
            super(0, "", "");
        }
    }

    public class MySystemImpl extends MySystem {

        public MySystemImpl() {
            super(0, "", "");
        }
    }

    
}
