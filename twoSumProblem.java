public class twoSumProblem {

	public static void main(String[] args) {
		int a=5;
		int b[]= {1,2,3,4,5};
		for(int i=0;i<b.length-1;i++) {
			for( int j=i+1;j<b.length;j++) {
				if(b[i]+b[j]==a) {
					System.out.println("indexes ["+i+","+j+"]");
				}
			}
		}

	}}
