package scdproject;
import java.util.LinkedList;
import java.util.Queue;
public class registercourse {
	
Queue<String> queue=new LinkedList<String>();
public void registercourses(String c) {
	
		queue.add(c);
	
	

}
public void removecourse(String c) {
	queue.remove(c);
}
public void getcourse()
{
	System.out.println(queue);
}
}
