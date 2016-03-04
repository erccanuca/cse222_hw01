/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * Users Class save all about system person informations
 * @version 1
 * @author ercan
 */
public class Users {
    /**
     * identfy
     */
    private int id;
    /**
     * name of user
     */
    private String name;
    /**
     * surname of user
     */
    private String surname;
    
    /**
     * Default Constructor
     * assigned variables to default values.
     */
    public Users() {
        this.id = 0;
        this.name = "";
        this.surname = "";
    }
  
   /**
     * Users Class constructor
     * @param id identfy
     * @param name name of user
     * @param surname surname of user
     */
    public Users(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    
    /**
     * Getter Method
     * @return identfy of user
     */
    public int getID() {
        return this.id;
    }
    
    /**
     * Setter Method
     * @param id is new identfy of user
     */
    public void setID(int id) {
        this.id = id;
    }
    
    /**
     * Getter Method
     * @return name of user
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter Method 
     * @return surname of user
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Setter Method 
     * @param name is new name of user
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Setter Method
     * @param surname is surname of user
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }  
    /**
    * This method show us about Users Class.
    * @return string is that information about current user.
    */
    @Override
    public String toString()
    {
        return "id:" + id + " name:" + name + " surname:" + surname + "\n";
    }
}
