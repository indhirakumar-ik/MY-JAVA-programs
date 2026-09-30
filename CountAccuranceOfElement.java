public class CountAccuranceOfElement {

    public static int count(int[] arr,int index,int n,int target){
        if(index==arr.length){
            return n;
        }
        if(arr[index]==target){
            n++;
        }
        return count(arr,index+1,n,target);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,2,2,9,0,2};
        System.out.println(count(arr,0,0,2));
    }
}
