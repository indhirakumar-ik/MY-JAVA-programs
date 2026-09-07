package indhirakumar;

import java.util.Scanner;

public class HackerRank2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                else if(x>=-32768&&x<=32767){
                    System.out.println(x+" can be fitted in:\n* short\n* int\n* long");
                }else if(x>=-2147483648&&x<=2147483647){
                    System.out.println(x+" can be fitted in:\n* int\n* long");
                }else if(x>=-9223372036854775808L&&x<=9223372036854775807L){
                    System.out.println(x+" can be fitted in:\n* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

	}
	}
}
