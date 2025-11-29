package arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};

        if(isPalidrome(arr)){
            System.out.println("The array is a Palindrome");
        }else{
            System.out.println("The array is not palindrome");
        }
    }

    public static boolean isPalidrome(int[] arr){
        int start = 0;
        int end =arr.length -1;

        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
