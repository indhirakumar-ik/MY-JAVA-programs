public class findhighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int[] newArr=new int[gain.length+1];
        newArr[0]=0;
        for(int i=0;i<gain.length-1;i++){
            newArr[i]=gain[i]+gain[i+1];
            gain[i]=newArr[i];
            System.out.println(newArr[i]);
        }
    }
}
