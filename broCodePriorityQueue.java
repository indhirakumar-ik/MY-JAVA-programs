package indhirakumar;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
public class broCodePriorityQueue {

	public static void main(String[] args) {
		Queue<String> a=new PriorityQueue<>();
		a.offer("Banu");
		a.offer("Amala");
		a.offer("Ajay");
		a.offer("Ganga");
		a.offer("Ajaak");
		while(!a.isEmpty()) {
			System.out.println(a.poll());
		}
	}

}
