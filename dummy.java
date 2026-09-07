class dummy{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,0,0,0};
        int[] arr2={3,4,5,6};
        int n=3,m=3;
        int i=0;
        int j=0;
        int k=0;
        int newArr[]=new int[n+m];
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                newArr[k]=arr1[i];
                i++;
                k++;
            }else{
                newArr[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            newArr[k]=arr1[i];
            i++;
            k++;
        }

        while(j<m){
            newArr[k]=arr2[j];
            j++;
            k++;
        }
        
        for(int g=0;g<newArr.length;g++){
            arr1[g]=newArr[g];
        }

        for(int g:arr1){
            System.out.println(g);
        }
    }
}