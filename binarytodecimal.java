class binarytodecimal{
    public static void main(String args[]){
        int a=1111;
        int decimal=0,ace=1;
        while(a>0){
            int reminder=a%10;
            decimal=decimal+reminder*ace;
            ace=ace*2;
            a=a/10;
        }System.out.println(decimal);


    }}