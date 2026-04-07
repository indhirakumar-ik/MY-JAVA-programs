public class outerDiamondPattern {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}for(int k=1;k<=i*2-2;k++) {
				System.out.print(" ");
			}for(int j=1;j<=n+1-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=(n*2)-2*i;k++) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
