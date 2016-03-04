/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw1;

/**
 * This Class MainTest Class
 * @version 1
 * @author ercan
 */
public class mainClass {
    
    /**
     * Main Class Static Tester main method
     * @param args commandline strings 
     */
    public static void main(String[] args)
    {
        /**
         * Senario 1
         */
        System.out.println("************* Senario 1 ***********************************");
        System.out.println("\n    Create Admin and view");
        Administor admin = new Administor(0, "Ercan", "UCA");
        System.out.print(admin.toString());
        System.out.println("\n     Create user1 and user2");
        Users user1 = new Users(1, "Ahmet", "Can");
        Users user2 = new Users(2, "Salih", "Oba");
       
        System.out.println("     Admin add user1 and user2"); 
        try{
            admin.addUser(user1);
        }catch(NullPointerException e){
            e.printStackTrace(System.err);
        }
         try{
           admin.addUser(user2);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
        System.out.println("     Admin view user1, user2 and yourself");
        admin.viewUser();
        System.out.println("\n************* Senario 1 END ***********************************\n");
        
        /**
         * Senario 2
         */
        System.out.println("************* Senario 2 ***********************************");
        System.out.println("\n    Create teacher1 and teacher2");
        Teachers teacher1 =new Teachers(1, "Yusuf Sinan", "Akgul");
        Teachers teacher2 = new Teachers(1, "Fatih Erdogan", "Sevilgen");
        
        System.out.println("    Admin add teacher1 and teacher2");
        try{
           admin.addTeacher(teacher1);
        }catch(NullPointerException | ClassCastException e){
           e.printStackTrace(System.err);
        }
        
        try{
           admin.addTeacher(teacher2);
        }catch(NullPointerException | ClassCastException e){
           e.printStackTrace(System.err);
        }
        
        
        System.out.println("    View Teachers");
        admin.viewTeacher();
        
        System.out.println("\n    View All Users");
        admin.viewUser();
        
        System.out.println("\n    Remove User1 and view");
        try{
           admin.removeUser(user1);
        }catch(NullPointerException | ClassCastException | Error e){
           e.printStackTrace(System.err);
        }
        
        admin.viewUser();
        
        System.out.println("\n    Create tutor1");
        Tutors tutor1 = new Tutors(2, "Necmettin", "Carkaci");
        
        System.out.println("    teacher2 add tutor1 and user1");
        
        try{
           teacher2.addTutor(tutor1);
        }catch(NullPointerException | ClassCastException  e){
           e.printStackTrace(System.err);
        }          
                 
       try{
            teacher2.addUser(user1);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
       
        
       
        
        System.out.println("    Teacher2 view users added by him");
        teacher2.viewUser();
        System.out.println("************* Senario 2 END*****************************");
        
        /**
         * Senario 3
         */
        System.out.println("\n************* Senario 3 ******************************");
        
        System.out.println("     Create course1 and course2 add its"); 
        Courses course1 = new Courses(10, "Object Oriented ");
        Courses course2 = new Courses(11, "System Programming ");
        try{
           admin.addCourse(course1);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
        try{
           admin.addCourse(course2);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }

        
        System.out.println("     Create assignment1(type pdf) and assignment2(type lecture)");
        Assignable assignment1 = new Assignable("HW01", ".pdf", "20/02/2016", "25/02/2016",0);
        Assignment assignment2 = new Assignment("Lectures11", ".docx");
        Assignment assignment3 = new Assignment("Book.pdf", ".pdf");
         
        System.out.println("     Teacher1 add assignment1 and assignment2 to course1 and assigmnet2 add to course2"); 
        try{
            teacher1.addAssignmetToCourse(course1, assignment1);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
        try{
           teacher1.addAssignmetToCourse(course1, assignment2);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
        try{
           teacher1.addAssignmetToCourse(course2, assignment3);
        }catch(NullPointerException e){
           e.printStackTrace(System.err);
        }
        
        System.out.println("     View course by teacher1"); 
        teacher1.viewCourse();
        
        System.out.println("     View course1 assignments");
        course1.viewAssignment();
        System.out.println("\n************* Senario 3 END***************************");
        
        /**
         * Senario 4
         */
        System.out.println("\n************* Senario 4 ******************************");
        
        System.out.println("\n    Create student1 and student2");
        Students student1 =  new Students(3, "Kenan", "Karaca");
        Students student2 =  new Students(3, "Elif",  "Tutucu");
        
        System.out.println("    Admin add student1, teacher1 add student2");
        
        try{
            admin.addStudent(student1);
        }catch(NullPointerException | ClassCastException e){
           e.printStackTrace(System.err);
        }
       
        try{
            teacher1.addStudent(student2);
        }catch(NullPointerException | ClassCastException e){
           e.printStackTrace(System.err);
        }

        System.out.println("    View students by teacher1 and admin");
        teacher1.viewStudent(admin);
        teacher1.viewStudent();
        System.out.println("\n    Create register for students");
        Register register = new Register("ercan", "123", 3, "Ercan", "UCA");
        Register register2 = new Register("ercan", "123", 3, "Ercan", "UCA");
        
        System.out.println("    Student1 enter system and view lessons");
        student1.registerSystem(admin, register);
        
        try{
            if(register.logIn(register2))
               System.out.println("\n    System log in");
        }catch(SecurityException e){
            e.printStackTrace(System.err);
        }
       
        
        System.out.println("    Student1 upload document of assignment1");
        System.out.print(student1.UploadDocument(assignment1).toString());
        
        System.out.print("\n    Grading by teacher1 is that uplaod by student1");
        int grade = 90;
        teacher1.gradeOfDocumentOfCurrentStudent(assignment1, grade);
        System.out.println("\n    Show Courses after grading");
        teacher1.viewCourse(admin);
        
        
        System.out.println("\n************* Senario 4 END***************************");
        
        
        Teachers t =  new Teachers(2, "t", "tt");
        t.viewCourse(admin);
        System.out.println("\n    Exception Test");
        Students s = null;
        try{
            System.out.println(t.addStudent(s));
        }catch(NullPointerException e){
            e.printStackTrace(System.err);
        }
        

    }
}
