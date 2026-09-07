import java.util.Arrays;
public class MergeSort1{

    public static int[] Msort(int []arr,int f,int end,int mid){
        int brr[]=new int[end];
        int i=f,j=mid,k=f;

        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                brr[k]=arr[i];
                i++;
                k++;
            }else{
                brr[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            brr[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            brr[k]=arr[j];
            j++;
            k++;
        }

        
        for(int it:brr){
            System.out.print(it+" ");
        }
        return arr;
    }

    public static void Merge(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;

            Merge(arr, start, mid);
            Merge(arr, mid+1, end);

            Msort(arr, start, end, mid);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,8,5,6,7,8,2,8,9,34,3,2,45,100};
        int f=0,mid=arr.length/2,l=arr.length;
        Merge(arr, f, l);
    }
}