public class MathematicalRecursion {

    public static int mathematical(int a,int b){
        if(b==1){
            return a;
        }
        return a*mathematical(a,b-1);

    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(mathematical(a,b));
    }
}
