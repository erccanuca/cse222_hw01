
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import java.util.ArrayList;


/**
 * Student Class extends Users impements StudentInterface interface
 * @version 1
 * @author ercan
 */
public class Students extends Users implements StudentInterface{
    
    /**
     * Register Class object to save register for student
     */
    private final Register register = new Register("ercan", "123", 3, "Ercan", "UCA");
    /**
     * Save upload documents.
     */
    private ArrayList documents = new ArrayList();
    
    /**
     * Student Class constructor
     * @param id identfy
     * @param name name of student
     * @param surname surname of student
     */
    public Students(int id, String name, String surname) {
        super(id, name, surname);
    }
   
    /**
     * View all courses added by admin
     * @param admin Object of Administor Class
     */
    @Override
    public void viewCourse(Administor admin) {
       admin.viewCourse();
    }
    
    /**
     * To student enter system with username and password
     * @param admin Administor Class object
     * @param obj Register Class object
     * if dont enter system catch exception
     * or login system and show courses to student
     */
    @Override
    public void registerSystem(Administor admin,Register obj){
       try{
           boolean result = register.logIn(obj);
       }catch(SecurityException e){
           e.printStackTrace(System.err);
       }
       viewCourse(admin);            
    }
    /**
     * View all added assignments
     * @param assign Assignment Class object is call other method
     */
    @Override
    public void viewAssignments(Assignment assign)
    {
       assign.viewAssignments();
    }
    /**
     * This Method for student to upload documents
     * @param assign Assignment Class object
     * @return return the changed Assignment Class object
     * throws NullPointerException
     */
    @Override
    public Assignment UploadDocument(Assignable assign)throws NullPointerException
    {
       if(assign == null)
          throw new NullPointerException();
       
       Assignment assign2 = assign;
       assign.setAssignment(assign.getAssignment()+" is upload");
       assign.setAssignmentType("File type is .pdf");
       assign.setAssignmentDeadline("File upload time is 19/02/2015");
       if(documents.add(assign))
           return assign;
       else
           return assign2;
    }
    
    


}
