public class findMissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,7,8};
		int n=10;
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
		}
		
	}
}