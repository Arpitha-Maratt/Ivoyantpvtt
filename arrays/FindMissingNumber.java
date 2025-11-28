package arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        int n = arr.length+1;  //total numbers from 1 to N
        int totalSum = n*(n+1)/2; // Sum of number from 1 to N

        int arrSum =0;
        for(int num : arr){
            arrSum += num;
        }

        int missingNumber = totalSum -arrSum;
        System.out.println("Missing number is :"+missingNumber);
    }
}
