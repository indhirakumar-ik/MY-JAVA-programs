package indhirakumar;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class fileWriter {
	public static void main(String[] args) {
		try {
			FileWriter f1=new FileWriter("output.txt");
			BufferedWriter b1=new BufferedWriter(f1);
			b1.write("heyy");
			b1.newLine();
			b1.write("iam ik");
			b1.newLine();
			b1.write("coming from nilgiri");
			b1.close();
			System.out.println("success");
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			FileReader fr=new FileReader("output.txt");
			BufferedReader br=new BufferedReader(fr);
			String name=br.readLine();
			while(name!=null) {
				System.out.println(name);
				name=br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
