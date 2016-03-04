/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * This Class extends Assignment Class,
 * save details of assignable documents like homeworks, projects
 * @version 1
 * @author ercan
 */
public class Assignable  extends Assignment{
    
    /**
     *  can upload homework before time
     */
    private String assignmentDeadline;
    /**
     * can upload homework the last time
     */
    private String assignmentLateline;
    /**
     * Grade it by teachers
     */
    private int grade;
    
    /**
      * Assignment Class Constructor with 5 paramaters
      * @param assignment is assignment name
      * @param assignmentType is assignment type, like pdf, doc
      * @param assignmentDeadline is upload homework before time
      * @param assignmentLateline is upload homework the last time
      * @param grade is grade it by teachers
     */
    public Assignable(String assignment, String assignmentType, String assignmentDeadline, String assignmentLateline, int grade) {   
        super(assignment, assignmentType);
        this.assignmentDeadline = assignmentDeadline;
        this.assignmentLateline = assignmentLateline;
        this.grade = grade;
    }
    
     /**
     * Getter method
     * @return assignment deadline.
     */
    public String getAssignmentDeadline() {
        return assignmentDeadline;
    }
    /**
     * Setter method
     * @param assignmentDeadline is new deadline.
     */
    public void setAssignmentDeadline(String assignmentDeadline) {
        this.assignmentDeadline = assignmentDeadline;
    }
    /**
     * Getter method
     * @return assignment lateline.
     */
    public String getAssignmentLateline() {
        return assignmentLateline;
    }
    /**
     * Setter method
     * @param assignmentLateline is new lateline
     */
    public void setAssignmentLateline(String assignmentLateline) {
        this.assignmentLateline = assignmentLateline;
    }
    /**
     * Getter Method
     * @return grade of student
     */
    public int getGrade() {
        return grade;
    }
   /**
    * Setter Method
    * @param grade is new grade of student
    */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
   /**
    * This method show us about Assignable Class.
    * @return string is that information about Assignable.
    */
    @Override
    public String toString() {
        return super.toString() + "\nAssignable{" + "assignmentDeadline=" + assignmentDeadline + ", assignmentLateline=" + assignmentLateline + ", grade=" + grade + "}\n";
    }
    
    
}
