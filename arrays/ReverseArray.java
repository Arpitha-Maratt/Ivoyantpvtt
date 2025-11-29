package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,4};

        for(int i = arr.length-1;i >= 0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
