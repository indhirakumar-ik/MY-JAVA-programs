public class removeDuplicatefromArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,1,6,5,4,3};		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
		}for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=-1) {
				System.out.print(arr[i]+" ");
			}
		}

	}
}