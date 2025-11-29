package practicedQuestionOfAllConcept;

import java.util.Scanner;

public class MatrixAdditionAndMultiplication {

    public int[][] matrixMultipliaction(int[][] A,int[][] B){

        int[][] C = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j] = 0;

                for(int k =0;k<3;k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }

        }
        return C;
}

public int[][] matrixAddition(int[][] A,int[][] B) {
        int[][] C = new int[3][3];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            C[i][j] = A[i][j] + B[i][j];
            }
        }
    return C;
    }

    public void display(int[][] M){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        System.out.println("Enter elemnt of the firts 3x3 matrix A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of the second 3x3 matrix B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j] = sc.nextInt();
            }
        }

        MatrixAdditionAndMultiplication matrix = new MatrixAdditionAndMultiplication();

        int[][] multipliction = matrix.matrixMultipliaction(A,B);
        int[][] addition = matrix.matrixAddition(A,B);

        System.out.println("\n Matrix addition(A+B)");
        matrix.display(addition);
        System.out.println("\n Matrix Multiplication");
        matrix.display(multipliction);


    }
}
