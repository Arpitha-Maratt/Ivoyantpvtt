package arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4, 3, 2, 8, 5};

        System.out.println("Dupliacte element are:");
        for(int i =0;i<arr.length;i++){ // first elment
            for(int j = i+1;j<arr.length;j++){ // remaining element check
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break; // Avoid printing same duplicate multiple times
                }
            }
        }
    }
}
