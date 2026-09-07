public class MaximizeActiveSectionwithTradeI {
    public static void main(String[] args) {
        String s="01010";
        int ones=0;
        char[] c=s.toCharArray();
        for(int i:c){
            if(i=='1'){
                ones++;
            }
        }

        String newS='1'+s+'1';
        

    }
}
