package indhirakumar;
public class missingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,7,8};
		int count=0;
		int n=9;
		boolean bool=true;
		for(int i=1;i<n;i++) {
			bool=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]==i) {
					bool=true;
					break;
				}
			}if(bool==false) {
				System.out.println(i);
			}
		}System.out.println(Math.pow(4, 3));
		
	}
}















