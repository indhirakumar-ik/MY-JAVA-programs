public class reverseVowels {
    public static void main(String[] args) {
        String name="Aeimnou";
        char[] c=name.toCharArray();
        int i=0;
        int j=c.length-1;
        while (i<j) {
            while(i<j&&!isvowel(c[i])){
                i++;
            }
            while (i<j&&!isvowel(c[j])) {
                j--;
            }
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        for(char m:c){
            System.out.print(m+" ");
        }
    }

    private static boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
