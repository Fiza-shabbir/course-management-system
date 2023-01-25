package scdproject;

import java.util.Scanner;

public class admin {
	choice obj=new choice();
Scanner input=new Scanner(System.in);
void registration(String name,String password){
	 System.out.println("register your account");

System.out.println("enter username");
name = input.nextLine();
System.out.println("enter password");
password = input.nextLine();
System.out.println("confirm password");
password = input.nextLine();
System.out.println("now login !");
System.out.println("login with your credentials");

System.out.println("enter username");
 String na = input.nextLine();
System.out.println("enter password");
String pw = input.nextLine();

if(na.equals(name) & pw.equals(password)) {
   System.out.println("you are login");
   obj.choiceadmin();
   

}
else{
	 System.out.println("wrong username or password");}}

}
