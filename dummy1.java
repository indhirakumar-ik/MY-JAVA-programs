public class dummy1 {
    public static void main(String[] args) {
        String a="hello";
        String b="ll";
        System.out.println(st(a, b));
    }


    public static int st(String a,String b){
        int i=0;
        int j=0;
        for(int g=0;g<a.length()&&g<b.length();g++){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else{
                return -1;
            }
        }
        return -1;
    }
}
