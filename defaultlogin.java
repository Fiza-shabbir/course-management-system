package scdproject;
import java.util.*;
public class defaultlogin {
	Scanner input=new Scanner(System.in);
choice obj=new choice();
student st=new student();
admin ad=new admin();
	public void defloginst() {
		System.out.println("****************************");
		System.out.println("LOGIN");
		System.out.println("enter username");
		String name=input.nextLine();
		System.out.println("enter password");
		String password=input.nextLine();
		String[] username=new String[] {"fiza", "moohib", "mahum","gul"};
		String[] pass=new String[] {"fiza", "moohib", "mahum","gul"};
		if(Arrays.asList(username).contains(name) && Arrays.asList(pass).contains(password)) {
	        System.out.println("YOU ARE LOGIN");
	   	     obj.choicestudent();
	}
		
		else {
			System.out.println("****************************");
			System.out.println("WRONG USERNAME OR PASSWORD");
			st.registration(null, null);
		}
		
}
	public void defloginad() {
		System.out.println("****************************");
		System.out.println("LOGIN");
		System.out.println("enter username");
		String name=input.nextLine();
		System.out.println("enter password");
		String password=input.nextLine();
		String[] username=new String[] {"fiza", "moohib", "mahum","gul"};
		String[] pass=new String[] {"fiza", "moohib", "mahum","gul"};
		if(Arrays.asList(username).contains(name) && Arrays.asList(pass).contains(password)) {
	        System.out.println("YOU ARE LOGIN");
	   	     obj.choiceadmin();
	}
		
		else {
			System.out.println("****************************");
			System.out.println("WRONG USERNAME OR PASSWORD");
			System.out.println("REGISTER YOURSELF FIRST");

			ad.registration(null, null);
		}
		
}}
