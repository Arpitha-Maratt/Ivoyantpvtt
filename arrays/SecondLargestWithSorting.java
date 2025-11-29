package arrays;

import java.util.Arrays;

public class SecondLargestWithSorting {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,1};

        //sort
        Arrays.sort(arr);
        // the largest
        int largest = arr[arr.length-1];

        //the second largest

        int secondLargest = arr[arr.length-2];

        System.out.println("Largest element :"+largest);
        System.out.println("Second largest element:"+secondLargest);
    }
}
