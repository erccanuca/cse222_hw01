/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * StudentInterface interface save specific methods for Student class
 * @version 1
 * @author ercan
 */
public interface StudentInterface {
    /**
     * View all courses added by admin
     * @param admin Object of Administor Class
     */
    public void viewCourse(Administor admin);
    
    /**
     * To student enter system with username and password
     * @param admin Administor Class object
     * @param obj Register Class object
     * if dont enter system catch exception
     * or login system and show courses to student
     */
    public void registerSystem(Administor admin,Register obj);
    
    /**
     * View all added assignments
     * @param assign Assignment Class object is call other method
     */
    public void viewAssignments(Assignment assign);
    
     /**
     * This Method for student to upload documents
     * @param assign Assignment Class object
     * @return return the changed Assignment Class object
     * throws NullPointerException
     */
    public Assignment UploadDocument(Assignable assign)throws NullPointerException;
}
