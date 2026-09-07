class MedianOfTwoSortedArray{
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4,5};
        int n=nums1.length;
        int m=nums2.length;
        int[] newArr=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                newArr[k]=nums1[i];
                i++;
                k++;
            }else{
                newArr[k]=nums2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            newArr[k]=nums1[i];
            i++;
            k++;
        }

        while(j<m){
            newArr[k]=nums2[j];
            j++;
            k++;
        }

        double add=0;
        int g=(n+m);
        int l=(n+m)/2;
        System.out.println("l is"+l);
        System.out.println("g id"+g);
        if(g%2==0){
             add=(newArr[l-1]+newArr[l]);
             add=add/2;
             System.out.println("add is "+add);
        }else{
             add=newArr[l];
             System.out.println("hello");
        }

        System.out.println("median is"+add);

    }
}
