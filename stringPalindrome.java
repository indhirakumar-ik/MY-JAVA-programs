public class stringPalindrome {
    public static void main(String[] args) {
        String s="abacd";
        char[] c=s.toCharArray();
        String newS="";
        for(int i=0;i<c.length;i++){
            newS=c[i]+newS;
        }

        System.out.println(newS);

        if(s.equals(newS)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
