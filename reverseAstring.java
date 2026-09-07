public class reverseAstring {
    public static void main(String[] args) {
        char[] c={'a','h','e','l','l','o'};
        int i=0;
        int j=c.length-1;
        for(int g=0;g<c.length;g++){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            System.out.println("hi");
            i++;
            j--;
        }
            c[0]='m';
        for(char g:c){
            System.out.println(g);
        }

        int[] number={1,2,3,4,5};
        int s=0;
        int e=number.length-1;
        for(int m=0;m<number.length/2;m++){
            int temp=number[s];
            number[s]=number[e];
            number[e]=temp;
            s++;
            e--;
        }

        for(int m:number){
            System.out.print(m+" ");
        }
    }
}
