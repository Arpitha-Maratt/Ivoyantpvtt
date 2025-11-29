package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,1};   // array

        int largest = Integer.MIN_VALUE;   //-2147483648
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] !=largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("The largest element is :"+largest);
        System.out.println("The second largest elemnt is:"+secondLargest);
    }
}
