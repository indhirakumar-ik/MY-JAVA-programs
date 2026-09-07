package indhirakumar;


public class patternJava {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}for(int i=5;i>0;i--) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}System.out.println();
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-i-1);j++) {
				System.out.print(j);
			}System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}for(int i=1;i<5;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
			}System.out.println();
		}
		}
	}


