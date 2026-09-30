public class removeAllOccuranceOfaCharacter {

    public static String remove(String name,int index,char target,String output){
        if(index==name.length()){
            return output;
        }
        if(name.charAt(index)!=target){
            output=output+name.charAt(index);
        }
        return remove(name,index+1,target,output);
    }
    public static void main(String[] args) {
        String name="banana";
        System.out.println(remove(name,0,'a',""));
    }
}
