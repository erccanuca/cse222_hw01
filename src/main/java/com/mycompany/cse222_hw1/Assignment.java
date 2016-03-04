/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import java.util.ArrayList;


/**
 * Assignment class, take all assignments types.
 * @author ercan
 * @version 1
 */
public class Assignment {
    /**
     * Assignment name
     */
    private String assignment;
    /**
     * Assignment type like book, pdf, word, exel, etc.
    */
    private String assignmentType;
   
   
    /**
     * Save all assignments for current course.
     */
    protected ArrayList assignments = new ArrayList();
    
    /**
     * Assignment Class Constructor with 2 parameters
     * @param assignment is assignment name
     * @param assignmentType is assignment type, like pdf, doc
     */
    public Assignment(String assignment, String assignmentType) {
        this.assignment = assignment;
        this.assignmentType = assignmentType;
    }
    
    
    /**
     * Getter method
     * @return name of assignment.
     */
    public String getAssignment() {
        return assignment;
    }
    /**
     * Setter method
     * @param assignment is new assignment.
     */
    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
    /**
     * Getter method 
     * @return assignment type.
     */
    public String getAssignmentType() {
        return assignmentType;
    }
    /**
     * Setter method
     * @param assignmentType is new assignment type.
     */
    public void setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }
   
    /**
     * Getter Method
     * @return arraylist of assignments
     */
    public ArrayList getAssignments() {
        return assignments;
    }
   
    /**
     * Setter Method
     * @param assignments is new arraylist of assignments
     */
    public void setAssignments(ArrayList assignments) {
        this.assignments = assignments;
    }
    
    /**
    * View all added assignments by teachers
    */
    public void viewAssignments()
    {
        for(int i=0; i< assignments.size(); ++i)
            System.out.println(assignments.get(i).toString());
    }

   
    /**
    * This method show us about Assignment Class.
    * @return string is that information about Assignment.
    */
     @Override
    public String toString() {
        return "Assignment{" + "assignment=" + assignment + ", assignmentType=" + assignmentType + '}';
    }
    
}
