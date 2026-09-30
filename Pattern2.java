public class Pattern2 {
    public static void recu(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            recu(row,col+1);
            System.out.print("* ");
        }else{

            recu(row-1,0);
            System.out.println();
        }
    }
    static void main(String[] args) {
        recu(5,0);
    }
}
