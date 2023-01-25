package scdproject;

import java.util.*;
import java.util.Arrays;

public class course <T>{
	
	
	
List <String>course=new ArrayList<>();
public  void getcourseadmin() {
	course.add("DSA");
	course.add("Math");
	course.add("AI");
	course.add("Phy");
	course.add("CCN");
	course.add("English");
	System.out.println(course);
}
public void setcourseadmin(String c) {
	
	course.add(c);



}
public void deletecourse(int a) {
	course.remove(a);

}
public void getcourse() {
	System.out.println(course);
}
}

