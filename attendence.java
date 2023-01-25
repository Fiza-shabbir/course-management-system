package scdproject;

import java.util.*;
public class attendence {
	Scanner input=new Scanner(System.in);
	ArrayList<String> att = new ArrayList<String>();

	public void setattendence(String add)
	{
		att.add(add);
	}
	public void getattendence()
	{
		System.out.println("DSA :"+att.get(1) +"\nCCN :"+att.get(2)+"\nSDA :"+att.get(3)+"\nS&CD :"+att.get(4));

	}

	



}
