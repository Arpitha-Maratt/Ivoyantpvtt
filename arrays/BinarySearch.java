package arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr,int key){
        int left = 0;
        int right = arr.length-1;
        boolean found = false;

        while(left <= right){
            int mid = (left + right) /2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                left = mid +1;
            }
            else{
                right = mid -1;
            }

        }
       return -1;

    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int key = 8;
        int result = binarySearch(arr,key);

        if(result !=-1){
            System.out.println("Key found at index:"+result);
        }else {
            System.out.println("Key not found in the array");
        }

    }
}
