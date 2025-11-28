package arrays;

import java.util.Scanner;

public class SumAndAvgOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 number:");
        for(int i = 0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int avg;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("The sum of an array is:"+sum);
        avg = sum/arr.length;
        System.out.println("The average of array is :"+avg);
    }
}
