
package javaapplication18;
import java.util.ArrayList;


import java.util.Scanner;


public class JavaApplication18 {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> stuID=new ArrayList<>();
        ArrayList<String> stuName=new ArrayList<>();
        ArrayList<Integer> stuAge=new ArrayList<>();
        ArrayList<String> stuEmail=new ArrayList<>();
        ArrayList<String> stuCourse=new ArrayList<>();
      
        int id = 0, age = 0,searchID = 0,deleteID = 0;
        String name = "", email = "",course = "";
        Student student = new Student();
        System.out.println("STUDENT MANAGENT APPLICATION");
        System.out.println("*****************************************************************");

        System.out.println("Enter (1) to launch menu or any other key to exit");
        Scanner scanner=new Scanner(System.in);
        int value = scanner.nextInt();
      
        int action = 0;
        while(value == 1){
            
            System.out.println("Please select one of the following items");
            System.out.println("(1) Capture a new student");
            System.out.println("(2) Search new student");
            System.out.println("(3) Delete a student");
            System.out.println("(4) Print student report");
            System.out.println("(5) Exit Application");
            action = scanner.nextInt();
            
            switch(action){
                case 1:
                    
                    student.SaveStudent();        
                    break;
                    
                case 2:
                    
                    student.SearchStudent();
                    break;
                    
                case 3:
                    
                    System.out.println(student.DeleteStudent());
                    break;
                    
                case 4:
                    
                    student.StudentReport();
                    break;
                    
                case 5:
                    
                    student.ExitSudentApplication();                    
                    break;
                    
                default:
                    System.err.println("You have entered an invalid value");
            }
            
            System.out.println("Enter (1) to launch menu or any other key to exit");
            value = scanner.nextInt();
        }
                
        
     //stuID.add(stu.getStudentID());
     //System.err.println(stuID.get(0));
     /*stuName.add("J.Blogs");
    stuAge.add(19);
    stuEmail.add("jbloggs@ymail.com");
    stuCourse.add("disd");
    
    
   System.out.println(stID);
   System.out.println(name);
   System.out.println(age);
   System.out.println(email);
   System.out.println(course);
   
   
   for(int i=0; i>=16; i++)
   {
    System.out.println(i);
   }*/
   
   
   
   
     
      
   
  
      
      
             
        
    }
    
}
