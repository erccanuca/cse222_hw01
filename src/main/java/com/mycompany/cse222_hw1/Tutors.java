/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;



/**
 * Tutors class extends Students Class
 * @version 1
 * @author ercan
 */
public class Tutors extends  Students{

    
   /**
     * Tutors Class constructor
     * @param id identfy
     * @param name name of tutor
     * @param surname surname of tutor
     */
    public Tutors(int id, String name, String surname) {
        super(id, name, surname);
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
    * This method show us about tutors Class.
    * @return string is that information about current tutor.
    */
    @Override
    public String toString() {
       return "id:" + getID()+ " name:" + getName() + " surname:" + getSurname() + "\n";
    }

   
    
    
 
   
}
