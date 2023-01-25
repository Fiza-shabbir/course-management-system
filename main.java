package scdproject;
import java.util.Scanner;
import java.util.*;

public class main {
public static void main(String []args) {
	student obj1=new student();
	admin obj2 = new admin();
	registercourse obj3 = new registercourse();
	course obj4 = new course();
	attendence obj5= new attendence();
	grade obj6 = new grade();
	choice obj7=new choice();
	defaultclass obj8=new defaultclass();
	defaultlogin obj9=new defaultlogin();
	Scanner input = new Scanner(System.in);
	System.out.println("************");
    System.out.println("WELCOME TO COURSE MANAGEMENT SYSTEM OF SSUET");
    System.out.println("************");
System.out.println("COURSE MANAGEMENT SYSTEM");
System.out.println("ENTER YOUR CHOICE");
System.out.println("1.STUDENT \n2.ADMIN");
try {
int choice = input.nextInt();
if(choice==1) {
	System.out.println("**************************************");
    System.out.println("         Student Menu                ");
    System.out.println("**************************************");
    System.out.println("Are you enrolled?");
      System.out.println("");
      System.out.println("--------------------------------------");
      System.out.println("1. Yes");
      System.out.println("2. No");
      System.out.println("3.Exit ");
      
          int selectedOption = input.nextInt();
          switch (selectedOption){
              case 1:
                  System.out.println("\n");
                  obj9.defloginst();
                
                  
                  
                  break;

              case 2:
                  System.out.println("\n");
                  obj1.registration(null, null);
                  System.out.println("---------------------------------------");
                  
                  break;

              case 3:
                  System.out.println("Exiting the application...");
                  System.exit(0);

              default:
                  System.out.println("Error! Please input only the number options available above!!!");}}
	


	
else if(choice==2) {
	 System.out.println("*************************************");
     System.out.println("          Instructor Menu           ");
     System.out.println("*************************************");
     int selectedOption = 0;
     System.out.println();
     System.out.println("Are you registered?");
     System.out.println("");
     System.out.println("--------------------------------------");
     System.out.println("1.ADMIN PORTAL");
     
     System.out.println("2.Exit ");
     
         selectedOption = input.nextInt();
         switch (selectedOption){
             case 1:
                 System.out.println("\n");
                 obj9.defloginad();
           
             case 2:
                 System.out.println("Exiting the application...");
                 System.exit(0);

             default:
                 System.out.println("Error! Please input only the number options available above!!!");
	
                 


}}}
catch(InputMismatchException e) {
   
    System.out.println("Please input only the number options available above!!!");
    System.out.println();
    System.out.println();
    System.out.println();
    



	
}}}
	
	

