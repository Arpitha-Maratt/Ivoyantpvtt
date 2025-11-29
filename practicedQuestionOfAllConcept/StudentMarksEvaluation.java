package practicedQuestionOfAllConcept;

import java.util.Scanner;

public class StudentMarksEvaluation {

    public int HighestMarks(int[]arr){

        int highestMarks = arr[0];

        for(int i =0;i<arr.length;i++){
            if(highestMarks < arr[i]){
                highestMarks = arr[i];
            }
        }
        return highestMarks;
    }

    public int lowestMarks(int[] arr){
        int lowestMarks = arr[0];

        for(int i=0;i<arr.length;i++){
            if(lowestMarks > arr[i]){
                lowestMarks=arr[i];
            }
        }
        return lowestMarks;
    }

    public int averageScore(int[] arr){
        int length = arr.length;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return  sum/length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The marks of the students:");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        StudentMarksEvaluation obj = new StudentMarksEvaluation();

        int highestScore = obj.HighestMarks(arr);
        int lowestScore = obj.lowestMarks(arr);
        int avg = obj.averageScore(arr);


        System.out.println("The Highest Score :" + highestScore);
        System.out.println("The lowest score :"+lowestScore);
        System.out.println("The average is :"+avg);
    }
}
