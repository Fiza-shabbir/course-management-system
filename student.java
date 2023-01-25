package scdproject;
import java.util.Scanner;

public class student {
	choice obj = new choice();
	Scanner input = new Scanner(System.in);
	  
	void registration(String name,String password){
		System.out.println("REGISTRATION ");
System.out.println("register your account");

 System.out.println("ENTER USERNAME");
  name = input.nextLine();
 System.out.println("ENTER PASSWORD");
  password = input.nextLine();
 System.out.println("CONFIRM PASSWORD");
  password = input.nextLine();
  System.out.println("NOW LOGIN !");
  System.out.println("LOGIN WITH YOUR CREDENTIALS");

	System.out.println("ENTER USERNAME");
	  String na = input.nextLine();
	  System.out.println("ENTER PASSWORD");
	 String pw = input.nextLine();

	 if(na.equals(name) & pw.equals(password)) {
        System.out.println("YOU ARE LOGIN");
       obj.choicestudent();
	 }
	 else{
		 System.out.println("WRONG PASSWORD");
		 System.exit(0);
	
	 
	 }}
	}
	
	
	 

		 




    
   
    
		
		

