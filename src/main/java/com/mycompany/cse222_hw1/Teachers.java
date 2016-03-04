/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * Teachers Class extends Users impements TeacherInterface interface
 * @version 1
 * @author ercan
 */
public class Teachers extends MySystem implements TeacherInterface{

    /**
     * Teachers Class constructor
     * @param id identfy
     * @param name name of teacher
     * @param surname surname of teacher
     */
    public Teachers(int id, String name, String surname) {
        super(id, name, surname);
    }
    /**
     * This method add assignment to current course
     * @param obj Cource Class object to add assignment
     * @param asg Assignment Class object to adds by Course Class object
     * @return true if asg added to obj, otherelse false;
     */
    @Override
    public boolean addAssignmetToCourse(Courses obj, Assignment asg){
        return obj.addAssignment(asg);
    }
    /**
     * View all added courses by Admin
     * @param admin Administor Class object to call method that view all courses.
     */
    @Override
    public void viewCourse(Administor admin) {
        admin.viewCourse();
    }
     /**
     * View all added students by Admin
     * @param admin Administor Class object to call method that view all students.
     */
    @Override
    public void viewStudent(Administor admin) {
        admin.viewStudent();
    }
    /**
     * This method is gradin by teacher
     * @param assign is assignable document
     * @param grade is load by teacher, type is integer
     */
    @Override
    public void gradeOfDocumentOfCurrentStudent(Assignable assign, int grade)
    {
      assign.setGrade(grade);
    }
     /**
    * This method show us about Teacher Class.
    * @return string is that information about current teacher.
    */
    @Override
    public String toString()
    {
        return "Teacher_id:" + getID() + " Teacher_name:" + getName() + " Teacher_surname:" + getSurname() + "\n";
    }  


   
}
