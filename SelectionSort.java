import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,7,8,5};
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min_index=j;
                    
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}