/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import java.util.ArrayList;

/**
 * MySystem Class like moodle and is an abstract class, extends Users Class and implements Process interface
 * Save all arraylists of users, students, teachers, tutors, courses etc.
 * @version 1
 * @author ercan
 */
public abstract class MySystem extends Users
                                  implements Process{
   /**
    * Admin and teachers can change
    */
   protected ArrayList<Users> users = new ArrayList();  
   /**
    * Only admin can chance
    */
   protected ArrayList<Teachers> teachers = new ArrayList();
   /**
    * Admin and teachers can chance
    */
   protected ArrayList<Tutors> tutors = new ArrayList();  
   /**
    * Admin and teachers can chance
    */
   protected ArrayList<Students> students = new ArrayList(); 
   /**
    * Admin and teachers can chance
    */
   protected ArrayList<Courses> courses = new ArrayList();  
   /**
    * Admin and teachers can chance
    */
   protected ArrayList<Courses> oldcourses = new ArrayList(); 

   
   /**
    * Default constructor
    */
    public MySystem() {
        super();
    }
    /**
    * Abstract class Constructor
    * @param id is user identify
    * @param name is user name
    * @param surname is user surname
    */
   
    public MySystem(int id, String name, String surname) {
        super(id, name, surname);
    }
    /**
    * This method take users ArrayList
    * @return users type of ArrayList
    */
    public ArrayList getUsers() {
        return users;
    }
    /**
    * This method take teachers ArrayList
    * @return teachers type of ArrayList
    */
    public ArrayList getTeachers() {
        return teachers;
    }
 
    /**
    * This method take tutors ArrayList
    * @return tutors type of ArrayList
    */
    public ArrayList getTutors() {
        return tutors;
    }
     /**
     * This method take students ArrayList
     * @return students type of ArrayList
     */
    public ArrayList getStudents() {
        return students;
    }
     /**
     * This method take courses ArrayList
     * @return courses type of ArrayList
     */
    public ArrayList<Courses> getCourses() {
        return courses;
    }
    
     /**
     * This method take oldcourses ArrayList
     * @return oldcourses type of ArrayList
     */
    public ArrayList<Courses> getOldcourses() {
        return oldcourses;
    }
    /**
     * This method adds users by admin
     * @param obj Users Class object
     * @return true if added
     * throws NullPointerException
     */
    @Override
    public boolean addUser(Users obj) throws NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        return users.add(obj);     
    }
    
    /**
     * This method removes users by Admin
     * @param obj Users Class object
     * @return true if removed
     * throws Error,NullPointerException
     */
    @Override
    public boolean removeUser(Users obj) throws Error,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        else if(users.isEmpty())
            throw new Error();
        else
           return users.remove(obj);
    }
    
    /**
     * This method adds tutors by admin
     * @param obj Users Class object
     * @return true if added to user's arraylist and tutor's araylist
     * throws NullPointerException,ClassCastException
     */
    @Override
    public boolean addTutor(Users obj) throws ClassCastException,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        else if(!(obj instanceof  Tutors) )
            throw new ClassCastException();
        else
            return users.add(obj) && tutors.add((Tutors) obj);
           
    }
    
   /**
     * This method removes tutors by Admin
     * @param obj Users Class object
     * @return true if removed from user's arraylist and tutor's araylist
     * throws NullPointerException,ClassCastException,Error
     */
    @Override
    public boolean removeTutor(Users obj) throws ClassCastException,Error,NullPointerException{
        if(obj==null)
            throw new NullPointerException();
        else if(!(obj instanceof  Tutors) )
            throw new ClassCastException();
        else if(users.isEmpty() || tutors.isEmpty())
            throw new Error();
        else
            return users.remove(obj) && tutors.remove((Tutors)obj);
    }
    
    /**
     * This method adds students by admin or teachers
     * @param obj Users Class object
     * @return true if added to user's arraylist and student's araylist
     * throws NullPointerException,ClassCastException
     */
    @Override
    public boolean addStudent(Users obj) throws NullPointerException,ClassCastException{
        if(obj==null)
            throw new NullPointerException();
        else if(!(obj instanceof Students) )
           throw new ClassCastException();
        else
            return users.add(obj) && students.add((Students)obj);
    }
    
     /**
     * This method removes students by Admin
     * @param obj Users Class object
     * @return true if removed from user's arraylist and student's araylist
     * throws NullPointerException,ClassCastException,Error
     */
    @Override
    public boolean removeStudent(Users obj) throws NullPointerException,ClassCastException,Error {
        if(obj==null)
            throw new NullPointerException();
        else if(!(obj instanceof Students) )
            throw new ClassCastException();
        else if(users.isEmpty() || students.isEmpty())
            throw new Error();
        else
            return users.remove(obj) && students.remove((Students)obj);
    }
    /**
     * view all added users
     */
    @Override
    public void viewUser() {
        System.out.print(toString());
        for(int i=0; i<users.size(); ++i)
           System.out.print(users.get(i).toString());
    }
    
    /**
     * view all added teachers
     */
    @Override
    public void viewTeacher() {
        for(int i=0; i<teachers.size(); ++i)
           System.out.print(teachers.get(i).toString());
    }
    
    /**
     * view all added tutors
     */
    @Override
    public void viewTutor() {
        for(int i=0; i<tutors.size(); ++i)
           System.out.print(tutors.get(i).toString());
    }
    
    /**
     * view all added students
     */
    @Override
    public void viewStudent(){
        for(int i=0; i<students.size(); ++i)
            System.out.print(students.get(i).toString());
    }
    
    /**
     * view all added courses by admin
     */
    @Override
    public void viewCourse() {
         for(int i=0; i<courses.size(); ++i)
           System.out.print(courses.get(i).toString());
    }
   
}
