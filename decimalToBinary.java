public class decimalToBinary {

    public static String decimal(int n,String out){
        if(n==0){
            return "";
        }
        return decimal(n/2,out)+out+(n%2);
    }
    public static void main(String[] args) {
        int n=10;
        String out="";
        while(n>0){
            int rem=n%2;
            out=rem+out;
            n=n/2;
        }
        System.out.println(out);
        System.out.println(decimal(10,""));
    }
}
