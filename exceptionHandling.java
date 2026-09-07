package indhirakumar;

import java.util.Scanner;
import java.io.FileWriter;

class invalidAgeException extends Exception{
		invalidAgeException(String message){
			super(message);
		}
}
class agechecker{
	void age(int a){
		try {
			if(a>18 && a<50) {
				System.out.println("age is valid");
			}else {
				throw new invalidAgeException("age is invalid");
			}
		}catch(invalidAgeException e) {
			System.out.println(e);
		}
		finally {
			if(a>18 && a<50) {
				System.out.println("program ended");
			}else {
				System.out.println("error");
			}
		}
	}
}

class marks{
	void StudentsMarks(int mark) throws Exception {
		if(mark>=35 && mark<=100) {
			System.out.println("you are pass");
		}else {
			System.out.println("you are fail");
		}
	}
}
class add{
	void div() throws Exception{
		int a=10/0;
	}
}

public class exceptionHandling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age =scan.nextInt();
		agechecker a1=new agechecker();
		a1.age(age);
		int marks=scan.nextInt();
		try{marks m1=new marks();
		m1.StudentsMarks(marks);}
		catch(Exception e) {
			System.out.println(e);
		}
		add a2=new add();
		try{a2.div();}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try{
			FileWriter fw=new FileWriter("Java file.txt",true);
			fw.append("iam coming from nilgiri");
			fw.close();
			System.out.println("success");
		}catch(Exception e) {
			System.out.println("Something happend");
		}
	}
}
