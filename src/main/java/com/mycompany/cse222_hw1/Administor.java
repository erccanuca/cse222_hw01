/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;
/**
 * This Class admin extends MySystem Class and imlements AdminInterface.
 * Override method is implemented.
 * @version 1
 * @author ercan
 */
public class Administor extends MySystem implements AdminInterface

{   
    /**
     * Default Constructer
     */
    public Administor() {
        super();
    }
  /**
    * Administor class Constructor
    * @param id is user identify
    * @param name is user name
    * @param surname is user surname
    */
    public Administor(int id, String name, String surname) {
        super(id, name, surname);
    }
     /**
     * This method adds courses by admin
     * @param obj Courses Class object
     * @return true if added
     * throws NullPointerException
     */
    @Override
    public boolean addCourse(Courses obj) throws NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        return courses.add(obj) && oldcourses.add(obj);
    }
     /**
     * This method removes courses by admin
     * @param obj Courses Class object
     * @return true if removed
     * throws Error,NullPointerException
     */
    @Override
    public boolean removeCourses(Courses obj) throws Error,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        else if(oldcourses.isEmpty() || courses.isEmpty())
            throw new Error();
        else
            return courses.remove(obj) && oldcourses.add(obj);
    }
    
     /**
     * This method adds teachers by admin
     * @param obj Users Class object
     * @return true if added to user's arraylist and teacher's araylist
     * throws ClassCastException,NullPointerException
     */
    @Override
    public boolean addTeacher(Users obj) throws ClassCastException,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        else if(!(obj instanceof Teachers) )
           throw new ClassCastException();
        else
            return users.add(obj) && teachers.add((Teachers) obj);
    }
     /**
     * This method removes teacher by Admin
     * @param obj Users Class object
     * @return true if removed from user's arraylist and teacher's araylist
     * throws ClassCastException,Error,NullPointerException
     */
    @Override
    public boolean removeTeacher(Users obj) throws ClassCastException,Error,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        
        else if(!(obj instanceof Teachers) )
            throw new ClassCastException();
        
        else if(users.isEmpty() || teachers.isEmpty())
            throw new Error();
        
        else
            return users.remove(obj) && teachers.remove((Teachers) obj);
    }
   /**
    * This method show us about Administor Class.
    * @return string is that information about Admin.
    */
    @Override
    public String toString()
    {
        return "Admin_id:" + getID() + " Admin_name:" + getName() + " Admin_surname:" + getSurname() + "\n";
    }  
 
    
}
