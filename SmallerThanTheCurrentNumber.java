public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]&&i!=j){
                    count++;
                    System.out.println("count no"+i+" "+j+" " +count);
                }
            }
            arr[i]=count;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }   
}
