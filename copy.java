class copy{
    public static void main(String args[]){
        int[] a={1,2,3,4,1,3,4,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;i<a.length-i;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }}