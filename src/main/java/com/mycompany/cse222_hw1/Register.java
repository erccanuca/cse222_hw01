/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

import java.util.Objects;

/**
 * Register Class extends User Class, 
 * Include information about register to system
 * @version 1
 * @author ercan
 */
public class Register extends Users{
    
    /**
     *  to enter system user's identify
     */
    private String username;
    /**
     *  to enter system user's special letters
     */
    private String password;
    
    /**
     * Register Class Constructor
     * @param username identfy
     * @param password verify
     * @param id  identfy
     * @param name name of user
     * @param surname surname of user
     */
    public Register(String username, String password, int id, String name, String surname) {
        super(id, name, surname);
        this.username = username;
        this.password = password;
    }
    /**
     * Getter method
     * @return username
     */
    public String getUsername() {
        return username;
    }
    /**
     * Setter method
     * @param username is new username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Getter method
     * @return password
     */
    public String getPassword() {
        return password;
    }
   /**
    * Setter Method
    * @param password is new password
    */
    public void setPassword(String password) {
        this.password = password;
    }
     /**
      * Log in for students
      * @param obj Register Class object
      * @return true if right username and password, otherwise throw exception
      * throws SecurityException
      */
    public boolean logIn(Register obj) throws SecurityException{  
        if( equals(obj) && equals(obj))
            return true;
        else 
            throw new SecurityException("Security Error!!!");
    }
    /**
     * for Students logout
     * @param obj Register Class object
     * @return true if username and password are right
     * throws SecurityException
     */
    public boolean logOut(Register obj)throws SecurityException{  
        if( equals(obj) && equals(obj))
            return true;
        else 
            throw new SecurityException("Security Error!!!"); 
    }

    /**
     * This method is override method, using for login and logout methods
     * @param obj Object Class object
     * @return true if equals username and password, otherelse false;
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Register other = (Register) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
    /**
     * This method is override method
     * @return hashCode type of integer
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.username);
        hash = 83 * hash + Objects.hashCode(this.password);
        return hash;
    }
  
    
}
