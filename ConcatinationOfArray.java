public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=ans[i];
        }

        for(int k:ans){
            System.out.println(k);
        }
    }
}
