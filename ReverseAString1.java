public class ReverseAString1 {
    public static void main(String[] args) {
        String s="abcd";
        int n=2;
        char[] c=s.toCharArray();
        int i=0;
        int j=n-1;
        for(int g=0;g<j;g++){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }

        for(char g:c){
            System.out.println(g);
        }
    }
}
