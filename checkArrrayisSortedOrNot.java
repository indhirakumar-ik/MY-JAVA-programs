public class checkArrrayisSortedOrNot {

    public static boolean check(int[] arr,int pointer){
        if(pointer==arr.length-1){
            return true;
        }
        if(arr[pointer]>arr[pointer+1]){
            return false;
        }
        return check(arr,pointer+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,8};
        System.out.println(check(arr,0));
    }
}
