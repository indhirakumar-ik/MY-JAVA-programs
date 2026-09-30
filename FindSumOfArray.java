public class FindSumOfArray {

    public static int find(int[] arr,int n){
        if(n==arr.length){
            return 0;
        }
        return arr[n]+find(arr,n+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(find(arr,0));
    }
}
