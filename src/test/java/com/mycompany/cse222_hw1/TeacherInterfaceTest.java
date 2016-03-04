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
public class TeacherInterfaceTest {
    
    public TeacherInterfaceTest() {
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
     * Test of addAssignmetToCourse method, of class TeacherInterface.
     */
    @Test
    public void testAddAssignmetToCourse() {
        System.out.println("addAssignmetToCourse");
        Courses obj = null;
        Assignment asg = null;
        TeacherInterface instance = new TeacherInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addAssignmetToCourse(obj, asg);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of viewCourse method, of class TeacherInterface.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Administor admin = null;
        TeacherInterface instance = new TeacherInterfaceImpl();
        instance.viewCourse(admin);
        
    }

    /**
     * Test of viewStudent method, of class TeacherInterface.
     */
    @Test
    public void testViewStudent() {
        System.out.println("viewStudent");
        Administor admin = null;
        TeacherInterface instance = new TeacherInterfaceImpl();
        instance.viewStudent(admin);
      
    }

    /**
     * Test of gradeOfDocumentOfCurrentStudent method, of class TeacherInterface.
     */
    @Test
    public void testGradeOfDocumentOfCurrentStudent() {
        System.out.println("gradeOfDocumentOfCurrentStudent");
        Assignable asign = null;
        int grade = 0;
        TeacherInterface instance = new TeacherInterfaceImpl();
        instance.gradeOfDocumentOfCurrentStudent(asign, grade);
        
    }

    public class TeacherInterfaceImpl implements TeacherInterface {

        public boolean addAssignmetToCourse(Courses obj, Assignment asg) {
            return false;
        }

        public void viewCourse(Administor admin) {
        }

        public void viewStudent(Administor admin) {
        }

        public void gradeOfDocumentOfCurrentStudent(Assignable asign, int grade) {
        }
    }
    
}
