public class IK_Pattern{

	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==(n+1)/2){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}}
				for(int j=1;j<=1;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=n;k++) {
					if(k==1) {
						System.out.print("*");
					}
				}for(int k=1;k<=(n+1)/2-i;k++) {
					System.out.print("  ");
				}
				for(int k=1;k<n+i-16;k++) {
					System.out.print("  ");
				}
				for(int j=1;j<=1;j++) {
					System.out.print(" *");
				}
				
				
				for(int k=1;k<=n;k++) {
						System.out.print(" ");
				}
				for(int k=1;k<=n;k++) {
					System.out.print(" -".repeat(3));
				}
			System.out.println();}
		}
	}
