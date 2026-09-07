public class BinarySearchUsingRecursion {
    public static int BinarySearch(int arr[],int target,int l,int r){
        if(r<l){
            return -1;
        }
        int mid=(l+r)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            return BinarySearch(arr, target, mid+1, r);
        }else{
           return BinarySearch(arr, target, l, mid-1);
        }
    }
        public static void main(String[] args){
            int arr[]={1,2,3,4,5,6,7,8};
            int target=10;
            int left=0;
            int right=arr.length-1;
            int value=BinarySearch(arr, target, left, right);
            if(value!=-1){
                System.out.println("Element Found");
            }else{
                System.out.println("Element not found");
            }
    }
}
