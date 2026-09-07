import java.util.Scanner;
class basic{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        int count=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count=count+1;
            }
           
        } System.out.println(count);


    }
}