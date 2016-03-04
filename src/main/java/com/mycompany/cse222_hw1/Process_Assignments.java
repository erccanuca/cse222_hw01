/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;


/**
 * Process_Assignments interface does about assignments
 * @version 1
 * @author ercan
 */
public interface Process_Assignments {
    
   /**
     * Adds to course new assignment
     * @param obj Assignment Class object
     * @return true if added
     * throws NullPointerException
    */
    public boolean addAssignment(Assignment obj) throws NullPointerException;
     /**
     * Removes from course exist assignment
     * @param obj Assignment Class object
     * @return true if deleted
     * throws NullPointerException,Error
     */
    public boolean removeAssignment(Assignment obj)throws NullPointerException,Error;
    
    /**
     * view all added assignments
     */
    public void viewAssignment();
}
