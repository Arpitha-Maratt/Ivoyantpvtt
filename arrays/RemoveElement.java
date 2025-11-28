package arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,8,2,9};
        System.out.println("Original Array:");

        for(int num :arr){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Enter elemnt to remove:");
        int value = sc.nextInt();

        int n =arr.length;
        int newSize = n;

        for(int i =0;i<newSize;i++){
            if(arr[i] ==  value){
                // shift all elelmnts

                for(int j = i; j<newSize-1;j++){
                    arr[j] = arr[j+1];
                }
                newSize--;
                i--;
            }
        }
        System.out.println("Array after  removing"+value+":");
        for(int i=0;i<newSize;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
