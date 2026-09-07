import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={2,3,5,1};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0&&temp<arr[j];j--){
                    arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
