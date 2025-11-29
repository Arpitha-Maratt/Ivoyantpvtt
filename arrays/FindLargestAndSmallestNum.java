package arrays;

import java.util.Scanner;

public class FindLargestAndSmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int i =0;i<arr.length;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The largest values:"+largest);
        System.out.println("The smallest values :"+smallest);

    }
}
