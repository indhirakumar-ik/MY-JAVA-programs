public class checkSentenceIsAnagram {
    public static void main(String[] args) {
        String sentence="abcd";
        boolean[] b1=new boolean[sentence.length()];
        int i=0;
        while(i<sentence.length()){
            if(alpha(sentence.charAt(i))){
                b1[i]=true;
            }else{
                b1[i]=false;
            }
            i++;
        }

        for(boolean itr:b1){
            System.out.println(itr+" ");
        }
    }

    public static boolean alpha(char c){
        return c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||
                c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z';
    }
    }

