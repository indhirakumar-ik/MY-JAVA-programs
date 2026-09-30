public class countDigits {
    public static int recu(int n){
        if(n==0){
            return 1;
        }
        return 1+recu(n/10);
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(recu(n));
    }
}
