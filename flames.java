public class flames {
    public static void main(String[] args) {
        String firstPerson="rose";
        String secondPerson="jacko";
        int count=0;
        for(int i=0;i<firstPerson.length();i++){
            char c=firstPerson.charAt(i);
            char b=secondPerson.charAt(i);
            if(c==b){
                count+=1;
                System.out.println(count);
            }
        }
    }
}
