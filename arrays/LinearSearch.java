package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,6,7};
        int key = 5;
        boolean found = false;

        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
             found = true;
             break;
            }
        }
        if(found){
            System.out.println("The key is found");
        }else{
            System.out.println("The key is not found");
        }
    }
}
