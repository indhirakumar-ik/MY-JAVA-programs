public class MajorityElements {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,3,2};
        int majority=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    majority++;
                }
            }
            if(majority>count){
                count=nums[i];
            }
            majority=0;

        }
        System.out.println(count);
    }
}
