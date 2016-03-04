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
public class TeachersTest {
    
    public TeachersTest() {
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
     * Test of addAssignmetToCourse method, of class Teachers.
     */
    @Test
    public void testAddAssignmetToCourse() {
        System.out.println("addAssignmetToCourse");
        Courses obj = new Courses(11, "");
        Assignment asg = new Assignment("", "");
        Teachers instance = new Teachers(1, "", "");
        boolean expResult = true;
        boolean result = instance.addAssignmetToCourse(obj, asg);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewCourse method, of class Teachers.
     */
    @Test
    public void testViewCourse() {
        System.out.println("viewCourse");
        Administor admin = new Administor(0, "", "");
        Teachers instance = new Teachers(1, "", "");
        instance.viewCourse(admin);
       
    }

    /**
     * Test of viewStudent method, of class Teachers.
     */
    @Test
    public void testViewStudent() {
        System.out.println("viewStudent");
        Administor admin = new Administor(0, "", "");
        Teachers instance = new Teachers(1, "", "");
        instance.viewStudent(admin);
        
    }

    /**
     * Test of toString method, of class Teachers.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Teachers instance = new Teachers(1, "name", "surname");
        Teachers instance2 = new Teachers(1, "name", "surname");
        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
        
    }

    /**
     * Test of gradeOfDocumentOfCurrentStudent method, of class Teachers.
     */
    @Test
    public void testGradeOfDocumentOfCurrentStudent() {
        System.out.println("gradeOfDocumentOfCurrentStudent");
        Assignable as = new Assignable("", "", "", "", 0);
        int grade = 0;
        Teachers instance = new Teachers(1, "", "");
        instance.gradeOfDocumentOfCurrentStudent(as, grade);
        
    }
    
}
