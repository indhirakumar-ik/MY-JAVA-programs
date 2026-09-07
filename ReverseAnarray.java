public class ReverseAnarray {
   public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int rev[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            rev[arr.length-i-1]=arr[i];
        }

        for(int i:rev){
            System.out.print(i+" ");
        }

        rec(arr, arr.length-1);
   }

   static int rec(int arr[],int n){
    int temp[]=new int[arr.length];
    if(n==0){
        return n;
    }
    temp[arr.length-n-1]=arr[n];
    rec(arr, n-1);
    
   }
}
