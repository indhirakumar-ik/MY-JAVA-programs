public class patternPrinting {
//    public static void recu(int row,int col){
//        if(row==0){
//            return;
//        }
//        if(row>col){
//            System.out.print("*");
//            recu(row,col+1);
//        }
//        System.out.println();
//        recu(row-1,0);
//    }
//    public static void main(String[] args) {
//        recu(4,4);
//    }
public static void printStars(int count) {
    if (count == 0) {
        return;
    }
    System.out.print("* ");
    printStars(count - 1); // Recursive call for the next star
}

    // Function to handle the row transitions
    public static void printPattern(int rows) {
        if (rows == 0) {
            return;
        }
        printStars(rows);
        System.out.println();
        printPattern(rows - 1); // Recursive call to handle previous rows first
          // Move to the next line
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
