/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Student {
    
    ArrayList<Integer> stuID=new ArrayList<>();
    ArrayList<String> stuName=new ArrayList<>();
    ArrayList<Integer> stuAge=new ArrayList<>();
    ArrayList<String> stuEmail=new ArrayList<>();
    ArrayList<String> stuCourse=new ArrayList<>();
      
    int id = 0, age = 0,searchID = 0,deleteID = 0;
    String name = "", email = "",course = "";

    Scanner scanner=new Scanner(System.in);

    public void SaveStudent(){
        System.out.println("Capture new student");                   
        System.out.println("**************************");                    
        System.out.print("Enter  the student ID: ");
        id = scanner.nextInt();
        stuID.add(id);
                    
        System.out.print("Enter student name: ");
        name = scanner.next();
        stuName.add(name);
                    
        System.out.print("Enter student age: ");
        age = scanner.nextInt();
        try 
        {
            //  Block of code to try
            if(age > 15 && Character.isDigit(age)== true){
               stuAge.add(age);
            }

        }
        catch(Exception e) {
            //  Block of code to handle errors

            while(age < 16 && Character.isDigit(age)== false){
                
                System.out.print("Please re-enter the student age>> ");
                age = scanner.nextInt();
                stuAge.add(age);  
                
            }
            
            
        }
                     
        stuAge.add(age);
        System.out.print("Enter student email: ");
        email = scanner.next();
        /*while(email.endsWith("@gmail.com") == false)//email.substring(email.indexOf('@'), email.length()) != "@gmail.com"){
            System.out.print("Enter student email: ");
            email = scanner.next();
                    
        }*/
         
        stuEmail.add(email);             
        System.out.print("Enter student course: ");
        course = scanner.next();
        stuCourse.add(course);
        
        System.err.println("Student details saved successfully");
        
    }
    
    public void SearchStudent(){
        
        //Enter student id of student to search 
        System.out.print("Enter  the student ID to search: ");
        searchID = scanner.nextInt();
        
        //Search for student
        for(int i=0;i<stuID.size();i++){
            if(stuID.get(i).equals(searchID))
            {
                
                System.out.println("Student ID: "+stuID.get(i));
                System.out.println("Student Name: "+stuName.get(i));
                System.out.println("Student Age: "+stuAge.get(i));
                System.out.println("Student Email: "+stuEmail.get(i));
                System.out.println("Student Course: "+stuCourse.get(i));
                    
            }
            else
            {
                        
                System.err.println("Student with student Id: "+searchID+" was not found");
                    
            }
        }
        
    }
    
    public String DeleteStudent(){
    
        //Enter student id of student to delete
        System.out.print("Enter  the student ID to delete: ");
        deleteID = scanner.nextInt();
        for(int i=0;i<stuID.size();i++){
            if(stuID.get(i).equals(deleteID))
            {
                char bool;
                //Enterto delete
                System.err.println("Are you sure you want to delet student "+deleteID+" from the system? Yes(Y) to delete");
                bool = scanner.next().charAt(0);
            
                
                if(bool == 'Y' || bool == 'y'){
                
                    //remove the found student
                    stuID.remove(i);
                    stuName.remove(i);
                    stuAge.remove(i);
                    stuEmail.remove(i);
                    stuCourse.remove(i);
                    //System.err.println("Student with student Id: "+deleteID+" was deleted");
                    return "Student with student Id: "+deleteID+" was deleted";
            
                }
                else
                {
                
                    return "Student with student Id: "+deleteID+" not deleted";
                
                }
                        
            }
            
        }
        return "Student with student Id: "+deleteID+" was not found";
        
    }
    
    public void StudentReport(){
        for(int i=0;i<stuID.size();i++){
           int no = i+1;
            System.err.println("Student "+no);
                        
            System.out.println("Student ID: "+stuID.get(i));
            System.out.println("Student Name: "+stuName.get(i));
            System.out.println("Student Age: "+stuAge.get(i));
            System.out.println("Student Email: "+stuEmail.get(i));
            System.out.println("Student Course: "+stuCourse.get(i));
        
        }
    }
    
    public void ExitSudentApplication(){
        
        System.exit(0);
        
    }
}
