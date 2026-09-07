class palindrome{
    public static void main(String args[]){
        String text="yatheesh";
        String a="";
        for(int i=text.length()-1;i>=0;i--){
            a=a+text.charAt(i);
        }if(text.equals(a)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }}