/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * This class extends Assignment class and implements Process_Assignments interface,
 * Course Class save all about courses.
 * @version 1
 * @author ercan
 */
public class Courses extends Assignment implements Process_Assignments{
    /**
     * Course identfy
     */
    private int courseID;
    /**
     * Name of course
     */
    private String courseName;
    
    /**
     * Assignable Class object for constructors.
     */
    private Assignable assignable;
    
    /**
     * Courses Class Constructor with 2 paramaters
     */
    public Courses() {
        super("","");
        assignable = new Assignable("", "", "", "", 0);
        this.courseID = 0;
        this.courseName = "";
    }
     /**
     * Courses Class Constructor with 4 paramaters
     * @param courseID identfy
     * @param courseName course name
    
     */
    public Courses(int courseID, String courseName) {
        super("", "");
        this.courseID = courseID;
        this.courseName = courseName;
    }
    /**
     * Courses Class Constructor with 4 paramaters
     * @param courseID identfy
     * @param courseName course name
     * @param assignment assignment name
     * @param assignmentType assignment type
     */
    public Courses(int courseID, String courseName,
               String assignment,String assignmentType) {
        
        super(assignment, assignmentType);
        this.courseID = courseID;
        this.courseName = courseName;
    }
    
    /**
     * Courses Class Constructor with 7 paramaters
     * @param courseID identfy
     * @param courseName course name
     * @param assignment assignment name
     * @param assignmentType assignment type
     * @param assignmentDeadline assignment deadline
     * @param assignmentLateline lateline
     * @param grade is grade it by teachers
     */
    public Courses(int courseID, String courseName, String assignment,
                                 String assignmentType, String assignmentDeadline,
                                 String assignmentLateline, int grade) {
        super(assignment, assignmentType);
        assignable.setAssignmentDeadline(assignmentDeadline);
        assignable.setAssignmentLateline(assignmentLateline);
        assignable.setGrade(grade);
        this.courseID = courseID;
        this.courseName = courseName;
    }

   /**
    * Getter method
    * @return course id
    */
    public int getCourseID() {
        return courseID;
    }
    /**
     * Setter method
     * @param courseID is new course id
     */
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
   /**
    * Getter method
    * @return name of course
    */
    public String getCourseName() {
        return courseName;
    }
    /**
     * Setter method
     * @param courseName is new name of course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Adds to course new assignment
     * @param obj Assignment Class object
     * @return true if added
     * throws NullPointerException
     */
    @Override
    public boolean addAssignment(Assignment obj) throws NullPointerException {
        if(obj==null)
            throw new NullPointerException();
        else
            return assignments.add(obj);
    }
    /**
     * Removes from course exist assignment
     * @param obj Assignment Class object
     * @return true if deleted
     * throws NullPointerException,Error
     */
    @Override
    public boolean removeAssignment(Assignment obj) throws NullPointerException,Error {
        if(obj==null)
            throw new NullPointerException();
        else if(assignments.isEmpty())
            throw new Error();
        else
            return assignments.remove(obj);
    }
    
    /**
     * view all added assignments
     */
    @Override
    public void viewAssignment() {
        for(int i=0; i<assignments.size(); ++i)
            System.out.println(assignments.get(i).toString());
    }
   
    /**
    * This method show us about Courses Class.
    * @return string is that information about Courses.
    */
    @Override
    public String toString() {
        String str ="\ncourseID:" + courseID + ", courseName:" + courseName + '\n';
        for(int i=0; i < assignments.size(); ++i)
            str+=assignments.get(i).toString();
        return str + "\n";
    }

    
   
}
