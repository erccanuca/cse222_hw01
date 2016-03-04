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
public class CoursesTest {
    
    public CoursesTest() {
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
     * Test of getCourseID method, of class Courses.
     */
    @Test
    public void testGetCourseID() {
        System.out.println("getCourseID");
        Courses instance = new Courses(11, "Courses");
        int expResult = 11;
        int result = instance.getCourseID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCourseID method, of class Courses.
     */
    @Test
    public void testSetCourseID() {
        System.out.println("setCourseID");
        int courseID = 0;
        Courses instance = new Courses(11, "PC");;
        instance.setCourseID(courseID);
    }

    /**
     * Test of getCourseName method, of class Courses.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Courses instance = new Courses(11, "computer science");
        String expResult = "computer science";
        String result = instance.getCourseName();
        assertEquals(expResult, result);     
    }

    /**
     * Test of setCourseName method, of class Courses.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "System";
        Courses instance = new Courses(11, "DD");
        instance.setCourseName(courseName);
    }

    /**
     * Test of addAssignment method, of class Courses.
     */
    @Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment obj = new Assignment("HW", ".pdf");
        Courses instance = new Courses(11, "Computer");
        boolean expResult = true;
        boolean result = instance.addAssignment(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAssignment method, of class Courses.
     */
    @Test
    public void testRemoveAssignment() {
        System.out.println("removeAssignment");
        Assignment obj = new Assignment("Lecture", ".pdf");
        Courses instance = new Courses(11, "Science");
        instance.addAssignment(obj);
        boolean expResult = true;
        boolean result = instance.removeAssignment(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewAssignment method, of class Courses.
     */
    @Test
    public void testViewAssignment() {
        System.out.println("viewAssignment");
        Courses instance = new Courses(11, "Grades");
        instance.viewAssignment();
    }

    /**
     * Test of toString method, of class Courses.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Courses instance = new Courses(11, "computer");
        Courses instance2 = new Courses(11, "computer");
        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
    }
    
}
