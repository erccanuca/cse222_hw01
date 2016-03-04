/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * Process interface include like add/remove and view methods types
 * @version 1
 * @author ercan
 */
public interface Process{
    /**
     * addUser method adds new User by Admin or Teachers
     * @param obj is Users class object
     * @return true if added
     * throws NullPointerException
     */
    public boolean addUser(Users obj) throws NullPointerException;
    /**
     * removeUser method removes user by Admin or Teachers
     * @param obj Users class object
     * @return true if removed
     * throws NullPointerException, Error
     */
    public boolean removeUser(Users obj) throws NullPointerException, Error;
    
    /**
     * view all added  users
     */
    public void viewUser();
    
    /**
     * view all added teachers
     */
    public void viewTeacher();
    
    /**
     * addTutor method adds new Tutor by Admin
     * @param obj is Users class object
     * @return true if added
     * throws ClassCastException,NullPointerException
     */
    public boolean addTutor(Users obj) throws NullPointerException, ClassCastException;
    
    /**
     * removetutor method removes tutor by Admin
     * @param obj Users class object
     * @return true if removed
     * throws NullPointerException,ClassCastException,Error
     */
    public boolean removeTutor(Users obj) throws NullPointerException,ClassCastException,Error;
    
    /**
     * view all added tutors
     */
    public void viewTutor();
    
    /**
     * addStudent method adds new Student by Admin or teachers
     * @param obj is Users class object
     * @return true if added
     * throws NullPointerException,ClassCastException
     */
    public boolean addStudent(Users obj)throws NullPointerException,ClassCastException;
    
    /**
     * removeStudent method removes student by Admin or teachers
     * @param obj Users class object
     * @return true if removed
     * throws NullPointerException,ClassCastException,Error
     */
    public boolean removeStudent(Users obj)throws NullPointerException,ClassCastException,Error;
    
    /**
     * view all added students
     */
    public void viewStudent();
    
    /**
    * view all added courses
    */
    public void viewCourse();
   
}
