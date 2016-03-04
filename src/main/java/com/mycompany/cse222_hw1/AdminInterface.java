/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * Admin interface Class, this interface saves specific methods for admin
 * @version 1
 * @author ercan
 */
public interface AdminInterface {
    
    /**
     * This method adds courses by admin
     * @param obj Courses Class object
     * @return true if added
     * throws NullPointerException
     */
     public boolean addCourse(Courses obj) throws NullPointerException;
     
     /**
     * This method removes courses by admin
     * @param obj Courses Class object
     * @return true if removed
     * throws Error,NullPointerException
     */
     public boolean removeCourses(Courses obj) throws Error,NullPointerException;
     
    /**
     * This method adds teachers by admin
     * @param obj Users Class object
     * @return true if added to user's arraylist and teacher's araylist
 
     */
     public boolean addTeacher(Users obj) throws ClassCastException,NullPointerException;
     
     /**
     * This method removes teacher by Admin
     * @param obj Users Class object
     * @return true if removed from user's arraylist and teacher's araylist
     * throws ClassCastException,Error,NullPointerException
     */
     public boolean removeTeacher(Users obj) throws ClassCastException,Error,NullPointerException;
    
}
