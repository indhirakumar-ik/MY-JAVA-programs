class arrayadd{
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6,7,8,4};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
        float n=(float)sum/a.length;
        System.out.println(n);
    }
    }