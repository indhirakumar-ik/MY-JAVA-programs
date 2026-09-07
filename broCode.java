package indhirakumar;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class broCode {

	public static void main(String[] args) {
		Stack<String> name=new Stack<String>();
		name.push("Indhirakumar");
		name.push("Suhail");
		name.push("Derin");
		name.push("Pranesh");
		name.push("Derin");
		System.out.println(name.peek());
		System.out.println(name);
		System.out.println(name.search("Pranesh"));
		Queue<String> games=new LinkedList<String>();
		games.offer("Freefire");
		games.offer("Clash of clans");
		System.out.println(games);
	}

}
