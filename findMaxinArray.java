import java.util.Arrays;
public class findMaxinArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,10,23,34,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }System.out.println(max);

        Arrays.sort(arr);
        System.out.println("max number"+arr[arr.length-1]);
        System.out.println("min number"+arr[0]);
    }
}
