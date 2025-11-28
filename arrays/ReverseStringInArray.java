package arrays;

public class ReverseStringInArray {

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java"};

        System.out.println("Original Array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Reverse each string
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseString(arr[i]);
        }

        System.out.println("Array after reversing each string:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
