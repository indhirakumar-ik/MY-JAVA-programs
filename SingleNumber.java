public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        boolean b=true;
        int j=0;
        for(int i=0;i<arr.length;i++){
            b=true;
            for( j=0;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                    b=false;
                    break;
                }
            }
            if(b==true){
                System.out.println(arr[i]);
            }
        }
    }
}
