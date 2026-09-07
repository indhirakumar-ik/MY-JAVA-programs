package indhirakumar;
import java.util.LinkedList;
public class broCodeLinkedList {

	public static void main(String[] args) {
		LinkedList<String> name =new LinkedList<String>();
		/*name.push("ik");
		name.push("suhail");
		name.push("derin");
		name.push("dani");
		System.out.println(name);
		name.pop();
		System.out.println(name);*/
		name.offer("undertaker");
		name.offer("RomenReins");
		name.offer("HHH");
		name.offer("johnsena");
		System.out.println(name);
		name.poll();
		System.out.println(name);
		name.add(1,"anil");
		System.out.println(name);
		System.out.println(name.indexOf("HHH"));
		System.out.println(name.peek());
		System.out.println(name.peekLast());
	}

}
