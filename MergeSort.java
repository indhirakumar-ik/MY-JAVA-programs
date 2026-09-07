import java.util.Arrays;
public class MergeSort {
    public static int[] Msor(int[] arr,int[] brr){
        int al=arr.length;
        int bl=brr.length;
        int cl=al+bl;
        int [] crr=new int[cl];
        int i=0,j=0,k=0;
        while(i<al&&j<bl){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            }else{
                crr[k]=brr[j];
                j++;
                k++;
            }
        }
        while(i<al){
            crr[k]=arr[i];
            i++;
            k++;
        }
        while(j<bl){
            crr[k]=brr[j];
            j++;
            k++;
        }

        return crr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,9};
        int[] brr={4,5,8,10};
        System.out.println(Arrays.toString(Msor(arr, brr)));
    }
}
