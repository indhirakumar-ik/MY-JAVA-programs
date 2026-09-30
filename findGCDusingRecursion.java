public class findGCDusingRecursion {
    public static void main(String[] args) {
        int a=48;
        int b=18;
        int n=2;
        while(a%n==0&&b%n==0){
            n=n+1;
        }
        System.out.println(n);
    }
}
