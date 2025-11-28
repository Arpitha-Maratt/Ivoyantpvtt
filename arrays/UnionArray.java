package arrays;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        HashSet<Integer> unionSet = new HashSet<>();
        for(int num : arr1){
            unionSet.add(num);
        }
        for(int num :arr2){
            unionSet.add(num);
        }

        System.out.println("Union:");
        for(int num : unionSet){
            System.out.print(num + " ");
        }
    }
}
