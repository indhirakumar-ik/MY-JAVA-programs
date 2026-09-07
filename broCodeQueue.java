package indhirakumar;
public class broCodeQueue {

	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==2||j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}}
			
			for(int j=1;j<=2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i==1||i==(n+1)/2||i==n||j==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
