public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int target=6;
        int l=0;
        int r=a.length-1;
        int count=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==target){
                count++;
                break;
            }else if(a[mid]<target){
                l=mid+1;
            }else if(a[mid]>target){
                r=mid-1;
            }
        }
        if(count==1){
            System.out.println("Element is in the Array");
        }else{
            System.out.println("Element is not in the Array");
        }
    }
}
