public class LinearSearch {
        public static void main(String[] args) {
            String Fruits[]={"Banana","Apple","Grapes","Lemon","Dragon Fruit"};
            String Fruit="";
            String name="Banana";
            for(int i=0;i<Fruits.length;i++){
                if(Fruits[i].equals(name)){
                    Fruit =Fruits[i];
                    break;
                }
            }
            if(Fruit.equals(name)){
                System.out.println("Fruit is in the array");
            }else{
                System.out.println("Fruit is not in the array");
            }


            int arr[]={1,2,3,4,5,6,7};
            int target2;
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Target is find");
            }else{
                System.out.println("Target is not found");
            }
        }
    }

