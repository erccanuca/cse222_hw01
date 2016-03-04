/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * TeacherInterface interface save specific methods for Teachers class
 * @version 1
 * @author ercan
 */
public interface TeacherInterface {
    
    /**
     * This method add assignment to current course
     * @param obj Cource Class object to add assignment
     * @param asg Assignment Class object to adds by Course Class object
     * @return true if asg added to obj, otherelse false;
     */
    public boolean addAssignmetToCourse(Courses obj, Assignment asg);
    
    /**
     * View all added courses by Admin
     * @param admin Administor Class object to call method that view all courses.
     */
    public void viewCourse(Administor admin);
    
    /**
     * View all added students by Admin
     * @param admin Administor Class object to call method that view all students.
     */
    public void viewStudent(Administor admin);
    
    /**
     * This method is gradin by teacher
     * @param asign is assignable document
     * @param grade is load by teacher, type is integer
     */
    public void gradeOfDocumentOfCurrentStudent(Assignable asign, int grade);
}
