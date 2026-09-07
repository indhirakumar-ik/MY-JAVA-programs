class decimaltoinary{
    public static void main(String args[]){
        int decimal=5;
        String inary="";
        while(decimal>0){
            int reminder=decimal%2;
            inary=reminder+inary;
            decimal=decimal/2;

        }System.out.println(inary);
    }}