public class reverseNumberPattern {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}System.out.println();
		}
		
		
	}
	
}
