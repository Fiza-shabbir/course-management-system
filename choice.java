package scdproject;
import java.util.Scanner;
public class choice {
	
	
	registercourse obj3 = new registercourse();
	course <String> obj4 = new course();
	attendence obj5= new attendence();
	grade obj6 = new grade();
	defaultclass obj8=new defaultclass();
	Scanner input=new Scanner(System.in);
public void choicestudent() {
	
	System.out.println("1.REGISTER COURSES \n2.CHECK ATTENDENCE \n3.CHECK GRADES \n4.EXIT");
	System.out.println("ENTER YOUR CHOICE");
	int ch=input.nextInt();
	try {
	if(ch==1) {
		obj4.getcourseadmin();
		System.out.println("ENTER COURSE OF YOUR CHOICE");
		for(int i=0;i<=4;i++) {
		String a =input.next();
		obj3.registercourses(a);}
		obj3.getcourse();
		choicestudent();}
	else if(ch==2) {
		try {
		obj8.defaultattendence();
		choicestudent();}
		catch(Exception e){
			System.out.println("ATTENDENCE IS NOT YET ADDED BY THE INSTRUCTOR ");
		}}
	else if(ch==3) {
		try {obj8.defaultmarks();
		choicestudent();
		}
		catch(Exception e) {
			System.out.println("MARKS ARE NOT YET ADDED ");
		}}
	else if(ch==4) {
		System.out.println("exit");
		System.exit(0);
			}}

     catch(Exception e) {
    	 System.out.println("invalid input please re enter");
     }}

	

public void choiceadmin() {
	   System.out.println("1.ADD COURSES \n2.ADD ATTENDENCE \n3.ADD RESULT \n4.EXIT");
	   System.out.println("enter your choice");
		int ch=input.nextInt();
		if(ch==1) {
			System.out.println("enter courses");

			for(int i=0;i<=4;i++) {
			String a =input.next();
			obj4.setcourseadmin(a);}
			obj4.getcourse();
			choiceadmin();}
		if(ch==2)
		{
			System.out.println("SET ATTENDENCE OF SUBJECTS\nDSA\nCCN\nSCD\nSC&D");
			try {
				obj5.getattendence();
				for(int i = 0;i<=4;i++)
				{
					String add = input.nextLine();
					obj5.setattendence(add);
				}
				obj5.getattendence();
				choiceadmin();
			}
			catch(Exception e){
				System.out.println("ASK THE STUDENT TO REGISTER COURSE");
			}
			

		}
		if(ch==3) {
			System.out.println("SET GRADES OF SUBJECTS\nDSA\nCCN\nSCD\nSC&D");
			try {
			for(int i = 0;i<=4;i++)
			{
				String add = input.nextLine();
				obj6.addgrade(add);
			}
			obj6.getgrade();
			choiceadmin();
		
			}
			catch(Exception e){
				choiceadmin();
			}
			
			
		
		}
		else if(ch==4) {
			System.out.println("exit");
			System.exit(0);
			}
	
}


}
